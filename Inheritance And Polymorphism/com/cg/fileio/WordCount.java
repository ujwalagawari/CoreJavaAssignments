package com.cg.fileio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * A Java WordCount Application: accept the path of a file from user and count
 * the number of words in that file and print it on the console.
 * 
 * @author ugawari
 */
public class WordCount {

	/**
	 * count words from given file
	 * @param path
	 * @return
	 * @throws Exception 
	 */
	public int countWordsFromFile(String path) throws Exception {
		int totalWords = 0;
		File file=new File(path);
		if(file.exists()){
			Scanner scanner=new Scanner(file);
			while(scanner.hasNext()){
				scanner.next();
				totalWords++;
			}
			scanner.close();
		}else if(!file.exists()){
			throw new FileNotFoundException();
		}else{
			throw new Exception();
		}
		return totalWords;
	}

}
