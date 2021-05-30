Feature: In order for items to be purchased user able to order items.

  Background: 
    Given User Launch the url "http://automationpractice.com/"
    When user successfully log in with userName "atulokhande93@gmail.com" and password "password"
    Then user naviagted to the HomePage

  Scenario: User able to order T-shirt and verify order in order history page
    Given User searched T-shirt with name 'Faded Short Sleeve T-shirts'
    And user added the t-shirt to the shopping cart
    When User successfully complete the payments via "Pay by bank wire" payment method
    Then User order is palced successfully
    And user Order is displayed in order history page