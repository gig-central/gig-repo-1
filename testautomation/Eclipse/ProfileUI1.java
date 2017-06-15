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




public class ProfileUI1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

//Constructor objects defined. 
Object userfile = null;
Object first_name = null;
Object last_name = null;
Object email = null;
Object password = null;
Object re_password = null;
Object bio = null;

public ProfileUI1() {
} ;


 /* // Default constructor, was empty before. 
  public ProfileUI1(Object userfile, Object first_name, Object last_name, Object email, Object password, Object re_password, Object bio) {
	// TODO Auto-generated constructor stub
	  
	  Object newuserfile = userfile; 
	  Object newfirst_name = first_name; 
	  Object newlast_name = last_name; 
	  Object newemail = email; 
	  Object newpassword = password; 
	  Object newre_password = re_password; 
	  Object newbio = bio; 
*/ 	  


@Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "http://lindese.com/gigcentral";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testGigsNB() throws Exception {
	  
	  // test for setting up a new Profile. 
	  // Not in a constructor. This works, as long as it's not already 
	  // in the database. 
	
	  // Test users 1-10: 
	  
	  // Test user 1
	  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing1");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest1");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test1@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test1");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test1");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test1");
	    driver.findElement(By.name("Submit")).click();
	 
	    // Test user 2
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing2");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest2");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test2@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test2");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test2");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test2");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 3
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing3");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest3");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test3@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test3");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test3");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test3");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 4
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing4");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest4");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test4@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test4");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test4");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test4");
	    driver.findElement(By.name("Submit")).click();
	 

	    // Test user 5
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing5");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest5");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test5@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test5");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test5");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test5");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 6
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing6");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest6");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test6@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test6");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test6");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test6");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 7
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing7");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest7");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test7@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test7");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test7");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test7");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 8
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing8");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest8");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test8@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test8");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test8");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test8");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 9
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing9");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest9");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test9@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test9");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test9");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test9");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 10
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing10");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest10");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test10@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test10");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test10");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test10");
	    driver.findElement(By.name("Submit")).click();

	    
	    // Tests 11-20: 

		  // Test user 11
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing11");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest11");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test11@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test11");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test11");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test11");
	    driver.findElement(By.name("Submit")).click();
	 
	    // Test user 12
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing12");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest12");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test12@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test12");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test12");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test12");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 13
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing13");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest13");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test13@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test13");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test13");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test13");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 14
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing14");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest14");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test14@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test14");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test14");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test14");
	    driver.findElement(By.name("Submit")).click();
	 

	    // Test user 15
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing15");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest15");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test15@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test15");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test15");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test15");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 16
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing16");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest16");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test16@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test16");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test16");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test6");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 17
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing17");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest17");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test17@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test17");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test17");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test17");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 18
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing18");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest18");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test18@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test18");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test18");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test18");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 19
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing19");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest19");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test19@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test19");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test19");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test19");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 20
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing20");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest20");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test20@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test20");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test20");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test20");
	    driver.findElement(By.name("Submit")).click();

	    // Tests 21-30:
	    
		  // Test user 21
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing21");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest21");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test21@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test21");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test21");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test21");
	    driver.findElement(By.name("Submit")).click();
	 
	    // Test user 22
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing22");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest22");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test22@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test22");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test22");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test22");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 23
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing23");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest23");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test23@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test23");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test23");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test23");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 24
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing24");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest24");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test24@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test24");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test24");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test24");
	    driver.findElement(By.name("Submit")).click();
	 

	    // Test user 25
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing25");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest25");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test25@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test25");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test25");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test25");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 26
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing26");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest26");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test26@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test26");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test26");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test26");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 27
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing27");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest27");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test27@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test27");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test27");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test27");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 28
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing28");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest28");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test28@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test28");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test28");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test28");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 29
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing29");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest29");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test29@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test29");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test29");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test29");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 30
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing30");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest30");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test30@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test30");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test30");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test30");
	    driver.findElement(By.name("Submit")).click();

	    // Tests 31-40: 
	    
		  // Test user 31
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing31");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest31");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test31@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test31");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test31");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test31");
	    driver.findElement(By.name("Submit")).click();
	 
	    // Test user 32
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing32");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest32");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test32@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test32");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test32");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test32");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 33
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing33");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest33");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test33@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test33");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test33");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test33");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 34
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing34");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest34");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test34@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test34");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test34");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test34");
	    driver.findElement(By.name("Submit")).click();
	 

	    // Test user 35
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing35");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest35");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test35@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test35");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test35");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test35");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 36
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing36");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest36");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test36@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test36");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test36");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test36");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 37
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing37");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest37");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test37@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test37");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test37");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test37");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 38
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing38");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest38");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test38@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test38");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test38");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test38");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 39
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing39");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest39");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test39@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test39");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test39");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test39");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 40
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing40");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest40");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test40@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test40");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test40");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test40");
	    driver.findElement(By.name("Submit")).click();

	    // Tests 41-50: 
	    
		  // Test user 41
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing41");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest41");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test41@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test41");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test41");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test41");
	    driver.findElement(By.name("Submit")).click();
	 
	    // Test user 42
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing42");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest42");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test42@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test42");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test42");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test42");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 43
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing43");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest43");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test43@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test43");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test43");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test43");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 44
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing44");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest44");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test44@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test44");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test44");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test44");
	    driver.findElement(By.name("Submit")).click();
	 

	    // Test user 45
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing45");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest45");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test45@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test45");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test45");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test45");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 46
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing46");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest46");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test46@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test46");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test46");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test46");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 47
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing47");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest47");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test47@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test47");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test47");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test47");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 48
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing48");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest48");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test48@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test48");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test48");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test48");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 49
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing49");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest49");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test49@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test49");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test49");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test49");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 50
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing50");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest50");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test50@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test50");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test50");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test50");
	    driver.findElement(By.name("Submit")).click();

	    // Tests 51-60: 
	    
		  // Test user 51
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing51");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest51");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test51@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test51");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test51");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test51");
	    driver.findElement(By.name("Submit")).click();
	 
	    // Test user 52
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing52");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest52");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test52@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test52");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test52");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test52");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 53
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing53");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest53");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test53@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test53");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test53");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test53");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 54
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing54");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest54");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test54@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test54");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test54");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test54");
	    driver.findElement(By.name("Submit")).click();
	 

	    // Test user 55
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing55");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest55");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test55@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test55");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test55");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test55");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 56
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing56");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest56");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test56@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test56");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test56");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test56");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 7
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing57");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest57");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test57@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test57");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test57");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test57");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 58
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing58");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest58");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test58@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test58");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test58");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test58");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 9
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing59");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest59");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test59@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test59");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test59");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test59");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 60
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing60");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest60");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test60@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test60");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test60");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test60");
	    driver.findElement(By.name("Submit")).click();

	    // Tests 61-70:
	    
		  // Test user 61
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing61");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest61");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test61@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test61");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test61");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test61");
	    driver.findElement(By.name("Submit")).click();
	 
	    // Test user 62
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing62");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest62");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test62@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test62");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test62");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test62");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 63
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing63");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest63");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test63@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test63");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test63");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test63");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 64
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing64");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest64");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test64@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test64");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test64");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test64");
	    driver.findElement(By.name("Submit")).click();
	 

	    // Test user 65
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing65");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest65");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test65@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test65");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test65");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test65");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 66
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing66");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest66");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test66@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test66");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test66");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test66");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 67
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing67");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest67");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test67@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test67");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test67");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test67");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 68
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing68");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest68");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test68@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test68");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test68");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test68");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 69
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing69");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest69");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test69@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test69");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test69");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test69");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 70
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing70");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest70");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test70@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test70");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test70");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test70");
	    driver.findElement(By.name("Submit")).click();

	    // Tests 71-80: 
	    
		  // Test user 71
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing71");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest71");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test71@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test71");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test71");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test71");
	    driver.findElement(By.name("Submit")).click();
	 
	    // Test user 72
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing72");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest72");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test72@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test72");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test72");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test72");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 73
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing73");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest73");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test73@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test73");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test73");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test73");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 74
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing74");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest74");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test74@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test74");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test74");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test74");
	    driver.findElement(By.name("Submit")).click();
	 

	    // Test user 75
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing75");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest75");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test75@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test75");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test75");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test75");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 76
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing76");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest76");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test76@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test76");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test76");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test76");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 77
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing77");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest77");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test77@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test77");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test77");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test77");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 78
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing78");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest78");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test78@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test78");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test78");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test78");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 79
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing79");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest79");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test79@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test79");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test79");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test79");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 80
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing80");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest80");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test80@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test80");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test80");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test80");
	    driver.findElement(By.name("Submit")).click();

	    // Tests 81-90: 
	    
		  // Test user 81
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing81");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest81");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test81@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test81");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test81");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test81");
	    driver.findElement(By.name("Submit")).click();
	 
	    // Test user 82
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing82");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest82");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test82@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test82");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test82");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test82");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 83
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing83");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest83");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test83@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test83");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test83");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test83");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 84
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing84");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest84");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test84@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test84");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test84");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test84");
	    driver.findElement(By.name("Submit")).click();
	 

	    // Test user 85
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing85");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest85");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test85@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test85");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test85");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test85");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 86
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing86");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest86");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test86@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test86");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test86");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test86");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 87
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing87");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest87");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test87@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test87");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test87");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test87");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 88
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing88");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest88");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test88@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test88");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test88");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test88");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 89
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing89");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest89");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test89@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test89");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test89");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test89");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 90
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing90");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest90");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test90@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test90");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test90");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test90");
	    driver.findElement(By.name("Submit")).click();

	    // Tests 91-100: 
	    
		  // Test user 91
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing91");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest91");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test91@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test91");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test91");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test91");
	    driver.findElement(By.name("Submit")).click();
	 
	    // Test user 92
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing92");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest92");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test92@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test92");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test92");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test92");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 93
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing93");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest93");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test93@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test93");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test93");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test93");
	    driver.findElement(By.name("Submit")).click();
	 
	    
	    // Test user 94
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing94");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest94");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test94@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test94");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test94");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test94");
	    driver.findElement(By.name("Submit")).click();
	 

	    // Test user 95
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing95");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest95");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test95@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test95");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test95");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test95");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 96
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing96");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest96");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test96@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test96");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test96");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test96");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 97
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing97");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest97");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test97@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test97");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test97");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test97");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 98
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing98");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest98");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test98@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test98");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test98");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test98");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 99
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing99");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest99");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test99@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test99");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test99");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test99");
	    driver.findElement(By.name("Submit")).click();

	    // Test user 100
		  
	    driver.get(baseUrl + "/profiles/add");
	   // driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[3]")).click();
	   // driver.findElement(By.xpath("(//a[contains(text(),'Add a Profile')])[2]")).click();
	    driver.findElement(By.id("userfile")).clear();
	    driver.findElement(By.id("userfile")).sendKeys("/Users/Lugano/Desktop/school/sp17/ITC260PHP/tests/bonesAUTOMATIONKEEPHERE.jpg");
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Testing100");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("TestTest100");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("test100@example.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test100");
	    driver.findElement(By.id("re_password")).clear();
	    driver.findElement(By.id("re_password")).sendKeys("test100");
	    driver.findElement(By.name("bio")).clear();
	    driver.findElement(By.name("bio")).sendKeys("test100");
	    driver.findElement(By.name("Submit")).click();

	  
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