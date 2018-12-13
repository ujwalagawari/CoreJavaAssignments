/**
 * 
 */
package com.assignment.controller;

/**
 * @author ugawari
 *
 */
public class RemoveDuplicatesFromWord {
	
	/**
	 * program to input a word from the user and remove the duplicate characters present in it.
	 * @param word
	 * @return string without duplicate characters
	 */
	public String removeDuplicates(String word) {
		String wordWithoutDuplicate="";
			for(int i=0; i<word.length(); i++){
				if(!wordWithoutDuplicate.contains(String.valueOf(word.charAt(i)))){
					wordWithoutDuplicate=wordWithoutDuplicate.concat(String.valueOf(word.charAt(i)));
				}
			}
		return wordWithoutDuplicate;
	}

}
