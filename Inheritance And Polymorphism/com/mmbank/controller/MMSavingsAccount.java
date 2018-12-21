/**
 * 
 */
package com.mmbank.controller;

import org.apache.log4j.Logger;

import com.cg.training.exception.InsufficientBalanceException;
import com.cg.training.exception.InvalidNumberException;
import com.mmbank.account.SavingsAccount;

/**
 * @author ugawari
 * 
 * Concrete MMSavingAcc: A concrete class representing bank specific Saving Account.  It extends SavingAcc.
 */
public class MMSavingsAccount extends SavingsAccount {
	private Logger logger= Logger.getLogger(MMCurrentAccount.class.getName());
	
	private static final float MINIMUM_BALANCE;
	
	static{
		MINIMUM_BALANCE=500;
	}
	
	public MMSavingsAccount(String accountName,float accountBalance, boolean isSalaried) {
		super(accountName, accountBalance, isSalaried);
	}
	
	/**
	 * withdraw amount from mmbanck only if balance does not goen below minimum balance 
	 */
	@Override
	public void withdraw(float amount) throws Exception {
		logger.debug("starts withdraw method of MMSavingsAccount");
		if(super.getAccountBalance()-amount>=MINIMUM_BALANCE && amount>0){
			super.deposite(-amount);
			logger.info("amount withdraw successfully");
		}else if(amount<0){
			logger.error("Invalid Number exception");
			throw new InvalidNumberException("Invalid Number.");
		}else{
			logger.error("Invalid Balance exception");
			throw new InsufficientBalanceException("Invalid Blance.");
		}
		logger.debug("ends withdraw method of MMSavingsAccount");
	}

	@Override
	public String toString() {
		return "MMSavingsAccount [toString()=" + super.toString() + "]";
	}
	
	

}
