package com.assignment.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.assignment.controller.Palindrome;

/**
 * @author ugawari
 *
 */
public class PalindromeTest {

	/**
	 * Program to find reverse the order of characters in each word within a sentence
	 * while still preserving whitespace and initial word order
	 */
	private Palindrome palindrome;
	
	@Before
	public void setUp(){
		palindrome=new Palindrome();
	}
	
	@Test
	public void testForPossitivePalindrome() {
		boolean result=palindrome.isPalindrome(121);
		assertTrue(result);
	}
	
	@Test
	public void testForNegativePalindrome() {
		boolean result=palindrome.isPalindrome(-121);
		assertTrue(result);
	}
	
	@Test
	public void testForZero() {
		boolean result=palindrome.isPalindrome(0);
		assertTrue(result);
	}
	
	@Test
	public void testForPossitiveNonPalindrome() {
		boolean result=palindrome.isPalindrome(1);
		assertTrue(result);
	}


}
