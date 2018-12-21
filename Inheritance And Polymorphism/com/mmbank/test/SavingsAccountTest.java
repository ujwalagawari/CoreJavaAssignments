/**
 * 
 */
package com.mmbank.test;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cg.training.exception.InsufficientBalanceException;
import com.cg.training.exception.InvalidNumberException;
import com.mmbank.account.BankFactory;
import com.mmbank.account.SavingsAccount;
import com.mmbank.controller.MMBankFactory;
import com.mmbank.controller.MMCurrentAccount;
import com.mmbank.controller.MMSavingsAccount;

/**
 * @author ugawari
 *
 */
public class SavingsAccountTest {

	private Logger logger= Logger.getLogger(MMSavingsAccount.class.getName());
	private BankFactory bankFactory;
	private SavingsAccount savingsAccount;
	
	@Before
	public void setUp(){
		bankFactory=new MMBankFactory();
		savingsAccount=bankFactory.getNewSavingAcc("Ujwala", 10000.50f, false);
	}

	@Test
	public void testForWithdrawAtInitial() throws Exception {
		logger.debug("test For Withdraw At Initial start");
		savingsAccount.withdraw(500);
		logger.info("withdraw successfully");
		Assert.assertEquals(9500.5, savingsAccount.getAccountBalance() , 0);
		logger.debug("test For Withdraw At Initial end");
	}
	
	@Test(expected = Exception.class)
	public void testForWithdrawForNegativeAmount() {
		logger.debug("testForWithdrawForNegativeAmount start");
		try {
			savingsAccount.withdraw(-500);
			logger.info("withdraw successfully");
			Assert.assertEquals(10000.5, savingsAccount.getAccountBalance() , 0);
		} catch (InvalidNumberException e) {
			logger.error("InvalidNumberException in testForWithdrawForNegativeAmount");
			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			logger.error("InsufficientBalanceException in testForWithdrawForNegativeAmount");
			e.printStackTrace();
		}catch (Exception e) {
			logger.error("Exception in testForWithdrawForNegativeAmount");
			e.printStackTrace();
		}
		logger.debug("testForWithdrawForNegativeAmount end");
	}
	
	@Test(expected = Exception.class)
	public void testForWithdrawAmountGreaterThanMinimumBalance() {
		logger.debug("testForWithdrawAmountGreaterThanMinimumBalance start");
		try {
			savingsAccount.withdraw(20000);
			logger.info("withdraw successfully");
			Assert.assertEquals(10000.5, savingsAccount.getAccountBalance() , 0);
		} catch (InvalidNumberException e) {
			logger.error("InvalidNumberException in testForWithdrawAmountGreaterThanMinimumBalance");
			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			logger.error("InsufficientBalanceException in testForWithdrawAmountGreaterThanMinimumBalance");
			e.printStackTrace();
		}catch (Exception e) {
			logger.error("Exception in testForWithdrawAmountGreaterThanMinimumBalance");
			e.printStackTrace();
		}
		logger.debug("testForWithdrawAmountGreaterThanMinimumBalance end");
	}
}
