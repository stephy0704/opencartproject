package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Basepage{
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(linkText="My account")
	WebElement lnkmyaccount;
	
	@FindBy(linkText="Log out")
	WebElement lnkLogout;
	
	public boolean verifylogin()
	{
		try
		{
		return lnkmyaccount.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void Clicklogout()
	{
		lnkLogout.click();
	}
	

}
