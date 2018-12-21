package com.mmbank.account;

/**
 * Abstract SavingAcc extends BankAcc: An abstract class to represent specific
 * case of Saving Account. It extends BankAcc. The overridden withdraw method of
 * the class must not allow withdrawal below minimum balance in the account.
 * 
 * @author ugawari
 *
 */
public abstract class SavingsAccount extends BankAccount {

	private boolean isSalaried;
	private static final float MINIMUM_BALANCE;
	
	static{
		MINIMUM_BALANCE=500;
	}
	
	public SavingsAccount(String accountName, float accountBalance, boolean isSalaried) {
		super(accountName, accountBalance);
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
	public abstract void withdraw(float amount) throws Exception;
	
	
	
}
