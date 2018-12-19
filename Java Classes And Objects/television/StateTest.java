/**
 * 
 */
package assignment.television;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class StateTest {

	private Television television;
	
	@Before
	public void setUp(){
		television=new Television();
	}
	
	@Test
	public void testForPower() {
		assertTrue(television.getCurrentState());
	}
	
	@Test
	public void testForPowerByChangesToOn() {
		television.changeState();
		assertTrue(television.getCurrentState());
	}
	
	@Test
	public void testForPowerByChangesToOff() {
		television.setState(true);
		television.changeState();
		assertTrue(television.getCurrentState());
	}

}
