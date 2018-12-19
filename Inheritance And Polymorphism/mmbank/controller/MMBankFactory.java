/**
 * 
 */
package com.mmbank.controller;

import com.mmbank.module.CurrentAccount;
import com.mmbank.module.SavingsAccount;

/**
 * @author ugawari
 *
 */
public class MMBankFactory extends BankFactory{

	BankFactory bankFactory=new MMBankFactory();
	MMSavingsAccount m=new SavingsAccount(0, null, 0, false);
	
	@Override
	public SavingsAccount getNewSavingAcc(int accountNumber, String accountName, float accountBalance, boolean isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAccount getNewCurrentAcc(int accountNumber, String accountName, float accountBalance, float creditLimit) {

		return null;
	}

}
