<?php
/**
* add.php view page for generic Venue controller
*
* views/venues/add.php
*
* @package ITC 260 Gig Central CodeIgnitor
* @subpackage Venues
* @author Anna Atiagina, Jenny Crimp
* @version 2.0 2015/08/11
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Venues_model.php
* @see Venues.php
* @todo none
*/

$this->load->view($this->config->item('theme').'header');
$attributes = array('class'=>'form-horizontal', 'role'=>'form');
?>
  
<div class="container">
  <div class="col-lg-10">
      <!--error messages for form validation -->
      
      <?php echo form_open('venues/add', $attributes); ?>
        <!--<form class="form-horizontal" role="form" method="post">-->

            <fieldset>
                <div class="form-group">
                <h1><strong>Add a Startup Venue</strong></h1><br />
                    <p>Job seekers and startups alike need public places to meet with potential employers and team members. We hope to provide them with great places they can gather and do business. Or, perhaps, to have something delicious to drink and to brainstorm.</p>
                    <p>Please add your gathering place below. Thanks for the input!</p>
                <legend><h3><strong>Venue Information</strong></h3></legend>

            </div>
            <div class="form-group">
                <label for="VenueName" class="col-lg-3 control-label" required><em>Venue Name</em></label>
                    <div class="col-md-6">
                        
              <?php echo form_error('VenueName'); ?>
                        <input type="text" class="form-control" id="VenueName" name="VenueName" placeholder="Venue Name" value="<?php echo set_value('VenueName'); ?>">
                    </div>
            </div>

            <div class="form-group">
                <label for="VenueAddress" class="col-lg-3 control-label" required><em>Venue Address</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('VenueAddress'); ?>
                        <input type="text" class="form-control" id="VenueAddress" name="VenueAddress" placeholder="Venue Address" value="<?php echo set_value('VenueAddress'); ?>">
                    </div>
            </div>
            <div class="form-group">
                <label for="City" class="col-lg-3 control-label"><em>City</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('City'); ?>
                        <input type="text" class="form-control" id="City" name="City" placeholder="City" value="<?php echo set_value('City'); ?>">
                    </div>
            </div>
            <div class="form-group">
                <label for="State" class="col-lg-3 control-label"><em>State</em></label>
                    <div class="col-md-6">
                       <select class="form-control" id="state" name="state">
                        <option value="">State</option>
                        <option value="AK">Alaska</option>
                        <option value="AL">Alabama</option>
                        <option value="AR">Arkansas</option>
                        <option value="AZ">Arizona</option>
                        <option value="CA">California</option>
                        <option value="CO">Colorado</option>
                        <option value="CT">Connecticut</option>
                        <option value="DC">District of Columbia</option>
                        <option value="DE">Delaware</option>
                        <option value="FL">Florida</option>
                        <option value="GA">Georgia</option>
                        <option value="HI">Hawaii</option>
                        <option value="IA">Iowa</option>
                        <option value="ID">Idaho</option>
                        <option value="IL">Illinois</option>
                        <option value="IN">Indiana</option>
                        <option value="KS">Kansas</option>
                        <option value="KY">Kentucky</option>
                        <option value="LA">Louisiana</option>
                        <option value="MA">Massachusetts</option>
                        <option value="MD">Maryland</option>
                        <option value="ME">Maine</option>
                        <option value="MI">Michigan</option>
                        <option value="MN">Minnesota</option>
                        <option value="MO">Missouri</option>
                        <option value="MS">Mississippi</option>
                        <option value="MT">Montana</option>
                        <option value="NC">North Carolina</option>
                        <option value="ND">North Dakota</option>
                        <option value="NE">Nebraska</option>
                        <option value="NH">New Hampshire</option>
                        <option value="NJ">New Jersey</option>
                        <option value="NM">New Mexico</option>
                        <option value="NV">Nevada</option>
                        <option value="NY">New York</option>
                        <option value="OH">Ohio</option>
                        <option value="OK">Oklahoma</option>
                        <option value="OR">Oregon</option>
                        <option value="PA">Pennsylvania</option>
                        <option value="PR">Puerto Rico</option>
                        <option value="RI">Rhode Island</option>
                        <option value="SC">South Carolina</option>
                        <option value="SD">South Dakota</option>
                        <option value="TN">Tennessee</option>
                        <option value="TX">Texas</option>
                        <option value="UT">Utah</option>
                        <option value="VA">Virginia</option>
                        <option value="VT">Vermont</option>
                        <option value="WA">Washington</option>
                        <option value="WI">Wisconsin</option>
                        <option value="WV">West Virginia</option>
                        <option value="WY">Wyoming</option>
                    </select>

                        
                        
                    </div>
            </div>
            <div class="form-group">
                <label for="ZipCode" class="col-lg-3 control-label"><em>Zip Code</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('ZipCode'); ?>
                        <input type="text" class="form-control" id="ZipCode" name="ZipCode" placeholder="Zip Code" value="<?php echo set_value('ZipCode'); ?>">
                    </div>
            </div>
            <div class="form-group">
                <label for="VenuePhone" class="col-lg-3 control-label"><em>Phone number</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('VenuePhone'); ?>
                        <input type="text" class="form-control" id="VenuePhone" name="VenuePhone" placeholder="Venue Phone Number" value="<?php echo set_value('VenuePhone'); ?>">
                    </div>
             </div>
            <div class="form-group">
                <label for="VenueWebsite" class="col-lg-3 control-label"><em>Website</em></label>
                    <div class="col-md-6">
                        <input type="text" class="form-control" id="VenueWebsite" name="VenueWebsite" placeholder="Venue Website" value="<?php echo set_value('VenueWebsite'); ?>">
                    </div>
            </div>
           <div class="form-group">
            <label for="VenueHours" class="col-lg-3 control-label"><em>Hours</em></label>
                <div class="col-md-6">
                  <input type="text" class="form-control" id="VenueHours" name="VenueHours" placeholder="Venue Hours" value="<?php echo set_value('VenueHours'); ?>">
                </div>
           </div>
          <div class="form-group">
              <label for="VenueTypeKey" class="col-lg-3 control-label"><em>Venue Type </em>
             <a class="btn btn-primary" data-toggle="collapse" href="#collapseExample1" role="button" aria-expanded="false" aria-controls="collapseExample1">?</a>   
            <div class="collapse" id="collapseExample1">
              <div class="card card-body">
                This can help people decide whether they want a quiet or active space to get together in.
              </div>
            </div>
              </label>
                  <div class="col-md-6">
                      <select class="form-control" id="VenueTypeKey" name="VenueTypeKey">
                          <option value="select">Select One</option>
                          <option value="1" <?php echo  set_select('VenueTypeKey', '1'); ?>>Cafe/Coffee Shop</option>
                          <option value="2" <?php echo  set_select('VenueTypeKey', '2'); ?>>Library</option>
                          <option value="3" <?php echo  set_select('VenueTypeKey', '3'); ?>>School</option>
                          <option value="4" <?php echo  set_select('VenueTypeKey', '4'); ?>>Community Center</option>
                          <option value="5" <?php echo  set_select('VenueTypeKey', '5'); ?>>Shared Work Space</option>
                          <option value="6" <?php echo  set_select('VenueTypeKey', '6'); ?>>Other</option>
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
            <label for="VenueExpirationDate" class="col-lg-3 control-label"><em>Venue Expiration Date </em>
            <a class="btn btn-primary" data-toggle="collapse" href="#VenueExpirationHelp" role="button" aria-expanded="false" aria-controls="collapseExample">?</a>   
            <div class="collapse" id="VenueExpirationHelp">
              <div class="VenueExpirationHelp">
                Will this venue be changing their policies on gathering there any time soon?
              </div>
            </div>
            
            </label><br>
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
                            <input type="radio" name="Food" value="Yes" <?php echo set_radio('Food', 'Yes', TRUE); ?>>Yes
                           </label>
                          <label class="radio-inline">
                            <input type="radio" name="Food" value="No" <?php echo set_radio('Food', 'No', TRUE); ?>>No
                          </label>
                        </div>
                      <div class="form-group">
                        <label class="radio-inline">
                                <strong>Bar:</strong>
                            </label>
                         <label class="radio-inline">
                                <input type="radio" name="Bar" value="Yes" <?php echo set_radio('Bar', 'Yes', TRUE); ?>>Yes
                          </label>
                          <label class="radio-inline">
                        <input type="radio" name="Bar" value="No" <?php echo set_radio('Bar', 'No', TRUE); ?>>No<br />
                          </label>
                      </div>
                      <div class="form-group">
                        <label class="radio-inline">
                            <strong>Electrical Outlets:</strong>
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Outlets" value="Yes" <?php echo set_radio('Outlets', 'Yes', TRUE); ?>>Yes
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Outlets" value="No" <?php echo set_radio('Outlets', 'No', TRUE); ?>>No
                        </label>
                      </div>
                      <div class="form-group">
                        <label class="radio-inline">
                            <strong>WiFi:</strong>
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="WiFi" value="Yes" <?php echo set_radio('WiFi', 'Yes', TRUE); ?>>Yes
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="WiFi" value="No" <?php echo set_radio('WiFi', 'No', TRUE); ?>>No
                        </label>
                      </div>
                      <div class="form-group">
                        <label class="radio-inline">
                            <strong>Outdoor Seating:</strong>
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Outdoor" value="Yes" <?php echo set_radio('Outdoor', 'Yes', TRUE); ?>>Yes
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Outdoor" value="No" <?php echo set_radio('Outdoor', 'No', TRUE); ?>>No
                        </label>
                      </div>
 <!--                      <div class="form-group">
                        <label class="radio-inline">
                            <strong>Separate Meeting Room(s):</strong>
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="MeetRoom" value="Yes" <?php echo set_radio('MeetRoom', 'Yes', TRUE); ?>>Yes
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="MeetRoom" value="No" <?php echo set_radio('MeetRoom', 'No', TRUE); ?>>No
                        </label>
                      </div>  -->
                      <div class="form-group">
                        <label class="radio-inline">
                            <strong>Wheelchair Access:</strong>
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Wheelchair" value="Yes" <?php echo set_radio('Wheelchair', 'Yes', TRUE); ?>>Yes
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Wheelchair" value="No" <?php echo set_radio('Wheelchair', 'No', TRUE); ?>>No
                        </label>
                      </div>
                      <div class="form-group">
                        <label class="radio-inline">
                            <strong>Parking:</strong>
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Parking" value="Yes" <?php echo set_radio('Parking', 'Yes', TRUE); ?>>Yes
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="Parking" value="No" <?php echo set_radio('Parking', 'No', TRUE); ?>>No
                        </label>
                      </div>
                      
               </div>
            </div>          

