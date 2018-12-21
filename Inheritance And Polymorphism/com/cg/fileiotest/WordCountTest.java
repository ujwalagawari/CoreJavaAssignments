package com.cg.fileiotest;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

import com.cg.fileio.WordCount;

/**
 * 
 */

/**
 * @author ugawari
 *
 */
public class WordCountTest {

	private WordCount wordCount;
	
	@Before
	public void setUp() {
		wordCount=new WordCount();
	}

	@Test
	public void testForWordCount() {
		try {
			String path="C:/work/newfile.txt";
			assertEquals(6, wordCount.countWordsFromFile(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testForWrongWordCount() {
		try {
			String path="C:/work/newfile.txt";
			assertEquals(5, wordCount.countWordsFromFile(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
