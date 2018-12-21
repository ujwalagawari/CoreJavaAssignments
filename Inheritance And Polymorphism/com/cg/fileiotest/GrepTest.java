package com.cg.fileiotest;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cg.fileio.Grep;


/**
 * @author ugawari
 *
 */
public class GrepTest {

	private Grep grep;
	
	@Before
	public void setUp() {
		grep= new Grep();
	}

	@Test
	public void testForCurrectLines() {
		String path="C:/work/newfile.txt";
		String word="ujwala";
		try {
			ArrayList<String> lineWithNumber=grep.searchWord(path, word);
			Assert.assertEquals("[Word present at 2 number line and line is : qqq dfgvb ujwala, Word present at 4 number line and line is : qqq dfgvb ujwala atul]", 
					lineWithNumber.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testForWrongLines() {
		String path="C:/work/newfile.txt";
		String word="ujwala";
		try {
			ArrayList<String> lineWithNumber=grep.searchWord(path, word);
			Assert.assertEquals("[Word present at 4 number line and line is : qqq dfgvb ujwala atul]", 
					lineWithNumber.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
