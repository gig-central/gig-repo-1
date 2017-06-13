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


public class venuesUI1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();



public venuesUI1() {
} ;


 /* // Default constructor, was empty before. 
  public ProfileUI1(Object userfile, Object first_name, Object last_name, Object email, Object password, Object re_password, Object bio) {
	// TODO Auto-generated constructor stub
	
*/ 	  


@Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "http://lindese.com/gigcentral";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testVenuesNB() throws Exception {
	  
	  // test for setting up a new Gig. 
	  // Not in a constructor. This works, as long as it's not already 
	  // in the database. 
	
	  // Tests 1-10: 
	  
	  // TestVenue 1
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue1");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue1");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue1");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue2
	    
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue2");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue2");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue2");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue3
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue3");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue3");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue3");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue4
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue4");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue4");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue4");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue5
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue5");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue5");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue5");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue6
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue6");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue6");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue6");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue7
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue7");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue7");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue7");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue8
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue8");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue8");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue8");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue9
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue9");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue9");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue9");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue10
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue10");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue10");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue10");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

	    // Tests 11-20: 
	    
		  // TestVenue11
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue11");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue11");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue11");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue12
	    
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue12");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue12");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue12");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue13
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue13");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue13");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue13");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue14
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue14");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue14");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue14");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue15
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue15");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue15");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue15");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue16
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue16");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue16");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue16");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue17
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue17");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue17");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue17");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue18
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue18");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue18");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue18");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue19
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue19");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue19");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue19");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue20
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue20");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue20");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue20");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

	    
	    // Tests 21-30: 
	    
		  // TestVenue21
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue21");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue21");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue21");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue22
	    
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue22");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue22");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue22");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue23
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue23");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue23");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue23");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue24
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue24");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue24");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue24");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue25
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue25");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue25");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue5");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue26
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue26");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue26");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue26");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue27
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue27");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue27");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue27");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue28
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue28");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue28");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue28");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue29
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue29");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue29");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue29");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue30
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue30");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue30");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue30");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

	    
	    // Tests 31-40: 
	    
		  // TestVenue31
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue31");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue31");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue31");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue32
	    
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue32");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue32");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue32");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue33
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue33");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue33");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue33");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue34
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue34");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue34");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue34");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue35
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue35");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue35");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue35");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue36
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue36");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue36");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue6");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue37
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue37");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue37");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue37");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue38
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue38");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue38");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue38");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue39
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue39");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue39");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue39");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue40
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue40");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue40");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue40");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

	    
	    // Tests 41-50: 
	    
		  // TestVenue41
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue41");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue41");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue41");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue42
	    
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue42");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue42");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue42");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue43
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue43");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue43");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue43");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue44
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue44");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue44");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue44");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue45
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue45");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue45");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue45");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue46
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue46");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue46");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue46");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue47
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue47");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue47");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue47");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue48
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue48");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue48");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue48");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue49
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue49");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue49");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue49");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue50
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue50");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue50");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue50");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

	    // Tests 51-60: 
	    
		  // TestVenue51
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue51");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue51");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue51");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue52
	    
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue52");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue52");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue52");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue53
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue53");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue53");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue53");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue54
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue54");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue54");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue54");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue55
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue55");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue55");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue55");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue56
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue56");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue56");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue56");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue57
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue57");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue57");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue57");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue58
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue58");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue58");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue58");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue59
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue59");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue59");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue59");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue60
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue60");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue60");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue60");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

	    
	    // Tests 61-70: 
	    
		  // TestVenue61
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue61");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue61");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue61");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue62
	    
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue62");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue62");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue62");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue63
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue63");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue63");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue63");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue64
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue64");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue64");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue64");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue65
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue65");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue65");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue65");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue66
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue66");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue66");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue66");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue67
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue67");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue67");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue67");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue68
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue68");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue68");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue68");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue69
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue69");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue69");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue69");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue70
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue70");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue70");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue70");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

	    
	    // Tests 71-80: 
	    
		  // TestVenue71
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue71");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue71");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue71");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue72
	    
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue72");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue72");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue72");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue73
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue73");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue73");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue73");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue74
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue74");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue74");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue74");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue75
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue75");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue75");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue75");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue76
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue76");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue76");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue6");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue77
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue77");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue77");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue7");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue78
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue78");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue78");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue78");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue79
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue79");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue79");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue79");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue80
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue80");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue80");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue80");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

	    
	    // Tests 81-90: 
	    
		  // TestVenue81
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue81");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue81");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue81");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue82
	    
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue82");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue82");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue82");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue83
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue83");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue83");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue83");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue84
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue84");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue84");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue84");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue85
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue85");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue85");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue85");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue86
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue86");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue86");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue86");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue87
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue87");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue87");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue87");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue88
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue88");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue88");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue88");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue89
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue89");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue89");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue89");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue90
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue90");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue90");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue90");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

	    
	    // Tests 91-100: 
	  
		  // TestVenue91
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue91");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue91");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue91");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue92
	    
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue92");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue92");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue92");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue93
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue93");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue93");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue93");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue94
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue94");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue94");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue94");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue95
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue95");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue95");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue95");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue96
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue96");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue96");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue96");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue97
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue97");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue97");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue97");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue98
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue98");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue98");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue98");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue99
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue99");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue99");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue99");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

		  // TestVenue100
	    driver.get(baseUrl + "/venues/add");
	    // driver.findElement(By.xpath("(//div[@id='post-gig']/div)[2]")).click();
	    driver.findElement(By.id("VenueName")).clear();
	    driver.findElement(By.id("VenueName")).sendKeys("TestVenue100");
	    driver.findElement(By.id("VenueAddress")).clear();
	    driver.findElement(By.id("VenueAddress")).sendKeys("TestVenue100");
	    driver.findElement(By.id("City")).clear();
	    driver.findElement(By.id("City")).sendKeys("TestVenue100");
	    driver.findElement(By.id("State")).clear();
	    driver.findElement(By.id("State")).sendKeys("WA");
	    driver.findElement(By.id("ZipCode")).clear();
	    driver.findElement(By.id("ZipCode")).sendKeys("00000");
	    driver.findElement(By.id("VenuePhone")).clear();
	    driver.findElement(By.id("VenuePhone")).sendKeys("206-555-1212");
	    driver.findElement(By.id("VenueWebsite")).clear();
	    driver.findElement(By.id("VenueWebsite")).sendKeys("www.example.com");
	    driver.findElement(By.id("VenueHours")).clear();
	    driver.findElement(By.id("VenueHours")).sendKeys("all");
	    new Select(driver.findElement(By.id("VenueTypeKey"))).selectByVisibleText("Community Center");
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    driver.findElement(By.linkText("Back to Venue List")).click();

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
