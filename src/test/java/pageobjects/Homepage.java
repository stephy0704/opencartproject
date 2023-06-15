package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {
	
	public Homepage(WebDriver driver)
	{
		super(driver);
	}
	
	
	/*@FindBy(xpath="//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/i[1]")
	WebElement lnkmyaccount;*/
	
	@FindBy(linkText="Register")
	WebElement lnkregister;
	
	@FindBy(linkText="Log in")
	WebElement lnklogin;
	
	//actions
	
	/*public void clickmyaccount()
	{
		lnkmyaccount.click();
	}*/
	
	public void clickregister()
	{
		lnkregister.click();
	}
	
	public void clicklogin()
	{
		lnklogin.click();
	}
	
	

}
