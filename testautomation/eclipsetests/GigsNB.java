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
	 System.out.println("The current URL is: " + strHome);

	 
	 // This is for the Nav Bar Element: Gigs.
	 
	driver.get(baseUrl + "/gig");
    String strGig = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strGig);
    
    driver.get(baseUrl + "/gig/add");
    String strGigAdd = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strGigAdd);
    
    driver.findElement(By.linkText("Home")).click();
    String strHome2 = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strHome2);

    
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
    
    driver.get(baseUrl + "/venues/add");
    String strVenueAdd = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strVenueAdd);
    
    

	 // This is for the Nav Bar Element: Profiles.
    driver.get(baseUrl + "/profiles");
    String strProfile = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strProfile);
    
    driver.get(baseUrl + "/profiles/add");
    String strProfileAdd = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strProfileAdd);
    

	 // This is for the Nav Bar Element: Contact Us.
    driver.get(baseUrl + "/contact");
    String strContact = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strContact);
    
   
	 // This is for the Nav Bar Element: Login.
    driver.get(baseUrl + "/admin/login");
    String strLogin = driver.getCurrentUrl();
    System.out.println("The current URL is: " + strLogin);
    
     
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