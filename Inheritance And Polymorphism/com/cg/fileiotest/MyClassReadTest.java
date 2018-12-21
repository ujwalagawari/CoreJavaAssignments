/**
 * 
 */
package com.cg.fileiotest;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cg.fileio.MyClass;
import com.cg.fileio.MyClassReadWrite;

/**
 * @author ugawari
 *
 */
public class MyClassReadTest {

	MyClassReadWrite myClassReadWrite;
	
	@Before
	public void setUp() {
		myClassReadWrite=new MyClassReadWrite();
	}

	@Test
	public void testForCorrectSize() {
		try {
			String path="c:/work/myclass.txt";
			ArrayList<MyClass> myClass=myClassReadWrite.readArrayFromFile(path);
			Assert.assertEquals(5, myClass.size());
			//System.out.println(myClass.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testForWrongSize() {
		try {
			String path="c:/work/myclass.txt";
			ArrayList<MyClass> myClass=myClassReadWrite.readArrayFromFile(path);
			Assert.assertEquals(4, myClass.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
