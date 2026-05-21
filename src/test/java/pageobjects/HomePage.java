package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//li[@class=\"dropdown\"][1]/child::*[1]/span[text()='My Account']") 
	WebElement accountRegistrationLink;
	
	@FindBy(xpath="//ul[@class=\"dropdown-menu dropdown-menu-right\"]//child::a[contains(text(),'Register')]")
	WebElement registrationLink;

	@FindBy(xpath="//a[contains(text(),\"Login\")]")
	WebElement login;
	
	public void clickMyAccount()
	{
		accountRegistrationLink.click();
	}
	
	public void clickregistration(){
		registrationLink.click();
		
		}
	
	public void clickonLogin()
	{
		login.click();
	}
	
}
