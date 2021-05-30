package com.test.atul.pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.atul.webdrivermanager.WebDriverUtility;


public class HomePage extends WebDriverUtility{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	final String pageTitle = "My account - My Store";
	
	@FindBy(partialLinkText="Sign in")
	private WebElement lnkSignIn;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li/a[@title='T-shirts']")
	private WebElement lnkTshirt;
	
	@FindBy(className="account")
	private WebElement lnkAccontName;
	

	/**
	 * Method clicking on the sign In link
	 * 
	 */
	public void clicksignlnk() {
		clickElement(lnkSignIn);
	}
	
	/**
	 * Method to wait for page to load and verify the HomePage title
	 */
	public void verifyUserOnHomePage() {
		waitUntilPageLoad();
		Assert.assertEquals(pageTitle, driver.getTitle());
	}


	/**
	 * Method to click on the TShirt product category
	 */
	public void selectTshirtProduct() {
		clickElement(lnkTshirt);
	}

	/**
	 * Method to click on the user name and it will navigate to the Account Page
	 */
	public void naviagetoAccount()
	{
		clickElement(lnkAccontName);
	}
}
