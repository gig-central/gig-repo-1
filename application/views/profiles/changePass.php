<?php
/**
* changepass.php view page for password change profile controller
*
*
* view/profiles/changepass.php
*
* @package itc260-sp18-gig-central
* @subpackage application/views/profiles
* @author Sean Gilliland
* @version 1.0 2018/06/02
* @link 
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Profile_model.php
* @see Profile.php
* @todo none
*/

$this->load->view($this->config->item('theme') . 'header'); //Loads Bootswatch theme and header
?>


<div class="container">

  <div class="col-lg-10">

  <form class="form-horizontal" role="form" method="post" action="changepass">
      <fieldset>
        <?php
        $attributes = array('class' => '', 'id' => '');
        echo form_open('Profile', $attributes);
        ?>

      <div class="form-group">
          <legend><h2><strong>Change Password</strong></h2></legend>
        </div>
    <div class="form-group">
          <label for="old_password" class="col-lg-3 control-label">Current Password <span class="required">*</span></label>
            
          <div class="col-lg-6">
            <input id="old_password" class="form-control" type="password" name="old_password"  >
          </div>
          <div class="col-lg-3">
          <p style="color: red;"><?php if(!empty($error)) {echo $error;} ?></p>
          <?php echo form_error('old_password'); ?>
          </div>
        </div>
        <div class="form-group">
          <label for="password" class="col-lg-3 control-label">New Password <span class="required">*</span></label>
            
          <div class="col-lg-6">
            <input id="new_password" class="form-control" type="password" name="new_password" >
          </div>
          <div class="col-lg-3">
          <?php echo form_error('new_password'); ?>
          </div>
        </div>
        
        <div class="form-group">
          <label for="re_password" class="col-lg-3 control-label">Confirm Password <span class="required">*</span></label>
          <div class="col-lg-6">
            <input id="re_password" class="form-control" type="password" name="re_password">
          </div>
          <div class="col-lg-3">
          <?php echo form_error('re_password'); ?>
          </div>
        </div>

        <div class="form-group text-right">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-6">
            <?php echo form_submit('Submit', 'Save',"class='btn btn-success'"); ?>
            </div>
        </div>
        <?php echo form_close(); ?>


      </fieldset>
      </form>
      </div>
    </div>

<?php
$this->load->view($this->config->item('theme').'footer');
?>
