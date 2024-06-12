package ui.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ui.base.TestBase;

public class LoginPage{

	public WebDriver driver;
	public HomePage hp;
	
public LoginPage(WebDriver driver) {
	this.driver=driver;
}
	
	
	private By username=By.id("username");
	private By password=By.id("password");
	private By submit=By.xpath("//*[@type='submit']");
	
	public void launchWebsite(String websiteName) {
		driver.get(websiteName);
	}

	public void setUsername(String name) {
	 driver.findElement(username).sendKeys(name);
	}
 
	public void setPassword(String pwd) {
	 driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnSubmitButton() {
	 driver.findElement(submit).click();
	}
	
	public String getCurrentUrlOfPage() {
		return driver.getCurrentUrl();
	}
	
	public void handleAlertAndAccept() {
		driver.switchTo().alert().accept();
	}
}
