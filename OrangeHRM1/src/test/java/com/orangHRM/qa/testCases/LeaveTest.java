package com.orangHRM.qa.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangHRM.base.TestBase;

import com.orangHRM.qa.pages.Leave;
import com.orangHRM.qa.pages.LoginPage;

public class LeaveTest extends TestBase {
	LoginPage loginPage;
	Leave leave;
	
	public LeaveTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		initialization();

		// Created Object of LoginPage (We can access the all Method & functions of
		// Login class)
		leave = new Leave();
		loginPage= new LoginPage();
	}
	@Test(priority=0)
	public void loginPageTest() throws InterruptedException {
		loginPage.loginToOragneHRM1("Admin", "admin123");
	}
	@Test(priority=1)
	public void verifyUrl() {
		leave.verifyUrl();
	}
	@Test(priority=2)
	public void verifyHeading() {
		leave.verifyHeading();
	}
	@Test(priority=3)
	public void inputEmployeeName() {
		leave.inputEmployeeName();
	}
	@Test(priority=4)
	public void selectLeaveType() {
		leave.selectLeaveType();
	}
	@Test(priority=5)
	public void verifyLeaveBalance() {
		leave.verifyLeaveBalance();
	}
	@Test(priority=6)
	public void pickFromDate() {
		leave.pickFromDate();
	}
	@Test(priority=7)
	public void pickToDate() {
		leave.pickToDate();
	}
	@Test(priority=8)
	public void commentField() {
		leave.commentField();
	}
	@Test(priority=9)
	public void assignButton() {
		leave.assignButton();
	}
	
	

}
