package com.test.atul.stepdefination;

import com.test.atul.pageobject.HomePage;
import com.test.atul.pageobject.LoginPage;
import com.test.atul.webdrivermanager.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends DriverManager{

	LoginPage login;
	HomePage homePage;
	public static String userName="";
	public static String password="";
	
	@Given("User Launch the url {string}")
	public void user_launch_the_url(String applicationUrl) {
		DriverManager.iniialiseDriver("CHROME");
		driver.get(applicationUrl);
	}

	@When("user successfully log in with userName {string} and password {string}")
	public void user_successfully_log_in_with_user_name_and_password(String userName, String password) {
		login = new LoginPage();
		homePage = new HomePage();
		
		homePage.clicksignlnk();
		login.logintoApplication(userName,password);
		LoginPageSteps.userName = userName;
		LoginPageSteps.password = password;
	
	}

	@Then("user naviagted to the HomePage")
	public void user_naviagted_to_the_home_page() {
	    homePage.verifyUserOnHomePage();
	}
	
}
