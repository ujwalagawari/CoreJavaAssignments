package com;

import java.util.Scanner;

/**
 * @author ugawari
 *
 */
public class IncomeTax {

	/**
	 * Program to find income tax on ctc
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ctc = 0;
		System.out.println("Ënter ctc");
        Scanner scanner = new Scanner(System.in);//for input
        ctc = scanner.nextInt();
        scanner.close();
        System.out.println("Tax on your ctc is = "+findTax(ctc));
		
	}
	
	public static double findTax(double ctc){
			double tax=0;
		 	if(ctc<=180000 && ctc>=0){//Income Range 0-1,80,000 & Tax payable in Percentage is Nil
		 		tax=0;
	        }else if(ctc<=300000 && ctc>=181001){//Income Range 1,81,001-3,00,000 & Tax payable in Percentage is 10% of ctc
	        	tax=ctc*10/100;
	        }else if(ctc<=500000 && ctc>=300001){//Income Range 3,00,001-5,00,000 & Tax payable in Percentage is 20% of ctc
	        	tax=ctc*20/100;
	        }else if(ctc<=1000000 && ctc>=500001){//Income Range 5,00,001-10,00,000 & Tax payable in Percentage is 30% of ctc
	        	tax= ctc*30/100;
	        }
			return tax;
	}
	
	
}
