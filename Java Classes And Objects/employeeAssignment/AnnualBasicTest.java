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
public class AnnualBasicTest {

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
	public void testAnnualBasicForPossitive() {
		expectedresult= 300000;
		answer=employee1.getAnnualBasic();
	}
	
	@Test
	public void testAnnualBasicForNegative() {
		expectedresult= 0;
		answer=employee2.getAnnualBasic();
	}
	
	@Test
	public void testAnnualBasicForDouble() {
		expectedresult= 420009;
		answer=employee3.getAnnualBasic();
	}
	
	@Test
	public void testAnnualBasicForZero() {
		expectedresult= 0;
		answer=employee4.getAnnualBasic();
	}
	
	@After
	public void tearDown(){
		assertEquals(expectedresult, answer, 2);
	}
}
