<?php
defined('BASEPATH') OR exit('No direct script access allowed');

/**
 * form_validation.php does FORM VALIDATION SETTINGS
 * 
 * In addition it does blah.
 *
 * @package ITC 260 Gig Central CodeInitor
 * @subpackage form validation
 * @author thomas.harrington@seattlecentral.edu
 * @version 2019q2
 * @link tbd 
 * @license http://www.apache.org/licenses/LICENSE-2.0
 * @see related_file.php
 * @see other_related_file.php
 * @todo none
 */

// Set form validation rules here.

/*form fileds:
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
                    'GigCloseDate' => set_value(strip_tags('GigCloseDate','<p>')),
                    'GigOutline' => set_value('GigOutline'),
                    'GigQualify' => set_value(strip_tags('GigQualify','<p>')),
                    'SpInstructions' => set_value(strip_tags('SpInstructions','<p>'))
                    );
                    */
$config = array(
        // Sets validation rules for the 'Add a Gig' form
                //establish form validation rules
        'gig/add' => array(
            array(
                'field' => 'Name',
                'label' => 'Name',
                'rules' => 'trim|min_length[2]|max_length[30]|required'
            ),
            array(
                'field' => 'CompanyAddress',
                'label' => 'Address',
                'rules' => 'trim|alpha_numeric_spaces|min_length[2]|max_length[30]|required'
            ),
            array(
                'field' => 'CompanyCity',
                'label' => 'City',
                'rules' => 'trim|min_length[3]|max_length[30]|required'
            ),
            array(
                'field' => 'CompanyState',
                'label' => 'State',
                'rules' => 'callback_check_dropdown|required'
            ),
            array(
                'field' => 'ZipCode',
                'label' => 'ZipCode',
                'rules' => 'trim|numeric|min_length[5]|max_length[5]|required'
            ),
            array(
                'field' => 'CompanyPhone',
                'label' => 'Phone',
                'rules' => 'trim|numeric|min_length[10]|max_length[15]|required'
            ),
            array(
                'field' => 'CompanyWebsite',
                'label' => 'Website',
                'rules' => 'trim|min_length[4]|valid_url'
            ),
            array(
                'field' => 'FirstName',
                'label' => 'First Name',
                'rules' => 'trim|alpha|min_length[2]|max_length[30]|required'
            ),
            array(
                'field' => 'LastName',
                'label' => 'Last Name',
                'rules' => 'trim|alpha|min_length[2]|max_length[30]|required'
            ),
            array(
                'field' => 'Email',
                'label' => 'Email',
                'rules' => 'trim|required|min_length[4]|max_length[30]|valid_email'
            ),
            array(
                'field' => 'Phone',
                'label' => 'Phone',
                'rules' => 'trim|numeric|min_length[10]|max_length[10]|required'
            ),
            array(
                'field' => 'EmploymentType',
                'label' => 'Employment type',
                'rules' => 'callback_check_dropdown|required'
            ),
            array(
                'field' => 'PayRate',
                'label' => 'Pay Rate',
                'rules' => 'trim|required|min_length[3]|max_length[50]'
            ),
            array(
                'field' => 'GigDuration',
                'label' => 'Employment Duration',
                'rules' => 'trim|required|min_length[3]|max_length[50]'
            ),
            array(
                'field' => 'GigCloseDate',
                'label' => 'Close Date',
                'rules' => 'required'
            ),
            array(
                'field' => 'GigOutline',
                'label' => 'Description',
                'rules' => 'trim|max_length[255]'
            ),
            array(
                'field' => 'GigQualify',
                'label' => 'Qualifications',
                'rules' => 'trim|max_length[255]'
            ),
            array(
                'field' => 'SpInstructions',
                'label' => 'Special Instructions',
                'rules' => 'trim|max_length[255]'
            )
        ),
        'venues/add' => array(
            array(
                'field' => 'VenueName',
                'label' => 'Venue Name',
                'rules' => 'required'
            ),
            array(
                'field' => 'VenueAddress',
                'label' => 'Venue Address',
                'rules' => 'required'
            ),
            array(
                'field' => 'City',
                'label' => 'Venue City',
                'rules' => 'required'
            ),
            array(
                'field' => 'ZipCode',
                'label' => 'Venue Zip Code',
                'rules' => 'required'
            ),
            array(
                'field' => 'VenuePhone',
                'label' => 'Venue Phone',
                'rules' => 'required'
            ),
            array(
                'field' => 'State',
                'label' => 'Venue State',
                'rules' => 'required'
            )
        ),
        'venues/edit' => array(
            array(
                'field' => 'VenueName',
                'label' => 'Venue Name',
                'rules' => 'required'
            ),
            array(
                'field' => 'VenueAddress',
                'label' => 'Venue Address',
                'rules' => 'required'
            ),
            array(
                'field' => 'City',
                'label' => 'Venue City',
                'rules' => 'required'
            ),
            array(
                'field' => 'ZipCode',
                'label' => 'Venue Zip Code',
                'rules' => 'required'
            ),
            array(
                'field' => 'VenuePhone',
                'label' => 'Venue Phone',
                'rules' => 'required'
            ),
            array(
                'field' => 'State',
                'label' => 'Venue State',
                'rules' => 'required'
            )
        ),
        'profile/add' => array(
            array(
            'field' => 'i_am_a',
            'label' => 'I am a',
            'rules' => 'required'
            ),
            array(
            'field' => 'first_name',
            'label' => 'First name',
            'rules' => 'required'
            ),
            array(
            'field' => 'last_name',
            'label' => 'Last name',
            'rules' => 'required'
            ),
            array(
            'field' => 'email',
            'label' => 'Email',
            'rules' => 'trim|required|valid_email|is_unique[Profile.email]',
                array(
                    'is_unique'     => 'This %s already exists.'
                ),
            ),
            array(
                'field' => 'bio',
                'label' => 'bio',
                'rules' => 'required'
                )
        ),
        'profile/changePass' => array(
            array(
            'field' => 'old_password',
            'label' => 'Current Password',
            'rules' => 'required'
            ),
            array(
            'field' => 'new_password',
            'label' => 'New Password',
            'rules' => 'required'
            ),
            array(
            'field' => 're_password',
            'label' => 'Password confirmation',
            'rules' => 'required|matches[new_password]'
            ),
        )
);

// Sets custom html wrappers for error messages on forms to change their style globally.
//https://www.codeigniter.com/user_guide/libraries/form_validation.html#changing-the-error-delimiters
// These settings MAY not work if they are above custom validation rules.
$config['error_prefix'] = '<div class="text-danger">';
$config['error_suffix'] = '</div>';