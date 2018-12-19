package com.mmbank.module;

public class CurrentAccount extends BankAccount {

	private final float creditLimit;
	
	public CurrentAccount(int accountNumber, String accountName, float accountBalance, float creditLimit) {
		super(accountNumber, accountName, accountBalance);
		this.creditLimit=creditLimit;
	}

	@Override
	public void withdraw(float amount) {
		
	}

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", toString()="
				+ super.toString() + "]";
	}

	

}
