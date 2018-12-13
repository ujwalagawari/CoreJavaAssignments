package com;

import java.util.Scanner;

/**
 * @author ugawari
 *
 */
public class GradeResult {
	/**
	 * Program to give grade to student depend on subjects marks 
	 */
	public static void main(String[] args) {
		int subject1, subject2, subject3  = 0;//declare each subject mark
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter First Subject Mark= "); 
		subject1 = scanner.nextInt();//first input
        
		System.out.println("enter Second Subject Mark= "); 
        subject2 = scanner.nextInt(); //second input
        
        System.out.println("enter Third Subject Mark= ");
        subject3 = scanner.nextInt();//third input
        
        if(subject1>60 && subject2>60 && subject3>60){//All subjects marks is greater than 60 is Passed 
        	System.out.println("Passed");
        }else if((subject1>60 && subject2>60) || (subject1>60 && subject3>60) || subject3>60 && subject2>60){
        	//Any two subjects marks is greater than 60 is Promoted
        	System.out.println("Promoted");
        }else{//Any one subject marks is greater than 60 or all subjects’ marks less than 60 is failed.
        	System.out.println("failed");
        }
        
	}
}
