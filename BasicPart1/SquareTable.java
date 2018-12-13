package com;
import java.util.Scanner;

/**
 * @author ugawari
 *
 */
public class SquareTable {
	/**
	 * Program to find table of given number and squre of that table
	 */
	public static void main(String[] args) {
		int number= 0;//declare 3 variables number as a input,
								//multiplication for table and square to display square for table   
        System.out.println("Ënter a Number");
        Scanner scanner = new Scanner(System.in);//for input
        number = scanner.nextInt();
        scanner.close();
        squareTable(number); //function to get table with square
	}
	
	public static void squareTable(int number){
		int multiplication, square  = 0;
        for(int i=1; i<=10; i++){
        	multiplication=number*i;//for table
        	square=multiplication*multiplication;//for square of tables
        	System.out.println("5*"+i+"="+multiplication+"---Square---="+square);
        }
	}
}
