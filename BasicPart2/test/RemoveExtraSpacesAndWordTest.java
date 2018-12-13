/**
 * 
 */
package com.assignment.test;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.assignment.controller.IndicesDifference;
import com.assignment.controller.RemoveExtraSpacesAndWord;

/**
 * @author ugawari
 *
 */
public class RemoveExtraSpacesAndWordTest {

	private RemoveExtraSpacesAndWord removeExtraSpacesAndWord;
 	
	@Before
	public void setUp(){
		removeExtraSpacesAndWord=new RemoveExtraSpacesAndWord();
	}
	
	@Test
	public void testForString() {
		String sentence="A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.";
		int position=6;
		String word="IS";
		String returnSentence=removeExtraSpacesAndWord.removeSpacesDuplicates(sentence,position,word);
		String expectedString="A MORNING WALK IS A IS BLESSING FOR THE WHOLE DAY.";
		assertEquals(expectedString, returnSentence);
	}
	
	@Test
	public void testForSecondString() {
		String sentence="AS YOU    SOW, SO   SO YOU REAP.";
		int position=4;
		String word="SO";
		String returnSentence=removeExtraSpacesAndWord.removeSpacesDuplicates(sentence,position,word);
		String expectedString="AS YOU SOW, SO YOU REAP.";
		assertEquals(expectedString, returnSentence);
	}
	
	@Test
	public void testForStringOfIntegers() {
		String sentence="55   78  8989 7689";
		int position=2;
		String word="78";
		String returnSentence=removeExtraSpacesAndWord.removeSpacesDuplicates(sentence,position,word);
		String expectedString="55 8989 7689";
		assertEquals(expectedString, returnSentence);
	}
	
	@Test
	public void testForEmptyString() {
		String sentence="";
		int position=0;
		String word="";
		String returnSentence=removeExtraSpacesAndWord.removeSpacesDuplicates(sentence,position,word);
		String expectedString="";
		assertEquals(expectedString, returnSentence);
	}

}
