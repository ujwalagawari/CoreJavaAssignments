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
import com.mmbank.account.CurrentAccount;
import com.mmbank.controller.MMBankFactory;
import com.mmbank.controller.MMCurrentAccount;

/**
 * @author ugawari
 *
 */
public class CurrentAccountTest {

	private Logger logger= Logger.getLogger(MMCurrentAccount.class.getName());
	private BankFactory bankFactory;
	private CurrentAccount currentAccount;
	
	@Before
	public void setUp(){
		bankFactory=new MMBankFactory();
		currentAccount=bankFactory.getNewCurrentAcc("Ujwala", 10000.50f, 2000);
	}

	@Test
	public void testForWithdrawAtInitial() throws Exception {
		logger.debug("test For Withdraw At Initial start");
		currentAccount.withdraw(500);
		logger.info("withdraw successfully");
		Assert.assertEquals(9500.5, currentAccount.getAccountBalance() , 0);
		logger.debug("test For Withdraw At Initial end");
	}
	
	@Test(expected = Exception.class)
	public void testForWithdrawForNegativeAmount() {
		logger.debug("test For Withdraw For Negative Amount start");
		try {
			currentAccount.withdraw(-500);
			logger.info("withdraw successfully");
			Assert.assertEquals(10000.5, currentAccount.getAccountBalance() , 0);
		} catch (InvalidNumberException e) {
			logger.error("Invalid Number Exception in testForWithdrawForNegativeAmount");
			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			logger.error("Insufficient Balance Exception in testForWithdrawForNegativeAmount");
			e.printStackTrace();
		}catch (Exception e) {
			logger.error("Exception in testForWithdrawForNegativeAmount");
			e.printStackTrace();
		}
		logger.debug("test For Withdraw For Negative Amount start");
	}
	
	@Test(expected = Exception.class)
	public void withdrawAmountGreaterThanSumOfCraditLimitAndBalance() {
		logger.debug("withdrawAmountGreaterThanSumOfCraditLimitAndBalance start");
		try {
			currentAccount.withdraw(20000);
			logger.info("withdraw successfully");
			Assert.assertEquals(10000.5, currentAccount.getAccountBalance() , 0);
		} catch (InvalidNumberException e) {
			logger.error("InvalidNumberException in withdrawAmountGreaterThanSumOfCraditLimitAndBalance");
			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			logger.error("InsufficientBalanceException in withdrawAmountGreaterThanSumOfCraditLimitAndBalance");
			e.printStackTrace();
		}catch (Exception e) {
			logger.error("Exception in withdrawAmountGreaterThanSumOfCraditLimitAndBalance");
			e.printStackTrace();
		}
		logger.debug("withdrawAmountGreaterThanSumOfCraditLimitAndBalance end");
	}
	
	@Test(expected = Exception.class)
	public void withdrawAmountEqualSumOfCraditLimitAndBalance() throws Exception {
		logger.debug("withdrawAmountEqualSumOfCraditLimitAndBalance start");
		try {
			currentAccount.withdraw(12000.5f);
			logger.info("withdraw successfully");
			Assert.assertEquals(-2000.0, currentAccount.getAccountBalance() , 0);
		} catch (InvalidNumberException e) {
			logger.error("InvalidNumberException in withdrawAmountEqualSumOfCraditLimitAndBalance");
			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			logger.error("InsufficientBalanceException in withdrawAmountEqualSumOfCraditLimitAndBalance");
			e.printStackTrace();
		}catch (Exception e) {
			logger.error("Exception in withdrawAmountEqualSumOfCraditLimitAndBalance");
			e.printStackTrace();
		}
		logger.debug("withdrawAmountEqualSumOfCraditLimitAndBalance end");
	}

}
