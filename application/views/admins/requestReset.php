<?php
/**
* resetPassword.php helps users reset a forgotten password by sending an email with a unique query string.
* users can then enter a new password that will be salted and hashed and updated in the database
*
* views/admins/resetPassword.php
*
* @package Gig-Central
* @subpackage Admin Controller
* @author Sean Gilliland 
* @version 1.0 2018/06/03
* @link 
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Admin_model.php
* @see Admin.php
* @todo none
*/

?>


<?php $this->load->view($this->config->item('theme') . 'header'); ?>

<div class="container">

<div class="col-lg-10">

<form class="form-horizontal" role="form" method="post" action="reset">
    <fieldset>
      <?php
      $attributes = array('class' => '', 'id' => '');
      echo form_open('Admin', $attributes);
      ?>

    <div class="form-group">
        <legend><h2><strong>Password Reset</strong></h2></legend>
      </div>
  <div class="form-group">
        <label for="email" class="col-lg-3 control-label">Email<span class="required">*</span></label>
          
        <div class="col-lg-6">
          <input id="email" class="form-control" type="email" name="email"  >
        </div>
        <div class="col-lg-3">
        <p style="color: red;"><?php if(!empty($error)) {echo $error;} ?></p>
        <?php echo form_error('not_registered_email'); ?>
        </div>
      </div>

      <div class="form-group text-right">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-6">
            <?php echo form_submit('Submit', 'Submit',"class='btn btn-success'"); ?>
            </div>
        </div>
        <?php echo form_close(); ?>


      </fieldset>
      </form>
      </div>
    </div>


<?php $this->load->view($this->config->item('theme') . 'footer'); ?>
