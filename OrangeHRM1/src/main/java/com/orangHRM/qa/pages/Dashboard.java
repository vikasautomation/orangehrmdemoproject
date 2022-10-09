package com.orangHRM.qa.pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orangHRM.base.TestBase;

public class Dashboard extends TestBase {
	
	@FindBy(linkText="Admin")
	WebElement Admin;
	
	@FindBy(linkText="PIM")
	WebElement PIM;
	
	@FindBy(linkText="Leave")
	WebElement Leave;
	
	@FindBy(linkText="Time")
	WebElement Time;
	
	@FindBy(linkText="Recruitment")
	WebElement Recruitment;
	
	@FindBy(linkText="My Info")
	WebElement MyInfo;
	
	@FindBy(linkText="Performance")
	WebElement Performance;
	
	@FindBy(linkText="Directory")
	WebElement Directory;
	
	@FindBy(linkText="Maintenance")
	WebElement Maintenance;
	
	@FindBy(linkText="Buzz")
	WebElement Buzz;
	
	@FindBy(xpath="//li[@class='main-menu-first-level-list-item' ]")
	public List<WebElement> headerlinks;
	
	@FindBy(xpath="//div[@id='content']")
	WebElement dashboardFrame;
	
	@FindBy(xpath="//div[@class=\"head\"]/h1")
	WebElement dashboardtitle;
	
	@FindBy(xpath="//div[@class='panel_wrapper']")
	WebElement quickLaunchframe;
	
	@FindBy(xpath="//div[@class='quickLaunge']")
	List<WebElement> images;
	
	@FindBy(xpath="//span[@class='quickLinkText']")
	List<WebElement> imagesName;
	
	@FindBy(xpath="//legend[contains(text(),'Employee Distribution by Subunit')]")
	WebElement empDistribution;
	
	@FindBy(xpath="//canvas[@class='flot-overlay']")
	WebElement canvasGraph;
	
	@FindBy(xpath="//legend[contains(text(),'Legend')]")
	WebElement legend;
	
	@FindBy(xpath="//td[@class='legendLabel']")
	List<WebElement> legendList;
	
	@FindBy(xpath="//legend[contains(text(),'Pending Leave Requests')]")
	WebElement pendingRequest;
	
	@FindBy(xpath="//td[contains(text(),'No Records are Available')]")
	WebElement textPrint;
	
	@FindBy(xpath="(//div[@class=\"quickLaunge\"])[1]")
	WebElement assignLeave;
	
	@FindBy(xpath="(//div[@class='quickLaunge'])[2]")
	WebElement verifyLeaveListpage;
	
	@FindBy(xpath="(//a[@class='firstLevelMenu'])[8]")
	WebElement dashboardLink;
	
	
	
	
	
	
	//Initializing the page objects
		public Dashboard() {
			PageFactory.initElements(driver, this);
		}
		
		
	//ACTIONS
		public void takeScreenshot() throws IOException {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
			System.out.println("the Screenshot is taken");
		}
		
		public void verifyAdminLink() {
			String linkName = Admin.getText();
			if(Admin.isDisplayed()) {
				System.out.println(linkName+"--------Admin link text is present");
			}
			else {
				System.out.println("Admin link text is not present");
			}
		}
		public void verifyPimLink() {
			String linkName1 = PIM.getText();
			if(PIM.isDisplayed()) {
				System.out.println(linkName1+"-----PIM link text is present");
			}
			else {
				System.out.println("PIM link text is not present");
			}
		}
		public void verifyLeaveLink() {
			String linkName1 = Leave.getText();
			if(Leave.isDisplayed()) {
				System.out.println(linkName1+"------Leave link text is present");
			}
			else {
				System.out.println("Leave link text is not present");
			}
		}
		
		public void verifyTimeLink() {
			String linkName1 = Time.getText();
			if(Time.isDisplayed()) {
				System.out.println(linkName1+"------Time link text is present");
			}
			else {
				System.out.println("Time link text is not present");
			}
		}
		
