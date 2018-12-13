/**
 * 
 */
package com;


/**
 * @author ugawari
 *
 */
public class RemoveDuplictesInArray {

	/**
	 * Program to remove duplicates and every element appearing once only from the given array
	 * @param args
	 */
    public static void main(String a[]){  
        int[] arrayOfNumbers = {1,2,2,3,4,5,5}; 
        
        
        System.out.println("Before removing duplicates : ");  
        for(int i=0; i<arrayOfNumbers.length; i++){  
            System.out.print(arrayOfNumbers[i]+" ");  
        }  
        System.out.println();  
          
        int[] newArray = removeDuplicates(arrayOfNumbers);//sorting array using selection sort  
         
        System.out.println("After removing duplicates :");  
        for(int i=0; i<newArray.length; i++){  
            System.out.print(newArray[i]+" ");  
        }  
    }

    //Method to eliminate given array
	private static int[] removeDuplicates(int[] arrayOfNumbers) {
		for(int i=0; i<arrayOfNumbers.length; i++){
			int index =i;
			//System.out.println("index "+index);
			for(int j=i+1; j<arrayOfNumbers.length; j++){
				//System.out.println("j "+j);
				if(arrayOfNumbers[i]==arrayOfNumbers[j]){
					if((j+1 >= 0) && (j+1 < arrayOfNumbers.length)){
						arrayOfNumbers[index]=arrayOfNumbers[j];
						arrayOfNumbers[j]=arrayOfNumbers[j+1];
					}
				}
			}
			//System.out.println(arrayOfNumbers[index]);
		}
		return arrayOfNumbers;
	}  

}
