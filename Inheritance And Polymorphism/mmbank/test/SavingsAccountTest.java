/**
 * 
 */
package com.mmbank.test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mmbank.module.BankAccount;
import com.mmbank.module.SavingsAccount;

/**
 * @author ugawari
 *
 */
public class SavingsAccountTest {

	private BankAccount savingsAccount;
	
	@Before
	public void setUp(){
		savingsAccount=new SavingsAccount(0, null, 0, false);
	}

	@Test
	public void test() {
		
	}
	
	@After
	public void tearDown(){
	}

}
