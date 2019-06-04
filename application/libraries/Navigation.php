<?php 

/**
 * application/libraries/Navigation.php - manages all navs on the pages
 *
 * @package GIG_CENTRAL
 * @subpackage GIG
 * @author Alexandre Daniels <adanie04@seattlecentral.edu>
 * @version 1.0 2016/06/09 
 * @link http://newmanix.com/ 
 * @license http://www.apache.org/licenses/LICENSE-2.0
 * @see application/views/themes/bootswatch/header.php
 * @see application/views/themes/bootswatch/footer.php
 * @todo none
 */

if ( ! defined('BASEPATH')) exit('No direct script access allowed');//prevents a webpage from accesing this file: DO NOT REMOVE THIS!!!

/**
 * Navigation.php holds all of the data for what goes into the header nav and the footer nav
 *
 * @see application/views/themes/bootswatch/header.php
 * @see application/views/themes/bootswatch/footer.php
 * @todo none
 */
 
class Navigation 
{
    private $headerMenu = array();  //The array holding all header navigation elements
    private $footerMenu = array();  //The array holding all footer navigation elements
    private $interfacePart;                   // The HTML string to be returned

    /**
     * contains the data for the navs but does not create it
     *
     * @param none
     * @return none
     * @todo none
     */    
    
    function init()
    { // HEADER NAV
        $headerNavigation = array(
            1 => array(
                'text'		    => 	'Home',
                'link'		    => 	base_url(),
                'show_condition'=>	1,
                'parent'	    =>	0
            ),
            2 => array(
                'text'		    => 	'Gigs',
                'link'		    => 	base_url() . 'gig',
                'show_condition'=> 1,
                'parent'	    =>	0
            ),
            3 => array(
                'text'		    => 	'Find a Gig',
                'link'		    => 	base_url() . 'gig',
                'show_condition'=> 1,
                'parent'	    =>	2
            ),
            4 => array(
                'text'		    => 	'Post a Gig',
                'link'		    => 	base_url() . 'gig/add',
                'show_condition'=>	1,
                'parent'	    =>	2
            ),
            //links commented out(deemed non-essential to MVP) for possible reintigration in future iterations
            /*5 => array(
                'text'		    => 	'Venues',
                'link'		    => 	base_url() . 'venues',
                'show_condition'=>	1,
                'parent'	    =>	0
            ),
            6 => array(
                'text'		    => 	'Find a Venue',
                'link'		    => 	base_url() . 'venues',
                'show_condition'=>	1,
                'parent'	    =>	5
            ),
            7 => array(
                'text'		    => 	'Post a Venue',
                'link'		    => 	base_url() . 'venues/add',
                'show_condition'=>	1,
                'parent'	    =>	5
            ),
            8 => array(
                'text'		    => 	'Profiles',
                'link'		    => 	base_url() . 'profiles',
                'show_condition'=>	1,
                'parent'	    =>	0
            ),
            9 => array(
                'text'		    => 	'View Profiles',
                'link'		    => 	base_url() . 'profiles',
                'show_condition'=>	1,
                'parent'	    =>	8
            ),
            10 => array(
                'text'		    => 	'Add a Profile',
                'link'		    => 	base_url() . 'profiles/add',
                'show_condition'=>	1,
                'parent'	    =>	8
            ),
            11 => array(
                'text'		    => 	'Contact Us',
                'link'		    => 	base_url() . 'contact',
                'show_condition'=>	1,
                'parent'	    =>	0
            ),
            //take away Login from the head nav. it shows Logout once user Loggedin
            /* 12 => array(
                'text'		    => 	'Login',
                'link'		    => 	base_url() . 'admin/login',
                'show_condition'=>	1,
                'parent'	    =>	0
            ), */
        );//end $headerNavigation
        #Admin menu
        $codeIgniter =& get_instance();
        $codeIgniter->load->library("session");
        $codeIgniter->load->model('gig_model');
        $getSessionId = $codeIgniter->gig_model->get_session_id();
        $gigResult = $codeIgniter->gig_model->find_post_id($getSessionId);

        if ($codeIgniter->session->logged_in == TRUE)
        {
        //links commented out(deemed non-essential to MVP) for possible reintigration in future iterations
        /*
            $editProfile = array(
                'text'		     => 	'Edit Profile',
                'link'		     => 	base_url() . 'profiles/edit',
                'show_condition' =>	    1,
                'parent'	     => 	8
            );

            $editVenues = array(
                'text'		     => 	'Edit Venues',
                'link'		     => 	base_url() . 'venues/edit',
                'show_condition' =>	    1,
                'parent'	     =>	    5
            );
            
            $editGig = array(
                'text'		     => 	'Edit Gig',
                'link'		     => 	base_url() . 'gig/edit',
                //'Edit' menu is hidden
                'show_condition' =>	    0,
                'parent'	     =>	    2
            );*/
            
            //If user id matches id stored in a post, 
            //change the value in 'show_condition' for $editGig to show 'Edit' menu
            if($gigResult == true)
            {
                $editGig['show_condition'] = 1;
            } 

            $login = array(
                    'text'		    => 	'Logout',
                    'link'		    => 	base_url() . 'admin/logout',
                    'show_condition'=>	1,
                    'parent'	    =>	0
                );

            //adding $login to show the user loggin status
            array_push($headerNavigation,$editProfile,$editVenues,$editGig,$login);

        } else { 
            $login = array(
                    'text'		    => 	'Login',
                    'link'		    => 	base_url() . 'admin/login',
                    'show_condition'=>	1,
                    'parent'	    =>	0
            );   
            array_push($headerNavigation,$login);
        }
        
        # FOOTER NAV
        $footerNavigation = array(
            1 => array(
                'text'		    => 	'About',
                'link'		    => 	base_url() . 'pages/about',
                'show_condition'=>	1,
                'parent'	    =>	0
            ),
            2 => array(
                'text'		    => 	'FAQ',
                'link'		    => 	base_url() . 'pages/faq',
                'show_condition'=>	1,
                'parent'	    =>	0
            ),
            3 => array(
                'text'		    => 	'Disclaimer',
                'link'		    => 	base_url() . 'pages/disclaimer',
                'show_condition'=>	1,
                'parent'	    =>	0
            ),
            4 => array(
                'text'		    => 	'Contact Us',
                'link'		    => 	base_url() . 'contact',
                'show_condition'=>	1,
                'parent'	    =>	0
            ),
            
        );//end $footerNavigation
        array_push($footerNavigation,$login);
        $this->setHeaderMenu($headerNavigation);
        $this->setFooterMenu($footerNavigation);
    }// end function init

/**
 * Constructor for Navigation file. 
 *
 * @param none
 * @return void 
 * @todo none
 */
    function __construct()
    {
        $this->init();
    } //end construct()

/**
 * I dont know what this is
 *
 * @param none
 * @return void 
 * @todo none
 */
    function setHeaderMenu($myMenu)
    {
        $codeIgniter =& get_instance();
        $this->headerMenu = $myMenu;
    }//end setHeaderMenu()

/**
 * I dont know what this is
 *
 * @param none
 * @return void 
 * @todo none
 */

