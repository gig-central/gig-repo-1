<?php
/**
* add.php is the add gigs page for Gigs controller
*
* views/gigs/add.php
*
* @package ITC 260 Gig Central CodeInitor
* @subpackage Gig Controller
* @author Patricia Barker <pbarke01@seattlecentral.edu>
* @author Mike Archambault <michael.archambault@seattlecentral.edu
* @version 3.0 2018/08/19
* @link http://www.tcbcommercialproperties.com/sandbox/codeignitor/
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Gig_model.php
* @see Gig.php
* @todo Change CompanyState field to be a dropdown instead of text
* @todo Fix validation for Gig Type
*/
?>


<?php $this->load->view($this->config->item('theme') . 'headerjqueryui'); ?>

<h1>Please note, if you do not login or create an account before posting a gig, you will be unable to make changes to or delete it after it has been posted</h1>

<div class="container">
    <div class="col-lg-10">
        <form class="form-horizontal" role="form" method="post" action="add">
            <fieldset>
                <?php
                    $attributes = array('class' => '', 'id' => '');
                    echo form_open('Gig', $attributes);
                ?>

                <div class="form-group">
                    <h1><strong>Add a Gig</strong></h1><br />
                    <legend><h3><strong>Company Information</strong></h3></legend>
                </div>
                <div class="form-group">
                    <label for="Name" class="col-lg-3 control-label"><em>Company Name</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('Name'); ?>
                        <input type="text" class="form-control" id="Name" name="Name" placeholder="Company Name" value="<?php echo set_value('Name'); ?>">
                    </div>
                </div>
                <div class="form-group">
                    <label for="CompanyAddress" class="col-lg-3 control-label"><em>Company Address</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('CompanyAddress'); ?>
                        <input type="text" class="form-control" id="CompanyAddress" name="CompanyAddress" placeholder="Company Address" value="<?php echo set_value('CompanyAddress'); ?>">
                    </div>
                </div>
                <div class="form-group">
                    <label for="CompanyCity" class="col-lg-3 control-label"><em>City</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('CompanyCity'); ?>
                        <input type="text" class="form-control" id="CompanyCity" name="CompanyCity" placeholder="City" value="<?php echo set_value('CompanyCity'); ?>">
                    </div>
                </div>
                <div class="form-group">
                    <label for="CompanyState" class="col-lg-3 control-label"><em>State</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('CompanyState'); ?>
                        <!-- CompanyState is temporarily a text field just to get code working -->
                        <input type="text" class="form-control" id="CompanyState" name="CompanyState" placeholder="State" value="<?php echo set_value('CompanyState'); ?>">
                        <!-- This html code below should be fixed so that State can be dropcown -->
                        <!-- <select class="form-control" id="CompanyState" name="CompanyState"> -->
                            <!-- <option value="">State</option>
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
                        </select> -->
                    </div>
                </div>
                <div class="form-group">
                    <label for="ZipCode" class="col-lg-3 control-label"><em>Zip Code</em></label>
                    <div class="col-md-6">
                        <input type="text" class="form-control" id="ZipCode" name="ZipCode" placeholder="Zip Code" value="<?php echo set_value('ZipCode'); ?>">
                    </div>
                </div>
                <div class="form-group">
                    <label for="CompanyPhone" class="col-lg-3 control-label"><em>Company Phone</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('CompanyPhone'); ?>
                        <input type="text" class="form-control" id="CompanyPhone" name="CompanyPhone" placeholder="Phone Number" value="<?php echo set_value('CompanyPhone'); ?>">
                    </div>
                </div>
                <div class="form-group">
                    <label for="CompanyWebsite" class="col-lg-3 control-label"><em>Company Website</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('CompanyWebsite'); ?>
                        <input type="text" class="form-control" id="CompanyWebsite" name="CompanyWebsite" placeholder="Company Website" value="<?php echo set_value('CompanyWebsite'); ?>">
                    </div>
                </div>
                <div class="form-group">
                    <legend><h3><strong>Company Gig Contact</strong></h3></legend>
                </div>
                <div class="form-group">
                    <label for="FirstName" class="col-lg-3 control-label"><em>First Name</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('FirstName'); ?>
                        <input type="text" class="form-control" id="FirstName" name="FirstName" placeholder="First Name" value="<?php echo set_value('FirstName'); ?>">
                    </div>
                </div>
                <div class="form-group">
                    <label for="LastName" class="col-lg-3 control-label"><em>Last Name</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('LastName'); ?>
                        <input type="text" class="form-control" id="LastName" name="LastName" placeholder="Last Name" value="<?php echo set_value('LastName'); ?>">
                    </div>
                </div>
                <div class="form-group">
                    <label for="Email" class="col-lg-3 control-label"><em>Email</em></label>
                        <div class="col-md-6">
                            <?php echo form_error('Email'); ?>
                            <input type="text" class="form-control" id="Email" name="Email" placeholder="Gig Contact Email" value="<?php echo set_value('Email'); ?>">
                        </div>
                </div>
                <div class="form-group">
                    <label for="Phone" class="col-lg-3 control-label"><em>Phone</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('Phone'); ?>
                        <input type="text" class="form-control" id="Phone" name="Phone" placeholder="Gig Contact Phone" value="<?php echo set_value('Phone'); ?>">
                    </div>
                </div>
                <div class="form-group">
                    <legend><h3><strong>Gig Information</strong></h3></legend>
                </div>
                <div class="form-group">
                    <label for="EmploymentType" class="col-lg-3 control-label"><em>Employment Type</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('EmploymentType'); ?>
                        <select class="form-control" id="EmploymentType" name="EmploymentType">
                            <option value="0">Select One</option>
                            <option value="contract" <?php echo set_select('EmploymentType', 'contract'); ?>>Contract</option>
                            <option value="intern" <?php echo set_select('EmploymentType', 'intern'); ?>>Intern</option>
                            <option value="temporary" <?php echo set_select('EmploymentType', 'temporary'); ?>>Temporary</option>
                            <option value="permanent" <?php echo set_select('EmploymentType', 'permanent'); ?>>Permanent</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="PayRate" class="col-lg-3 control-label"><em>Pay rate</em></label>
                        <div class="col-md-6">
                            <?php echo form_error('PayRate'); ?>
                            <input type="text" class="form-control" id="PayRate" name="PayRate" placeholder="Pay rate" value="<?php echo set_value('PayRate'); ?>">
                        </div>
                </div>
                <div class="form-group">
                    <label for="GigCloseDate"class="col-lg-3 control-label hidden-label">
                        <em>Gig Close Date</em>
                    </label>
                    <div class="col-md-6">
                        <?php
                            echo form_error('GigCloseDate');
                            $attributes = 'id="GigCloseDate" placeholder="Gig close date"';
                            echo form_input('GigCloseDate', set_value('GigCloseDate'), $attributes);
                        ?>
                    </div>
                </div>
                <div class="form-group">
                    <label for="GigOutline" class="col-lg-3 control-label hidden-label"><em>Gig Description</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('GigOutline'); ?>
                        <textarea class="form-control" rows="15" cols="25" id="GigOutline" name="GigOutline" placeholder="Project/Gig Description"><?php echo set_value('GigOutline'); ?></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <label for="GigQualify" class="col-lg-3 control-label hidden-label"><em>Gig Qualifications</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('GigQualify'); ?>
                        <textarea  rows="15" cols="25" class="form-control" id="GigQualify" name="GigQualify" placeholder="Qualifications"><?php echo set_value('GigQualify'); ?></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <label for="SpInstructions" class="col-lg-3 control-label hidden-label"><em>Gig Special Instructions</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('SpInstructions'); ?>
                        <textarea rows="15" cols="25" class="form-control" id="SpInstructions" name="SpInstructions" placeholder="Special Instructions"><?php echo set_value('SpInstructions'); ?></textarea>
                    </div>
                </div>
                <div class="form-group text-right">
                    <div class="col-lg-3"></div>
                    <div class="col-lg-6">
                        <?php echo form_submit('Submit', 'Add',"class='btn btn-success'"); ?>
                    </div>
                </div>

                <?php echo form_close(); ?>

            </fieldset>
        </form>
    </div>
</div>
<?php $this->load->view($this->config->item('theme') . 'footerjqueryui'); ?>
