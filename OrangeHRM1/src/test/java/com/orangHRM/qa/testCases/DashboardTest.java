package com.orangHRM.qa.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangHRM.base.TestBase;
import com.orangHRM.qa.pages.Dashboard;
import com.orangHRM.qa.pages.LoginPage;

public class DashboardTest extends TestBase{
	
	 Dashboard dashboard;
	 LoginPage loginPage;
	 
	 public DashboardTest() {
		 super();
	 }
	 
	 @BeforeTest
		public void setUp() throws InterruptedException {
			initialization();
			dashboard= new Dashboard();
			loginPage= new LoginPage();
	 }

		@Test(priority=0)
		public void loginPageTest() throws InterruptedException {
			loginPage.loginToOragneHRM1("Admin", "admin123");
		}
		@Test(priority=1)
		public void takeScreenshot() throws IOException {
			dashboard.takeScreenshot();
		}
	 
	 
	@Test(priority=2)
	public  void verifyAdminLink1() {
		dashboard.verifyAdminLink();
	}
	
	@Test(priority=3)
	public  void verifyPimLink() {
		dashboard.verifyPimLink();
	}
	@Test(priority=4)
	public void verifyLeaveLink() {
		dashboard.verifyLeaveLink();
	}
	@Test(priority=5)
	public void verifyTimeLink() {
		dashboard.verifyTimeLink();;
	}
	@Test(priority=6)
	public void verifyRecruitmentLink() {
		dashboard.verifyRecruitmentLink();
	}
	@Test(priority=7)
	public void verifyMyInfoLink() {
		dashboard.verifyMyInfoLink();
	}
	@Test(priority=8)
	public void verifyPerformanceLink() {
		dashboard.verifyPerformanceLink();
	}
	@Test(priority=9)
	public void verifyDirectoryLink() {
		dashboard.verifyDirectoryLink();
	}
	@Test(priority=10)
	public void verifyMaintenanceLink() {
		dashboard.verifyMaintenanceLink();
	}
	@Test(priority=11)
	public void verifyBuzzLink() {
		dashboard.verifyBuzzLink();
	}
	
	
	@Test(priority=12)
	 public void printHeaderlinks() {
		dashboard.printHeaderlinks();
	}
	@Test(priority=13)
	public void verifyDashboardSection() {
		dashboard.verifyDashboardSection();
	}
	@Test(priority=14)
	public void quickLaunch() {
		dashboard.quickLaunch();
	}
	@Test(priority=15)
	public void verifyImages() {
		dashboard.verifyImages();
	}
	
	@Test(priority=16)
	public void printimagesName() {
		dashboard.printimagesName();
	}
	@Test(priority=17)
	public void verifyEmpSection() {
		dashboard.verifyEmpSection();
	}
	@Test(priority=18)
	public void verifylegendSection() {
		dashboard.verifylegendSection();
	}
	
	@Test(priority=19)
	public void verifypendingRequest() {
		dashboard.verifypendingRequest();
	}
	@Test(priority=20)
	public void verifyassignLeaveUrl() {
		dashboard.verifyassignLeaveUrl();
	}
	@Test(priority=21)
	public void verifyLeaveListUrl() {
		dashboard.verifyLeaveListUrl();
	}
	
	@Test(priority=22)
	public void teardown() {
		driver.quit();
	}
	
}

