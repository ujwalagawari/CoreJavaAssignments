package com;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * @author ugawari
 *
 */
public class DateFormat {
	/**
	 * Program to convert date DD,MM,YYYY in DD/Month-Name/YYYY format
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String dateString= null;
		  System.out.println("Enter Date In DD,MM,YYYY format");
	      System.out.print("Enter date: ");
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);//for input
        dateString = scanner.nextLine();
        //scanner.close();
        System.out.println("Converted date is : " + changeDateFormat(dateString));
	}

	private static String changeDateFormat(String dateString) throws ParseException {
		 SimpleDateFormat sdf = new SimpleDateFormat("dd,MM,yyyy");// parse the date string into Date object
		 Date date = sdf.parse(dateString);
		 SimpleDateFormat destDf = new SimpleDateFormat("dd/MMM/yyyy"); // format the date into another format
		 dateString = destDf.format(date);
		 return dateString;
	}
}
