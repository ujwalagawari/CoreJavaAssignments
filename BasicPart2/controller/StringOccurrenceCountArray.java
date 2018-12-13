/**
 * 
 */
package com.assignment.controller;

/**
 * @author ugawari
 *
 */
public class StringOccurrenceCountArray {

	/**
	 * program to accept an array of names and a name and check whether the name is present in the array.
	 * Return the count of occurrence
	 * @param stringOfNames is a array of strings
	 * @param inputName a name to check occurrence
	 * @return count in Integer
	 */
	public int countOfOccurance(String[] stringOfNames, String inputName) {
		int count=0;
		for(String name:stringOfNames){
			if(name==inputName){ //name is present or not
				count++;//if present increase the count
			}
		}
		return count;
	}

}
