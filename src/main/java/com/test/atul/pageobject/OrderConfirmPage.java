package com.test.atul.pageobject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.atul.webdrivermanager.WebDriverUtility;



public class OrderConfirmPage  extends WebDriverUtility{

	public OrderConfirmPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//p[@class='cheque-indent']/strong")
	private WebElement lblOrderconfMsg;
	
	@FindBy(xpath="//span[@class='price']/strong")
	private WebElement lblOrderTotal;
	
	@FindBy(className="box")
	private WebElement lblconfirmMsg;
	
	/**
	 * Method to verify the order success message is displayed on screen 
	 */
	public void verifyOrderConfirmed()
	{
		waitUntileElementVisible(lblOrderconfMsg);
		Assert.assertEquals("Your order on My Store is complete.", lblOrderconfMsg.getText());
	}
	
	
	/**
	 * Method to get the order total price
	 * @return @String Order total price
	 */
	public String getOrderTotal()
	{
		waitUntileElementVisible(lblOrderTotal);
		return lblOrderTotal.getText();
	}
	
	/**
	 * Method to get the order reference number
	 * @return @String Order reference number
	 */
	public String getOrderReference()
	{
		waitUntileElementVisible(lblconfirmMsg);
		String confirmationmsg = lblconfirmMsg.getText();
		Matcher m = Pattern.compile("[A-Z]{9}").matcher(confirmationmsg);
        return m.find() ? m.group(0) : null;
	}
}
