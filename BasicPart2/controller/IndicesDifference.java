package com.assignment.controller;

/**
 * @author ugawari
 *
 */
public class IndicesDifference {
	/**
	 * find out whether there are two distinct indices i and j in the 
	 * array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
	 * @param arrayOfIntegers- array of integers
	 * @return result- indices difference
	 */
	public int getIndicesDifference(int[] arrayOfIntegers) {
		int result=0;
		for(int i=0; i<arrayOfIntegers.length; i++){
			for(int j=i+1; j<arrayOfIntegers.length; j++){
				if(arrayOfIntegers[i]==arrayOfIntegers[j]){//find out whether there are two distinct indices i and j in the array
					result=j-i;//store in result
				}
			}
		}
		return result;
	}

}
