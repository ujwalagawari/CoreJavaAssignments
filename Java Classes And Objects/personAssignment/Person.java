/**
 * 
 */
package personAssignment;
import java.util.Date;

/**
 * @author ugawari
 *
 */
public class Person {

	private String name; // data member to store the name of a person.
	private Date dob; // data member to store the date of birth of a person.
	public Person(String n, int d, int m, int y){ //constructor to initialize Person objects
	
		//initialize the data members of the current Person object using the parameters. 
	}
	
	public void display()// method to display the details of a person.
	{
		//Person details should be displayed in the following format:
		//Name: Person Name
		//Date Of Birth: dd/mm/yyyy
		//Age: ... Years, ... Months, ... Days
	}
	
	public void olderOne(Person p) //method to identify the older of the two persons.
	{
		//Older one of the invoking and given person object is identified and its details are 
		//displayed in the following format:
		//.... is older than .... by ... years, ... months and ... days.
	}
}
