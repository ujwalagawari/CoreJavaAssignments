package com.cg.fileiotest;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cg.fileio.LineCount;

/**
 * @author ugawari
 *
 */
public class LineCountTest {

	private LineCount lineCount;
	
	
	@Before
	public void setUp(){
		lineCount = new LineCount();
	}
	
	@After
	public void tearDown(){
	}

	@Test
	public void testForCorrectPath() {
			String path="C:/work/newfile.txt";
			try {
				Assert.assertEquals(3, lineCount.countLinesInfile(path));
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void testForWrongPath() {
			String path="C:/work/new/newfile.txt";
			try {
				Assert.assertEquals(0, lineCount.countLinesInfile(path));
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
