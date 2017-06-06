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
    <div class="col-lg-8 col-lg-offset-2">
      
      <?php echo validation_errors(); ?>
      <?php $attributes = array('class'=>'form-horizontal');
 echo form_open('contact', $attributes) ?>
 <div class="form-group">
  <h1 class="text-center">Contact Us</h1>
 </div>
      <div class="form-group">
        <label for="name" class="col-lg-3 control-label"><em>Name*</label>
        <div class="col-md-6">
          <input name="name" class="form-control" type="text">
        </div>
      </div>

      <div class="form-group">
      <label for="email" class="col-lg-3 control-label">Email*</label>

      <div class="col-md-6">
        <input name="email" class="form-control" type="email">
      </div>
      </div>
      <div class="form-group">
      <label for="subject" class="col-lg-3 control-label">Subject*</label>

      <div class="col-md-6">

<<<<<<< HEAD
    <input name="Name" type="text">
</div>
<label for="email">Email*</label>

<div class="controls">
    <input name="Email" type="email">
</div>
  <label for="subject">Subject*</label>

<div class="controls">

    <select name="Subject">
=======
        <select name="subject" class="form-control inputstl">
>>>>>>> master

        <option value="General Inquiry" selected="selected">General Help & Feedback</option>
        <option value="Specific Inquiry">Flag Inappropriate Content</option>
        <option value="Stoopid Inquiry">Employer Support</option>
        <option value="Stoopid Inquiry">Job Posting Support</option>
        <option value="Stoopid Inquiry">Press Inquiry</option>
        <option value="Stoopid Inquiry">Partnership Inquiry</option>
        <option value="Stoopid Inquiry">Advertising</option>
    </select>
<<<<<<< HEAD
</div>
<label for="message">Message*</label>
<div class="controls">
  <textarea name="Message" cols="40" rows="5" required></textarea>
</div>
<div class="controls">
  <?php echo $this->recaptcha->render(); ?>
  <input name="submit" class="btn btn-primary" type="submit" value="Submit Message" />
</div>
</form>
=======
      </div>
      </div>
      <div class="form-group">
      <label for="message" class="col-lg-3 control-label">Message*</label>
      <div class="col-md-6">
        <textarea name="message" class="form-control" cols="40" rows="5" required></textarea>
      </div>
      </div>
      <div class="form-group">  
        <?php echo $this->recaptcha->render(); ?>
       </div>
       <fieldset>
         <div class="form-actions col-xs-12 col-md-6 col-lg-9">
        <input name="submit" class="btn btn-default contact-btn" type="submit" value="Submit Message" />
       </div>
       </fieldset>
       
      </div>
      </form>
>>>>>>> master

      <?php
//$this->load->view('themes/bootswatch/footer');
$this->load->view($this->config->item('theme') . 'footer');

?>