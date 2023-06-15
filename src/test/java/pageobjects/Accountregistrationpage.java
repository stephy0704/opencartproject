package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountregistrationpage extends Basepage{
	
	public Accountregistrationpage(WebDriver driver)
	{
		super(driver);
	}
	
	//identifying elements
	
	@FindBy(name="FirstName")
	 WebElement txtfirstname;
	 
	 @FindBy(name="LastName")
	 WebElement txtlastname;
	 
	 @FindBy(name="Email")
	 WebElement txtemail;
	 
	 @FindBy(name="Password")
	 WebElement txtpassword;
	 
	 @FindBy(name="ConfirmPassword")
	 WebElement txtcnfmpassword;
	 
	 @FindBy(id="register-button")
	 WebElement btnregister;
	 
	 @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
	 WebElement msgconfirmation;
	 
	 
	 //actions
	 
	 public void setfirstname(String fname)
	 {
		 txtfirstname.sendKeys(fname);
	 }
	 
	 public void setlastname(String lname)
	 {
		 txtlastname.sendKeys(lname);
	 }
	 
	 public void setemail(String email)
	 {
		 txtemail.sendKeys(email)
;
	 }
	 
	 public void setpassword(String password)
	 {
		 txtpassword.sendKeys(password);
	 }
	 
	 public void confirmpassword(String cnfmpassword)
	 {
		 txtcnfmpassword.sendKeys(cnfmpassword);
	 }
	 
	 public void clickRegister()
	 {
		 btnregister.click();
	 }
	 
	 public String Getconfirmationmsg()
	 {
		 return  msgconfirmation.getText();
	 }
}
