package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {
	
	public Login(WebDriver driver) {
		super(driver);
		
	}

	
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement email;

	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@type=\"submit\" and @class=\"btn btn-primary\"]")
	WebElement submit;
	
	
	public void enteremailid(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void enterpassword(String Pass)
	{
		password.sendKeys(Pass);
	}
	
	public void clickonSubmit()
	{
		submit.click();
	}
	
}
