package com.test.atul.pageobject;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.atul.webdrivermanager.WebDriverUtility;

public class OrderHistoryPage extends WebDriverUtility{

	public OrderHistoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//table[@id='order-list']")
	private WebElement tableOrderlist;
	
	@FindBy(xpath="//table[@id='order-list']/tbody/tr/td[1]/a")
	private List<WebElement> lnkOrderReferenceno;
	
	@FindBy(xpath="//table[@id='order-list']/tbody/tr/td[3]/span")
	private List<WebElement> lblOrderPrice;
	
	
	/**
	 * Methos to verify the given order is present or not on order history page
	 * @param orderReferenceNo Reference number of Order 
	 * @param orderPrice Total Price of Order
	 */
	public void verifyOrderPresent(String orderReferenceNo,String orderPrice)
	{
		waitUntileElementVisible(tableOrderlist);
		Boolean orderPresent =false;
			for (int i = 0; i < lnkOrderReferenceno.size(); i++) {
			if(lnkOrderReferenceno.get(i).getText().equals(orderReferenceNo) && lblOrderPrice.get(i).getText().equals(orderPrice))
			{
				orderPresent = true;
				break;
			}
		}
			if(orderPresent)
			{
				Assert.assertTrue("Order present in the order history", true);
			}
			else
			{
				Assert.assertTrue("No Order present in the order history", false);
			}
	}
	
}
