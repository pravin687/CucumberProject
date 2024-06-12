package stepDefination;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.base.TestBase;
import ui.pageObject.HomePage;
import ui.pageObject.LoginPage;
import ui.utility.World;

public class HomeStep{
	public HomePage hp;
	public World world;
	
	public HomeStep(World world) throws IOException {
		this.world=world;
		this.hp=world.po.getHomePage();
	}
	
	@When("I click on Selenium link")
	public void i_click_on_selenium_link() {
		hp.clickOnSeleniumLink();

	}
	@Then("I check user land on selenium webpage")
	public void i_check_user_land_on_selenium_webpage() {
    assertEquals(hp.getCurrentUrl(), "https://debugautomation.com/Tabs/Selenium.html", "Page not matched");
	}

	@When("I click on api link")
	public void i_click_on_api_link() {
	   
	}
	@Then("I check user land on api webpage")
	public void i_check_user_land_on_api_webpage() {
	   
	}

}
