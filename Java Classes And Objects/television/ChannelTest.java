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
public class ChannelTest {

	private Television television;
	
	@Before
	public void setUp(){
		television=new Television();
	}
	
	@Test
	public void checkCurrentChannelPowerOff() {
		assertEquals(0, television.getCurrentChannel());
	}

	@Test
	public void checkCurrentChannelPowerOn() {
		television.changeState();
		television.setChannel(5);
		System.out.println(television.getCurrentChannel());
		assertEquals(5, television.getCurrentChannel());
	}
	
	@Test
	public void checkCurrentChannelByChangingWhenPowerOff() {
		television.changeChannel(5);
		System.out.println(television.getCurrentChannel());
		assertEquals(0, television.getCurrentChannel());
	}
}
