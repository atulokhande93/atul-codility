package com.test.atul.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.atul.webdrivermanager.WebDriverUtility;

public class LoginPage extends WebDriverUtility{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="passwd")
	private WebElement txtPassword;
	
	@FindBy(id="SubmitLogin")
	private WebElement btnSignIn;
	
	
	/**
	 * Method to log in into the application with given username and password
	 * @param userName User userName to log in
	 * @param passwrd password of the provided userName
	 */
	public void logintoApplication(String userName, String passwrd) {
		
		enterValue(txtEmail, userName);
		enterValue(txtPassword, passwrd);
		clickElement(btnSignIn);
		
	}

}
