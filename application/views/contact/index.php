<?php

/**
 * views/contact/index.php
 *
 * Contact index for Gig Central
 * 
 * @package ITC260
 * @subpackage Pages
 * @author
 * @version 2.0 2016/06/14
 * @license http://www.apache.org/licenses/LICENSE-2.0
 * @see
 * @todo 
 */
 
//$this->load->view('themes/bootswatch/header');
$this->load->view($this->config->item('theme') . 'header');
?>
  <div class="container ">
    <div class="col-lg-4 col-lg-offset-4 well">
      <?php $attributes = array('class'=>'form-horizontal');
 echo form_open('contact', $attributes) ?>
      <div class="form-group">
        <h1 class="text-center">Contact Us</h1>
      </div>
      <div class="form-group">
        <label for="name" class="col-lg-3 control-label hidden">Name</label>
          <?php echo form_error('Name'); ?>
        <input name="Name" class="form-control" type="text" id="name" placeholder="Name" value="<?php echo set_value('Name'); ?>">
      </div>
      <div class="form-group">
        <label for="email" class="col-lg-3 control-label hidden">Email</label>
          <?php echo form_error('Email'); ?>
        <input name="Email" class="form-control" type="email" placeholder="Email" value="<?php echo set_value('Email'); ?>">
      </div>
      <div class="form-group">
        <label for="subject" class="col-lg-3 control-label hidden">Subject</label>
        <select name="Subject" class="form-control inputstl">
          <option value="General Help & Feedback" selected="selected">General Help & Feedback</option>
          <option value="Flag Inappropriate Content">Flag Inappropriate Content</option>
          <option value="Employer Support">Employer Support</option>
          <option value="Job Posting Support">Job Posting Support</option>
          <option value="Press Inquiry">Press Inquiry</option>
          <option value="Partnership Inquiry">Partnership Inquiry</option>
          <option value="Advertising">Advertising</option>
        </select>
      </div>  
    <div class="form-group">
      <label for="message" class="col-lg-3 control-label hidden">Message</label>
        <?php echo form_error('Message'); ?>
      <textarea name="Message" class="form-control" cols="40" rows="5" placeholder="Message"><?php echo set_value('Message'); ?></textarea>
    </div>
    <div class="form-group">
      <?php echo $this->recaptcha->render(); ?>
    </div>
    
      <div class="form-group">
        <input name="submit" class="btn btn-default btn-block" type="submit" value="Submit Message" />
      </div>
  </form>
</div>
</div>
  <?php
//$this->load->view('themes/bootswatch/footer'); -old code
$this->load->view($this->config->item('theme') . 'footer');

?>