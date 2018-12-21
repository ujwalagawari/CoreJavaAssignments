package com.mmbank.account;

/**
 * Abstract CurrentAcc extends BankAcc: An abstract class to represent
 * specific case of Current Account. It extends BankAcc. The overridden
 * withdrawal method of the class must not allow withdrawal below sum of balance
 * and the credit limit for the account.
 * 
 * @author ugawari
 *
 */
public abstract class CurrentAccount extends BankAccount {

	private final float creditLimit;
	
	public CurrentAccount(String accountName, float accountBalance, float creditLimit) {
		super(accountName, accountBalance);
		this.creditLimit=creditLimit;
	}

	@Override
	public abstract void withdraw(float amount) throws Exception;

	public float getCreditLimit() {
		return creditLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", toString()="
				+ super.toString() + "]";
	}

	

}
