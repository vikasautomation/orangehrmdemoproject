package com.orangHRM.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.orangHRM.base.TestBase;

public class Leave extends TestBase {
	@FindBy(xpath="//div[@class='head']")
	WebElement assignLeave;
	//css=<HTML tag><#><Value of ID attribute>
	@FindBy(css="input#assignleave_txtEmployee_empName")
	WebElement employeeName;
	
	@FindBy(css="select#assignleave_txtLeaveType")
	WebElement leaveTypedropdown;
	
	@FindBy(xpath="//label[contains(text(),'Leave Balance')]")
	WebElement leaveBalance;
	
	@FindBy(xpath="//span[contains(text(),'Should be a valid date in yyyy-mm-dd format')]")
	WebElement validationMessage;
	
	@FindBy(xpath="(//img[@class=\"ui-datepicker-trigger\"])[1]")
	WebElement fromDatecalendar;//click on claendar icon
	
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	WebElement yearDropdown;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	WebElement monthDropdown;
	
	@FindBy(xpath="(//a[@class='ui-state-default'])[1]")
	WebElement selectDate;
	
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[2]")
	WebElement toDatecalendar;
	
	@FindBy(xpath="//textarea[@name='assignleave[txtComment]']")
	WebElement commentField;
	
	@FindBy(xpath="//input[@id='assignBtn']")
	WebElement assignBtn;
	
	@FindBy(xpath="//select[@class=\'ui-datepicker-month\']")
	WebElement monthdropDown;
	
	@FindBy(xpath="(//input[@class='btn'])[3]")
	WebElement popup;
	
	//Initializing the page objects
			public Leave() {
				PageFactory.initElements(driver, this);
			}
			
			
	//Actions
	public void verifyUrl() {
		driver.findElement(By.xpath("(//span[@class='quickLinkText'])[1]")).click();
		String ActualURL = driver.getCurrentUrl();
	String ExpectedURL= "https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave";
	Assert.assertEquals(ActualURL, ExpectedURL);
	System.out.println("Yo are on correct page");
	
	}
	
	public void verifyHeading() {
		if(assignLeave.isDisplayed()==true) {
			System.out.println("Title of section"+assignLeave.getText());
		}
		else{
			System.out.println("Sorry ELement not found ");
			
		}
	}
	
	public void inputEmployeeName() {
		if(employeeName.isEnabled()==true) {
			String labelText = driver.findElement(By.xpath("//label[@for='assignleave_txtEmployee']")).getText();
			System.out.println("Here we have employee field"+labelText);
			employeeName.sendKeys("a");
			driver.findElement(By.xpath("(//li[contains(text(),'Jord')])[2]")).click();
			
		}
	}
	public void selectLeaveType() {
		Select s = new Select(leaveTypedropdown);
		s.selectByIndex(2);
		String selectedOption = leaveTypedropdown.getText();
		System.out.println(selectedOption);
	}
	public void verifyLeaveBalance() {
           String ele = driver.findElement(By.xpath("//div[@id='assignleave_leaveBalance']")).getText();
           System.out.println("Here we have leave count"+ele);
           driver.findElement(By.xpath("//a[@id='leaveBalance_details_link']")).click();
           String popupHeaderText = driver.findElement(By.xpath("(//div[@class='modal-header'])[3]")).getText();
           System.out.println("Here we have header title"+  popupHeaderText);
           String bodyText = driver.findElement(By.xpath("(//div[@class=\"modal-body\"])[5]")).getText();
           System.out.println(bodyText);
           driver.findElement(By.id("closeButton")).click();
	}
	public void pickFromDate() {
		fromDatecalendar.click();
		Select s1 = new Select(yearDropdown);
		s1.selectByIndex(10);
		Select s2 = new Select(monthDropdown);
		s2.selectByIndex(5);
		selectDate.click();
	}
	
   public void pickToDate() {
	   toDatecalendar.click();
	   Select s1 = new Select(yearDropdown);
		s1.selectByIndex(11);
		Select s2 = new Select(monthDropdown);
		s2.selectByIndex(6);
		selectDate.click();
   }
   public void commentField() {
	   commentField.sendKeys("My name is vikas");
	   
   }
   public void assignButton() {
	   assignBtn.click();
	   popup.click();
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
