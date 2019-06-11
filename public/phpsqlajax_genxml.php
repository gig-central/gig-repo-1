<?php
/**
 * public/phpsqlajax_genxml.php
 *
 * file for generating xml from map data
 *
 * @package GigCentral
 * @subpackage StartupMap
 * @author Kate Lee, John Gilmer
 * @version 2.0 2017/5/09
 * @link
 * @license http://www.apache.org/licenses/LICENSE-2.0
 * @see public/phpsqlajax_dbinfo.php
 * @see header.php
 * 
 * @todo none
*/
define('BASEPATH', "placeholder");

include_once('../application/config/database.php');

function parseToXML($htmlStr)
{
$xmlStr=str_replace('<','&lt;',$htmlStr);
$xmlStr=str_replace('>','&gt;',$xmlStr);
$xmlStr=str_replace('"','&quot;',$xmlStr);
$xmlStr=str_replace("'",'&#39;',$xmlStr);
$xmlStr=str_replace("&",'&amp;',$xmlStr);
return $xmlStr;
}

//mysqli object
$db=$db['default'];
$mysqli = new mysqli($db['hostname'], $db['username'], $db['password'], $db['database']);

/* check connection */
if ($mysqli->connect_error) {
    printf("Connect failed: %s\n", $mysqli->connect_error);
    exit();
}

//join tables - use inner joins to link all 3 tables (Gigs, Markers, Company)
$query = 
    "SELECT lat, lng, EmploymentType, Name, Address
    FROM Gigs g
    Inner Join Markers m on m.GigID = g.GigID
    Inner join Company c on c.CompanyID = g.CompanyID";

/* Select queries return a resultset */
if ($result = $mysqli->query($query)) {
    
	    
	header("Content-type: text/xml");

	// Start XML file, echo parent node
	echo '<markers>';
	while($row = $result->fetch_assoc()){
	// Iterate through the rows, printing XML nodes for each
	//while ($row = @mysqli_fetch_assoc($result))
	//{
	  // ADD TO XML DOCUMENT NODE
	  echo '<marker ';
	  echo 'name="' . parseToXML($row['Name']) . '" ';
	  echo 'address="' . parseToXML($row['Address']) . '" ';
	  echo 'lat="' . $row['lat'] . '" ';
	  echo 'lng="' . $row['lng'] . '" ';
	  echo 'type="' . $row['EmploymentType'] . '" ';
	  echo '/>';
//}
   
    }
	
	// End XML file
	echo '</markers>';
	

    /* free result set */
    $result->close();

}

else
{
  die('Not connected : ' . mysqli_connect_error() . PHP_EOL);
	exit;
}

?>