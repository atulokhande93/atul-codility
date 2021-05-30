package com.test.atul.stepdefination;

import com.test.atul.pageobject.MyAccountPage;
import com.test.atul.pageobject.PersonalInformation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalInfoSteps {
	
	MyAccountPage myaccount=null;
	PersonalInformation personalInfo=null;
	@Given("user naviagted to the personal Information page")
	public void user_naviagted_to_the_personal_information_page() {
		myaccount = new MyAccountPage();
		myaccount.navigateTopersonalInfo();
	}

	@When("user update first name to {string}")
	public void user_update_first_name_to(String firstName) {
		personalInfo = new PersonalInformation();
		personalInfo.enterFirstName(firstName);
		personalInfo.enterOldPassword(LoginPageSteps.password);
		personalInfo.saveInfo();
	}

	@Then("user first name has been changed successfully")
	public void user_first_name_has_been_changed_successfully() {
		personalInfo.verifyInformationSaved();
	}
}
