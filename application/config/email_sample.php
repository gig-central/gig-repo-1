<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');


/*
| -------------------------------------------------------------------
| email_sample.php and email.php
| -------------------------------------------------------------------
| About: 
|
| This file's purpose is to store all the custom configurations for 
| use in CI's Email class. By storing these configurations in their
| file named email.php, CI's Email class will automagically import 
| them into the class. These configurations will be used to link to 
| your existing smtp server for SSL mail delivery. This can be with a
| gmail address or the mail server of your web hosting company.
| 
| Info:
|
| See the CI documentation for a list of other configuration you
| can add to this file.
|
| Setup:
|
| This file should be saved as email.php once your personal credentials
| are filled out.
| 
| Troubleshooting:
|
| if your emails are failing to send double check your credentials, port,
| and protocols are correct. If you are using a gmail address, mail will
| not be sent if you have google's two factor authentication turned on. 
| you will need to disable it from you gmail user dashboard and make sure
| that the "Allow Less Secure Apps" option is turned on. If you are still having
| trouble and need to send emails for development purposes, comment out the
| below configurations and 
|
|

/**
* Following settings for email
*/

$config['protocol'] = 'smtp';
$config['smtp_host'] = 'ssl://smtp.gmail.com';
$config['smtp_user'] = 'Your Gmail address';
$config['smtp_pass'] = 'Your Gmail Password';
$config['smtp_port'] = '465';