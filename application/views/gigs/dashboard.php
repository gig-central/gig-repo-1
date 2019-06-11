<?php
/**
* dashboard.php is the view component/page that summarizes the top four job types available
*
* views/gigs/dashboard.php
*
* @package ITC 260 Gig Central CodeIgnitor
* @subpackage Gig Controller
* @author Craig Peterson <craig.peterson@seattlecentral.edu>
* @version 0.1 2019/06/10
* @link https://craigpeterson.dev/school/itc260/gig-central/
* @license http://www.apache.org/licenses/LICENSE-2.0
* @see Gig_model.php
* @see Gig.php
* @todo none
*/
?>

<div class="column col-lg-12 col-sm-12 col-xs-12">
    <div class="inner-column">
        <h2>Dashboard</h2>
        <div class="dashboard">
            <?php
                $mostGigs = $gigTypes[0]['NumberOfGigs']; //get number of gigs from top gig type
                $gigsFormat = 'Gigs'; //set format for word 'Gigs' when plural

                for ($i = 0; $i <= 3; $i++) { //only show top four gig types
                    //calculate a percentage to be used to style the "bar graph" part of the dashboard
                    $percentOfGigs = ($gigTypes[$i]['NumberOfGigs'] / $mostGigs) * 100;

                    if ($gigTypes[$i]['NumberOfGigs'] === '1') {
                        $gigsFormat = 'Gig'; //set format for word 'Gig' when singular
                    }
            ?>
            <div class="gig-type" style="width: <?php echo $percentOfGigs?>%"> <!-- bar graph effect created by this inline style -->
                <h3><?=$gigTypes[$i]['NumberOfGigs']?> <?=$gigTypes[$i]['EmploymentType']?> <?=$gigsFormat?></h3>
            </div>
            <!-- creates a query string search request string -->
            <p><?php echo anchor('gig/search/' . $gigTypes[$i]['EmploymentType'], 'View All ' . $gigTypes[$i]['EmploymentType'] . ' Gigs');?></p>
            <?php } //end for loop ?>
        </div>
    </div>
</div>
