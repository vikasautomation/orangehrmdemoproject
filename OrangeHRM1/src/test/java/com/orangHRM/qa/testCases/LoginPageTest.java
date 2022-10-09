package com.orangHRM.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangHRM.base.TestBase;
import com.orangHRM.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	//String sheetName ="Sheet1";
	public LoginPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {
		initialization();

		// Created Object of LoginPage (We can access the all Method & functions of Login class)
		loginPage = new LoginPage();	
	}
	
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		System.out.println("Title: "+ title);
		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test(priority=2)
	public void logoOrangeHRM() {
		loginPage.validateOrangeHRMLogo();

	}
	
	@Test(priority=3)
	public void loginWithInvalidCredentials() throws InterruptedException{
		loginPage.loginWithInvalidCredentials();
		
	}
	
	@Test(priority=4)
	public void setUp1() throws InterruptedException {
		initialization();

		// Created Object of LoginPage (We can access the all Method & functions of Login class)
		loginPage = new LoginPage();	
	}
	public void loginPageTest() throws InterruptedException {
		loginPage.loginToOragneHRM1("Admin", "admin123");
	}

	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
