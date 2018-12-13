/**
 * 
 */
package com.assignment.controller;

/**
 * @author ugawari
 *
 */
public class PalindromeArray {

	/**
	 * Program to Identify a Palindrome Strings from array of String, Count the chars in it,And sort in descending order of chars
	 * @param stringArray
	 * @return array in descending order for polindrome strings
	 */
	public static String[] palindromeWithDescOrder(String[] stringArray) {
		boolean flag=false;
		String[] palindromeArray=checkPalindromeArray(stringArray);
		String temp=null;
		for(int i=0; i<palindromeArray.length; i++){
			int index=i;
			for(int j=i+1; j<palindromeArray.length; j++){
				if(palindromeArray[i].compareTo(palindromeArray[j])<0){
					temp=palindromeArray[i];
					palindromeArray[i]=palindromeArray[j];
					palindromeArray[j]=temp;
				}
			}
		}
		return palindromeArray;
	}
	
	/**
	 * check count of palindrome String and make array of them
	 * @param stringArray
	 * @return
	 */
	private static String[] checkPalindromeArray(String[] stringArray) {
		int count=0, size=0;
		for(int i=0; i<stringArray.length; i++){
			String reverseWord=findReversestring(stringArray[i]);
			if(reverseWord.equals(stringArray[i])){
				count++;
			}
		}
		
		String[] palindromeArray=new String[count];
		for(int i=0; i<stringArray.length; i++){
			String reverseWord=findReversestring(stringArray[i]);
			if(reverseWord.equals(stringArray[i])){
				palindromeArray[size]=reverseWord;
				size++;
			}
		}
		return palindromeArray;
	}

	/**
	 * Reverse The given word
	 * @param element
	 * @return
	 */
	public static String findReversestring(String element) {
		char characters[] = element.toCharArray();//split words into characters
		int index=characters.length-1;
		String reverseWord="";
		for(int j=index; j>=0; j--){
			reverseWord+=characters[j];//reverse character of each word
		}
		return reverseWord;
	}

}
