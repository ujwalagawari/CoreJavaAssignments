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
public abstract class BankFactory {

	public abstract SavingsAccount getNewSavingAcc(int accountNumber, String accountName,float accountBalance, boolean isSalaried);

	public abstract CurrentAccount getNewCurrentAcc(int accountNumber, String accountName, float accountBalance, float creditLimit);
}
