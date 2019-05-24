<?php

/**
 * 
 * controllers/Contact.php
 *
 * Contact page for Gig Central
 *
 * @package ITC260
 * @subpackage Contact
 * @author Victoria Moiseenko, Turner Tackit
 * @version 2.0 2016/06/14
 * @license http://www.apache.org/licenses/LICENSE-2.0
 * @see Contact_model.php
 * @see view/contact/index.php
 * @see view/contact/success.php
 * @todo Add inline error message to form in the event of an email problem, instead of printing generic "An Error Happened" page.
 */

class Contact extends CI_Controller
{
	public function __construct()
	{//everything here is global to all methods in the controller
		parent::__construct();
		$this->load->model('contact_model');
		$this->config->set_item('nav-active', 'Contact Us');//sets active class on current nav item
	}#end constructor()

	/*
	 * Load form page to compose contact message, or send composed email to website operators.
	 *
	 * @return void
	 * @todo Add inline error message to form in the event of an email problem, instead of printing generic "An Error Happened" page.
	 */
	public function index()
	{
		$this->load->helper('form');
		$this->load->library('form_validation');
		$this->load->library('recaptcha');

		$data['title'] = 'Contact Us';
		$data['name'] = 'Contact';
		$data['contact'] = $this->contact_model->getEmails();

		//default form placeholder values
		$data['contact_Form_Name'] = '';
		$data['contact_Form_Email'] = '';
		$data['contact_Form_Message'] = '';

		$this->form_validation->set_rules('Name', 'Name', 'required');
		$this->form_validation->set_rules('Email', 'Email', 'required');
		$this->form_validation->set_rules('Message', 'Message', 'required');

		if ($this->form_validation->run() === FALSE)
		{//no data yet, show form!
		    $this->load->view('contact/index', $data);
		}
		else
		{//process data, send email!
			//get the form data
			$name = $this->input->post('Name');
			$email = $this->input->post('Email');
			$subject = $this->input->post('Subject');
			$message = $this->input->post('Message');

			// Catch the user's answer
			$captcha_answer = $this->input->post('g-recaptcha-response');

			// Verify user's answer
			$captcha_googleresponse = $this->recaptcha->verifyResponse($captcha_answer);

			if( !$captcha_googleresponse['success'] )
			{//reload index with form data in placeholder values for form
				$data['contact_Form_Name'] = $name;
				$data['contact_Form_Email'] = $email;
				$data['contact_Form_Message'] = $message;

				feedback('<h1>Invalid Captcha, Please Try Again.</h1>','error'); //set feedback
				$this->load->view('contact/index', $data); 
				return;
			}
			else
			{
				//Use model to set email values to DB
				$this->contact_model->set_emails();

				//load helpers /libries
				$this->load->helper('url');
				$this->load->library('email');

				//send mail
				$this->email->from($email, $name);
				$this->email->to( $this->config->item('email_contact_sendto') );
				$this->email->subject($subject);
				$this->email->message($message);
				if ($this->email->send())
				{// mail sent
					feedback('<h1>Thanks for contacting us!</h1>
					<p>We\'ll be sure to get back to your inquiry as soon as possible!</p>','success'); //set feedback
					$this->load->view('contact/index', $data);
				}
				else
				{
					// an error occured
					// XXX TODO In the event of an error, we need to redirect back to the submission form, and show an in-line error message (eg, using session variable)
					// -- Turner Tackitt aka Hastwell, 19 May 2016
				
					//redirect('contact');
					echo "Error!";
					show_error( "<h1>Failed To Send Email</h1><p />Debug Details follow:<br />" . $this->email->print_debugger() );
				}
			}
	    }
	}
}
