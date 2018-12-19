/**
 * 
 */
package assignment.bank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class PaymentGatewayTest {
	
	SavingsAccount sender, reciever;
	
	
	@Before
	public void setUp(){
		reciever= new SavingsAccount("Ujwala", 500.0);
		sender= new SavingsAccount("Mrudula", 0.0);
	}


	@Test
	public void testForBalanceZeroOrLessThanAmount() {
		assertTrue(PaymentGateway.transfer(sender, reciever,100));
	}

	@Test
	public void testForBalanceGreaterOrEqualAmount() {
		sender.deposit(500.00);
		assertTrue(PaymentGateway.transfer(sender, reciever,100));
	}
}
