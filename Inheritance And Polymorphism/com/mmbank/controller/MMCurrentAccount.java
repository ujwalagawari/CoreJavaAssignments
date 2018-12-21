/**
 * 
 */
package com.mmbank.controller;

import org.apache.log4j.Logger;

import com.cg.training.exception.InsufficientBalanceException;
import com.cg.training.exception.InvalidNumberException;
import com.mmbank.account.CurrentAccount;

/**
 * @author ugawari
 *
 * Concrete MMCurrentAcc: A concrete class representing bank specific Current Account.  It extends CurrentAcc.
 */
public class MMCurrentAccount extends CurrentAccount{

	private Logger logger= Logger.getLogger(MMCurrentAccount.class.getName());
	
	public MMCurrentAccount(String accountName, float accountBalance, float creditLimit) {
		super(accountName, accountBalance, creditLimit);
	}

	/**
	 * withdraw amount from mmbanck only if balance does not goen below sum of balance and creadit limit
	 */
	@Override
	public void withdraw(float amount) throws Exception  {
		logger.debug("starts withdraw of MMCurrentaccount");
		if(amount>0 && amount<=(super.getAccountBalance()+super.getCreditLimit())){
			super.deposite(-amount);
			logger.info("amount withdraw successfully in withdraw method");
		}else if(amount<0){
			logger.error("Invalid Number in withdraw method");
			throw new InvalidNumberException("Invalid Number.");
		}else{
			logger.error("Invalid Balance in withdraw method");
			throw new InsufficientBalanceException("Invalid Balance.");
		}
		logger.debug("ends withdraw of MMCurrentaccount");
	}

	@Override
	public String toString() {
		return "MMCurrentAccount [toString()=" + super.toString() + "]";
	}
	
	
	
}
