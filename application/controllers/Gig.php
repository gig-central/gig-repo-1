<?php
/**
* Gig.php controller for Gigs at SCC
*
* @package ITC 260 Gig Central CodeIgnitor
* @subpackage Gig Controller
* @author Patricia Barker, Mitchell Thompson, Spencer Echon, Turner Tackitt 
* @version 2.3 2016/06/14
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
 * 
 * 
 * @see Gig_model
 * @return void
 * @todo none
 */
    
    
    public function __construct()
    {//begin constructor
        parent::__construct();
        $this->load->model('gig_model');
        $this->config->set_item('banner', 'Global News Banner');
        $this->config->set_item('nav-active', 'Gigs');//sets active class on all gig children
    }#end constructor

    public function index()
    {//begin function index
        $data['gigs'] = $this->gig_model->get_gigs();
        $data['title']= 'Gigs';
        
        $this->load->view('gigs/index', $data);
    }#end function index

    public function view($slug = NULL)
    {//begin function index
        $data['gig'] = $this->gig_model->get_gigs($slug);
        if (empty($data['gig']))
        {
                show_404();
        }
        $data['title']= 'Gig';
        
        $this->load->view('gigs/view', $data);
    }#end function view

    public function add()
    {
        $this->load->helper('form');
        $this->load->library('form_validation');
        $this->form_validation->set_message('check_dropdown', 'You need to select an employment type.');
        $data['title'] = 'Add a new gig';
        
        if ($this->form_validation->run() == FALSE)
        {//create form to add gigs
            $this->load->view('gigs/add', $data); 
        }
        else
        {//this processes
            $data['gigs'] = $this->gig_model->get_gigs();
            $data['title']= 'Gigs';
            $data['success'] = 'created';
            $this->gig_model->add_gig();
            $this->load->view('gigs/success', $data);

        }
    }#end function add()
    public function search()
    {
        $keyword = $this->input->post('keyword');
        $data['gigs'] = $this->gig_model->searchGigs($keyword);
        $data['title']= 'Searching for: '.$keyword;

        $this->load->view('gigs/search', $data);
    }
    public function edit(){
        
        $this->load->helper('form');
        $this->load->library('form_validation');
        $this->form_validation->set_message('check_dropdown', 'You need to select an employment type.');
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
                    //if ($this->form_validation->run() == FALSE) // validation hasn't been passed
                    //{ 
                        //$data['data'] = "Validation failed!";
                        //$this->load->view('gigs/edit', $data);
                    //}else{
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
                    'Phone' => $this->input->post('Phone'),
                    );
                
                $data2 = array(
                    
                    'GigQualify' => strip_tags($this->input->post('GigQualify'),'<p>'),
                    'EmploymentType' => $this->input->post('EmploymentType'),              
                    'GigOutline' => strip_tags($this->input->post('GigOutline'),'<p>'),       
                    'SpInstructions' => strip_tags($this->input->post('SpInstructions'),'<p>'),        
                    'PayRate' => $this->input->post('PayRate'),      
                    'LastUpdated' => date("Y-m-d H:i:s"),
                    );
                    if ($data['gigs'] = $this->gig_model->edit_gigs($companyId, $data, $companyContactId, $data3, $userId, $data2) == TRUE)
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

    public function check_dropdown($post_dropdown){
        return $post_dropdown == '0' ? FALSE : TRUE;
    }


}#end Gigs class/controller
