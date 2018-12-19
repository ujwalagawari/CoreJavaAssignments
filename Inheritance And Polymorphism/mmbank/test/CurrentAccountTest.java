/**
 * 
 */
package com.mmbank.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mmbank.module.BankAccount;
import com.mmbank.module.CurrentAccount;

/**
 * @author ugawari
 *
 */
public class CurrentAccountTest {

	private BankAccount currentAccount;
	
	@Before
	public void setUp(){
		currentAccount=new CurrentAccount(0, null, 0, 0);
	}

	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
	}

}
