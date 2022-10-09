package com.orangHRM.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangHRM.base.TestBase;
public class LoginPage extends TestBase {
	
	//Page Factory and OR
	@FindBy(xpath="//input[@name='username']")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup//just used for pick element from stored cache so that operation can be more faster
	WebElement password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy(xpath = "//div[@id=\'divLogo\']")
	WebElement OrangeHRMLogo ;
	
	@FindBy(linkText = "Forgot your password?")
	WebElement forgotPasswordLink;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement validationMessage;
	
	@FindBy(xpath="//div[@class='orangehrm-login-forgot']")
	WebElement forgotPwd;
	
	
	//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		
		//Action: To Get Title Of the Page
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		// Action: To check
		//page logo
		public void validateOrangeHRMLogo(){
			 //identify image
		      WebElement i = driver.findElement(By.xpath("//img[@src=\"/web/images/ohrm_branding.png?1660914792648\"]"));
		      // Javascript executor to check image
		      Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		      //verify if status is true
		      if (p) {
		         System.out.println("Logo Image present");
		      } else {
		         System.out.println("Logo Image not present");
		      }
		}
			
		

	public void loginToOragneHRM1(String userName, String pwd) throws InterruptedException {
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		email.clear();
		email.sendKeys(userName);
		Thread.sleep(2000);
		password.clear();
		password.sendKeys(pwd);
		loginButton.click();
		System.out.println("User is successfully logged with valid credentials");

	}
	
	//Check login with incorrect credentials
public void loginWithInvalidCredentials() throws InterruptedException{
	email.clear();
	email.sendKeys("Invalid");
	Thread.sleep(2000);
	password.clear();
	password.sendKeys("Invalid");
	loginButton.click();
	Thread.sleep(2000);
	System.out.println(validationMessage.getText());
	if(validationMessage.isDisplayed()) {
		System.out.println("User is not able to login with incorrect credentials");
	}else {
		System.out.println("User is able to login with incorrect credentials or may be an other issues");
	}
	System.out.println(forgotPwd.getText());
	forgotPwd.click();	
	driver.close();
		
}
		
	

	
	
	
	//To click on Forgot Password Link
		public void forgotPassword() {
			forgotPasswordLink.click();
			
			
		}
}