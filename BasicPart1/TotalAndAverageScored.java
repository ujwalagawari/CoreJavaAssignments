package com;

import java.util.Scanner;

/**
 * @author ugawari
 *
 */
public class TotalAndAverageScored {

	static double studentsTotal=0; //declare global variable
	static double studentsAverage=0;
	/**
	 * Program to the total scored and the average in all the subjects.
	 * Also to Find the Total and Average scored by students 
	 * @param args
	 */
	public static void main(String[] args) {
		double subjectA,subjectB,subjectC= 0;	//declare 3 variables as a input for three subject,
		int student=3;	//declare total numbers of students 
		for(int i=1; i<=student; i++){
			System.out.println("Ënter a marks of Student "+i);
	        Scanner scanner = new Scanner(System.in);//Accept the marks of three students for the subject say A, B, C.
	        System.out.print("Ënter subject A marks= ");
	        subjectA = scanner.nextDouble();
	        System.out.print("Ënter subject B marks= ");
	        subjectB = scanner.nextDouble();
	        System.out.print("Ënter subject C marks= ");
	        subjectC = scanner.nextDouble();
	        score(subjectA,subjectB,subjectC); //function to get table with square
		}
		studentsAverage=studentsTotal/9;//average of all subjects for all students
		System.out.println("All students total= "+studentsTotal+", all students average marks="+studentsAverage);
	}
	
	private static void score(double subjectA, double subjectB, double subjectC) {// TODO Auto-generated method stub
		double total, average=0;
		total=subjectA+subjectB+subjectC;//total of all subjects for a student
		average=total/3;//average of all subjects for a student
		System.out.println("total = "+total+", average = "+average);
		studentsTotal+=total;//total of all subjects for all students
		//studentsAverage+=average;
	}

}
