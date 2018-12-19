/**
 * 
 */
package assignment.person;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import assignment.date.Date;

/**
 * @author ugawari
 *
 */
public class PersonTest {
	
	private Person person1, person2, person3;
	
	@Before
	public void setUp() throws ParseException{
		person1=new Person("Ujwala", 30,4,1995);
		person2=new Person("Atul", 13,7,1990);
	}
	
	
	@Test
	public void testForAgeDifference() {
		assertEquals("Atul is older than Ujwala by 4 Years 9 Month 17 Days.", person1.olderOne(person2));
	}
	
	@Test
	public void testForSameAge() throws ParseException {
		person3=new Person("Mrudula", 30,4,1995);
		assertEquals("Both are same.", person1.olderOne(person3));
	}
	
	@Test
	public void testForDaysGreaterThan31AndMonthBy12() throws ParseException {
		person3=new Person("Mrudula", 45,13,1995);
		assertEquals("Both are same.", person1.olderOne(person3));
	}

}
