package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account extends BasePage{
	
	public Account(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//*[@id=\"account-account\"]/ul/li[2]/a")
	WebElement accountpage;
	
	@FindBy(xpath="//*[@id=\"logo\"]/h1/a")
	WebElement headermsg;
	
	public void getmessage()
	{
		System.out.println(accountpage.getText());
	}
	
	public boolean displayheader()
	{
		try {
		return headermsg.isDisplayed() ;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		
		
	}

}
