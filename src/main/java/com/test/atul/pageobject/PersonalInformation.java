package com.test.atul.pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.atul.webdrivermanager.WebDriverUtility;

public class PersonalInformation extends WebDriverUtility {

	
	public PersonalInformation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstname")
	private WebElement txtFirstName;
	
	@FindBy(name="submitIdentity")
	private WebElement btnSubmit;
	
	@FindBy(name="old_passwd")
	private WebElement txtOldPassword;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement lblSccessMsg;
	
	
	/**
	 * Method to enter the given name in firstname textBox
	 * @param firstName Name to enter
	 */
	public void enterFirstName(String firstName)
	{
		enterValue(txtFirstName, firstName);
	}
	
	/**
	 * Method to enter the given password in old password textBox
	 * @param oldPassword
	 */
	public void enterOldPassword(String oldPassword)
	{
		enterValue(txtOldPassword, oldPassword);
	}
	
	/**
	 * Method to click on Save Info button
	 */
	public void saveInfo()
	{
		clickElement(btnSubmit);
	}
	
	
	/**
	 * Method to verify that information updated successfully
	 */
	public void verifyInformationSaved()
	{
		waitUntileElementVisible(lblSccessMsg);
		Assert.assertEquals("Your personal information has been successfully updated.", lblSccessMsg.getText());
	}
}