    function setFooterMenu($myMenu)
    {
        $codeIgniter =& get_instance();
        $this->footerMenu = $myMenu;
    }// end setFooterMenu()

/**
 * this will create the header nav
 *
 * @param none
 * @return all of the html for the header nav 
 * @todo none
 */

    public function loadHeader($selected = null)
    {  
        $interfacePart = '<ul class="nav navbar-nav">';
        foreach ( $this->headerMenu as $iterator=>$headerOrFooter )
        {
            if ( is_array ( $this->headerMenu[ $iterator ] ) ) 
            {//must be by construction but let's keep the errors home
                if ( $this->headerMenu[ $iterator ] [ 'show_condition' ] && $this->headerMenu [ $iterator ] [ 'parent' ] == 0 ) 
                {//are we allowed to see this menu?
                    // Set class for current nav item - Binary safe case-insensitive string comparison
                    (strcasecmp($this->headerMenu[ $iterator ] [ 'text' ], $selected) == 0 ) ? $class = "active" : $class = "";
                    if($this->hasChildren($iterator))
                    {
                        $class .= "dropdown";
                        $interfacePart .= "<li class=\"" . $class . "\">";
                        $interfacePart .= "<a href=\"" . $this->headerMenu [ $iterator ] [ 'link' ] . "\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">";
                        $interfacePart .= $this->headerMenu [ $iterator ] [ 'text' ];
                        $interfacePart .= '<b class="caret"></b>';
                        $interfacePart .= '</a>';
                        $interfacePart .= $this->getChildren ( $iterator ); //loop through children
                        $interfacePart .= '</li>' . "\n";
                    } else {
                        $interfacePart .= "<li class=\"" . $class . "\">";
                        if($this->headerMenu [ $iterator ] [ 'link' ]!=null)	
                        {
                            $interfacePart .= "<a href=\"" . $this->headerMenu [ $iterator ] [ 'link' ] . "\">";
                            $interfacePart .= $this->headerMenu [ $iterator ] [ 'text' ];
                            $interfacePart .= '</a>';
                        } else {
                            $interfacePart .= "<span>".$this->headerMenu [ $iterator ] [ 'text' ]."</span>";
                        }
                        $interfacePart .= '</li>' . "\n";
                    }
                }
            } else {
                die ( sprintf ( 'menu nr %s must be an array', $iterator ) );
            }
        }//end foreach

        $interfacePart .= '</ul>';
        return $interfacePart;
    }// end public function loadHeader()

    
/**
 * this checks to see if one of the header nav items is supposed to have a subnav
 *
 * @param whatever menu item happens to be going through the loop
 * @return boolean 
 * @todo none
 */
    private function hasChildren($menu_id)
    {
        foreach ( $this->headerMenu as $iterator=>$headerOrFooter )
        {
            if ( $this->headerMenu [ $iterator ] [ 'show_condition' ] && $this->headerMenu [ $iterator ] [ 'parent' ] == $menu_id ) 
            {
                return TRUE;
            }
        }
        return FALSE;
    }// end public function hasChildren()

/**
 * this will create the dropdowns of the header nav
 *
 * @param the id of the nav item that has children
 * @return adds a class of dropdown-menu to the nav item 
 * @todo none
 */

