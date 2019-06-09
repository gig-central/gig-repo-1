<?php
/**
* add.php is the add gigs page for Gigs controller
*
* views/gigs/add.php
*
* @package ITC 260 Gig Central CodeInitor
* @subpackage Gig view
* @author Patricia Barker <pbarke01@seattlecentral.edu>
* @author Mike Archambault <michael.archambault@seattlecentral.edu
* @author Thom Harrington <thomas.harrington@seattlecentral.edu
* @version 3.1 2019/08/19
* @link tbd
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Gig_model.php
* @see Gig.php
* @todo none
*/
?>


<?php $this->load->view($this->config->item('theme') . 'header'); ?>

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
<!--
                        See implmentaion instructions in the makeDropdownSelect() function documention in helpers/common_helpers.php
                        Also, be sure the stateSelect key/value array is in the custom_config.php file as shown in custom_config_sample.php
-->
                        <?php echo form_error('CompanyState'); ?>
                        <?php echo '
                        <select class="form-control" id="CompanyState" name="CompanyState">
                            <option value="0" selected>Select State</option>' .
                            makeDropdownSelect($this->config->item("stateSelect"), "CompanyState") . '
                        </select>'; ?>
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
<!--
                See implmentaion instructions in the makeDropdownSelect() function documention in helpers/common_helpers.php
                Also, be sure the empolymentType key/value array is in the custom_config.php file as shown in custom_config_sample.php
-->
                <div class="form-group">
                    <label for="EmploymentType" class="col-lg-3 control-label"><em>Employment Type</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('EmploymentType'); ?>
                        <?php echo '
                            <select class="form-control" id="EmploymentType" name="EmploymentType">
                                <option value="0" selected>Select One</option>' .
                                 makeDropdownSelect($this->config->item("employmentTypeSelect"),"EmploymentType") . '
                            </select>';
                        ?>
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
                    <label for="GigDuration" class="col-lg-3 control-label"><em>Employment Duration</em></label>
                        <div class="col-md-6">
                            <?php echo form_error('GigDuration'); ?>
                            <input type="text" class="form-control" id="GigDuration" name="GigDuration" placeholder="Employment Duration" value="<?php echo set_value('GigDuration'); ?>">
                        </div>
                </div>

                <div class="form-group">
                    <label for="GigCloseDate"class="col-lg-3 control-label hidden-label">
                        <em>Close Date</em>
                    </label>
                    <div class="col-md-6">
                        <?php
                            echo form_error('GigCloseDate');
                            $attributes = '
                                id="GigCloseDate" 
                                class="form-control" 
                                name="GigCloseDate" 
                                placeholder="YYYY-MM-DD"';
                            echo form_input('GigCloseDate', set_value('GigCloseDate'), $attributes);
                        ?>
                    </div>
                </div>
                <div class="form-group">
                    <label for="GigOutline" class="col-lg-3 control-label hidden-label"><em>Description</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('GigOutline'); ?>
                        <textarea class="form-control" rows="15" cols="25" id="GigOutline" name="GigOutline" placeholder="Project/Gig Description"><?php echo set_value('GigOutline'); ?></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <label for="GigQualify" class="col-lg-3 control-label hidden-label"><em>Qualifications</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('GigQualify'); ?>
                        <textarea  rows="15" cols="25" class="form-control" id="GigQualify" name="GigQualify" placeholder="Qualifications"><?php echo set_value('GigQualify'); ?></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <label for="SpInstructions" class="col-lg-3 control-label hidden-label"><em>Special Instructions</em></label>
                    <div class="col-md-6">
                        <?php echo form_error('SpInstructions'); ?>
                        <textarea rows="15" cols="25" class="form-control" id="SpInstructions" name="SpInstructions" placeholder="Special Instructions"><?php echo set_value('SpInstructions'); ?></textarea>
                    </div>
                </div>
                <div class="form-group text-right">
                    <div class="col-lg-3"></div>
                    <div class="col-lg-6">
                        <?php echo form_submit('Submit', 'Add',"class='btn'"); ?>
                    </div>
                </div>

                <?php echo form_close(); ?>

            </fieldset>
        </form>
    </div>
</div>
<?php $this->load->view($this->config->item('theme') . 'footer'); ?>
