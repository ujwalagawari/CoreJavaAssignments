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
public class MonthlyDeductionsTest {

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
	public void testMonthlyDeductionsForPossitive() {
		expectedresult= 2600;
		answer=employee1.getMonthlyDeductions();
	}
	
	@Test
	public void testMonthlyDeductionsForNegative() {
		expectedresult= 0;
		answer=employee2.getMonthlyDeductions();
	}
	
	@Test
	public void testMonthlyDeductionsForDouble() {
		expectedresult= 6600;
		answer=employee3.getMonthlyDeductions();
	}
	
	@Test
	public void testMonthlyDeductionsForZero() {
		expectedresult= 0;
		answer=employee4.getMonthlyDeductions();
	}
	
	@After
	public void tearDown(){
		assertEquals(expectedresult, answer, 2);
	}

}
