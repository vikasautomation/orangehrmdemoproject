package com.orangHRM.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangHRM.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath= "//img[@alt=\"OrangeHRM\"]")
	WebElement homePageLogo;
	
//	@FindBy(xpath="//li[@class='main-menu-first-level-list-item']")
//	WebElement headerMenu;
	
	@FindBy(id="MP_link")
	WebElement headerLink;
	
	@FindBy(xpath="//a[@class=\"help-icon-div\"]")
	WebElement headerIcon;
	
	@FindBy(xpath="//span[@id=\"notification\"]")
	WebElement notificationIcon;
	
	@FindBy(id="welcome")
	WebElement userName;
	
	
	//Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public boolean verifyHomeLogo() {
	return	homePageLogo.isDisplayed();
	}
	
	public void verifyHeaderMenu() {
	List<WebElement> menues = driver.findElements(By.xpath("//li[@class='main-menu-first-level-list-item']"));
	System.out.println(menues.size());
	for(WebElement Menulist : menues ) {
		String HeaderMenu = Menulist.getText();
		System.out.println(HeaderMenu);
	}
	}
	
	public boolean verifyHeaderLink() {
	return	headerLink.isDisplayed();
	}
	
	public boolean verifyHeaderIcon(){
	return	headerIcon.isDisplayed();
	}
	
	public boolean verifyNotificationIcon() {
	return	notificationIcon.isDisplayed();
	}
	
	public boolean verifyUsername() {
	return	userName.isDisplayed();
	}

}
