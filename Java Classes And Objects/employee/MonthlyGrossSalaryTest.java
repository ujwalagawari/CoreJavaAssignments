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
public class MonthlyGrossSalaryTest {

	private Employee employee1,employee2,employee3,employee4;
	private double answer, expectedresult;
	
	@Before
	public void setUp(){
		employee1=new Employee(101, "Ujwala", 25000);
		employee2=new Employee(102, "Atul", -25000);
		employee3=new Employee(103, "Mangesh", 35000.75);
		employee4=new Employee(104, "Akshay", 0);
	}
	
	@Test
	public void testMonthlyGrossForPossitive() {
		expectedresult= 39550;
		answer=employee1.getMonthlyGrossSalary();
		assertEquals(expectedresult, answer, 2);
	}
	
	@Test
	public void testMonthlyGrossForNegative() {
		expectedresult= 0;
		answer=employee2.getMonthlyGrossSalary();
		assertEquals(expectedresult, answer, 2);
	}
	
	@Test
	public void testMonthlyGrossForDouble() {
		expectedresult= 54551.125;
		answer=employee3.getMonthlyGrossSalary();
		assertEquals(expectedresult, answer, 2);
	}
	
	@Test
	public void testMonthlyGrossForZero() {
		expectedresult= 0;
		answer=employee4.getMonthlyGrossSalary();
		assertEquals(expectedresult, answer, 2);
	}
	
}
