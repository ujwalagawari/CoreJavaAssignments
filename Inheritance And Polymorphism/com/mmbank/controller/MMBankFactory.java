/**
 * 
 */
package com.mmbank.controller;
import com.mmbank.account.BankFactory;
import com.mmbank.account.CurrentAccount;
import com.mmbank.account.SavingsAccount;

/**
 * @author ugawari
 *
 * Concrete MMBankFactory: A concrete class having complete
 * implementation of necessary factory methods to instantiate
 * MMSavingAcc and MMCurrentAcc. It extends BankFactory.
 */
public class MMBankFactory extends BankFactory{
	
	@Override
	public SavingsAccount getNewSavingAcc(String accountName, float accountBalance, boolean isSalaried) {
		return new MMSavingsAccount(accountName, accountBalance, isSalaried);
	}

	@Override
	public CurrentAccount getNewCurrentAcc(String accountName, float accountBalance, float creditLimit) {
		return new MMCurrentAccount(accountName, accountBalance, creditLimit);
	}

}
