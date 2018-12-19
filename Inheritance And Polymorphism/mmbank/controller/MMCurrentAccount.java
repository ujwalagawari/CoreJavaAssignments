/**
 * 
 */
package com.mmbank.controller;

import com.mmbank.module.CurrentAccount;

/**
 * @author ugawari
 *
 */
public class MMCurrentAccount extends CurrentAccount{

	public MMCurrentAccount(int accountNumber, String accountName, float accountBalance, float creditLimit) {
		super(accountNumber, accountName, accountBalance, creditLimit);
	}

	@Override
	public void withdraw(float amount) {

	}

	@Override
	public String toString() {
		return "MMCurrentAccount [toString()=" + super.toString() + "]";
	}
	
	
	
}
