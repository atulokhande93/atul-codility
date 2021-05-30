package com.test.atul.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.atul.webdrivermanager.WebDriverUtility;

public class MyAccountPage extends WebDriverUtility{

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Information']")
	private WebElement lnkpersonalInfo;
	
	@FindBy(xpath="//a[@title='Orders']")
	private WebElement lnkOrderDetails;
	
	
	
	/**
	 * Method to click on personal information link and navigate to the personal information page
	 */
	public void navigateTopersonalInfo()
	{
		clickElement(lnkpersonalInfo);
	}
	
	
	/**
	 * Method to click on order detail and history link and navigate to the order history page
	 */
	public void navigateToOrderDetails()
	{
		clickElement(lnkOrderDetails);
	}
}
