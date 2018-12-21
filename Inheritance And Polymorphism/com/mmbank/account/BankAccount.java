/**
 * 
 */
package com.mmbank.account;

import org.apache.log4j.Logger;

import com.mmbank.controller.MMCurrentAccount;

/**
 * An abstract class to represent a bank account and it is base class
 * @author ugawari
 *
 */
public abstract class BankAccount {

	private Logger logger= Logger.getLogger(MMCurrentAccount.class.getName());
	
	private final int accountNumber;
	private String accountName;
	private float accountBalance;
	private static int accountId;
	
	static{
		accountId=1000;
	}
	
	{
		accountNumber=++accountId;
	}
	
	public BankAccount(String accountName, float accountBalance) {
		super();
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountName="
				+ accountName + ", accountBalance=" + accountBalance + "]";
	}
	
	/**
	 * abstract method common to all classes which extends this class
	 * @return
	 */
	public abstract void withdraw(float amount) throws Exception;
	
	/**
	 * abstract method common to all classes which extends this class
	 * to deposite amount
	 * @return
	 */
	public void deposite(float amount) {
		logger.debug("deposite start");
		this.accountBalance+=amount;
		logger.debug("deposite end");
	};
	
	
}
