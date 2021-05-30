package com.test.atul.stepdefination;

import com.test.atul.pageobject.HomePage;
import com.test.atul.pageobject.MyAccountPage;
import com.test.atul.pageobject.OrderAddressPage;
import com.test.atul.pageobject.OrderConfirmPage;
import com.test.atul.pageobject.OrderHistoryPage;
import com.test.atul.pageobject.OrderPaymentPage;
import com.test.atul.pageobject.OrderShipingPage;
import com.test.atul.pageobject.OrderSummaryPage;
import com.test.atul.pageobject.SelectedproductPage;
import com.test.atul.pageobject.TShirtPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseOrderSteps {

	HomePage homePage;
	TShirtPage tshirtPage;
	SelectedproductPage selectProd;
	OrderSummaryPage ordersummary;
	OrderAddressPage orderaddress;
	OrderShipingPage ordershiping;
	OrderPaymentPage orderpayment;
	OrderConfirmPage orderconfirm;
	OrderHistoryPage orderhistory;
	MyAccountPage myaccount;
	String orderTotal="";
	String orderReferenceNo="";
	
	
	@Given("User searched T-shirt with name {string}")
	public void user_searched_t_shirt_with_name(String productName) {
		homePage = new HomePage();
		tshirtPage = new TShirtPage();
		homePage.selectTshirtProduct();
		tshirtPage.selectTShirt(productName);
	}

	@Given("user added the t-shirt to the shopping cart")
	public void user_added_the_t_shirt_to_the_shopping_cart() {
		ordersummary = new OrderSummaryPage();
		orderaddress = new OrderAddressPage();
		ordershiping = new OrderShipingPage();
		
		selectProd = new SelectedproductPage();
		selectProd.AddProductToCart();
		ordersummary.proceedTochOut();
		orderaddress.proceedTochOut();
		ordershiping.acceptTerms();
		
		
	}

	@When("User successfully complete the payments via {string} payment method")
	public void user_successfully_complete_the_payments_via_payment_method(String paymentMehod) {
		orderpayment = new OrderPaymentPage();
		orderpayment.selectPaymentMehod(paymentMehod);
		orderpayment.confirmOrder();
	    
	}

	@Then("User order is palced successfully")
	public void user_order_is_palced_successfully() {
		orderconfirm = new OrderConfirmPage();
		orderconfirm.verifyOrderConfirmed();
		orderTotal = orderconfirm.getOrderTotal();
		orderReferenceNo = orderconfirm.getOrderReference();
		
	}

	@Then("user Order is displayed in order history page")
	public void user_order_is_displayed_in_order_history_page() {
		homePage.naviagetoAccount();
		myaccount = new MyAccountPage();
		orderhistory = new OrderHistoryPage();
		myaccount.navigateToOrderDetails();
		orderhistory.verifyOrderPresent(orderReferenceNo, orderTotal);
	}
	
}
