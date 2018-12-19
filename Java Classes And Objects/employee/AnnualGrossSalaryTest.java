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
public class AnnualGrossSalaryTest {

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
	public void testAnnualGrossForPossitive() {
		expectedresult= 474600;
		answer=employee1.getAnnualGrossSalary();
		assertEquals(expectedresult, answer, 2);
	}
	
	@Test
	public void testAnnualGrossForNegative() {
		expectedresult= 0;
		answer=employee2.getAnnualGrossSalary();
		assertEquals(expectedresult, answer, 2);
	}
	
	@Test
	public void testAnnualGrossForDouble() {
		expectedresult= 654613.5;
		answer=employee3.getAnnualGrossSalary();
		assertEquals(expectedresult, answer, 2);
	}
	
	@Test
	public void testAnnualGrossForZero() {
		expectedresult= 0;
		answer=employee4.getAnnualGrossSalary();
		assertEquals(expectedresult, answer, 2);
	}

}
