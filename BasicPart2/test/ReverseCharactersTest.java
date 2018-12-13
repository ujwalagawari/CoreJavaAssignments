package com.assignment.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.assignment.controller.Palindrome;
import com.assignment.controller.ReverseCharacters;

/**
 * @author ugawari
 *
 */
public class ReverseCharactersTest {
	/**
	 * Determine whether an integer is a palindrome.
	 *  An integer is a palindrome when it reads the same backward as forward
	 */
	private ReverseCharacters reverseCharacter;
	
	@Before
	public void setUp(){
		reverseCharacter=new ReverseCharacters();
	}
	
	@Test
	public void testReverseCharacters() {
		String reverseCharacters=reverseCharacter.reverseCharacter("Let's take LeetCode contest");
		String sentence="s'teL ekat edoCteeL tsetnoc";
		assertEquals(sentence, reverseCharacters);
	}
	
	@Test
	public void testReverseCharactersForEmpty() {
		String reverseCharacters=reverseCharacter.reverseCharacter("");
		String sentence="";
		assertEquals(sentence, reverseCharacters);
	}
	@Test
	public void testReverseCharactersForSingleSpace() {
		String reverseCharacters=reverseCharacter.reverseCharacter(" ");
		String sentence=" ";
		assertEquals(sentence, reverseCharacters);
	}

}
