package com;

/**
 * @author ugawari
 *
 */
public class SequentialSort {

	/**
	 * Program to sort given array
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOfNumbers= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};//Array which is of the size 15, which is not sorted
		System.out.println("Before Sorting: ");  
		for(int i=0; i<arrayOfNumbers.length; i++){
			System.out.print(arrayOfNumbers[i]+" ");// array before sorting
		}
		System.out.println(" ");
		System.out.println("After Sorting: ");
		int[] sortedArray=sequentialSort(arrayOfNumbers);
		for(int i=0; i<sortedArray.length; i++){
			System.out.print(sortedArray[i]+" ");// array after serial sorting
		}
	}
	//Method to sort given array
	public static int[] sequentialSort(int[] arrayOfNumbers){
		for(int i=0; i<arrayOfNumbers.length; i++){
			int index = i;
			for(int j=i+1; j<arrayOfNumbers.length; j++){
				if(arrayOfNumbers[i]>arrayOfNumbers[j]){
					 int temp=arrayOfNumbers[index];
					 arrayOfNumbers[i]=arrayOfNumbers[j]; //checking index value with each value of array
					 arrayOfNumbers[j]=temp;
				}
			}
		}
		return arrayOfNumbers;
	}

}
