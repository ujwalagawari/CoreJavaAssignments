package com.cg.fileiotest;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.fileio.FileExist;

/**
 * @author ugawari
 *
 */
public class FileExistTest {

	private FileExist fileExist;
	private File file;
	@Before
	public void setUp() {
		fileExist=new FileExist();
	}

	@Test
	public void testFileExitanceForCorrectPath() {
			file=new File("C:/work/newfile.txt");
			assertTrue(fileExist.isExist(file));
	}
	
	@Test
	public void testFileExitanceForWrongPath() {
			file=new File("C:/work/new/newfile.txt");
			assertTrue(fileExist.isExist(file));
	}

	@After
	public void tearDown() {
	}
}
