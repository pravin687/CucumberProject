package ui.pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public LoginPage lp;
	public HomePage hp;
	public SeleniumPage sp;
	
	
    public PageObjectManager(WebDriver driver) {
    	this.driver=driver;
    }
    
    public LoginPage getLoginPage() {
    	lp=new LoginPage(driver);
    	return lp;
    }
    
    public HomePage getHomePage() {
    	hp=new HomePage(driver);
    	return hp;
    }
}
