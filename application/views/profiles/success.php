<?php
/**
* view/profile_form/success.php
* view for profiles/success, which is called inside controller: Profile->add()
*
* @package gig-central
* @subpackage application/views/profiles
* @author Max Diediker <mdiediker@gmail.com>
* @author Mike Archambault <michael.arch@gmail.com
* @version 1.1 2018/08/10
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Profile.php
* @todo A nice feature would be to provide a link to the newly created profile.
*/

$this->load->view($this->config->item('theme') . 'header'); //Loads Bootswatch theme and header
?>

<div class="container">
    <p><?php echo 'You successfully submitted a profile!'; ?><p>
    <p><?php echo anchor('profiles/','View Profiles'); ?></p>
</div>


<?php $this->load->view($this->config->item('theme') . 'header'); //Loads Bootswatch theme and footer
?>
