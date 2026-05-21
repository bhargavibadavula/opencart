package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends BasePage{
	
	public Registration(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class=\"col-sm-10\"]//input[1][@name=\"firstname\"]")
	WebElement FirstName;
	
	
	@FindBy(xpath="//div[@class=\"col-sm-10\"]//input[1][@name=\"lastname\"]")
	WebElement LastName;


	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement Email;
	

	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	WebElement telephone;
	
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"input-confirm\"]")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement privacy;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement Continue;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement successfulmsg;
	
	public void EnterName(String fisrname)
	{
		FirstName.sendKeys(fisrname);
	}
	
	
	public void EnterLastName(String lastname)
	{
		LastName.sendKeys(lastname);
	}
	
	public void EnterEamil(String email)
	{
		Email.sendKeys(email);
	}
	
	public void Enterpassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void EnterTelephone(String Telephone)
	{
		telephone.sendKeys(Telephone);
	}
	
	public void EnterConfirmPassword(String confirmpassword)
	{
		ConfirmPassword.sendKeys(confirmpassword);
	}
	
	public void Clickprivacye()
	{
		privacy.click();
	}
	
	public void ClickTContinue()
	{
		Continue.click();
	
	}
	public String getmessage()
	{
		String msg="";
		try
		{
			 msg=successfulmsg.getText();
			 System.out.println(msg);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return msg;
		
	}
	
}
