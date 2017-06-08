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
      <?php echo validation_errors(); ?>
      <?php $attributes = array('class'=>'form-horizontal');
 echo form_open('contact', $attributes) ?>
      <div class="form-group">
        <h1 class="text-center">Contact Us</h1>
      </div>
      <div class="form-group">
        <label for="name" class="col-lg-3 control-label hidden">Name</label>
        <input name="Name" class="form-control" type="text" id="name" placeholder="Name">
      </div>
      <div class="form-group">
        <label for="email" class="col-lg-3 control-label hidden">Email</label>
        <input name="Email" class="form-control" type="email" placeholder="Email">
      </div>
      <div class="form-group">
        <label for="subject" class="col-lg-3 control-label hidden">Subject</label>
        <select name="Subject" class="form-control inputstl">
          <option value="General Inquiry" selected="selected">General Help & Feedback</option>
          <option value="Specific Inquiry">Flag Inappropriate Content</option>
          <option value="Stoopid Inquiry">Employer Support</option>
          <option value="Stoopid Inquiry">Job Posting Support</option>
          <option value="Stoopid Inquiry">Press Inquiry</option>
          <option value="Stoopid Inquiry">Partnership Inquiry</option>
          <option value="Stoopid Inquiry">Advertising</option>
        </select>
      </div>  
    <div class="form-group">
      <label for="message" class="col-lg-3 control-label hidden">Message</label>
      <textarea name="Message" class="form-control" cols="40" rows="5" required placeholder="Your message goes here"></textarea>
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