package com.assignment.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.assignment.controller.IndicesDifference;
import com.assignment.controller.MultiDimensionalArray;

public class MultiDimensionalArrayTest {

	private MultiDimensionalArray multiDimensionalArray;
 	
	@Before
	public void setUp(){
		multiDimensionalArray=new MultiDimensionalArray();
	}
	
	@Test
	public void testForArray() {
		int [][]arrayOfInteger={{1,2,5},{3,2,1},{1,2,0},{3,2,1}};
		boolean answer=multiDimensionalArray.isNumberInArray(arrayOfInteger,3);
		assertTrue(answer);
	}
	
	@Test
	public void testForEmptyArray() {
		int [][]arrayOfInteger={};
		boolean answer=multiDimensionalArray.isNumberInArray(arrayOfInteger, 0);
		assertTrue(answer);
	}
	
	@Test
	public void testForEmptyZeros() {
		int [][]arrayOfInteger={{0},{0}};
		boolean answer=multiDimensionalArray.isNumberInArray(arrayOfInteger, 0);
		assertTrue(answer);
	}

	@Test
	public void testForEmptyZeroAndOneNumber() {
		int [][]arrayOfInteger={{0},{1}};
		boolean answer=multiDimensionalArray.isNumberInArray(arrayOfInteger, 1);
		assertTrue(answer);
	}
	
	@Test
	public void testForDifferentLengthOfArray() {
		int [][]arrayOfInteger={{0},{1,2,3}};
		boolean answer=multiDimensionalArray.isNumberInArray(arrayOfInteger, 1);
		assertTrue(answer);
	}
}
