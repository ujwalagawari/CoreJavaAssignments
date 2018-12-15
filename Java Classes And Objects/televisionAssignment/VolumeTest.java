/**
 * 
 */
package televisionAssignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class VolumeTest {

	private Television television;
	
	@Before
	public void setUp(){
		television=new Television();
	}
	
	@Test
	public void checkCurrentVolumePowerOff() {
		assertEquals(0, television.getCurrentVolume());
	}

	@Test
	public void checkCurrentChannelPowerOn() {
		television.setVolume(5);
		television.changeState();
		System.out.println(television.getCurrentVolume());
		assertEquals(5, television.getCurrentVolume());
	}
	
	@Test
	public void checkCurrentVolumePowerOffAndVolumeSet() {
		television.setVolume(5);
		System.out.println(television.getCurrentVolume());
		assertEquals(0, television.getCurrentVolume());
	}
	
	@Test
	public void checkCurrentVolumeByChangingWhenPowerOff() {
		television.increaseVolume();
		System.out.println(television.getCurrentVolume());
		assertEquals(0, television.getCurrentChannel());
	}

	@Test
	public void checkCurrentVolumeByChangingWhenPowerOn() {
		television.changeState();
		television.increaseVolume();
		System.out.println(television.getCurrentVolume());
		assertEquals(1, television.getCurrentVolume());
	}
	
	@Test
	public void checkCurrentVolumeByDecreasingWhenPowerOff() {
		television.setVolume(5);
		television.decreaseVolume();
		System.out.println(television.getCurrentVolume());
		assertEquals(0, television.getCurrentChannel());
	}

	@Test
	public void checkCurrentVolumeByDecreasingWhenPowerOn() {
		television.setVolume(5);
		television.changeState();
		television.decreaseVolume();
		System.out.println(television.getCurrentVolume());
		assertEquals(4, television.getCurrentVolume());
	}
}
