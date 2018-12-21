/**
 * 
 */
package com.mmbank.account;

import com.mmbank.account.CurrentAccount;
import com.mmbank.account.SavingsAccount;

/**
 * Abstract BankFactory: An abstract class having necessary factory abstract methods.
 * 
 * @author ugawari
 *
 */
public abstract class BankFactory {

	public abstract SavingsAccount getNewSavingAcc(String accountName,float accountBalance, boolean isSalaried);

	public abstract CurrentAccount getNewCurrentAcc(String accountName, float accountBalance, float creditLimit);
}
