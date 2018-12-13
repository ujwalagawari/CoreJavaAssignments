package com.assignment.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.assignment.controller.AssignmentStatement;

/**
 * @author ugawari
 *
 */
public class AssignmentStatementTest {
	
	private AssignmentStatement assignmentStatement;
	@Before
	public void setUp(){
		assignmentStatement=new AssignmentStatement();
	}
	
	@Test
	public void testDiscountForPossitive() {
		double result=assignmentStatement.calculateNewPrice(500.0);
		double expectedResult=325.0;
		assertEquals(expectedResult, result, 2);
	}
	
	@Test
	public void testDiscountForNegative() {
		double result=assignmentStatement.calculateNewPrice(-500.0);
		double expectedResult=0;
		assertEquals(expectedResult, result, 2);
	}
	
	@Test
	public void testDiscountForZero() {
		double result=assignmentStatement.calculateNewPrice(0.0);
		double expectedResult=0;
		assertEquals(expectedResult, result, 2);
	}

}
