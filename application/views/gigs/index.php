<?php
/**
* index.php is the view page of all gigs for Gigs controller
*
* views/gigs/index.php
*
* @package ITC 260 Gig Central CodeIgnitor
* @subpackage Gig Controller
* @author Patricia Barker <pbarke01@seattlecentral.edu>, Craig Peterson <craig.peterson@seattlecentral.edu>
* @version 1.1 2019/06/03
* @link http://www.tcbcommercialproperties.com/sandbox/ci/
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Gig_model.php
* @see Gig.php
* @todo none
*/
?>

<?php $this->load->view($this->config->item('theme') . 'header'); ?>

<?php if(isset($_POST['submit'])) {
    $retrived_result = $gig->filter($_POST);
}?>

<ul class="breadcrumb">
  <li><a href="<?=base_url()?>">Home</a></li>
  <li class="active">Gigs</li>
</ul>

<h2 class="page-title">Gigs List</h2>

<div class="container-fluid">
    <!-- why is this here?
    <h1>&nbsp;</h1>
    -->
    <div class="row">

        <!-- left column: search form and filter form -->
        <div class="col-sm-3 gig-search">
            <!-- gig search field -->
            <form role="search" method="post" action="gig/search" class="gig-list-form" id="gig-search-form">
                <h4>Search by Keyword</h4>
                <div class="form-group input-container">
                    <input type="text" class="form-control" placeholder="Enter a Keyword..." name="keyword">
                </div>
                <div class="form-group button-container">
                    <button type="submit" class="btn small-btn">Search</button>
                </div>
            </form>

            <!-- gig filter form -->
            <form role="filter" method="post" action="gig/filter" class="gig-list-form">
                <h4>Filter</h4>
                <div class="form-group">
                    <label>Type of Job:</label>
                    <select name="GigOutline">
                        <?php foreach ($gigs as $gig): ?>
                        <option value="<?=$gig['GigOutline']?>"><?=$gig['GigOutline']?></option>
                        <?php endforeach ?>
                    </select>
                </div>

                <div class="form-group">
                    <label>City:</label>
                    <select name="CompanyCity">
                        <?php foreach ($gigs as $gig): ?>
                        <option value="<?=$gig['CompanyCity']?>"><?=$gig['CompanyCity']?></option>
                        <?php endforeach ?>
                    </select>
                </div>

                <div class="form-group button-container">
                    <button type="submit" class="btn small-btn">Apply Filter</button>
                </div>

            </form>
        </div><!-- .col-sm-6 -->
        <!-- END left column: search form and filter form -->

        <!-- right column: lists all gigs -->
        <div class="col-sm-9 gig-list">
            <?php foreach ($gigs as $gig): ?>
                
                <div class="gig-list-header">
                        <h3 class="gig-list-title"><?php echo $gig['EmploymentType'] ?></h3>
                        <p class="gig-list-subtitle"><?php echo $gig['CompanyCity'] . ", " . $gig['CompanyState'] ?></p>
                </div>
                <div class="gig-list-item">
                    <p class="gig-list-subheader text-info">Description: </p><p><?php 
                        if($gig['GigOutline']){echo $gig['GigOutline'];}
                        else{echo 'N/A';}?>
                        </p>
                    <p class="gig-list-subheader text-info">Technologies: </p><p><?php 
                        if($gig['GigQualify']){echo $gig['GigQualify'];}
                        else{echo 'N/A';}?>
                    </p>
                    <p class="gig-list-subheader text-info">Duration: </p><p><?php 
                        if($gig['GigDuration']){echo $gig['GigDuration'];}
                        else{echo 'N/A';}?>
                    </p>
                    <p><?php echo anchor('gig/'.$gig['GigID'] , 'Read More');?></p>
                </div>
            <?php endforeach ?>
        </div>

    </div><!-- .row -->
</div><!-- .container-fluid -->

<?php $this->load->view($this->config->item('theme') . 'footer'); ?>
