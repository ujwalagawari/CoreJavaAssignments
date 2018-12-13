package com.assignment.test;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import com.assignment.controller.IndicesDifference;

public class IndicesDifferenceTest {

 	private IndicesDifference indicesDifference;
 	
	@Before
	public void setUp(){
		indicesDifference=new IndicesDifference();
	}
	
	@Test
	public void testForDifference() {
		int k=3;
		int[] arrayOfIntegers={4,8,3,5,8,9};
		int answer=indicesDifference.getIndicesDifference(arrayOfIntegers);
		assertTrue(k>=answer);
	}
	
	@Test
	public void testForWrongDifference() {
		int k=2;
		int[] arrayOfIntegers={4,8,3,5,8,9};
		int answer=indicesDifference.getIndicesDifference(arrayOfIntegers);
		assertTrue(k>=answer);
	}
	
	@Test
	public void testForEmptyArray() {
		int k=0;
		int[] arrayOfIntegers={};
		int answer=indicesDifference.getIndicesDifference(arrayOfIntegers);
		assertTrue(k>=answer);
	}
	
	@Test
	public void testForZero() {
		int k=0;
		int[] arrayOfIntegers={0};
		int answer=indicesDifference.getIndicesDifference(arrayOfIntegers);
		assertTrue(k>=answer);
	}
	
	@Test
	public void testForTwoZeros() {
		int k=1;
		int[] arrayOfIntegers={0,0};
		int answer=indicesDifference.getIndicesDifference(arrayOfIntegers);
		assertTrue(k>=answer);
	}

}
