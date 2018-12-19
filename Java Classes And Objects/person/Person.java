/**
 * 
 */
package assignment.person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 * @author ugawari
 *
 */
public class Person {

	private String name; // data member to store the name of a person.
	private LocalDate dob; // data member to store the date of birth of a person.
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public Person(String name, int day, int month, int year) throws ParseException{ //constructor to initialize Person objects
		this.name=name;
		this.dob=LocalDate.of(year, month, day);
		//initialize the data members of the current Person object using the parameters. 
	}
	
	public String display()// method to display the details of a person.
	{
		Period diff= Period.between(LocalDate.now(), dob);
		return "Name: "+name+"/n"+
				"Date Of Birth: "+dob+"/n"+
				"Age: "+diff.getYears()+"Years, "+diff.getMonths()+" Months, "+diff.getDays()+"Days";
		//Person details should be displayed in the following format:
		//Name: Person Name
		//Date Of Birth: dd/mm/yyyy
		//Age: ... Years, ... Months, ... Days
		
	}
	
	public String olderOne(Person person) //method to identify the older of the two persons.
	{
		Period diff; String result;
		if(person.getDob().compareTo(this.getDob())>0){ 	//this.getDob()>person.getDob()
            diff= Period.between(dob, person.getDob());
            result=name+" is older than "+person.name+" by "+diff.getYears()+" Years "+diff.getMonths()+" Month "+diff.getDays()+" Days.";
        }else if(person.getDob().compareTo(this.getDob())<0){  //this.getDob()<person.getDob()
             diff = Period.between(person.getDob(), dob);
             result=person.name+" is older than "+name+" by "+diff.getYears()+" Years "+diff.getMonths()+" Month "+diff.getDays()+" Days.";
        }else{
             diff = Period.between(person.getDob(), dob);
             result="Both are same.";
        }
		//Older one of the invoking and given person object is identified and its details are 
		//displayed in the following format:
		//.... is older than .... by ... years, ... months and ... days.
		return result;
	}

	
	/* Or
	public void olderOnes(Person person) //method to identify the older of the two persons.
	{
		Period diff=Period.between(dob,person.getDob());
		String result;
		if(diff.getDays()==0){
			result="Both are same.";
		}else if(diff.getDays()<0){
			result=person.name+" is older than "+name+" by "+diff.getYears()+" Years "+diff.getMonths()+" Month "+diff.getDays()+" Days.";
		}else if(diff.getDays()>0){
			result=name+" is older than "+person.name+" by "+diff.getYears()+" Years "+diff.getMonths()+" Month "+diff.getDays()+" Days.";
		}
	}*/
	
}
