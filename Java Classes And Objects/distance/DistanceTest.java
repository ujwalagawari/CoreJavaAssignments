package assignment.distance;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class DistanceTest {
	private Distance distance1,distance2,distance3;
	private String expectedResult;
	
	@Before
	public void setUp(){
		distance1=new Distance();
		distance2=new Distance();
		distance3=new Distance();
	}
	
	@Test
	public void mainForFeetAddLessThanTwelve() {
		distance1.setDistance(1, (float) 1.1);
		distance2.setDistance(2, (float) 2.2);	
		distance3=distance1.add(distance2);
		expectedResult="3,3.3000002";
		assertEquals(expectedResult, distance3.getFeet()+","+distance3.getInches());
		distance1.disp();
		distance2.disp();
		distance3.disp();
	}
	
	@Test
	public void mainForFeetAddMoreThanTwelve() {
		distance1.setDistance(1, (float) 10.1);
		distance2.setDistance(2, (float) 5.2);	
		distance3=distance1.add(distance2);
		expectedResult="4,3.3000002";
		assertEquals(expectedResult, distance3.getFeet()+","+distance3.getInches());
		distance1.disp();
		distance2.disp();
		distance3.disp();
	}
	
	@After
	public void tearDown(){
		
	}
	

}
