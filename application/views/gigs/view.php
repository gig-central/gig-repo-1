<?php
/**
* view.php is view page for an individual gig for Gigs controller
*
* views/gigs/view.php
* 
* @package ITC 260 Gig Central CodeIgnitor
* @subpackage Gig Controller
* @author Patricia Barker <pbarke01@seattlecentral.edu>
* @version 2.2 2015/06/11
* @link http://www.tcbcommercialproperties.com/sandbox/codeignitor/
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Gig_model.php
* @see Gig.php
* @todo none
*/
?>
    <?php $this->load->view($this->config->item('theme') . 'header'); ?>

    <ul class="breadcrumb">
        <li><a href="<?php echo base_url();?>">Home</a></li>
        <li><a href="<?php echo base_url();?>gig">Gigs</a></li>
        <li class="active">
            <?php echo $gig['Name']; ?>
        </li>
    </ul>

    <div class="container list-group row">
        <div class="col-md-6">
        <div class="list-group-item">
            <h2 class="list-group-item-heading">
                <?php echo $gig['Name']; ?>
            </h2>
            <ul class="list-group-item-text">
                <li>
                    <b>Company Address: </b><a target="blank" href="https://www.google.com/maps/place/<?php echo $gig['Address']; ?>,<?php echo $gig['CompanyCity']; ?>"><?php echo $gig['Address'] . ", " . $gig['CompanyCity']  . ", " .  $gig['State']; ?></a>  
                </li>
                <li>
                    <b>Website: </b>
                    <a target="blank" href="<?php echo $gig['Website']; ?>">
                        <?php echo $gig['Website']; ?>
                    </a>
                </li>
            </ul>
        </div>
        <div class="list-group-item">
            <h2 class="list-group-item-heading">
                Gig Details
            </h2>
            <ul class="list-group-item-text">
                <li>
                    <b>Employment Type: </b>
                    <?php echo $gig['EmploymentType']; ?>
                </li>
                <li>
                    <b>Gig Close: </b>
                    <?php echo $gig['GigCloseDate']; ?>
                </li>
                <li>
                    <b>Gig information: </b>
                    <?php echo $gig['GigOutline']; ?>
                </li>
                <li>
                    <b>Special Instructions: </b>
                    <?php echo $gig['SpInstructions']; ?>
                </li>
                <li>
                    <b>Pay Rate: </b>
                    <?php echo $gig['PayRate']; ?>
                </li>
                <li>
                    <b>Date Posted: </b>
                    <?php echo $gig['GigPosted']; ?>
                </li>
            </ul>
        </div>
        </div>

        <div class="col-md-6">
    <div class="list-group-item">
        <h2 class="list-group-item-heading">
            Contact
        </h2>
        <ul class="list-group-item-text">
            <li>
                <b>Contact Name: </b>
                <?php echo $gig['FirstName'] . " " . $gig['LastName']; ?>
            </li>
            <li>
                <b>Email: </b>
                <a href="mailto:<?php echo $gig['Email']; ?>"><?php echo $gig['Email']; ?></a>
            </li>
            <li>
                <b>Phone: </b>
                <a href="tel:<?php echo $gig['Phone']; ?>"><?php echo $gig['Phone']; ?></a>
                
            </li>
            <?php if ($this->session->logged_in == TRUE && $this->gig_model->find_post_id($userId) == TRUE) : ?>
                <li><a class="btn btn-warning" href="<?php echo site_url("gig/edit/".$gig["GigID"])?>">Edit</a></li>
            `<br>
                <li><a class="btn btn-warning " href="<?php echo site_url("gig/delete/".$gig["GigID"])?>">Delete</a></li>

            <?php elseif ($this->session->logged_in == TRUE && $this->gig_model->find_post_id($userId) == FALSE) : ?>
                <li><a class="btn btn-warning " href="<?php echo $gig["Website"]; ?>">Apply</a></li>
            
            <?php else : ?>
                <li><a class="btn btn-warning " href="<?php echo $gig["Website"]; ?>">Apply</a></li>
            <?php endif; ?>
        </ul>
    </div>
    </div>
    </div>
    
    <?php $this->load->view($this->config->item('theme') . 'footer'); ?>