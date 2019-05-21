<?php

/**
 * views/contact/failed.php
 *
 * Contact index for Gig Central
 * 
 * @package ITC260
 * @subpackage Pages
 * @author Esteban Ginocchio Silva
 * @version 2.0 2016/06/14
 * @license http://www.apache.org/licenses/LICENSE-2.0
 * @see
 * @todo
 */

$this->load->view($this->config->item('theme') . 'header');
?>

<h1>Woops!</h1>
<p>It looks like you didn't check the ReCaptcha validation checkbox! Click on the "Back" button to try again.</p>

<?php
echo '<p>' . anchor('contact/', 'Go back');
?>

<?php
$this->load->view($this->config->item('theme') . 'footer');
?>
