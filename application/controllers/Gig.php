<?php
/**
* Gig.php controller for Gigs at SCC
*
* @package ITC 260 Gig Central CodeIgnitor
* @subpackage Gig Controller
* @author Patricia Barker, Mitchell Thompson, Spencer Echon, Turner Tackitt
* @author Mike Archambault, Thom Harrington, Craig Peterson
* @version 2.7 2019/06/06
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Gig_model.php
* @see view/gigs/index.php
* @see view/gigs/view.php
* @see view/gigs/add.php
* @see view/gigs/success.php
* @todo none
*/


class Gig extends CI_Controller
{//begin controller
/**
 * Gig Class extends the CI_Controller class
 *
 * The constructor creates an instance of the Gig Class that loads Gig_model.php and sets
 * the banner.
 *
 * A profile object can be created in this manner:
 *
 * <code>
 * $myGig = new Gig();
 * </code>
 *
 * The index() method of the gig object created will get all the data from Gig_model and load them into the view gigs/index
 *
 * The view($slug) method of the gig object created will get  the data of that slug from Gig_model and load them into the view gigs/view
 *
 * The add() method of the gig object created will load a form , validate it and add gigs.
 *Form validation is handled in the form_validation.php in the cofig folder. It will automaticly be called when validation runs
 *
 * @see Gig_model
 * @return void
 * @todo none
 */


    public function __construct()
    {//begin constructor
        parent::__construct();
        $this->load->model('Gig_model');
        $this->config->set_item('banner', 'Global News Banner');
        $this->load->helper('form');
        $this->load->library('form_validation');
   

        /**
        *$this->form_validation->set_message below is a customer message for dropdown fields. This is basically
        * saying apply this message to the custom rule
        *"check_dropdown". check_dropdown is a method in this controller.
        */
        $this->form_validation->set_message('check_dropdown', '{field} must be selected.');
        /**
         */

        //Form validation is handled in the form_validation.php in the cofig folder. It will automaticly be called when validation runs

    }#end constructor

    public function index()
    {//begin function index
        $data['gigs'] = $this->gig_model->getGigs();
        $data['title']= 'Gigs';

        $this->config->set_item('nav-active', 'Find a Gig');
        $this->load->view('gigs/index', $data);
    }#end function index

    public function view($slug = NULL)
    {//begin function view
        $this->load->model('admin_model');
        $this->load->database();
        $data['title']= 'Gig';

        if($this->session->logged_in === TRUE)
        {//if logged get data of the gig(s) that matches userId from db)
            $data['userId'] = $this->gig_model->get_session_id();
            $data['gig'] = $this->gig_model->getGigs($slug);
            if (empty($data['gig']))
            {
                show_404();
            }

            $this->load->view('gigs/view', $data);
        }else
        {
            feedback(
                '<strong>Heads up!</strong>
                <p class="mb-0">Please ' . anchor('admin/login', 'log in') . ' to see gig details.</p>'
                , 'danger'
            ); //set feedback
            $data['gigs'] = $this->gig_model->getGigs();
            $data['title']= 'Gigs';
            $this->load->view('gigs/index', $data);
        }
    }#end function view

    public function edit(){
        $data['title'] = 'Edit Gigs';

        $userId = $this->gig_model->get_session_id();
        $id = $this->gig_model->get_session_id();
        $companyId = $this->gig_model->find_id_in_table('CompanyID', 'Gigs', 'id', $id);
        $companyContactId = $this->gig_model->find_id_in_table('CompanyContactID', 'CompanyContact', 'CompanyID', $companyId);

        if ($this->session->logged_in == TRUE)
        {//if logged get data of the gig(s) that matches userId from db
            if ($this->gig_model->find_post_id($userId) == TRUE)
            {
                if(!isset($_POST['submit']))
                {//create form to edit gigs
                    //Get CompanyContact
                    $data['single_company_contact'] = $this->gig_model->get_table('CompanyContact', 'CompanyContactID', $companyContactId);

                    //Get Company
                    $data['single_company'] = $this->gig_model->get_table('Company', 'CompanyID', $companyId);

                    //Get gigs
                    $data['single_gig'] = $this->gig_model->get_table('Gigs', 'id', $id);
                    $this->load->view('gigs/edit', $data);
                }
                if(isset($_POST['submit']))
                {
                    $data = array(
                        'Name' => $this->input->post('Name'),
                        'Address' => $this->input->post('Address'),
                        'CompanyCity' => $this->input->post('CompanyCity'),
                        'State' => $this->input->post('State'),
                        'ZipCode' => $this->input->post('ZipCode'),
                        'CompanyPhone' => $this->input->post('CompanyPhone'),
                        'Website' => $this->input->post('Website'),
                        );

                    $data3= array(
                        'FirstName' => $this->input->post('FirstName'),
                        'LastName' => $this->input->post('LastName'),
                        'Email' => $this->input->post('Email'),
                        'Phone' => $this->input->post('Phone')
                    );

                    $data2 = array(
                        'GigQualify' => strip_tags($this->input->post('GigQualify'),'<p>'),
                        'EmploymentType' => $this->input->post('EmploymentType'),
                        'GigOutline' => strip_tags($this->input->post('GigOutline'),'<p>'),
                        'SpInstructions' => strip_tags($this->input->post('SpInstructions'),'<p>'),
                        'PayRate' => $this->input->post('PayRate'),
                        'LastUpdated' => date("Y-m-d H:i:s")
                    );

                    if ($data['gigs'] = $this->gig_model->editGigs($companyId, $data, $companyContactId, $data3, $userId, $data2) == TRUE)
                    {
                        $data['title']= 'Gigs';
                        $data['success'] = 'updated';
                        $this->load->view('gigs/success', $data);
                    }
                }
            }
            else
            {//The user hasn't posted a gig yet. Redirect to add gig page
                $data['title'] = 'Add Gigs';
                $this->load->view('gigs/add', $data);
            }
        }else{//redirect to login page
                redirect("admin/login");
        }
    }#end of function edit

