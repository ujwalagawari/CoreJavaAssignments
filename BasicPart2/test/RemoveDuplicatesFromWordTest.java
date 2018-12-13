/**
 * 
 */
package com.assignment.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.assignment.controller.IndicesDifference;
import com.assignment.controller.RemoveDuplicatesFromWord;

/**
 * @author ugawari
 *
 */
public class RemoveDuplicatesFromWordTest {

	private RemoveDuplicatesFromWord removeDuplicatesFromWord;
 	
	@Before
	public void setUp(){
		removeDuplicatesFromWord=new RemoveDuplicatesFromWord();
	}
	
	@Test
	public void testString() {
		String word="abcabcabc";
		String expectedResult="abc";
		String result=removeDuplicatesFromWord.removeDuplicates(word);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testForEmptyString() {
		String word="";
		String expectedResult="";
		String result=removeDuplicatesFromWord.removeDuplicates(word);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testForCombinationOfIntegerString() {
		String word="ab53455cabc7abc";
		String expectedResult="ab534c7";
		String result=removeDuplicatesFromWord.removeDuplicates(word);
		assertEquals(expectedResult, result);
	}

}
