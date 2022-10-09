package com.orangHRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orangHRM.base.TestBase;

public class PIM extends TestBase{
	//Verify user is able to search employee by "Employment Status" input
	
	@FindBy(xpath= "(//div[@class='oxd-select-text-input'])[1]")
	WebElement employeeStatus;
	
	
	public PIM() {
		PageFactory.initElements(driver, this);
		
	}
	public void verifyPimPage() {
		String actualURL = driver.getCurrentUrl();
	Assert.assertEquals(actualURL, "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
			System.out.println("You are on PIM page");
	
	}
	public void selectEmployeeStatusDropdown() {

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
