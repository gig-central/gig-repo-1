package MyPackage;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
// import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class GigsNB {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "http://lindese.com/gigcentral";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testGigsNB() throws Exception {
    
/* This tests all the URLs that are associated with this app. 
 * This is through feeding in the base URLs, not mouseclicks. 
 */ 	  
	 // This is for the Nav Bar Element: Home. 
	 driver.get(baseUrl);
	 String strHome = driver.getCurrentUrl();
	 // System.out.println("The current URL is: " + strHome);
	 
	 // Testing the actual page title against planned page title.
	 // Log results. If different, test will fail. 
	 String actualTitleGC = driver.getTitle();
	 String expectedTitleGC = "Gig Central";
	 assertEquals(expectedTitleGC,actualTitleGC);
	   
	 System.out.println(expectedTitleGC + " is the expected title of " + strHome);
	 System.out.println(actualTitleGC + " is the actual title of " + strHome);	   
	  

	 
	 // This is for the Nav Bar Element: Gigs.
	 
	driver.get(baseUrl + "/gig");
    String strGig = driver.getCurrentUrl();
    // System.out.println("The current URL is: " + strGig);
    
 // Testing the actual page title against planned page title.
 	 // Log results. If different, test will fail. 
 	 String actualTitleGig = driver.getTitle();
 	 String expectedTitleGig = "Gigs";
 	 assertEquals(expectedTitleGig,actualTitleGig);
 	   
 	 System.out.println(expectedTitleGig + " is the expected title of " + strGig);
 	 System.out.println(actualTitleGig + " is the actual title of " + strGig);	   
 	 
    
    driver.get(baseUrl + "/gig/add");
    String strGigAdd = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strGigAdd);
    
 // Testing the actual page title against planned page title.
 	 // Log results. If different, test will fail. 
 	 String actualTitleGigAdd = driver.getTitle();
 	 String expectedTitleGigAdd = "Add a new gig";
 	 assertEquals(expectedTitleGigAdd,actualTitleGigAdd);
 	   
 	 System.out.println(expectedTitleGigAdd + " is the expected title of " + strGigAdd);
 	 System.out.println(actualTitleGigAdd + " is the actual title of " + strGigAdd);	   
 	 
    
    /* driver.findElement(By.linkText("Home")).click();
    String strHome2 = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strHome2);

 // Testing the actual page title against planned page title.
 	 // Log results. If different, test will fail. 
 	 String actualTitle = driver.getTitle();
 	 String expectedTitle = "Profiles";
 	 assertEquals(expectedTitle,actualTitle);
 	   
 	 System.out.println(expectedTitle + " is the expected title.");
 	 System.out.println(actualTitle + " is the actual title.");	   */ 
 	 
    
    //driver.findElement(By.linkText("Gigs")).click();
    //String strHome3 = driver.getCurrentUrl();
    //System.out.println("The current URL is: " + strHome3);

    
    //driver.findElement(By.linkText("Profiles")).click();
    //String strHome4 = driver.getCurrentUrl();
    //System.out.println("The current URL is: " + strHome4);


	 // This is for the Nav Bar Element: Venues.
    driver.get(baseUrl + "/venues");
    String strVenue = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strVenue);
    
 // Testing the actual page title against planned page title.
 	 // Log results. If different, test will fail. 
 	 String actualTitleVenue = driver.getTitle();
 	 String expectedTitleVenue = "Venues";
 	 assertEquals(expectedTitleVenue,actualTitleVenue);
 	   
 	 System.out.println(expectedTitleVenue + " is the expected title of " + strVenue);
 	 System.out.println(actualTitleVenue + " is the actual title of " + strVenue);	   
 	 
    
    driver.get(baseUrl + "/venues/add");
    String strVenueAdd = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strVenueAdd);
    
 // Testing the actual page title against planned page title.
 	 // Log results. If different, test will fail. 
 	 String actualTitleVenueAdd = driver.getTitle();
 	 String expectedTitleVenueAdd = "Add a new Venue";
 	 assertEquals(expectedTitleVenueAdd,actualTitleVenueAdd);
 	   
 	 System.out.println(expectedTitleVenueAdd + " is the expected title of " + strVenueAdd);
 	 System.out.println(actualTitleVenueAdd + " is the actual title of " + strVenueAdd);	   
 	 

	 // This is for the Nav Bar Element: Profiles.
    driver.get(baseUrl + "/profiles");
    String strProfile = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strProfile);
    
 // Testing the actual page title against planned page title.
 	 // Log results. If different, test will fail. 
 	 String actualTitleProfile = driver.getTitle();
 	 String expectedTitleProfile = "Profiles";
 	 assertEquals(expectedTitleProfile,actualTitleProfile);
 	   
 	 System.out.println(expectedTitleProfile + " is the expected title of " + strProfile);
 	 System.out.println(actualTitleProfile + " is the actual title of " + strProfile);	   
 	 
    
    driver.get(baseUrl + "/profiles/add");
    String strProfileAdd = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strProfileAdd);
    
    
 // Testing the actual page title against planned page title.
 	 // Log results. If different, test will fail. 
 	 String actualTitleProfileAdd = driver.getTitle();
 	 String expectedTitleProfileAdd = "Add Profile";
 	 assertEquals(expectedTitleProfileAdd,actualTitleProfileAdd);
 	   
 	 System.out.println(expectedTitleProfileAdd + " is the expected title of " + strProfileAdd);
 	 System.out.println(actualTitleProfileAdd + " is the actual title of " + strProfileAdd);	   
 	 
 	 // Contact Us
	 // This is for the Nav Bar Element: Contact Us.
    driver.get(baseUrl + "/contact");
    String strContact = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strContact);
    
 // Testing the actual page title against planned page title.
 	 // Log results. If different, test will fail. 
 	 String actualTitleContact = driver.getTitle();
 	 String expectedTitleContact = "Contact Us";
 	 assertEquals(expectedTitleContact,actualTitleContact);
 	   
 	 System.out.println(expectedTitleContact + " is the expected title of " + strContact);
 	 System.out.println(actualTitleContact + " is the actual title of " + strContact);	   
 	 
   
	 // This is for the Nav Bar Element: Login.
    driver.get(baseUrl + "/admin/login");
    String strLogin = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strLogin);
    
 // Testing the actual page title against planned page title.
 	 // Log results. If different, test will fail. 
 	 String actualTitleLogin = driver.getTitle();
 	 String expectedTitleLogin = "Login page";
 	 assertEquals(expectedTitleLogin,actualTitleLogin);
 	   
 	 System.out.println(expectedTitleLogin + " is the expected title of " + strLogin);
 	 System.out.println(actualTitleLogin + " is the actual title of " + strLogin);	   
 	  
   // https://stackoverflow.com/questions/8506489/get-page-title-with-selenium-webdriver-using-java
//   // Testing for title validation.    
//   
//   // This is for the Nav Bar Element: Profiles. This is a PASS.
//   driver.get(baseUrl + "/profiles");
//   String strProfiles2 = driver.getCurrentUrl();
//   System.out.println("The current URL is: " + strProfiles2);
//  
//   
//   String actualTitle = driver.getTitle();
//   String expectedTitle = "Profiles";
//   assertEquals(expectedTitle,actualTitle);
//   
//   System.out.println(expectedTitle + " is the expected title.");
//   System.out.println(actualTitle + " is the actual title.");	   
//  
//   // This is for the Nav Bar Element: Profiles. This is a FAIL.
//   driver.get(baseUrl + "/profiles/foobar");
//   String strProfiles3 = driver.getCurrentUrl();
//   System.out.println("The current URL is: " + strProfiles3);
//  
//   
//   String actualTitle2 = driver.getTitle();
//   String expectedTitle2 = "Profiles";
//   assertEquals(expectedTitle2,actualTitle2);
//   
//   System.out.println(expectedTitle2 + " is the expected title.");
//   System.out.println(actualTitle2 + " is the actual title.");	   
//   
   
  }



  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}