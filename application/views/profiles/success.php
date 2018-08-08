<?php
/**
* index.php view page for generic profile_form controller
*
*
*view/profile_form/index.php
*
* @package MediumLARGE_PIECE_OF_PROGRAM
* @subpackage Profile_form
* @author Max Diediker <mdiediker@gmail.com>
* @version 1.0 2015/05/21
* @link http://www.example.com/
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Profile_form_model.php
* @see Profile_form.php
* @todo none
*/

$this->load->view($this->config->item('theme') . 'header'); //Loads Bootswatch theme and header
?>

<!--
/**
* Form that accepts data
*
*
* @param none
* @return void
* @todo none
*/
-->

<div class="container">
    <p><?php echo 'You successfully submitted a profile!'; ?><p>
    <p><?php echo anchor('profiles/','View Profiles'); ?></p>
</div>


<?php $this->load->view($this->config->item('theme') . 'header'); //Loads Bootswatch theme and footer
?>
