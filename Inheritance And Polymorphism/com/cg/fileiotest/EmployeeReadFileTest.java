/**
 * 
 */
package com.cg.fileiotest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cg.fileio.Employee;
import com.cg.fileio.EmployeeFileReadWrite;

/**
 * @author ugawari
 *
 */
public class EmployeeReadFileTest {

	private EmployeeFileReadWrite employeeReadWrite;
	
	@Before
	public void setUp(){
		employeeReadWrite = new EmployeeFileReadWrite();
	}
	
	@Test
	public void testRead() {
		Employee readEmployee;
		try {
			readEmployee = employeeReadWrite.readFile("c:/work/Employee.txt");
			Assert.assertEquals("Employee [id=101, name=Ujwala, salary=50000.0]", readEmployee.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
