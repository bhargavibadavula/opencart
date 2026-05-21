package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Account;
import pageobjects.HomePage;
import pageobjects.Login;
import testbase.BaseClass;

public class Tc_02_Login extends BaseClass{
	
	@Test
	public void verify_loginpage()
	{
		logger.info("started login execution");
		
		HomePage h1=new HomePage(driver);
		h1.clickMyAccount();
		h1.clickonLogin();
		
		Login l1=new Login(driver);
		l1.enteremailid(p.getProperty("email"));
		l1.enterpassword(p.getProperty("password"));
		l1.clickonSubmit();
		
		Account A1=new Account(driver);
		A1.getmessage();
		A1.displayheader();
		
		boolean target=A1.displayheader();
		Assert.assertEquals(target, true); // Assert.assertTrue(target);
	}
	
	

}
