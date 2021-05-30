package com.test.atul.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.atul.webdrivermanager.WebDriverUtility;

public class OrderPaymentPage extends WebDriverUtility{

	public OrderPaymentPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement lnkPayBankWire;
	
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement lnkPayCheque;
	
	@FindBy(xpath="//span[contains(text(),'confirm my order')]//parent::button")
	private WebElement btnConfirmOrder;
	
	/**
	 * Method to select the payment type from the payment page
	 * @param paymentMehod Method of Payment 'Pay by bank wire' or 'Pay by check'
	 */
	public void selectPaymentMehod(String paymentMehod)
	{
		if(paymentMehod.trim().contains("Pay by bank wire"))
			clickElement(lnkPayBankWire);
		else if(paymentMehod.trim().contains("Pay by check"))
			clickElement(lnkPayCheque);
	}
	
	
	/**
	 * Method to click on confirm button
	 */
	public void confirmOrder()
	{
		clickElement(btnConfirmOrder);
	}
	
	
}
