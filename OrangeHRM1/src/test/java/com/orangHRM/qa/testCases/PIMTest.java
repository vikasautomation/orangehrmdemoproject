package com.orangHRM.qa.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangHRM.base.TestBase;
import com.orangHRM.qa.pages.Dashboard;
import com.orangHRM.qa.pages.LoginPage;
import com.orangHRM.qa.pages.PIM;

public class PIMTest extends TestBase {
	LoginPage loginPage;
	PIM pim;
	
	
	public PIMTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {
		initialization();
		pim= new PIM();
		loginPage= new LoginPage();
 }
	
	@Test(priority=-1)
	public void loginPageTest() throws InterruptedException {
		loginPage.loginToOragneHRM1("Admin", "admin123");
	}
	@Test(priority=0)
	public void selectEmployeeStatusDropdown() {
		pim.selectEmployeeStatusDropdown();
	}

 
	
	
}
