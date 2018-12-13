package com.assignment.test;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.assignment.controller.PalindromeArray;

/**
 * @author ugawari
 *
 */
public class PalindromeArrayTest {

	
	@Test
	public void testPalindromeArray() {
		String[] stringArray={"ABC", "ABA", "PQR", "PQO", "LMN", "LML", "SWSK", "TUUT", "GG", "XYZ"};
		String[] stringArrayInDesc={"TUUT", "LML" ,"GG", "ABA"};
		String[] palindromeArrayWithDescOrder=PalindromeArray.palindromeWithDescOrder(stringArray);
		assertArrayEquals(stringArrayInDesc, palindromeArrayWithDescOrder);
	}
	
	@Test
	public void testForDoublePalindromeString() {
		String[] stringArray={"ABC", "ABA", "PQR", "PQO", "ABA", "LML", "SWSK", "TUUT", "GG", "XYZ"};
		String[] stringArrayInDesc={"TUUT", "LML" ,"GG", "ABA", "ABA"};
		String[] palindromeArrayWithDescOrder=PalindromeArray.palindromeWithDescOrder(stringArray);
		assertArrayEquals(stringArrayInDesc, palindromeArrayWithDescOrder);
	}

	@Test
	public void testForDoubleInitial() {
		String[] stringArray={"ABC", "ABA", "PQR", "PQO", "ABBA", "LML", "SWSK", "TUUT", "GG", "XYZ"};
		String[] stringArrayInDesc={"TUUT", "LML" ,"GG", "ABBA", "ABA"};
		String[] palindromeArrayWithDescOrder=PalindromeArray.palindromeWithDescOrder(stringArray);
		assertArrayEquals(stringArrayInDesc, palindromeArrayWithDescOrder);
	}
	
	@Test
	public void testForEmptyArray() {
		String[] stringArray={};
		String[] stringArrayInDesc={};
		String[] palindromeArrayWithDescOrder=PalindromeArray.palindromeWithDescOrder(stringArray);
		assertArrayEquals(stringArrayInDesc, palindromeArrayWithDescOrder);
	}
	
	@Test
	public void testForCombinationOfStringAndInteger() {
		String[] stringArray={"ABC", "ABA", "PQR","111", "PQO", "ABBA", "LML", "SWSK", "TUUT", "GG", "XYZ"};
		String[] stringArrayInDesc={"TUUT", "LML" ,"GG", "ABBA", "ABA", "111"};
		String[] palindromeArrayWithDescOrder=PalindromeArray.palindromeWithDescOrder(stringArray);
		assertArrayEquals(stringArrayInDesc, palindromeArrayWithDescOrder);
	}
}
