/**
 * 
 */
package com.assignment.controller;

/**
 * @author ugawari
 *
 */
public class MultiDimensionalArray {

	/**
	 * program to find if a particular element is present or not in a multi-dimensional array.
	 * @param arrayOfInteger
	 * @param number
	 * @return boolean
	 */
	public boolean isNumberInArray(int[][] arrayOfInteger, int number) {
		 if(checkNumberInArray(arrayOfInteger,number).equals("")){
			 return false;
         }else{
        	 return true;
         }
	}
	
	/**
	 * @param arrayOfInteger
	 * @param number
	 * @return
	 */
	private String checkNumberInArray(int[][] arrayOfInteger, int number) {
		String returnValue="";
		for(int i=0;i<arrayOfInteger.length;i++){   
			for(int j=0; j<arrayOfInteger[i].length; j++){
				if(arrayOfInteger[i][j] == number){//checking number is present or not
					returnValue=i+","+j;
	            } 
			}
        }
		return returnValue;	//return index of given number
	}
	
}
