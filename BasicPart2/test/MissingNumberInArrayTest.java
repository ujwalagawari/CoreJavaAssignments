package com.assignment.test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.assignment.controller.MissingNumberInArray;

/**
 * @author ugawari
 *
 */
//@RunWith(Parameterized.class)
public class MissingNumberInArrayTest {

	//private int[] arrayOfIntegers;
	//private int missingNumber;

	private MissingNumberInArray missingNumberInArray;
 	
	@Before
	public void setUp(){
		missingNumberInArray=new MissingNumberInArray();
	}

	/*public MissingNumberInArrayTest(int[] arrayOfIntegers, int missingNumber){
		this.arrayOfIntegers = arrayOfIntegers;
		this.missingNumber = missingNumber;
	}
	
	@Parameters
	public static List<Object[]> input(){
		return Arrays.asList(new Object[][]{
				{new int[]{5,2,8,4,6,0,1,7}, 3}
		});
	}*/
	
	@Test
	public void testForMissingNumber() {
		int[] arrayOfIntegers={5,2,8,4,6,0,1,7};
		int missingNumber=3;
		int result=missingNumberInArray.findMissingnumber(arrayOfIntegers);
		assertEquals(missingNumber, result);
	}
	
	@Test
	public void testForEmptyArray() {
		int[] arrayOfIntegers={};
		int missingNumber = -1;//means empty
		int result=missingNumberInArray.findMissingnumber(arrayOfIntegers);
		assertEquals(missingNumber, result);
	}
	
	@Test
	public void testForZero() {
		int[] arrayOfIntegers={0};
		int missingNumber = -1;//means correct
		int result=missingNumberInArray.findMissingnumber(arrayOfIntegers);
		assertEquals(missingNumber, result);
	}
	
}
