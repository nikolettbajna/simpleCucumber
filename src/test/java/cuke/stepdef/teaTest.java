package cuke.stepdef;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teaTest {
	
	public static WebDriver driver;
	public static WebElement targ;
	public static String check;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver(chromeCfg());
	}
	
	@Given("^I can open the website$")
	public void i_can_open_the_website() throws Throwable {
		driver.get("http://www.practiceselenium.com/");
	}

	@Given("^the title is equals to \"([^\"]*)\"$")
	public void the_title_is_equals_to(String arg1) throws Throwable {
		assertEquals(arg1, driver.getTitle());
		System.out.println("I am on the " + arg1 + " page");
	}

	@When("^I check the menu$")
	public void i_check_the_menu() throws Throwable {
		targ = driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
		targ.click();
		check = "Menu";
		assertEquals(check, driver.getTitle());
		System.out.println("Check the menu");
	}
	
	@When("^I choose the \"([^\"]*)\"$")
	public void i_choose_the(String arg1) throws Throwable {
		targ = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong"));
		assertEquals(arg1, targ.getText());
		System.out.println("I choose the " + arg1);
	}

	@When("^I will buy the tea$")
	public void a_choose_which_tea_to_buy() throws Throwable {
		targ = driver.findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451959280\"]/span"));
		targ.click();
		System.out.println("I go the checkout");
	}

	@Then("^I go to checkout$")
	public void i_go_to_checkout() throws Throwable {
		check = "Check Out";
		assertEquals(check, driver.getTitle());
		targ = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button"));
		targ.click();
		System.out.println("I bought the tea");
	}
	
	@After
	public void end() {
		driver.close();
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
