<?php

/**
 *
 * controllers/Contact.php
 *
 * Contact page for Gig Central
 *
 * @package ITC260
 * @subpackage Contact
 * @author Victoria Moiseenko, Turner Tackit, Esteban Ginocchio Silva
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

        $this->form_validation->set_rules('Name', 'Name', 'trim|required');
        $this->form_validation->set_rules('Email', 'Email', 'trim|min_length[5]|required');
        $this->form_validation->set_rules('Message', 'Message', 'trim|required');

        if ($this->form_validation->run() === FALSE) {//no data yet, show form!
            $this->load->view('contact/index', $data);
        } else {//process data, send email!
            //get the form data
            $name = $this->input->post('Name');
            $email = $this->input->post('Email');
            $subject = $this->input->post('Subject');
            $message = $this->input->post('Message');

            // Catch the user's answer
            $captcha_answer = $this->input->post('g-recaptcha-response');

            // Verify user's answer
            $captcha_googleresponse = $this->recaptcha->verifyResponse($captcha_answer);

            if (!$captcha_googleresponse['success']) {//reCAPTCHA validation fail, provide feedback
                feedback('<h1>Invalid Captcha, Please Try Again.</h1>', 'error'); //set feedback
                $this->load->view('contact/index', $data);
                return;
            } else {
                //Use model to set email values to DB
                $this->contact_model->set_emails();

                //load helpers /libries
                $this->load->helper('url');
                $this->load->library('email');

                /**
                 * config
                 */
                $email_config = array(
                    'mailtype' => "html"
                );

                /**
                 * Initializw $email_config value
                 */
                $this->email->initialize($email_config);

                // converts the time in seconds to current date
                $today = date("D M j G:i:s T Y");

                //send mail to config->item('autoemail_from_address')
                //from config->item('autoemail_from_name')
                $this->email->from($this->config->item('autoemail_from_address'), $this->config->item('autoemail_from_name'));
                $this->email->to($this->config->item('email_contact_sendto'));
                $this->email->subject($subject);
                $this->email->message(
                    "
<p>You have received the following submission from the Gig Central Contact Us form:</p>
                    <p><strong>Email: </strong>$email</p>
                    <p><strong>Name: </strong>$name</p>
				    <p><strong>Subject: </strong>$subject</p>
				    <p><strong>Message: </strong>$message</p>
				    <footer><strong>Submitted: </strong>$today</footer>
                    </body>
                </html>"
                );

                if ($this->email->send()) {// mail sent, print form submission confirmation
                    feedback('<h1>Thanks for contacting us!</h1>
					<p>Your form has been submitted. We\'ll be sure to get back to your inquiry as soon as possible!</p>', 'success'); //set feedback
                    $this->load->view('contact/index', $data);
                } else {//not sent, provide feedback
                    /*
                     * Remove debugger from comments when reached MVP
                     */
                    //Debugger probably should not be on the Production version
                    //show_error( "<h1>Failed To Send Email</h1><p />Debug Details follow:<br />" . $this->email->print_debugger() );
                    feedback('<h1>Internal Error</h1>
					<p>There was an error submitting your form. We\'re working to fix it!</p>', 'error'); //set feedback
                    $this->load->view('contact/index', $data);
                }
            }
        }
    }
}