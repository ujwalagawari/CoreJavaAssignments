package com;
import java.util.Scanner;

/**
 * @author ugawari
 *
 */
public class LinearSearch {

	/**
	 * Program to search number is contained in the array   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 0;
	      System.out.print("Enter a number: ");
		Scanner scanner = new Scanner(System.in);//for input
		number = scanner.nextInt();
         scanner.close();
         if(linearSearch(number)!=-1){
        	 System.out.println(number+" is found at index: "+linearSearch(number));
         }else{
        	 System.out.println(number+" is not found.");
         }
         
	}

	private static int linearSearch(int number) {
		int index=0;
		int[] arrayOfNumbers= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};//Array which is of the size 15, which is not sorted
		for(int i=0;i<arrayOfNumbers.length;i++){    
            if(arrayOfNumbers[i] == number){//finding for location of input value
            	index=i;
            }    
        }
		//System.out.println(index);
		if(index>0){
			index=index;
		}else if(index==0){
			if(number==arrayOfNumbers[0]){//checking for index 0
				index=0; 
			}else{
				index=-1;
			}
		}
		return index;	//return index of given number
	}

}