    private function getChildren ( $parent_id )
    {
        $has_subcats = FALSE;
        $interfacePart  = '';
        $interfacePart .= "\n".'	<ul class="dropdown-menu">' . "\n";
        
        foreach ( $this->headerMenu as $iterator=>$headerOrFooter )
        {
            if ( $this->headerMenu [ $iterator ] [ 'show_condition' ] && $this->headerMenu [ $iterator ] [ 'parent' ] == $parent_id ) 
            {//are we allowed to see this menu?
                $has_subcats = TRUE;
                $interfacePart .= "<li><a href=\"{$this->headerMenu[ $iterator ][ 'link' ]}\">{$this->headerMenu [ $iterator ] [ 'text' ]}</a>" . $this->getChildren ( $this->headerMenu, $iterator ) . "</li>";
            }
        }//end foreach
        
        $interfacePart .= '	</ul>'."\n";
        return ( $has_subcats ) ? $interfacePart : FALSE;
    }// end function getChildren()

/**
 * this will create the footer nav
 *
 * @param none
 * @return all of the html for the footer nav 
 * @todo none
 */
    public function loadFooter($selected = null)
    {
		$interfacePart = '<ul class="nav navbar-nav">';
		foreach ( $this->footerMenu as $iterator=>$headerOrFooter )
		{
			if ( is_array ( $this->footerMenu[ $iterator ] ) ) 
            {//must be by construction but let's keep the errors home
				if ( $this->footerMenu[ $iterator ] [ 'show_condition' ] && $this->footerMenu [ $iterator ] [ 'parent' ] == 0 )
				{//are we allowed to see this menu?
                    
					// Set class for current nav item -- Binary safe case-insensitive string comparison
					(strcasecmp($this->footerMenu[ $iterator ] [ 'text' ], $selected) == 0 ) ? $class = "active" : $class = "";

					if($this->hasChildrenFooter($iterator))
					{
						$class .=" dropdown";
						$interfacePart .= "<li class=\"" . $class . "\">";
						$interfacePart .= "<a href=\"" . $this->footerMenu [ $iterator ] [ 'link' ] . "\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">";
						$interfacePart .= $this->footerMenu [ $iterator ] [ 'text' ];
						$interfacePart .= '<b class="caret"></b>';
						$interfacePart .= '</a>';
						$interfacePart .= $this->getChildrenFooter ( $iterator ); //loop through children
						$interfacePart .= '</li>' . "\n";
					} else {
						$interfacePart .= "<li class=\"" . $class . "\">";
						if($this->footerMenu [ $iterator ] [ 'link' ]!=null)	
                        {
							$interfacePart .= "<a href=\"" . $this->footerMenu [ $iterator ] [ 'link' ] . "\">";
							$interfacePart .= $this->footerMenu [ $iterator ] [ 'text' ];
							$interfacePart .= '</a>';
						} else {
							$interfacePart .= "<span>".$this->footerMenu [ $iterator ] [ 'text' ]."</span>";
						}
						$interfacePart .= '</li>' . "\n";
					}
				}
			} else {
				die ( sprintf ( 'menu nr %s must be an array', $iterator ) );
			}
		}//end foreach

		$interfacePart .= '</ul>';
		return $interfacePart;
	}// end function loadFooter()

/**
 * this checks to see if one of the footer nav items is supposed to have a subnav
 *
 * @param whatever menu item happens to be going through the loop
 * @return boolean 
 * @todo none
 */
    private function hasChildrenFooter($menu_id)
	{
		foreach ( $this->footerMenu as $iterator=>$headerOrFooter )
        {
			if ( $this->footerMenu [ $iterator ] [ 'show_condition' ] && $this->footerMenu [ $iterator ] [ 'parent' ] == $menu_id ) 
            {
				return TRUE;
			}
		}

		return FALSE;
	}// end function hasChildrenFooter
    
    
/**
 * this will create the dropdowns of the footer nav
 *
 * @param the id of the nav item that has children
 * @return adds a class of dropdown-menu to the nav item 
 * @todo none
 */
    private function getChildrenFooter ( $parent_id )
	{
		$has_subcats = FALSE;
		$interfacePart  = '';
		$interfacePart .= "\n".'	<ul class="dropdown-menu">' . "\n";
        
		foreach ( $this->footerMenu as $iterator=>$headerOrFooter )
        {
			if ( $this->footerMenu [ $iterator ] [ 'show_condition' ] && $this->footerMenu [ $iterator ] [ 'parent' ] == $parent_id ) 
            {//are we allowed to see this menu?
				$has_subcats = TRUE;
				$interfacePart .= "<li><a href=\"{$this->footerMenu[ $iterator ][ 'link' ]}\">{$this->footerMenu [ $iterator ] [ 'text' ]}</a>" . $this->getChildrenFooter ( $this->footerMenu, $iterator ) . "</li>";
			}
		}// end foreach
        
		$interfacePart .= '	</ul>'."\n";
		return ( $has_subcats ) ? $interfacePart : FALSE;
	}// end function getChildrenFooter
}// end class Navigation
