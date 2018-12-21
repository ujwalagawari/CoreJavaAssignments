package com.cg.fileio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * EmployeeFileReadWrite class used write employee object in file and read from that file.
 * 
 * @author ugawari
 */
public class EmployeeFileReadWrite {

	/**
	 * method to write employee details in a file
	 * @param employee, path
	 * @throws IOException 
	 */
	public void writeFile(Employee employee, String path) throws IOException{
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
			objectOutputStream.writeObject(employee);
			objectOutputStream.close();
			fos.close();
	}

	/**
	 * methods to read file which contains employee details
	 * @param path
	 * @return 
	 * @throws Exception 
	 */
	public Employee readFile(String path) throws Exception{
		Employee employee=null;
		if((new File(path).exists())){
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream objectInputStream = new ObjectInputStream(fis);
			employee=(Employee) objectInputStream.readObject();
			objectInputStream.close();
			fis.close();
		}else if(!(new File(path).exists())){
			throw new FileNotFoundException();
		}else{
			throw new Exception();
		}
		return employee;
	}
}
