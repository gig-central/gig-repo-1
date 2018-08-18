
<?php
/**
* login.php is the login admins page for Admin controller
*
* views/admins/login.php
*
* @package itc-260-sp15-gig-central
* @subpackage Admin Controller
* @author Rattana Neak 
* @version 1.0 2016/05/22
* @link 
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Admin_model.php
* @see Admin.php
* @todo none
*/
?>





<?php $this->load->view($this->config->item('theme').'header'); ?>

<div class="container">
    <div class="col-lg-4 col-lg-offset-4 well">
        <form class="form-horizontal" role="form" method="post">
            <div class="form-group">
  <h1 class="text-center">Log In</h1>
 </div>
            <div class="form-group">
                <label for="Email" class="col-lg-3 control-label hidden">Email address:</label>
                <input type="email" class="form-control" id="Email" name="email" placeholder="Email">
            </div>
            <?php echo form_error('email'); ?>
            <div class="form-group">
                <label for="Pass" class="col-lg-3 control-label hidden">Password:</label>
                <input type="password" class="form-control" id="Pass" name="pass" placeholder="Password">
            </div>
            <?php echo form_error('pass'); ?>
            <?php echo $error; ?>
            <div class="form-group">
            <button type="submit" class="btn btn-default btn-block" name="Submit">Submit</button>
            </div>
        </form>
        
        <a href="<?=base_url()?>admin/reset">Forgot Password?</a><br>
        
        <h2>Not A Member?</h2><br>
        <a href="<?=base_url()?>profiles/add">Register</a>

        
    </div><!-- end row form -->
</div><!-- end .container -->
<?php $this->load->view($this->config->item('theme').'footer'); ?>
