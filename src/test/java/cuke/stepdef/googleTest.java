package cuke.stepdef;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googleTest {
	
	public static WebDriver driver;
	public static WebElement targ;
	public static String searchTerm = "Kittens";
	
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver(chromeCfg());
	}
	
	@Given("^we can open google$")
	  public void given() throws Throwable {
		driver.get("https://google.com");
		
		assertEquals("Google", driver.getTitle());
	  }
	
	@Given("^the title is equal to \"([^\"]*)\"$")
	public void the_title_is_equal_to(String arg1) throws Throwable {
	    System.out.println(arg1);
	}


	  @When("^we search for kitten$")
	  public void when() throws Throwable {
		  targ = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		  assertNotNull(targ);
		  
		  targ.sendKeys(searchTerm);
		  
		  assertEquals(searchTerm, targ.getAttribute("value"));
		  targ.submit();
	  }

	  @Then("^google will return us images of kittens$")
	  public void then() throws Throwable {
		  targ = driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a"));
		  targ.click();
		  
		  targ = driver.findElement(By.xpath("//*[@id=\"islrg\"]/div[1]/div[1]/a[1]/div[1]/img"));
		  
		  
		  Boolean hasImage = targ.getAttribute("src").contains("image");
		  
		  assertTrue(hasImage);
	  }
	  
	  @When("^we search for puppies$")
	  public void we_search_for_puppies() throws Throwable {
		  targ = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		  assertNotNull(targ);
		  
		  searchTerm = "Puppies";
		  
		  targ.sendKeys(searchTerm);
		  
		  assertEquals(searchTerm, targ.getAttribute("value"));
		  targ.submit();
	  }

	  @Then("^google will return us images of puppies$")
	  public void google_will_return_us_images_of_puppies() throws Throwable {
		  targ = driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a"));
		  targ.click();
		  
		  targ = driver.findElement(By.xpath("//*[@id=\"islrg\"]/div[1]/div[1]/a[1]/div[1]/img"));
		  
		  
		  Boolean hasImage = targ.getAttribute("src").contains("image");
		  
		  assertTrue(hasImage);
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
