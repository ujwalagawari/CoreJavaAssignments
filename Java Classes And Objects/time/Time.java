/**
 *Write the definition for a class called Time that has hours and minutes as integer. The class has the following behaviours/services/methods:
void setTime(int, int) to set the specified value in object
void showTime() to display time object
time sum(time) to sum two time object & return time
1. Write the definitions for each of the above member functions.
2. Write main function to create three time objects. Set the value in two objects and call sum() to calculate sum and assign it in third object. Display all time objects.
 */
package assignment.time;

/**
 * @author ugawari
 *
 */
public class Time {

	private int hours;
	private int minutes;
	private int newMinutes; //not given access to outside so not created getter and setter
	private int newHours; //not given access to outside so not created getter and setter
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	/**
	 * To set time in hours and minutes 
	 */
	void setTime(int hours, int minutes){
		this.hours=hours;
		this.minutes=minutes;
	}
	
	/**
	 * To display time in hours and minutes format
	 */
	String showTime(){
		return "Time is "+hours+":"+minutes;
	}
	
	
	/**
	 * To add time to given time
	 * @param time of Time Instance
	 * @return sum of two times
	 */
	Time sum(Time time){
		Time newtime=new Time();
		newHours=this.hours+time.hours;
		newMinutes=this.minutes+time.minutes;
		if(newMinutes>=60){		//if time is greater than 60 then convert into minutes
			newMinutes-=60;
			newHours++;
		}
		newtime.setHours(newHours);
		newtime.setMinutes(newMinutes);
		return newtime;
	}
}
