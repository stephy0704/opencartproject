package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.*;
import testBase.BaseClass;

public class Tc_002_LoginTest extends BaseClass {
	
	@Test
	public void test_login()
	{
		logger.info("***Tc_002_LoginTest***");
		Homepage hp=new Homepage(driver);
		
		hp.clicklogin();
		logger.info("clicked on login link and page is visible");
		
		Loginpage lp=new Loginpage(driver);
		lp.enteremail(rb.getString("email"));
		lp.enterpassword(rb.getString("password"));
		
		lp.clicklogin();
		
		logger.info("clicked on login button");
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.verifylogin();
		
		Assert.assertEquals(targetpage,true);
		
	}
	

}
