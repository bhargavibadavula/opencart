package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement myAccount = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//span[text()='My Account']")
		        )
		);
		//accountRegistrationLink.click();
		myAccount .click();
	}
	
	public void clickregistration(){
		registrationLink.click();
		
		}
	
	public void clickonLogin()
	{
		login.click();
	}
	
}
