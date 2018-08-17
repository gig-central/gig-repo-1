<?php
/**
* index.php is the view page of all gigs for Gigs controller
*
* views/gigs/index.php
*
* @package ITC 260 Gig Central CodeIgnitor
* @subpackage Gig Controller
* @author Patricia Barker <pbarke01@seattlecentral.edu>
* @version 1.0 2015/05/25
* @link http://www.tcbcommercialproperties.com/sandbox/ci/
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Gig_model.php
* @see Gig.php
* @todo none
*/
?>

<?php $this->load->view($this->config->item('theme') . 'header'); ?>


<ul class="breadcrumb">
  <li><a href="<?=base_url()?>">Home</a></li>
  <li class="active">Gigs</li>
</ul>


<h2>Gigs List</h2>

<form class="navbar-form navbar-left" role="search" method="post" action="gig/search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Enter a Keyword..." name="keyword">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
</form>
<br>
<div class="container-fluid">
<h1>&nbsp;</h1>
  <div class="row">
      
    <div class="col-sm-6">
        <?php foreach ($gigs as $gig): ?>
        <h3><?php echo $gig['Name'] ?></h3>
        <p><?php echo $gig['CompanyCity'] . ", " . $gig['State'] ?></p>
        <p><?php echo $gig['GigOutline'] ?></p>
        <p><?php echo anchor('gig/'.$gig['GigID'] , 'Read More');?></p>
        <?php endforeach ?>
      </div>
      
    <div class="col-sm-6">
        <h2>Filter</h2>
        <form role="filter" method="post" action="gig/filter">
        <div class="form-group">
        <button type="submit" class="btn btn-primary">Go</button>
        <label>Type of Job: </label>
          <select name="GigOutline">
            <?php foreach ($gigs as $gig): ?>
              <option value="<?=$gig['GigOutline']?>"><?=$gig['GigOutline']?></option>
            <?php endforeach ?>
            </select>        
            </div>
        </form>


        <form role="filter" method="post" action="gig/filter">
        <div class="form-group">
        <button type="submit" class="btn btn-primary">Go</button>
        <label>City: </label>
          <select name="CompanyCity">
            <?php foreach ($gigs as $gig): ?>
              <option value="<?=$gig['CompanyCity']?>"><?=$gig['CompanyCity']?></option>
            <?php endforeach ?>
            </select>
            </div>
        </form>

        <form role="filter" method="post" action="gig/filter">
        <div class="form-group">
        <button type="submit" class="btn btn-primary">Go</button>
        <label>Company Name: </label>
          <select name="Name">
            <?php foreach ($gigs as $gig): ?>
              <option value="<?=$gig['Name']?>"><?=$gig['Name']?></option>
            <?php endforeach ?>
            </select>
            </div>
        </form>
      </div>
  </div>
</div>

<?php $this->load->view($this->config->item('theme') . 'footer'); ?>
