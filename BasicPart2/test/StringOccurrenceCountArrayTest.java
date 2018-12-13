/**
 * 
 */
package com.assignment.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.assignment.controller.IndicesDifference;
import com.assignment.controller.StringOccurrenceCountArray;

/**
 * @author ugawari
 *
 */
public class StringOccurrenceCountArrayTest {

	private StringOccurrenceCountArray stringOccurrenceCountArray;
 	
	@Before
	public void setUp(){
		stringOccurrenceCountArray=new StringOccurrenceCountArray();
	}
	
	@Test
	public void testCountForPresentString() {
		int count=3;
		String[] stringOfNames={"Dave", "Ann", "Abc", "Sam", "Ted", "Gag", "Saj",
				"MAM", "Mary", "Sam", "MAM", "Dev", "Kity", "Abc", "Smith", "Johnson",
				"Bill", "Abc", "Jones", "Brown", "Davis", "Miller",
				"Wilson", "Moore", "Taylor", "MAM", "Thomas", "Jackson"};
		int result=stringOccurrenceCountArray.countOfOccurance(stringOfNames, "MAM");
		assertEquals(count, result);
	}
	
	@Test
	public void testCountForNotPresentString() {
		int count=0;
		String[] stringOfNames={"Dave", "Ann", "Abc", "Sam", "Ted", "Gag", "Saj",
				"MAM", "Mary", "Sam", "MAM", "Dev", "Kity", "Abc", "Smith", "Johnson",
				"Bill", "Abc", "Jones", "Brown", "Davis", "Miller",
				"Wilson", "Moore", "Taylor", "MAM", "Thomas", "Jackson"};
		int result=stringOccurrenceCountArray.countOfOccurance(stringOfNames, "AA");
		assertEquals(count, result);
	}
	
	@Test
	public void testForIntegerStringCombination() {
		int count=2;
		String[] stringOfNames={"Dave", "122", "Abc", "Sam", "Ted", "Gag", "Saj",
				"MAM", "Mary", "Sam", "MAM", "Dev", "Kity", "Abc", "Smith", "Johnson",
				"Bill", "Abc", "Jones", "Brown", "122", "Miller",
				"Wilson", "Moore", "Taylor", "MAM", "Thomas", "Jackson"};
		int result=stringOccurrenceCountArray.countOfOccurance(stringOfNames, "122");
		assertEquals(count, result);
	}
	
	@Test
	public void testEmptyArray() {
		int count=0;
		String[] stringOfNames={};
		int result=stringOccurrenceCountArray.countOfOccurance(stringOfNames, "");
		assertEquals(count, result);
	}

}
