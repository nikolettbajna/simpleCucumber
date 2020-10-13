package cuke.stepdef;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demoSiteTest {
	
	public static WebDriver driver;
	public static WebElement targ;
	public static String check = "";
	
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver(chromeCfg());
	}
	
	@Given("^I can access the \"([^\"]*)\" website$")
	public void i_can_access_the_website(String arg1) throws Throwable {
		driver.get(arg1);
		check = "FREE example PHP code and online MySQL database - example username password protected site";
		assertEquals(check, driver.getTitle());
		System.out.println("I am on the " + arg1 + " page");
	}

	@Given("^I can navigate to the register page$")
	public void i_can_navigate_to_the_register_page() throws Throwable {
		targ = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		targ.click();
		check = "Add a user - FREE PHP code and SQL";
		assertEquals(check, driver.getTitle());
		System.out.println("I am on the register page now");
	}

	@When("^I type in the following credentials$")
	public void i_type_in_the_following_credentials(DataTable arg1) throws Throwable {
		targ = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		assertNotNull(targ);
		
		List<String> table = arg1.asList(String.class);
		System.out.println(table);
		String un = table.get(0);
		String pw = table.get(1); 
		System.out.println("Username: "+un);
		System.out.println("Password: "+pw);
		targ.sendKeys(un);
		  
		assertEquals(un, targ.getAttribute("value"));
		
		targ = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		assertNotNull(targ);
		
		targ.sendKeys(pw);
		  
		assertEquals(pw, targ.getAttribute("value"));
		
		targ = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		targ.click();
	}

	@Then("^I am able to register$")
	public void i_am_able_to_register() throws Throwable {
		targ = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote"));
		assertEquals("The username: root\n" + 
				"The password: root", targ.getText());
	}
	
	@Given("^I can navigate to the login page$")
	public void i_can_navigate_to_the_login_page() throws Throwable {		
		driver.get("http://thedemosite.co.uk/login.php");
		check = "Login example page to test the PHP MySQL online system";
		assertEquals(check, driver.getTitle());
		System.out.println("I am on the Login page");
	}
	
	@When("^To login I type in the following credentials$")
	public void to_login_i_type_in_the_following_credentials(DataTable arg1) throws Throwable {
		targ = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		assertNotNull(targ);
		
		List<String> table = arg1.asList(String.class);
		System.out.println(table);
		String un = table.get(0);
		String pw = table.get(1); 
		System.out.println("Username: "+un);
		System.out.println("Password: "+pw);
		targ.sendKeys(un);
		  
		assertEquals(un, targ.getAttribute("value"));
		
		targ = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		assertNotNull(targ);
		
		targ.sendKeys(pw);
		  
		assertEquals(pw, targ.getAttribute("value"));
		
		targ = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		targ.click();
	}

	@Then("^I am able to login$")
	public void i_am_able_to_login() throws Throwable {
		targ = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		assertEquals("**Successful Login**", targ.getText());
	}
	
	@After
	public void end() {
		driver.close();
		driver.quit();
	}
	
	// Designed to return ChromeOptions to configure new ChromeDrivers in Selenium
	  public static ChromeOptions chromeCfg() {
	   Map<String, Object> prefs = new HashMap<String, Object>();
	   ChromeOptions cOptions = new ChromeOptions();
	    
	   // Settings
	   prefs.put("profile.default_content_setting_values.cookies", 2);
	   prefs.put("network.cookie.cookieBehavior", 2);
	   prefs.put("profile.block_third_party_cookies", true);

	   // Create ChromeOptions to disable Cookies pop-up
	   cOptions.setExperimentalOption("prefs", prefs);

	   return cOptions;
	   }
}
