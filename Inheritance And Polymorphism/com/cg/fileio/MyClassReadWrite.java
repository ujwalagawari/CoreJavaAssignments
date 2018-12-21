/**
 * 
 */
package com.cg.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ugawari
 *
 */
public class MyClassReadWrite {

	/**
	 * method to write MyClass array details in a file
	 * @param myClass, path
	 * @throws IOException 
	 */
	public void writeArrayInFile(List<MyClass> list, String path) throws IOException {
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
		objectOutputStream.writeObject(list);
		objectOutputStream.close();
		fos.close();
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<MyClass> readArrayFromFile(String path) throws Exception {
		ArrayList<MyClass> myClasses=null;
		if((new File(path).exists())){
			FileInputStream fis = new FileInputStream("c:/work/myclass.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fis);
			myClasses=(ArrayList<MyClass>) objectInputStream.readObject();
			objectInputStream.close();
			fis.close();
		}else if(!(new File(path).exists())){
			throw new FileNotFoundException();
		}else{
			throw new Exception();
		}
		return myClasses;
	}

	
}
