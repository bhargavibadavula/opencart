package testcases;


import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.Registration;
import testbase.BaseClass;


public class Tc_01AccontRegistration extends BaseClass{
	
	@Test
	void Verify_account_registration()
	{
		logger.info("started the test execution");
		System.out.println("hello");
		try {
		HomePage h=new HomePage(driver);
		
		h.clickMyAccount();
		logger.info("clicked on my account");
		
		h.clickregistration();
		logger.info("clicked on registration");
		
		Registration r=new Registration(driver);
		logger.info("entering details for registration");
		
		r.EnterName("bhargavi");
		r.EnterLastName("badavula");
		r.EnterEamil(randomstring()+"@gamil.com");
		r.EnterTelephone(randomNumber());
		r.Enterpassword("@12345");
		r.EnterConfirmPassword("@12345");
		r.Clickprivacye();
		r.ClickTContinue();
		r.getmessage();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			logger.error("test failed");
			logger.debug("debug logs");
		}
	}
	
	

}
