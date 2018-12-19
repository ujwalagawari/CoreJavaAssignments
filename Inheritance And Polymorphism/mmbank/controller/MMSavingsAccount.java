/**
 * 
 */
package com.mmbank.controller;

import com.mmbank.module.SavingsAccount;

/**
 * @author ugawari
 *
 */
public class MMSavingsAccount extends SavingsAccount {

	private static float MINIMUM_BALANCE=0;
	
	public MMSavingsAccount(int accountNumber, String accountName,float accountBalance, boolean isSalaried) {
		super(accountNumber, accountName, accountBalance, isSalaried);
	}
	
	@Override
	public void withdraw(float amount) {

	}

	@Override
	public String toString() {
		return "MMSavingsAccount [toString()=" + super.toString() + "]";
	}
	
	

}
