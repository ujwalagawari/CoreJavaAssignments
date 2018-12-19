/**
 * 
 */
package assignment.employee;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class MonthlyTakeHomeTest {

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
	public void testMonthlyTakeHomeForPossitive() {
		expectedresult= 36950;
		answer=employee1.getMonthlyTakeHome();
		assertEquals(expectedresult, answer, 2);
	}
	
	@Test
	public void testMonthlyTakeHomeForNegative() {
		expectedresult= 0;
		answer=employee2.getMonthlyTakeHome();
		assertEquals(expectedresult, answer, 2);
	}
	
	@Test
	public void testMonthlyTakeHomeForDouble() {
		expectedresult= 100451.125;
		answer=employee3.getMonthlyTakeHome();
		assertEquals(expectedresult, answer, 2);
	}
	
	@Test
	public void testMonthlyTakeHomeForZero() {
		expectedresult= 0;
		answer=employee4.getMonthlyTakeHome();
		assertEquals(expectedresult, answer, 2);
	}


}
