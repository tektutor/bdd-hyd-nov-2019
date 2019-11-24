Feature: Develop a SavingsAccount Feature with balance enquiry, deposit and withdraw functionalities.

	Scenario: Deposit amount to Savings Account when the balance is nil.
	
		Given I have "0.00" balance in my savings account
		When I deposit "50000.00" in my savings account
		Then I expect the balance as "50000.00"
		
	Scenario: Deposit amount to Savings Account when the balance is non-zero.
	
		Given I have "5000.00" balance in my savings account
		When I deposit "25000.00" in my savings account
		Then I expect the balance as "30000.00"