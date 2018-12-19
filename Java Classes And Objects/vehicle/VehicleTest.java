/**
 * 
 */
package assignment.vehicle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class VehicleTest {

	private Vehicle vehicle1;
	
	@Before
	public void setUp(){
		vehicle1=new Vehicle("Ujwala");
	}

	@Test
	public void testForZeroSpeedOrForStop() {
		vehicle1.stop();
		String answer=vehicle1.turnVehicle(true, 5);
		assertNull(answer);
	}
	
	@Test
	public void testWhenVehicleIsNotStop() {
		vehicle1.changeSpeed(5);
		String answer=vehicle1.turnVehicle(true, 5);
		assertEquals("West-South", answer);
	}
	
	@Test
	public void testWhenVehicleIsTurnedToLeftByLessThan360Degree() {
		vehicle1.changeSpeed(5);
		String answer=vehicle1.turnVehicle(false, 55);
		assertEquals("North-South", answer);
	}
	
	@Test
	public void testWhenVehicleIsTurnedToLeftByGreaterThan360Degree() {
		vehicle1.changeSpeed(5);
		String answer=vehicle1.turnVehicle(false, 555);
		assertEquals("South-Eest", answer);
	}
	@Test
	public void testWhenVehicleIsTurnedToRightByLessThan360Degree() {
		vehicle1.changeSpeed(5);
		String answer=vehicle1.turnVehicle(true, 55);
		assertEquals("West-South", answer);
	}
	
	@Test
	public void testWhenVehicleIsTurnedToRightByGreaterThan360Degree() {
		vehicle1.changeSpeed(5);
		String answer=vehicle1.turnVehicle(true, 555);
		assertEquals("East-North", answer);
	}
	
	@Test
	public void testWhenVehicleIsGoesStraight() {
		vehicle1.changeSpeed(5);
		String answer=vehicle1.turnVehicle(true, 0);
		assertEquals("West", answer);
	}

}
