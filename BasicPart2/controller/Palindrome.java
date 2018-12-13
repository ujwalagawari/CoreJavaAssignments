package com.assignment.controller;

/**
 * @author ugawari
 *
 */
public class Palindrome {
	
	/**
	 * program to check integer is a palindrome when it reads the same backward as forward.
	 * @param number
	 * @return boolean value
	 */
	public boolean isPalindrome(int number) {
		int originalNumber=number;//store input in another variable
		int reminder,reverseNumber=0;
		boolean flag=false;//declare boolean variable to return number is palindrome or not
		while(number>0){
			reminder=number%10;
			reverseNumber=(reverseNumber*10)+reminder; //reverse number
			number=number/10; 
		}
		
		if(originalNumber==reverseNumber)
			flag=true;
		return flag;
	}

}
