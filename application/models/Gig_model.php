<?php

/**
* Gig_model.php model for Gig Controller
*
* @package ITC 260 CodeIgnitor - Gig Central
* @subpackage Gig Controller
* @author Patricia Barker <patriciabethbarker@gmail.com>, Turner Tackitt <turner8193@gmail.com>, Spencer Echon
* @author Mike Archambault <michael.archambault@seattlecentral.edu>
* @version 2.3 2018/08/19
* @link http://www.tcbcommercialproperties.com/sandbox/codeignitor/
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see controllers/Gig.php
* @see views/gigs/add.php
* @see add.php
* @todo fix Gigposted and Lastupdated to output actual time
*/

/**
 * Gigs_form model for our Gig Central Project
 *
 * @see Gigs_form
 * @todo none
 */
class Gig_model extends CI_Model {
    var $companyid = 0;
     /**
     * Loads default data into Object
     *
     * @param none
     * @param void
     * @todo none
     */
    public function __construct()
    {
            $this->load->database();
    }#end constructor


     /**
     * Retreive a list of available gigs from the DB.
     *
     * @param $slug string Retreives data about a specific gig by slug. If $sinceDate is specified, this parameter must be explicitly given a value of FALSE. Can be omitted to retreive a list of all gigs posted.
     * @param $sinceDate int (timestamp from eg, time() function) If specified, this function will only return gigs posted since the specified date. The time portion of this timestamp is ignored. Timestamp is based off the number of seconds elapsed since the Unix Epoch (January 1 1970 00:00:00 GMT), and can be retreived using a function like time().
     * @return array(GigID, CompanyID, GigQualify, EmploymentType, GigOutline, SpInstructions, PayRate, GigPosted, LastUpdated, Name, Address, CompanyCity, State, ZipCode, CompanyPhone, Website, FirstName, LastName, Email, Phone)
     * @todo order query by date posted
     */
    public function getGigs($slug = FALSE, $sinceDate = FALSE)
    {
        if ($slug === FALSE)
        {
             $this->db->select('*');
             $this->db->from('Company');
             $this->db->join('Gigs', 'Gigs.CompanyID = Company.CompanyID');
             $this->db->join('CompanyContact', 'Gigs.CompanyID = CompanyContact.CompanyID');

             //get the current date
             $dateNow = date('Y-m-d');
             //GigCloseDate column was set up as VARCHAR(10) instead of DATE, without altering the database we can use
             // native sql functions to convert the strings to dates and compare with today's date
             //this will filter out any gig posting that has expired.
             $queryString = "STR_TO_DATE(GigCloseDate, '%Y-%m-%d') > STR_TO_DATE('" . $dateNow . "', '%Y-%m-%d') OR GigCloseDate = ''";
             $this->db->where($queryString);

             // We can use this feature in the future for a more robust search functionality that filters results by date posted.
             // If sinceDate is specified, load it as a PHP timestamp and filter out all listings created BEFORE that date. Time portion of timestamp is ignored.
             if($sinceDate !== FALSE) $this->db->where('GigPosted > ', date( 'Y-m-d 00:00:00', $sinceDate ) );

             $query = $this->db->get();
             return $query->result_array();
        }

        $this->db->select('*');
        $this->db->from('Company');
        $this->db->join('Gigs', 'Gigs.CompanyID = Company.CompanyID');
        $this->db->join('CompanyContact', 'Gigs.CompanyID = CompanyContact.CompanyID');
        $query = $this->db->get_where('',array('GigID'=> $slug));
        //$query = $this->db->like('GigOutline', $slug);
        return $query->row_array();
    }#end getGigs()

    /**
     * Add a new gig to the DB using POST parameters.
     *
     * @return void
     * @todo Refactor functino so POST parameters are replaced with function parameters, allowing bulk-imports of new gigs.
     *
     */
    public function addGig($company_data, $contact_data, $gig_data)
    {
        $this->load->helper('url');

         // checks to see if company submitted on form already exists in db
        $company_query = $this->db->get_where('Company', array(
            'Name' => $company_data['Name'],
            'Address' => $company_data['Address'],
            )
        );
        //  returns matching query result as Object
        $company_query_result = $company_query->row();


        // if company doesn't exist, insert into database and get ID, else id equals existing column ID
        // prevents bloat of database with multiple instances of same company
        if ($company_query->num_rows() < 1) {
            $this->db->insert('Company', $company_data);
            $company_id = $this->db->insert_id();
        } else {
            $company_id = $company_query_result->CompanyID;
        }

        //Now that CompanyID is known, add to $contact_data array from form
        $contact_data['CompanyID'] = $company_id;
        // insert into CompanyContact table
        $this->db->insert('CompanyContact', $contact_data);

        // checks to see if User ID exists in the session variable, else assume anonymous user
        if (isset($_SESSION['id'])) {
            $user_id = $_SESSION['id'];
        } else {
            $user_id = 0;
        }

        // insert gig data into Gigs table
        //Now that CompanyID is known, add to $contact_data array from form
        $gig_data['CompanyID'] = $company_id;
        $this->db->insert('Gigs', $gig_data);
        if ($this->db->affected_rows() == '1')
            return true;
        return false;

        //not sure why this is here or what they were trying to do. possibly an attempt to check if data already exists?
        //$this->db->order_by("CompanyID", "desc");
        //$this->db->limit(0, 1);
        //$query = $this->db->get('Company');
        //$row = $query->row();
        //if(isset($row)) {
             //$companyid = $row->CompanyID;//Joins CompanyID for gig and company tables
        //}

    }#end of add_gig()

