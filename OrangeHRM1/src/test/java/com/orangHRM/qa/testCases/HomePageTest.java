package com.orangHRM.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangHRM.base.TestBase;
import com.orangHRM.qa.pages.HomePage;
import com.orangHRM.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	// String sheetName ="Sheet1";

	public HomePageTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {
		initialization();

		// Created Object of LoginPage (We can access the all Method & functions of
		// Login class)
		homePage = new HomePage();
		loginPage= new LoginPage();
	}
	
	@Test(priority=0)
	public void loginPageTest() throws InterruptedException {
		loginPage.loginToOragneHRM1("Admin", "admin123");
	}

	@Test(priority = 1)
	public void verifyHomeLogo() {
		Assert.assertEquals(homePage.verifyHomeLogo(), true);
	}

	@Test(priority = 2)
	public void verifyHeaderMenu() {
		homePage.verifyHeaderMenu();
		
	
		
		
	
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
