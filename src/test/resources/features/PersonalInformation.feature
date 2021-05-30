Feature: User able to update/view personal information on personal information page

  Background: 
    Given User Launch the url "http://automationpractice.com/"
    When user successfully log in with userName "atulokhande93@gmail.com" and password "password"
    Then user naviagted to the HomePage

  Scenario: user successfully able to update FirstName
    Given user naviagted to the personal Information page
    When user update first name to "Atul"
    Then user first name has been changed successfully
