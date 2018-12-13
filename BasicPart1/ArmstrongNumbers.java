package com;

/**
 * @author ugawari
 *
 */
public class ArmstrongNumbers {
	/**
	 * Program to find Armstrong number between 100 to 999
	 */
	public static void main(String[] args) {
		System.out.println("armstrong number between 100 to 999 are below:");
		for(int number=100; number<=999; number++){//to check numbers between 100 and 999
			int decimal, isArmstrong  = 0;
			int oldNumber=number;
			//System.out.println("oldNumber "+oldNumber);
			while(oldNumber>0){  
				decimal=oldNumber%10; 
				oldNumber=oldNumber/10; 
				isArmstrong=isArmstrong+(decimal*decimal*decimal);
		    }
			if(isArmstrong==number){
				System.out.print(number+", ");
			}
		}
	}
}