    public function searchGigs($keyword = null)
    {
        if (is_null($keyword))
        {
            return null;
        }
        $this->db->select('*');
        $this->db->from('Company');
        $this->db->join('Gigs', 'Gigs.CompanyID = Company.CompanyID');
        $this->db->join('CompanyContact', 'Gigs.CompanyID = CompanyContact.CompanyID');
        $this->db->like('Gigs.GigOutline', $keyword);
        $this->db->or_like('Gigs.EmploymentType', $keyword);
        $this->db->or_like('Company.CompanyCity', $keyword);
        $this->db->or_like('Company.Name', $keyword);
        $query = $this->db->get();
        return $query->result_array();

    }#end searchGigs()

    /**
     * Update Gig, Company, Company contact in the DB using POST parameters.
     *
     * @return TRUE
     * @todo Currently, it only works if the user has only one gig posted. It need to be able to update multiple gigs.
     * @todo Validate data. Currently, when you leave a field blank, it still updates the tables with empty data.
     */
    public function editGigs($companyid, $data, $companyContactId, $data3, $id, $data2)
    {
        //Update Company table
        $this->db->where('CompanyID', $companyid);
        $this->db->update('Company', $data);
        //Update CompanyContact table
        $this->db->where('CompanyContactID', $companyContactId);
        $this->db->update('CompanyContact', $data3);
        //Update Gigs table
        $this->db->where('id', $id);
        $this->db->update('Gigs', $data2);
                 return TRUE;
    }#end of edit_gigs
    public function deleteGig($id)
    {
        //get the id of the gig from the database
        $this->db->where('GigID', $id);
        //delete from the Gigs table
        $this->db->delete('Gigs');
        return $this->db->affected_rows();
    }
    public function get_session_id()
    {//find userId in the session and return the value
        foreach ($_SESSION as $session) {
                if ($session == "id")
                {
                     return $_SESSION["id"];
                }
            }
    }#end of get_session_id
    public function list_all_posts(){
        //        $this->db->
    }#end of list_all_posts

    public function find_post_id($userId)
    {
        $postExist = false;
        $query = $this->db->query("SELECT id FROM Gigs");
        foreach ($query->result_array() as $row)
                 {
                    if($row['id'] == $userId)
                        {
                        $postExist = true;
                        }
                 }
         return $postExist;
    }#end of find_post_id
    public function get_table($table, $id, $data)
    {
        $this->db->select('*');
        $this->db->from($table);
        $this->db->where($id, $data);
        $query = $this->db->get();
        $result = $query->result();
        return $result;
    }#end of get_table

    public function find_id_in_table($targeId, $table, $id, $searchId)
    {
        $result = 0;
        $this->db->select($targeId);
        $this->db->from($table);
        $this->db->where($id, $searchId);
        $query = $this->db->get();
        foreach ($query->result_array() as $row)
                 {
                    $result = $row[$targeId];
                 }
        return $result;
    }#end of find_id_in_table

    function SaveForm($form_data)
    {
        $this->db->insert('Profile', $form_data);
        if ($this->db->affected_rows() == '1')
        {
            return TRUE;
        }

        return FALSE;
    }//end function SaveForm

    public function filter_search($GigOutline, $CompanyCity){

       $conditions = array('GigOutline' => $GigOutline, 'CompanyCity' => $CompanyCity);

       $this->db->select('*');
       $this->db->from('Gigs');
       $this->db->join('Company', 'Gigs.CompanyID = Company.CompanyID');
       $this->db->where($conditions);
       $result = $this->db->get();

       return $result->result_array();

    }//end of the filter_search form

    //get data for dashboard component
    public function dashboard() {

        $result = $this->db->query('SELECT count(EmploymentType) as NumberOfGigs, EmploymentType FROM Gigs GROUP BY EmploymentType ORDER BY NumberOfGigs desc');
        return $result->result_array();
    }

}#end of the Gig_model
