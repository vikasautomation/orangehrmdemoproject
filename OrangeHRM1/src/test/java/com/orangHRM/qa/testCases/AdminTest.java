package com.orangHRM.qa.testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangHRM.base.TestBase;
import com.orangHRM.qa.pages.Admin;
import com.orangHRM.qa.pages.HomePage;
import com.orangHRM.qa.pages.LoginPage;

public class AdminTest extends TestBase {
	Admin admin;
	LoginPage loginPage;

	public AdminTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		initialization();

		// Created Object of LoginPage (We can access the all Method & functions of
		// Login class)
		admin = new Admin();
		loginPage= new LoginPage();
	}
	@Test(priority=0)
	public void loginPageTest() throws InterruptedException {
		loginPage.loginToOragneHRM1("Admin", "admin123");
	}
	
	@Test(priority=1)
	public void onAdmminPage() {
		admin.onAdmminPage();
	}
	
	@Test(priority=2)
	public void getUserManagementText() {
		admin.getUserManagementText();// not printing linkText
	}
	@Test(priority=3)//expected [Users] but found []
	public void getUsersText() {
		admin.getUsersText();
	}
	@Test(priority=4)
		public void verifySearchTitle() {
			admin.verifySearchTitle();
		}
		
	@Test(priority=5)
	public void fillUserName() {
		admin.fillUserName();
	}
	@Test(priority=6)
	public void userRoleDropdown() {
		admin.userRoleDropdown();
	}
	@Test(priority=7)
	public void fillemployeeName() {
		admin.fillemployeeName();
	}
	public void statusDropdown() throws InterruptedException {
		admin.statusDropdown();
	}
	@Test(priority=8)
	public void addUser() {
		admin.addUser();
	}
	
	@Test(priority=9)
	public void addUserHeading() {
		admin.addUserHeading();
	}
	@Test(priority=10)
	public void userRole() {
		admin.userRole();
	}
	@Test(priority=11)
	public void emloyeename() {
		admin.emloyeename();
	}
	@Test(priority=12)    
	public void UserName() {
		admin.UserName();
	}
	@Test(priority=13)
		public void enterPassword() {
			admin.enterPassword();
		}
	@Test(priority=14)
		
		public void enterConfirmPassword() {
			admin.enterConfirmPassword();
		}
		
	@Test(priority=15)
	public void cancelButton() {
		admin.cancelButton();
	}
	@Test(priority=16)
	public void saveButon() {
		admin.saveButon();
	}
	@Test(priority=17)
	public void selectCheckbox() {
		admin.selectCheckbox();
	}
	@Test(priority=18)
	public void deleteData() {
		admin.deleteData();;
	}
	@Test(priority=19)
		public void confirmation() {
			admin.confirmation();
		}
	
	
	
	
	@Test(priority=20)
	public void printUserList() {
		admin.printUserList();
	}
	@Test(priority=21)
	public void adminTab() {
		admin.adminTab();
	}
	@Test(priority=22)
	public void jobTabOption() {
		admin.jobTabOption();
	}
	@Test(priority=23)
	public void getAlloptions() {
		admin.getAlloptions();
	}
	
	@Test(priority=24)
	public void jObTitleSection() {
		admin.jObTitleSection();
	}
		
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
}