<!--           <div class="form-group">
              <label for="Ambiance" class="col-lg-3 control-label"><em>Venue Ambiance</em></label>
                  <div class="col-md-6">
                      <div class="form-group">
                          <label class="radio-inline">
                            <strong>Loud Music:</strong>
                          </label>
                          <label class="radio-inline">
                            <input type="radio" name="Music" value="Yes" <?php echo set_radio('Music', 'Yes', TRUE); ?>>Yes
                           </label>
                          <label class="radio-inline">
                            <input type="radio" name="Music" value="No" <?php echo set_radio('Music', 'No', TRUE); ?>>No
                          </label>
                        </div>

                      <div class="form-group">
                          <label class="radio-inline">
                            <strong>Loud Conversation:</strong>
                          </label>
                          <label class="radio-inline">
                            <input type="radio" name="Conversation" value="Yes" <?php echo set_radio('Conversation', 'Yes', TRUE); ?>>Yes
                           </label>
                          <label class="radio-inline">
                            <input type="radio" name="Conversation" value="No" <?php echo set_radio('Conversation', 'No', TRUE); ?>>No
                          </label>
                        </div>

                      <div class="form-group">
                          <label class="radio-inline">
                            <strong>Busy Location:</strong>
                          </label>
                          <label class="radio-inline">
                            <input type="radio" name="Busy" value="Yes" <?php echo set_radio('Busy', 'Yes', TRUE); ?>>Yes
                           </label>
                          <label class="radio-inline">
                            <input type="radio" name="Busy" value="No" <?php echo set_radio('Busy', 'No', TRUE); ?>>No
                          </label>
                        </div>
                        <div class="border2">
                        <button type="submit" class="btn btn-default">Submit</button>
                        </div>   
               </div>

            </div>  -->         
      </fieldset>
      
    </div>
</div>

<?php
$this->load->view($this->config->item('theme').'footer'); ?>