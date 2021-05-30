package com.test.atul.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.atul.webdrivermanager.WebDriverUtility;

public class OrderSummaryPage extends WebDriverUtility{

	public OrderSummaryPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//p[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']")
	private WebElement btnproceedChkout;
	
	/**
	 * Click on Proceed checkout button on order Summary page
	 */
	public void proceedTochOut()
	{
		clickElement(btnproceedChkout);
	}
	
	
}
