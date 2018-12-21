package com.cg.fileio;
import java.io.File;


/**
 * A Java FileExist Application accept the complete path of a file from the user
 * and display whether the file exist or not.
 * 
 * @author ugawari
 */
public class FileExist {
	
	/**
	 * method to check file is present or not if yes return true else false
	 * @param file
	 * @return
	 */
	public boolean isExist(File file){
		return file.exists();
	}
}
