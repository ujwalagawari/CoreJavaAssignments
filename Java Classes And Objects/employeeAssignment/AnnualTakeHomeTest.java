/**
 * 
 */
package employeeAssignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class AnnualTakeHomeTest {

	private Employee employee1,employee2,employee3,employee4;
	private double answer, expectedresult;
	
	@Before
	public void setUp(){
		employee1=new Employee(101, "Ujwala", 25000);
		employee2=new Employee(102, "Atul", -25000);
		employee3=new Employee(103, "Mangesh", 70000.75);
		employee4=new Employee(104, "Akshay", 0);
	}
	
	@Test
	public void testAnnualTakeHomeForPossitive() {
		expectedresult= 443400;
		answer=employee1.getAnnualTakeHome();
	}
	
	@Test
	public void testAnnualTakeHomeForNegative() {
		expectedresult= 0;
		answer=employee2.getAnnualTakeHome();
	}
	
	@Test
	public void testAnnualTakeHomeForDouble() {
		expectedresult= 1205413.5;
		answer=employee3.getAnnualTakeHome();
	}
	
	@Test
	public void testAnnualTakeHomeForZero() {
		expectedresult= 0;
		answer=employee4.getAnnualTakeHome();
	}
	
	@After
	public void tearDown(){
		assertEquals(expectedresult, answer, 2);
	}

}
