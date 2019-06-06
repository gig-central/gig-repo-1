<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');
//common_helper.php
if(!function_exists('startSession'))
{
	 /**
	 * wrapper function for PHP session_start(), to prevent 'session already started' error messages. 
	 *
	 * To view any session data, sessions must be explicitly started in PHP.  
	 * In order to use sessions in a variety of INC files, we'll check to see if a session 
	 * exists first, then start the session only when necessary.
	 * 
	 * @return void
	 * @todo none 
	 */
	function startSession()
	{
		if(isset($_SESSION))
		{
			return true;
		}else{
			@session_start();
		}
		if(isset($_SESSION)){return true;}else{return false;}
	}
}#end startSession()
if(!function_exists('feedback'))
{
	/**
	 * loads a quick user message (flash/heads up) to provide user feedback
	 *
	 * Uses a Session to store the data until the data is displayed via showFeedback() loaded 
	 * inside the bottom of header.php (or elsewhere) 
	 *
	 * <code>
	 * feedback('Flash!  This is an important message!'); #will show up next running of showFeedback()
	 * </code>
	 *
	 * For bootswatch theme, the function called is named bootswatchFeedback()
	 * 
	 * @param string $msg message to show next time showFeedback() is invoked
	 * @return none 
	 * @see showFeedback()
	 * @see bootswatchFeedback()	 
	 * @todo Create showFeedback(), move from nmWDK common_inc.php and integrate into CI
	 */
	function feedback($msg,$level="warning")
	{
		startSession();
		$_SESSION['feedback'] = $msg;
		$_SESSION['feedback-level'] = $level;
	
	}
}#end feedback()
if(!function_exists('bootswatchFeedback'))
{
	/**
	 * shows a quick user message (flash/heads up) to provide user feedback
	 *
	 * Uses a Session to store the data until the data is displayed via bootswatchFeedback()
	 *
	 * Related feedback() function used to store message 
	 *
	 * <code>
	 * echo bootswatchFeedback(); #will show then clear message stored via feedback()
	 * </code>
	 * 
	 * @param none 
	 * @return string html & potentially CSS to style feedback
	 * @see feedback() 
	 * @todo none
	 */
	function bootswatchFeedback()
	{
		startSession();//startSession() does not return true in INTL APP!
		
		$myReturn = "";  //init
		if(isset($_SESSION['feedback']) && $_SESSION['feedback'] != "")
		{#show message, clear flash
			if(isset($_SESSION['feedback-level'])){$level = $_SESSION['feedback-level'];}else{$level = '';}
			
			switch($level)
			{
				case 'warning';
					$level = 'warning';
					break;
				case 'info';
				case 'notice';
					$level = 'info';
					break;
				case 'success';
					$level = 'success';
					break;	
				case 'error';
				case 'danger';
					$level = 'danger';
					break;
			
			}
			$myReturn .= '
			<div class="alert alert-dismissable alert-' . $level . '" style="margin-top:.5em;">
			<button class="close" data-dismiss="alert" type="button">&times;</button>
			' . $_SESSION['feedback'] . '</div>
			';
			$_SESSION['feedback'] = ""; #cleared
			$_SESSION['feedback-level'] = "";
		}
		return $myReturn; //data passed back for printing
	} 
}#end bootswatchFeedback()


////encrypt and decrypt pass///
//$key is a string that need to encrypt or decrypt the password
function pass_encrypt($string,$key)
{
    
    $iv = mcrypt_create_iv(
    mcrypt_get_iv_size(MCRYPT_RIJNDAEL_128, MCRYPT_MODE_CBC),
    MCRYPT_DEV_URANDOM
    );

$encrypted = base64_encode(
    $iv .
    mcrypt_encrypt(
        MCRYPT_RIJNDAEL_128,
        hash('sha256', $key, true),
        $string,
        MCRYPT_MODE_CBC,
        $iv
    )
);
return $encrypted;
}
////decrypt password
function pass_decrypt($encrypted,$key)
{
    $data = base64_decode($encrypted);
$iv = substr($data, 0, mcrypt_get_iv_size(MCRYPT_RIJNDAEL_128, MCRYPT_MODE_CBC));

$decrypted = rtrim(
    mcrypt_decrypt(
        MCRYPT_RIJNDAEL_128,
        hash('sha256', $key, true),
        substr($data, mcrypt_get_iv_size(MCRYPT_RIJNDAEL_128, MCRYPT_MODE_CBC)),
        MCRYPT_MODE_CBC,
        $iv
    ),
    "\0"
);
return $decrypted;
}

/**
 * makeDropdownSelect($option) inserts dropdown <option> elements
 * this function is written generically and can be applied to any dropdown
 * 
 * function implementation example:
 * <code>
 *    <?php echo '
 *        <select class="form-control" id="CompanyState" name="CompanyState">
 *            <option value="0">Select State</option>' .
 *            makeDropdownSelect($this->config->item("stateSelect"),"CompanyState") . ' 
 *        </select>'; 
 *     ?>
 * </code>
 *
 * array implementation example
 * <code>
 *    $config['stateSelect'] = array(
 *        'AK' => 'Alaska',
 *        'AL' => 'Alabama',
 *        'WV' => 'West Virginia',
 *        'WY' => 'Wyoming',
 *    );
 * <code>
 *
 * @param string $option is an array of key/value pairs
 * @param string $fieldSetName is the name property value of the select element
 * 
 * @return string $myReturn is a fully formatted <option> element
 *
 * @see related custom validation message used is
 * @see      controller function __construct:         
 * @see      $this->form_validation->set_message('check_dropdown', 'The {field} must be selected.');
 * @see      form_validation.php: 'rules' => 'required|callback_check_dropdown' for field used
 *
 
 
 * @todo none
 */


if(!function_exists('makeDropdownSelect'))
{
    function makeDropdownSelect($option,$fieldSetName)
    {
        $myReturn = '';
        foreach ($option as $key => $value)        
        {            
            $myReturn .= '<option value="' . $key . '"' . set_select("$fieldSetName", "$key") . '>' . $value . '</option>' . PHP_EOL;
        }
        return $myReturn;
            
    }
}//end makeDropdownSelect
