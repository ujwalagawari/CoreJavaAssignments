package com.cg.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A Java grep Application: There is a useful utility in Unix called grep. You
 * can use grep to list the lines in a text file that contain a certain strings.
 * Here, In this assignment, You will write the Java version of grep The user
 * will input from the command line the search string and file name The output
 * of your program will be the line numbers AND the lines in which the string
 * occurs. If it does not find the string then a message is displayed to show
 * that the string was not found.
 * 
 * @author ugawari
 *
 */
public class Grep {

	/**
	 * check whether word is present or not in file if present then search for line and line nuber
	 * @param path
	 * @param word
	 * @return
	 * @throws Exception
	 */
	public ArrayList<String> searchWord(String path, String word) throws Exception {
		ArrayList<String> list=new ArrayList<String>();
		int count=0;
		String string=null;
		if((new File(path).exists())){
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
			while((string=bufferedReader.readLine()) != null){
				count+=1;
				String[] words=string.split(" ");
					for(String checkWord:words){
						if(checkWord.equals(word)){
							String line="Word present at "+count+" number line and line is : "+string;
							list.add(line);
						}
					}
			}
			bufferedReader.close();
		}else if(!(new File(path).exists())){
			throw new FileNotFoundException();
		}else{
			throw new Exception();
		}
		return list;
	}

	
	
}
