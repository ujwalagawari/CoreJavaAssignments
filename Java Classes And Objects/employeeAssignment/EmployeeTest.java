package employeeAssignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class EmployeeTest {

	private Employee employee;
	
	@Before
	public void setUp(){
		employee=new Employee(101, "Ujwala", 25000);
	}
	
	@Test
	public void test() {
		
	}

}