		public void verifyRecruitmentLink() {
			String linkName1 = Recruitment.getText();
			if(Recruitment.isDisplayed()) {
				System.out.println(linkName1+"------Recruitment link text is present");
			}
			else {
				System.out.println("Recruitment link text is not present");
			}
		}
		public void verifyMyInfoLink() {
			String linkName1 = MyInfo.getText();
			if(MyInfo.isDisplayed()) {
				System.out.println(linkName1+"------MyInfo link text is present");
			}
			else {
				System.out.println("MyInfo link text is not present");
			}
		}
		public void verifyPerformanceLink() {
			String linkName1 = Performance.getText();
			if(Performance.isDisplayed()) {
				System.out.println(linkName1+"------Performance link text is present");
			}
			else {
				System.out.println("Performance link text is not present");
			}
		}
		public void verifyDirectoryLink() {
			String linkName1 = Directory.getText();
			if(Directory.isDisplayed()) {
				System.out.println(linkName1+"------Directory link text is present");
			}
			else {
				System.out.println("Directory link text is not present");
			}
		}
		public void verifyMaintenanceLink() {
			String linkName1 = Maintenance.getText();
			if(Maintenance.isDisplayed()) {
				System.out.println(linkName1+"------Maintenance link text is present");
			}
			else {
				System.out.println("Maintenance link text is not present");
			}
		}
		public void verifyBuzzLink() {
			String linkName1 = Buzz.getText();
			if(Buzz.isDisplayed()) {
				System.out.println(linkName1+"------Buzz link text is present");
			}
			else {
				System.out.println("Buzz link text is not present");
			}
		}
				
		public void printHeaderlinks() {
			List<WebElement> allLinks = driver.findElements(By.xpath("//li[@class='main-menu-first-level-list-item' ]"));
			for(int i=0; i<allLinks.size(); i++) {
				if(allLinks.get(i).isDisplayed()) {
				System.out.println(allLinks.get(i).getText()+  "--->Here is text");
				
			}
				else {
					System.out.println("Sorry no text is present");
				}
			}
		}
		public void verifyDashboardSection() {
			if(dashboardFrame.isEnabled()) {
				System.out.println(dashboardtitle.getText());
				
			}
			
			
		}
		public void quickLaunch() {
			if(quickLaunchframe.isDisplayed()) {
				System.out.println("Quicklaunch section is present");
				
			}
			else {
				System.out.println("Quicklaunch section is not present");
			}
			
			
		}
		public void verifyImages() {
			for(int i=0; i<images.size();i++) {
				if(images.get(i).isDisplayed()) {
				System.out.println("Images are present");
				
			}
				else {
					System.out.println("Images are not present ");
				}
		}
}
		
		public void printimagesName() {
			for(int i=0;i<imagesName.size();i++) {
				
				System.out.println(imagesName.get(i).getText()+"--->Here we have all Option's names");
				
			}
		}
		public void verifyEmpSection() {
			if(empDistribution.isDisplayed()) {
				System.out.println("Section is available "+ empDistribution.getText());
				if(canvasGraph.isDisplayed()) {
					System.out.println("-------------------------------");
					System.out.println("Graph is available");
				}
			}
			else {
				System.out.println("Section is missing");
			}
		}
		
		public void verifylegendSection() {
			if(legend.isDisplayed()) {
				System.out.println("**********************Legend section is Available********************"+legend.getText());
				for(int i=0; i<legendList.size();i++) {
					System.out.println(legendList.get(i).getText());
				}
				
			}
			else {
				System.out.println("Legend section is missing ");
			}
		}
		
		public void verifypendingRequest() {
			if(pendingRequest.isDisplayed()) {
				System.out.println("Pending request section is present");
				System.out.println(pendingRequest.getText());
				//System.out.println(textPrint.getText());
			
		}	
		}
		public void verifyassignLeaveUrl() {
			assignLeave.click();
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave";
			Assert.assertEquals(actualUrl, expectedUrl);
			System.out.println("We are on Assign leave page with this URL"+actualUrl);
			dashboardLink.click();
			
			
			
			
		}
		public void verifyLeaveListUrl() {
			verifyLeaveListpage.click();
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList";
			Assert.assertEquals(actualUrl, expectedUrl);
			System.out.println("We are on leave List page with this URL"+actualUrl);
			
			
			
		}
		
		
		
}