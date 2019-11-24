package org.tektutor.savingsaccount;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	private SavingsAccount account;
	private double actualBalance;
		
	@Given("I have {string} balance in my savings account")
	public void initializeBalance(String strAmount) {
		account = new SavingsAccount();
		account.deposit(Double.parseDouble(strAmount));
	}

	@When("I deposit {string} in my savings account")
	public void depositSuppliedAmount(String strAmount) {
		double amount = Double.parseDouble(strAmount);
		actualBalance = account.deposit(amount);
	}

	@Then("I expect the balance as {string}")
	public void verifyBalanceAfterDeposit(String strExpectedBalance) {
		double expectedBalance = Double.parseDouble(strExpectedBalance);
		Assert.assertEquals( actualBalance, expectedBalance, 0.0001 );
	}
	
}
