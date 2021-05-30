package com.test.atul.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.atul.webdrivermanager.WebDriverUtility;

public class OrderShipingPage extends WebDriverUtility{

	public OrderShipingPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="processCarrier")
	private WebElement btnproceedChkout;
	
	@FindBy(id="uniform-cgv")
	private WebElement chckboxCgb;
	
	
	/**
	 * Method to click on accept terms checkbox and click on confirm btn
	 */
	public void acceptTerms()
	{
		clickElement(chckboxCgb);
		clickElement(btnproceedChkout);
	}
	
	
}
