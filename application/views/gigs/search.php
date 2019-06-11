<?php
/**
* search.php displays search results for gigs
*
* views/gigs/search.php
*
* @package ITC 260 Gig Central CodeIgnitor
* @subpackage Gig Controller
* @author Sophia Allen
* @version 1.0 2015/05/25
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Gig_model.php
* @see Gig.php
*/
?>

<?php $this->load->view($this->config->item('theme') . 'header'); ?>


<ul class="breadcrumb">
  <li><a href="#">Home</a></li>
  <li class="active">Gigs</li>
</ul>


<h2><?=$title;?></h2>

<form class="navbar-form navbar-left" role="search" method="post" action="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Enter a Keyword..." name="keyword">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
</form>

<div id="gigs">
<?php if ($gigs === null): ?>
	<h3>Sorry, no results found. Please try again.</h3>
<?php else: ?>
	<h3><strong>Results found:</strong></h3>
	<hr/>
	<?php foreach ($gigs as $gig): ?>
	<h3><?php echo $gig['Name'] ?></h3>
	<p><?php echo $gig['CompanyCity'] . ", " . $gig['CompanyState'] ?></p>
	<p><?php echo $gig['GigOutline'] ?></p>
	<p><?php echo anchor('gig/'.$gig['GigID'] , 'Read More');?></p>
	<?php endforeach ?>
<?php endif ?>
</div>

<?php $this->load->view($this->config->item('theme') . 'footer'); ?>
