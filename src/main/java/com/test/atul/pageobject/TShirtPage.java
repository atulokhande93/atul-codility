package com.test.atul.pageobject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.atul.webdrivermanager.WebDriverUtility;

public class TShirtPage extends WebDriverUtility {

	public TShirtPage () {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//div[@id='center_column']//a[@class='product-name']")
	private List<WebElement> lnkProductsName;
	

	/**
	 * Method to select the product by given name
	 * @param productName name of the product to select
	 */
	public void selectTShirt(String productName)
	{
		waitUntilAllElementsVisible(lnkProductsName);
		for (Iterator<WebElement> iterator = lnkProductsName.iterator(); iterator.hasNext();) {
			WebElement product = (WebElement) iterator.next();
			
			if(product.getText().trim().equalsIgnoreCase(productName))
			{
				clickElement(product);
				break;
			}
			
		}
	}

}
