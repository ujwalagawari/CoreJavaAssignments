package assignment.date;
import static org.junit.Assert.assertArrayEquals;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class DateTest {

	private Date date, date1;
	
	@Before
	public void setUp(){
		date=new Date(22,05,2019);
	}
	
	@Test
	public void testForZero() throws ParseException {
		date1=new Date(00,00,0000);//
		int[] answer=date.diff(date1);
		int[] expected={0, 0, 0};
		assertArrayEquals(expected, answer);//date not allowed so return 0
	}
	
	@Test
	public void testForMonthGreaterThan12() throws ParseException {
		date1=new Date(22,13,2019);//
		int[] answer=date.diff(date1);
		int[] expected={0, 0, 0};
		assertArrayEquals(expected, answer);//date not allowed so return 0
	}

	@Test
	public void testForDayGreaterThan32() throws ParseException {
		date1=new Date(33,12,2018);//
		int[] answer=date.diff(date1);
		int[] expected={0, 0, 0};
		assertArrayEquals(expected, answer);//date not allowed so return 0
	}
	
	@Test
	public void testForDayEessThan32MonthLessThan13() throws ParseException {
		date1=new Date(12,12,2018);//
		int[] answer=date.diff(date1);
		int[] expected={10, 5, 0};
		assertArrayEquals(expected, answer);
	}
	
	@Test
	public void testForDifferentDate() throws ParseException {
		date1=new Date(10,12,2017);//
		int[] answer=date.diff(date1);
		int[] expected={12, 5, 1};
		assertArrayEquals(expected, answer);
	}
}
