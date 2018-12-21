/**
 * 
 */
package com.cg.fileiotest;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.fileio.MyClass;
import com.cg.fileio.MyClassReadWrite;

/**
 * @author ugawari
 *
 */
public class MyClassWriteTest {

	MyClass myClass1, myClass2, myClass3, myClass4, myClass5;
	MyClassReadWrite myClassReadWrite=new MyClassReadWrite();
	
	@Before
	public void setUp(){
		myClass1=new MyClass(101, "Ujwala1");
		myClass2=new MyClass(102, "Ujwala2");
		myClass3=new MyClass(103, "Ujwala3");
		myClass4=new MyClass(104, "Ujwala4");
		myClass5=new MyClass(104, "Ujwala5");
	}
	
	@Test
	public void test() {
		//MyClass[] myClass={myClass1, myClass2, myClass3, myClass4, myClass5};
		ArrayList<MyClass> list=new ArrayList<MyClass>();
		list.add(myClass1);
		list.add(myClass2);
		list.add(myClass3);
		list.add(myClass4);
		list.add(myClass5);
		String path="c:/work/myclass.txt";
		try {
			myClassReadWrite.writeArrayInFile(list, path);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@After
	public void tearDown(){
	}

}
