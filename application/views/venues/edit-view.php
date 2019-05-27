<?php
/**
* view.php view page for generic Venue controller
*
* views/venues/view.php
*
* @package ITC 260 Gig Central CodeIgnitor
* @subpackage Gig
* @author Anna Atiagina, Jenny Crimp
* @version 2.0 2015/08/11
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Venues_model.php
* @see Venues.php
* @todo none
*/
 
$this->load->view($this->config->item('theme').'header');
$attributes = array('class'=>'form-horizontal', 'role'=>'form');
//$this->load->library('passphraseclass');
//$this->passphraseclass->passphrase();
?>


<ul class="breadcrumb">
  <li><a href="<?php echo base_url();?>">Home</a></li>
  <li><a href="<?php echo base_url();?>venues/edit">Edit Venues</a></li>
  <li class="active"><?php echo $venue['VenueName']; ?></li>
</ul>

<div class="container">
  <div class="col-lg-10">
      <!--error messages for form validation -->

      <?php echo form_open('venues/edit', $attributes); ?>
        <!--<form class="form-horizontal" role="form" method="post">-->

            <fieldset>
                <div class="form-group">
                <h1><strong>Edit <?=$venue['VenueName']?></strong></h1><br />
                <legend><h3><strong>Venue Information</strong></h3></legend>

            </div>
            <div class="form-group">
                <label for="VenueName" class="col-lg-3 control-label" required><em>Venue Name</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('VenueName'); ?>
                        <input type="text" class="form-control" id="VenueName" name="VenueName" value="<?=$venue['VenueName']?>">
                    </div>
            </div>

            <div class="form-group">
                <label for="VenueAddress" class="col-lg-3 control-label" required><em>Venue Address</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('VenueAddress'); ?>
                        <input type="text" class="form-control" id="VenueAddress" name="VenueAddress" value="<?=$venue['VenueAddress']?>">
                    </div>
            </div>
            <div class="form-group">
                <label for="City" class="col-lg-3 control-label"><em>City</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('City'); ?>
                        <input type="text" class="form-control" id="City" name="City" value="<?=$venue['City']?>">
                    </div>
            </div>
            <div class="form-group">
                <label for="State" class="col-lg-3 control-label"><em>State</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('State'); ?>
                        <input type="text" class="form-control" id="State" name="State" value="<?=$venue['State']?>">
                    </div>
            </div>
            <div class="form-group">
                <label for="ZipCode" class="col-lg-3 control-label"><em>Zip Code</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('ZipCode'); ?>
                        <input type="text" class="form-control" id="ZipCode" name="ZipCode" value="<?=$venue['ZipCode']?>">
                    </div>
            </div>
            <div class="form-group">
                <label for="VenuePhone" class="col-lg-3 control-label"><em>Phone number</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('VenuePhone'); ?>
                        <input type="text" class="form-control" id="VenuePhone" name="VenuePhone" value="<?=$venue['VenuePhone']?>">
                    </div>
             </div>
            <div class="form-group">
                <label for="VenueWebsite" class="col-lg-3 control-label"><em>Website</em></label>
                    <div class="col-md-6">
                        <input type="text" class="form-control" id="VenueWebsite" name="VenueWebsite" value="<?=$venue['VenueWebsite']?>">
                    </div>
            </div>
           <div class="form-group">
            <label for="VenueHours" class="col-lg-3 control-label"><em>Hours</em></label>
                <div class="col-md-6">
                  <input type="text" class="form-control" id="VenueHours" name="VenueHours" value="<?=$venue['VenueHours']?>">
                </div>
           </div>
          <div class="form-group">
              <label for="VenueTypeKey" class="col-lg-3 control-label"><em>Venue Type</em></label>
                  <div class="col-md-6">
                      <select class="form-control" id="VenueTypeKey" name="VenueTypeKey">
                          <option value="select">Select One</option>
                          <option value="1" <?php echo ($venue['VenueTypeKey'] == "1") ? "selected": ""?>>Cafe/Coffee Shops</option>
                          <option value="2" <?php echo ($venue['VenueTypeKey'] == "2") ? "selected": ""?>>Library</option>
                          <option value="3" <?php echo ($venue['VenueTypeKey'] == "3") ? "selected": ""?>>School</option>
                          <option value="4" <?php echo ($venue['VenueTypeKey'] == "4") ? "selected": ""?>>Community Center</option>
                          <option value="5" <?php echo ($venue['VenueTypeKey'] == "5") ? "selected": ""?>>Other</option>
                      </select>
                  </div>
                </div>
            <!--<div class="form-group">
            <label for="VenuePostDate" class="col-lg-3 control-label"><em>Venue Post Date</em></label><br>
                <div class="col-md-6">
                  <input type="text" class="form-control" id="VenuePostDate" name="VenuePostDate" placeholder="Venue Post Date" value="<//?php echo set_value('VenuePostDate'); ?>">
                </div>
           </div>-->
           <div class="form-group">
            <label for="VenueExpirationDate" class="col-lg-3 control-label"><em>Venue Expiration Date</em></label><br>
                <div class="col-md-6"> 
                  <?php $attrib = 'id="VenueExpirationDate" placeholder="Venue Expiration Date"';  
                    echo form_input('VenueExpirationDate', set_value('VenueExpirationDate'), $attrib); ?> 
                    
                 <!-- <input type="text" class="form-control hasDatepicker" id="VenueExpirationDate" name="VenueExpirationDate" placeholder="Venue Expiration Date" value="<?php echo set_value('VenueExpirationDate'); ?>"> -->
                </div>
           </div>
        </fieldset>

        <fieldset>
        <legend><h3><strong>Venue Amenities</strong></h3></legend>
           <div class="form-group">
              <label for="Food" class="col-lg-3 control-label"><em>Venue Amenities</em></label>
                  <div class="col-md-6">

                      <div class="form-group">
                          <label class="radio-inline">
                            <strong>Food:</strong>
                          </label>
                          <label class="radio-inline">
                            <input type="radio" name="Food" value="Yes" <?php echo ($venue['Food'] == "Yes") ? "checked": ""?>>Yes
                           </label>
                          <label class="radio-inline">
                            <input type="radio" name="Food" value="No" <?php echo ($venue['Food'] == "No") ? "checked": ""?>>No
                          </label>
                        </div>
                      <div class="form-group">
                        <label class="radio-inline">
                                <strong>Bar:</strong>
                            </label>
                         <label class="radio-inline">
                                <input type="radio" name="Bar" value="Yes" <?php echo ($venue['Bar'] == "Yes") ? "checked": ""?>>Yes
                          </label>
                          <label class="radio-inline">
                        <input type="radio" name="Bar" value="No" <?php echo ($venue['Bar'] == "No") ? "checked": ""?>>No<br />
                          </label>
                      </div>
                      <div class="form-group">
                        <label class="radio-inline">
                            <strong>Electrical Outlets:</strong>
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Outlets" value="Yes" <?php echo ($venue['Outlets'] == "Yes") ? "checked": ""?>>Yes
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Outlets" value="No" <?php echo ($venue['Outlets'] == "No") ? "checked": ""?>>No
                        </label>
                      </div>
                      <div class="form-group">
                        <label class="radio-inline">
                            <strong>WiFi:</strong>
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="WiFi" value="Yes" <?php echo ($venue['WiFi'] == "Yes") ? "checked": ""?>>Yes
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="WiFi" value="No" <?php echo ($venue['WiFi'] == "No") ? "checked": ""?>>No
                        </label>
                      </div>
                      <div class="form-group">
                        <label class="radio-inline">
                            <strong>Outdoor Seating:</strong>
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Outdoor" value="Yes" <?php echo ($venue['Outdoor'] == "Yes") ? "checked": ""?>>Yes
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Outdoor" value="No" <?php echo ($venue['Outdoor'] == "No") ? "checked": ""?>>No
                        </label>
                      </div>
                      <div class="form-group">
                        <label class="radio-inline">
                            <strong>Wheelchair Access:</strong>
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Wheelchair" value="Yes" <?php echo ($venue['Wheelchair'] == "Yes") ? "checked": ""?>>Yes
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Wheelchair" value="No" <?php echo ($venue['Wheelchair'] == "No") ? "checked": ""?>>No
                        </label>
                      </div>
                      <div class="form-group">
                        <label class="radio-inline">
                            <strong>Parking:</strong>
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Parking" value="Yes" <?php echo ($venue['Parking'] == "Yes") ? "checked": ""?>>Yes
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Parking" value="No" <?php echo ($venue['Parking'] == "No") ? "checked": ""?>>No
                        </label>
                      </div>
                      <div class="border2">
                      <button type="submit" name="VenueKey" value="<?php echo $venue['VenueKey']?>" class="btn btn-default">Submit</button>
                      </div>
               </div>
            </div>
      </fieldset>
    </div>
</div>
<?php $this->load->view($this->config->item('theme') . 'footer'); 