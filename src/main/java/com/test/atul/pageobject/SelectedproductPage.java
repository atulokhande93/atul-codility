package com.test.atul.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.atul.webdrivermanager.WebDriverUtility;

public class SelectedproductPage  extends WebDriverUtility {

	public SelectedproductPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//p[@id='add_to_cart']/button")
	private WebElement btnAddCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement btnproceedChkout;
	
	
	
	/**
	 * Method to click on add to cart button and proceed for checkout
	 */
	public void AddProductToCart()
	{
		clickElement(btnAddCart);
		clickElement(btnproceedChkout);
		
	}
}
