package com;
import java.util.Scanner;

/**
 * @author ugawari
 *
 */
public class ArmstrongNumber {
	/**
	 * Program to find Armstrong number for 3 digit number
	 */
	public static void main(String[] args) {
		int number, decimal , isArmstrong  = 0;//declare 3 variables - number as a input,
		//decimal for getting value after dot(decimal) and
		//isArmstrong to display square for table   
		System.out.println("Ënter a 3 digit Number");
		Scanner scanner = new Scanner(System.in);//for input
		number = scanner.nextInt();
		scanner.close();
		if(number>99 && number<1000){
			int oldNumber=number;
			while(number>0){  
				decimal=number%10; 
				//System.out.println(" decimal "+decimal);
				number=number/10;  
				//System.out.println(" number "+number);
				isArmstrong=isArmstrong+(decimal*decimal*decimal);
				//System.out.println("isArmstrong "+isArmstrong);
		    }  
			if(isArmstrong==oldNumber){
				System.out.println(oldNumber+" is a armstrong number.");
			}else{
				System.out.println(oldNumber+" is not a armstrong number.");
			}
		}else{
			System.out.println("Please enter 3 digit number. Run Again.");
		}
	}
}
