package org.tektutor.savingsaccount;

public class SavingsAccount {

	private double balance;
	
	public SavingsAccount() {
		balance = 0.00;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double deposit( double amount ) {
		balance = balance + amount;
		return balance;
	}
	
	public double withdraw ( double amount ) throws InsufficientBalanceException {
		
		if ( balance > amount ) {
			balance = balance - amount;
		}
		else
			throw new InsufficientBalanceException();
		
		return balance;
		
	}
	
}
