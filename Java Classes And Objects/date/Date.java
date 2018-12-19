package assignment.date;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

/**
 * @author ugawari
 *
 */
public class Date {

	private int day, month, year; // data members to store the day, month and year of a date.
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// parse the date string into Date object
	
	public Date(int day, int month, int year){ //constructor to initialize Date objects
		//initialize d, m, y of the current object using the d, m, y parameters. 
		this.month=month;
		this.day=day;
		this.year=year;
	}

	
	public String toString() {// method to get the value of a Date object printed
		return "Date is: "+day+"/"+month+"/"+year;//return the value of a Date object as a String in d/m/y format.
	}
	
	/**
	 * method to check whether a date is smaller than the other 
	 * @param date1
	 * @throws ParseException 
	 * @return-If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
	 */
	public boolean isSmaller(Date date1) throws ParseException{
		java.util.Date givenDate = sdf.parse(date1.day+"/"+date1.month+"/"+date1.year);
		java.util.Date invokingDate = sdf.parse(day+"/"+month+"/"+year);
		if(invokingDate.after(givenDate))
			return true;
		else
			return false; 
	}
	

	/**
	 * method to find out the difference of days, months and years in two dates.
	 * The difference of days, months and years in the invoking and parameter Date objects 
	 * is obtained and returned in an int array. The first element of the array should represent
	 * difference of days; second one, the difference of months and the third one, the difference of years.
	 * @param date
	 * @return
	 * @throws ParseException 
	 */
	public int[] diff(Date date1) throws ParseException{ 
		int[] dateArray=new int[3];
		if(isSmaller(date1) && date1.month<=12 && date1.month>=1 && date1.day>=1 && date1.day<=31 && date1.year>0){
			LocalDate givenDate = LocalDate.of(date1.year, date1.month, date1.day);
			LocalDate invokingDate = LocalDate.of(this.year, this.month, this.day);
	 
	        Period diff = Period.between(givenDate, invokingDate);
				dateArray[0]=(int) diff.getDays();
				dateArray[1]=(int) diff.getMonths();
				dateArray[2]=(int) diff.getYears();
		}
		return dateArray;
	}
	
	
	/*
	 //Or We can use this also 
	 * public int[] diff(Date date1) throws ParseException{ 
		int[] dateArray=new int[3];
		java.util.Date givenDate = sdf.parse(date1.day+"/"+date1.month+"/"+date1.year);
		java.util.Date invokingDate = sdf.parse(day+"/"+month+"/"+year);
		if(isSmaller(date1) && date1.month<=12 && date1.month>=1 && date1.day>=1 && date1.day<=31 && date1.year>0){
			long timeDiff=invokingDate.getTime()-givenDate.getTime();//In millisecond
			long days = (timeDiff / (24 * 60 * 60 * 1000));//d*h*m*s
			int month=0;
			int year=0;
			while(days>30){
				days-=30;
				month++;
			}
			while(month>12){
				month-=12;
				year++;
			}
			dateArray[0]=(int) days;
			dateArray[1]=(int) month;
			dateArray[2]=(int) year;
		}
		return dateArray;
	}*/
	
}
