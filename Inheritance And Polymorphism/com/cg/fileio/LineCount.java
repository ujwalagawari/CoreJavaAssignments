package com.cg.fileio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */

/**
 * accept the complete path of a file from user and count the number of lines in
 * that file and print it on the console.
 * @author ugawari
 */
public class LineCount {
	
	private BufferedReader bufferedReader;
	
	/**
	 * Method to count lines present in given file
	 * @param path
	 * @return
	 * @throws Exception 
	 */
	public int countLinesInfile(String path) throws Exception {
		int count=0;
			if((new File(path).exists())){
				bufferedReader = new BufferedReader(new FileReader(path));
				while(bufferedReader.readLine() != null){
					count++;
				}
				bufferedReader.close();
			}else if(!(new File(path).exists())){
				throw new FileNotFoundException();
			}else{
				throw new Exception();
			}
		return count;
	}

}
