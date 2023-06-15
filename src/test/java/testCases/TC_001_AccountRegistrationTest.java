package testCases;

import org.testng.Assert;
import org.testng.annotations.*;
import pageobjects.*;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	
	
	@Test
	void test_registrationaccount() throws InterruptedException
	{
		Homepage hp=new Homepage(driver);
		hp.clickregister();
		
		logger.info("****TC_001_AccountRegistrationTest has started*****");
		Accountregistrationpage regpage=new Accountregistrationpage(driver);
		
		regpage.setfirstname("lachu");
		logger.info("First name is entered");
		
		 regpage.setlastname("lachu");
		 logger.info("Last name is entered");
		 
		 regpage.setemail(rb.getString("email"));
		 logger.info("email is entered");
		 
		 regpage.setpassword(rb.getString("password"));
		 logger.info("Password is set");
		 
		 regpage.confirmpassword(rb.getString("password"));
		 logger.info("password is confirmed");
		 
		 regpage.clickRegister();
		 logger.info("Register button clicked");
		 
		 String message=regpage.Getconfirmationmsg();
		 
		 Assert.assertEquals(message,"Your registration completed");
		 logger.info("registered");
		 

		    logger.info("****TC_001_AccountRegistrationTest has finished*****");
		 Thread.sleep(3000);
		 
		
	}
	
	

}
