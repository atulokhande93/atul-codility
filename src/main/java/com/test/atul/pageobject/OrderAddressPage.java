package com.test.atul.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.atul.webdrivermanager.WebDriverUtility;

public class OrderAddressPage extends WebDriverUtility{

	public OrderAddressPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="processAddress")
	private WebElement btnproceedChkout;
	
	
	/**
	 * Click on Proceed checkout button on order Address page
	 */
	public void proceedTochOut()
	{
		clickElement(btnproceedChkout);
	}
	
	
	
}
