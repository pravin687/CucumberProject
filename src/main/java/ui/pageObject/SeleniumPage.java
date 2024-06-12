package ui.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ui.base.TestBase;

public class SeleniumPage extends TestBase{
	public WebDriver driver;
	
	public SeleniumPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By selenium=By.xpath("//*[text()='Selenium']");
	private By api=By.xpath("//*[text()='Api Automation']");
	
	public void  clickOnSeleniumLink() {
		driver.findElement(selenium).click();
	}
	
	public void  clickOnApiLink() {
		driver.findElement(api).click();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void waitTime() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(0));
		wait.until(ExpectedConditions.visibilityOf((WebElement) selenium));
	}
	
	

	

}
