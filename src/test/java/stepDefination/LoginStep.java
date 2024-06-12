package stepDefination;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.base.TestBase;
import ui.pageObject.LoginPage;
import ui.utility.World;


public class LoginStep{
	public LoginPage lp;
	public World world;
	
	public LoginStep(World world) throws IOException {
		this.world=world;
		this.lp=world.po.getLoginPage();
	}
	
	
	@Given("user login in {string} website")
	public void user_login_in_website(String string) {
    lp.launchWebsite(string);
	}
	
	@When("User insert username  {string} and password {string}")
	public void user_insert_username_and_password(String string, String string2) {
	    lp.setUsername(string);
	    lp.setPassword(string2);
	}
	@And("user click on submit button")
	public void user_click_on_submit_button() {
		lp.clickOnSubmitButton();
		lp.handleAlertAndAccept();
	}
	@Then("user will verify homepage")
	public void user_will_verify_homepage() {
	   assertEquals(lp.getCurrentUrlOfPage(), "https://debugautomation.com/Home.html");
	}
}