    public function delete($id)
    {
        $userId = $this->gig_model->get_session_id();

        $id = $this->uri->segment(3);
        $data['title'] = 'Delete a Gig';

        if($this->gig_model->deleteGig($id)){       $this->load->view('gigs/delete', $data);
        }

    }#end function delete()

        /**
    * @author Patricia Barker, Mitchell Thompson, Spencer Echon, Turner Tackitt, esteban Ginocchio Silva
    * @todo 'Name' should be CompanyName in DB
    */

    public function add()
    {
        $this->config->set_item('nav-active', 'Post a Gig');
        $data['title'] = 'Add a New Gig'; //set values to be passed to view

        //establish form validation rules is handled in config/form_validation.php

        //if the user is logged in then send him to gigs/add page, 
        //else send him to welcome_page
        if($this->session->logged_in === TRUE)
        {
            if ($this->form_validation->run() == FALSE)
        {// validation not passed, re-load form to add gig
            $this->load->view('gigs/add', $data);
        }
        else
        {//passed validation, proceed to post Success logic

            //build company info array for model
            $company_data = array(
                'Name' => set_value('Name'), //name should be CompanyName in DB
                'Address' => set_value('CompanyAddress'),
                'CompanyCity' => set_value('CompanyCity'),
                'CompanyState' => set_value('CompanyState'),
                'ZipCode' => set_value('ZipCode'),
                'CompanyPhone' => set_value('CompanyPhone'),
                'Website' => set_value('CompanyWebsite')
            );

            $contact_data = array(
                'FirstName' => set_value('FirstName'),
                'LastName'  => set_value('LastName'),
                'Email'   => set_value('Email'),
                'Phone' => set_value('Phone')
            );

            // build gig array for the model
            $gig_data = array(
                'EmploymentType' => set_value('EmploymentType'),
                'PayRate' => set_value('PayRate'),
                'PayRate' => set_value('GigDuration'),
                'GigCloseDate' => set_value(strip_tags('GigCloseDate','<p>')),
                'GigOutline' => set_value('GigOutline'),
                'GigQualify' => set_value(strip_tags('GigQualify','<p>')),
                'SpInstructions' => set_value(strip_tags('SpInstructions','<p>'))
                );

            if ($this->gig_model->addGig($company_data, $contact_data, $gig_data) == TRUE)
            {
                // gig information has been successfully saved in the db
                // $data['gigs'] = $this->gig_model->getGigs();
                $data['success'] = 'created';
                $data['title'] = 'Success!';
                $this->load->view('gigs/success', $data);
            }
            else
            {
                echo 'An error occurred saving your information. Please try again later';
                // Or whatever error handling is necessary
            }
        }
        }else//else show snackbar
        {
            feedback(
                '<strong>Heads up!</strong>
                <p class="mb-0">Please ' . anchor('admin/login', 'log in') . ' to post a gig.</p>'
                , 'danger'
            ); //set feedback

            //if the user is not logged in then send him to welcome_page
            $data['gigs'] = $this->gig_model->getGigs();
            $data['title'] = 'Gig Central';
		    $data['api'] = $this->config->item('googleMapsKey');
            $data['gigTypes'] = $this->gig_model->dashboard();
            $this->load->view($this->config->item('theme') . 'header', $data);
		    $this->load->view('welcome_page', $data);
        
        }

        /*else {
            //load the blank form if the form is not a submit
                $this->load->view('gigs/add', $data);*/
    }#end function add()

    public function search($keyword = NULL)
    {
        if($keyword != NULL) {
            $keyword = str_replace('%20', ' ', $keyword); //fixes query string space formatting
        }

        if(!empty($_POST)) { //check if search submitted via POST form
            $keyword = $this->input->post('keyword');
        }

        $data['gigs'] = $this->gig_model->searchGigs($keyword);
        $data['title']= 'Searching for: '.$keyword;

        $this->load->view('gigs/search', $data);
    }
    public function check_dropdown($post_dropdown){
        return $post_dropdown == '0' ? FALSE : TRUE;
    }

    //search with filtering for gigs
        public function filter() {

            $GigOutline = $_POST['GigOutline'];
            $CompanyCity = $_POST['CompanyCity'];

            $result = $this->gig_model->filter_search($GigOutline, $CompanyCity);

            if (!empty($result)){
                //if we have results, then post them here
                $data['title'] = 'Success!';
                $data['gigs'] = $result;
                $this->load->view('gigs/search', $data);
            } else {
                $data['title'] = 'Success!';
                $data['gigs'] = null;
                $this->load->view('gigs/search', $data);
            }
        }

}#end Gigs class/controller
