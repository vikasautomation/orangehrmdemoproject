package com.orangHRM.qa.pages;

import java.util.List;
import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.orangHRM.base.TestBase;

public class Admin extends TestBase {
	
	//Page factory/OR
	
	@FindBy(xpath="(//a[@class='firstLevelMenu'])[1]")
	WebElement admin;
	
	@FindBy(xpath="(//a[contains(@class,arrow)])[10]")
	WebElement link;
	
	@FindBy(xpath="//a[@id='menu_admin_viewSystemUsers']")
	WebElement link1;
	
	@FindBy(xpath= "//a[@class='toggle tiptip']")
	WebElement searchTitle;
	
	@FindBy(id="searchSystemUser_userName")
	WebElement userName;//vikas123
	
	@FindBy(xpath="//select[@id='searchSystemUser_userType']")
	WebElement userRole;									//dropdown
	
	@FindBy(xpath="//input[@name='searchSystemUser[employeeName][empName]']")
	WebElement employeeName;//David Morris
	
	@FindBy(xpath="//select[@id='searchSystemUser_status']")
	WebElement status;                                    //dropdown
	
	@FindBy(id="//input[@id='searchBtn']")
	WebElement button;
	//****************************Add User***************************************************
	@FindBy(id="btnAdd")
	WebElement addbutton;
	
	@FindBy(xpath="//h1[@id='UserHeading']")
	WebElement addUserHeading;
	
	@FindBy(xpath="//select[@id='systemUser_userType']")
	WebElement selectUserRole;	//dropdown
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement employeename;
	
	@FindBy(id="systemUser_userName")
	WebElement selectUserName;	//dropdown
	
	@FindBy(id="systemUser_password")
	WebElement password;
	
	@FindBy(xpath="//input[@name='systemUser[confirmPassword]']")
	WebElement confirmPassword;
	
	@FindBy(id="btnCancel")
	WebElement cancelButton;
	
	@FindBy(id="btnSave")
	WebElement saveButton;
	
	
//*****************************Delete User*************************************
	
@FindBy(xpath="(//input[@type='checkbox'])[4]")
WebElement checkBox1;
//@FindBy(id="ohrmList_chkSelectRecord_18")
//WebElement checkBox2;
//@FindBy(id="ohrmList_chkSelectRecord_18")
WebElement checkBox3;
@FindBy(id="btnDelete")
WebElement deleteButton;
//*************************JOB**********************
@FindBy(linkText="Admin")
WebElement admintab;//need to click

@FindBy(xpath="(//a[@class=\"arrow\"])[2]")
WebElement jobTab;//Need to hover

//@FindBy(xpath="//a[@id=\"menu_admin_Job\"]/following-sibling::ul/li/a")
//List<WebElement> listOptions;//Need to print all

@FindBy(xpath="//a[@id='menu_admin_viewJobTitleList']")
WebElement jobTitle;//Need to click 













//**********************************************************************************
	
	//Initializing the page objects
	public Admin() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions over elements
	public void onAdmminPage() {
		admin.click();
		String Url = driver.getCurrentUrl();
		Assert.assertEquals(Url, "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	}
	public void getUserManagementText() {
		String linkname = link.getText();
		Assert.assertEquals(linkname, "User Management");
		System.out.println("Here we have link name "+ linkname);    
	}
	public void getUsersText() {
		String linkname1 = link1.getText();
		Assert.assertEquals(linkname1, "");
		System.out.println("Here we have link name1 "+ linkname1);
		
	}
	public void verifySearchTitle() {
		Assert.assertEquals(searchTitle.isDisplayed(), true);
		String Title = searchTitle.getText();
		System.out.println(Title);
	}
	public void fillUserName() {
		Assert.assertEquals(userName.isEnabled(), true);
		userName.clear();
		userName.sendKeys("vikas123");	
	}
	public void userRoleDropdown() {
		Select s =new Select(userRole);
		s.selectByIndex(1);
		String selectedRole = userRole.getText();
		System.out.println(selectedRole);
	}
	public void fillemployeeName() {
		Assert.assertEquals(employeeName.isEnabled(), true);
		employeeName.clear();
		employeeName.sendKeys("David Morris");
	}
	public void statusDropdown() throws InterruptedException {
		Select s = new Select(status);
		s.selectByIndex(1);
		String statusText = status.getText();
		System.out.println(statusText);
		Thread.sleep(3000);
		button.click();
	}
	
	
	//***************************Add User**********************************************
	public void addUser() {
		Assert.assertEquals(addbutton.isEnabled(), true);
		String btnText = addbutton.getText();
		System.out.println(btnText);
		addbutton.click();
	}

	public void addUserHeading() {
		String headingText = addUserHeading.getText();
		System.out.println(headingText);
	}
	public void userRole() {
		Select s= new Select(selectUserRole);
		s.selectByIndex(1);

	}
	public void emloyeename() {
		Assert.assertEquals(employeename.isDisplayed(), true);
		employeename.clear();
		employeename.sendKeys("dav");	
		driver.findElement(By.xpath("//li[contains(text(),'id Morris')]")).click();
		}
	public void UserName() {
		selectUserName.sendKeys(getSaltString());
		
	}
	
	public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	public void enterPassword() {
		Assert.assertEquals(password.isDisplayed(), true);
		password.clear();
		password.sendKeys("12345678");
	}
	public void enterConfirmPassword() {
		Assert.assertEquals(confirmPassword.isDisplayed(), true);
		confirmPassword.clear();
		confirmPassword.sendKeys("12345678");
	}
	public void cancelButton() {
		String cnclButtontext = cancelButton.getText();
		System.out.println(cnclButtontext);
	}
	
	public void saveButon() {
		saveButton.click();
		
	}
	//*****************************Delete User*************************************
	public void selectCheckbox() {
		checkBox1.click();
//		checkBox2.click();
//		checkBox3.click();
	}
	public void deleteData() {
		deleteButton.click();
	}
	
	public void confirmation() {
		driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
		
	}
	//***************************Print user names***************************************
	
	public void printUserList() {
		List<WebElement> allList = driver.findElements(By.xpath("//td[@class='left']"));
	for(WebElement users:allList ) {
		System.out.println(users.getText());	
	}
	
	}
	//********************************JOB********************************************************
	public void adminTab() {
		admintab.click();
		System.out.println(driver.getCurrentUrl());
		
	}
	public void jobTabOption() {
		Actions action = new Actions(driver);

		action.moveToElement(jobTab).perform();
	}
	
	public void getAlloptions() {
		List<WebElement> allElements = driver.findElements(By.xpath("//a[@id=\\\"menu_admin_Job\\\"]/following-sibling::ul/li/a"));
		for(WebElement users:allElements ) {
			System.out.println(users.getText());
			
		}
	}
	public void jObTitleSection() {
		jobTitle.click();
		System.out.println(driver.getCurrentUrl());
	}
	
	
	
	
	}
	
	
	
	
