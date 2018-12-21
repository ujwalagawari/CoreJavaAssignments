/**
 * 
 */
package assignment.bank;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class SavingAccountTest {

	private SavingsAccount savingAccount, zeroBalanceAccount; 
	
	@Before
	public void setUp(){
		savingAccount=new SavingsAccount("Ujwala", 0.9);
		zeroBalanceAccount=new SavingsAccount("Ujwala");
	}
	
	
	@Test
	public void testForWithdrawAtInitial() {
		savingAccount.withdraw(150);
		assertEquals(0.9, savingAccount.checkCurrentBalance(), 0);	//can not withdraw , balance less than entering amount
	}
	
	@Test
	public void testForDeposit() {
		savingAccount.deposit(500);
		assertEquals(500.9, savingAccount.checkCurrentBalance(), 0);//changing current balance to 0.9+500
	}

	@Test
	public void testForWithdrawAfterDeposite() {
		savingAccount.deposit(500);//first deposit
		savingAccount.withdraw(150);//then withdraw
		assertEquals(350.9, savingAccount.checkCurrentBalance(), 0);	
	}
	
	@Test
	public void testForNegativeDeposite() {
		savingAccount.deposit(-500);
		assertEquals(0.9, savingAccount.checkCurrentBalance(), 0);	//no change
	}
	
	
	@Test
	public void testForZeroAccount() {
		assertEquals(0.0, zeroBalanceAccount.checkCurrentBalance(), 0);	//null pointer
	}
	
	@Test
	public void testToDepositeInZeroAccount() {
		zeroBalanceAccount.deposit(500);
		assertEquals(500, zeroBalanceAccount.checkCurrentBalance(), 0);	
	}
	
	@Test
	public void testToWithdrawInZeroAccount() {
		zeroBalanceAccount.withdraw(500);
		assertEquals(0, zeroBalanceAccount.checkCurrentBalance(), 0);	//no change
	}
	
	@After
	public void tearDown(){
		savingAccount=null;
		zeroBalanceAccount=null;
	}

}
