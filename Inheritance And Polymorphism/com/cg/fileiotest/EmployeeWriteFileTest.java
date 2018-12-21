/**
 * 
 */
package com.cg.fileiotest;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.cg.fileio.Employee;
import com.cg.fileio.EmployeeFileReadWrite;

/**
 * @author ugawari
 *
 */
public class EmployeeWriteFileTest {

	private Employee employee = null;
	private EmployeeFileReadWrite employeeReadWrite;
	@Before
	public void setUp(){
		employeeReadWrite = new EmployeeFileReadWrite();
		employee = new Employee(101, "Ujwala", 50000);
	}
	

	@Test
	public void testForWrite() {
		try {
			String path="c:/work/Employee.txt";
			employeeReadWrite.writeFile(employee, path);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
