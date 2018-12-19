package com.mmbank.module;

/**
 * @author ugawari
 *
 */
public class SavingsAccount extends BankAccount {

	private boolean isSalaried;
	private static final float MINIMUM_BALANCE=0;
	
	public SavingsAccount(int accountNumber, String accountName, float accountBalance, boolean isSalaried) {
		super(accountNumber, accountName, accountBalance);
		this.isSalaried=isSalaried;
	}
	
	public boolean isSalaried() {
		return isSalaried;
	}

	public static float getMinimumBalance() {
		return MINIMUM_BALANCE;
	}

	
	@Override
	public String toString() {
		return "SavingsAccount [isSalaried=" + isSalaried + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void withdraw(float amount) {

	}
	
	
	
}
