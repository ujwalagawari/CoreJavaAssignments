package com.assignment.controller;

/**
 * @author ugawari
 *
 */
public class MissingNumberInArray {
	/**
	 * Program to find the one that is missing from the array containing n distinct numbers taken from 0, 1, 2, ..., n,
	 * @param arrayOfIntegers
	 * 		input of integer array
	 * @return missingElement
	 * 		return missing element from array from distinct number
	 */
	public int findMissingnumber (int[] arrayOfIntegers){
		int missingElement=0;
		if(arrayOfIntegers.length>0){
			if(arrayOfIntegers[0]==0 && arrayOfIntegers.length==1){//checking for length is 1 and element is 0 
				missingElement=-1;
			}else{
				for(int i=0; i<arrayOfIntegers.length-1; i++){//to change array in ascending order
					if(arrayOfIntegers[i]>arrayOfIntegers[i+1]){
						int temp=arrayOfIntegers[i];
						arrayOfIntegers[i]=arrayOfIntegers[i+1];
						arrayOfIntegers[i+1]=temp;
					}
				}
				
				int sum=0;
				for(int j=0;j<=arrayOfIntegers[arrayOfIntegers.length-1];j++){//obtain sum of expected numbers  
					sum+=j;
				}
				
				int total=0;
				for(int i=0; i<arrayOfIntegers.length; i++){//obtain sum of actual numbers in array
							total+=arrayOfIntegers[i];
				}
				missingElement=(sum-total);//find missing number by subtracting sum of actual numbers from sum of expected
			}
		}else{
			missingElement=-1;//empty array
		}
		return missingElement;
	}

}
