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

        <!-- right column: search form and filter form -->
        <div class="col-sm-3 gig-search">
            <!-- gig search field -->
            <form role="search" method="post" action="gig/search">
                <h4>Search by Keyword</h4>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Enter a Keyword..." name="keyword">
                </div>
                <button type="submit" class="btn">Search</button>
            </form>

            <!-- gig filter form -->
            <form role="filter" method="post" action="gig/filter">
                <h4>Filter</h4>
                <div class="form-group">
                    <label>Type of Job:<br />
                        <select name="GigOutline">
                            <?php foreach ($gigs as $gig): ?>
                            <option value="<?=$gig['GigOutline']?>"><?=$gig['GigOutline']?></option>
                            <?php endforeach ?>
                        </select>
                    </label>
                </div>

                <div class="form-group">
                    <label>City:<br />
                        <select name="CompanyCity">
                            <?php foreach ($gigs as $gig): ?>
                            <option value="<?=$gig['CompanyCity']?>"><?=$gig['CompanyCity']?></option>
                            <?php endforeach ?>
                        </select>
                    </label>
                </div>

                <div class="form-group">
                    <label>Company Name:<br />
                        <select name="Name">
                            <?php foreach ($gigs as $gig): ?>
                            <option value="<?=$gig['Name']?>"><?=$gig['Name']?></option>
                            <?php endforeach ?>
                        </select>
                    </label>
                </div>

                <button type="submit" class="btn">Filter</button>

            </form>
        </div><!-- .col-sm-6 -->
        <!-- END right column: search form and filter form -->

        <!-- left column: lists all gigs -->
        <div class="col-sm-9 gig-list">
            <?php foreach ($gigs as $gig): ?>
                <div class="gig-list-item">
                    <h3><?php echo $gig['Name'] ?></h3>
                    <p><?php echo $gig['CompanyCity'] . ", " . $gig['State'] ?></p>
                    <p><?php echo $gig['GigOutline'] ?></p>
                    <p><?php echo anchor('gig/'.$gig['GigID'] , 'Read More');?></p>
                </div>
            <?php endforeach ?>
        </div>

    </div><!-- .row -->
</div><!-- .container-fluid -->

<?php $this->load->view($this->config->item('theme') . 'footer'); ?>
