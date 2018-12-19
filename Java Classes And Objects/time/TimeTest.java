package assignment.time;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class TimeTest {

	private Time time1,time2,time3;
	private String expectedResult;
	
	@Before
	public void setUp(){
		time1=new Time();
		time2=new Time();
		time3=new Time();
	}
	
	@Test
	public void testForMinutesSumLessThan60() {
		time1.setTime(5, 25);
		time2.setTime(10, 15);
		time3=time1.sum(time2);
		expectedResult="15,40";
		assertEquals(expectedResult, time3.getHours()+","+time3.getMinutes());
		time1.showTime();
		time2.showTime();
		time3.showTime();
	}
	
	@Test
	public void testForMinutesSumGreaterThan60() {
		time1.setTime(5, 35);
		time2.setTime(10, 45);
		time3=time1.sum(time2);
		expectedResult="16,20";
		assertEquals(expectedResult, time3.getHours()+","+time3.getMinutes());
		time1.showTime();
		time2.showTime();
		time3.showTime();
	}
	
	@After
	public void tearDown(){
		
	}

}
