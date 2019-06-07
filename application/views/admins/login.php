<?php
/**
* login.php is the login admins page for Admin controller
*
* views/admins/login.php
*
* @package itc-260-sp15-gig-central
* @subpackage Admin Controller
* @author Rattana Neak, Craig Peterson <craig.peterson@seattlecentral.edu>
* @version 1.1 2019/06/03
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
                <a href="<?=base_url()?>admin/reset">Forgot Password?</a>
            </div>
            <?php echo form_error('pass'); ?>

            <div class="form-group text-center">
                <button type="submit" class="btn" name="Submit">Submit</button>
            </div>
        </form>
    </div><!-- end row form -->
</div><!-- end .container -->

<?php $this->load->view($this->config->item('theme').'footer'); ?>
