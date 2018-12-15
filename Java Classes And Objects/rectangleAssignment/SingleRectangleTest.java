package rectangleAssignment;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class SingleRectangleTest {
	
	private Rectangle rectangle;
	private double expectedResult;
	private double result;
	/*@Before
	public void setUp(){
		rectangle=new Rectangle(8,9);
	}*/
	
	@Test
	public void testForPossitiveWidthHight() {
		expectedResult=72;
		rectangle=new Rectangle(8,9);
		result=rectangle.rectangleArea();
		assertEquals(expectedResult, result, 2);
	}
	
	@Test
	public void testForPossitiveWidthNegativeHight() {
		expectedResult=0;
		rectangle=new Rectangle(-8,9);
		result=rectangle.rectangleArea();
		assertEquals(expectedResult, result, 2);
	}
	
	@Test
	public void testForNegativeWidthNegativeHight() {
		expectedResult=0;
		rectangle=new Rectangle(-8,-9);
		result=rectangle.rectangleArea();
		assertEquals(expectedResult, result, 2);
	}
	
	@Test
	public void testForNegativeWidthPossitiveHight() {
		expectedResult=0;
		rectangle=new Rectangle(8,-9);
		result=rectangle.rectangleArea();
		assertEquals(expectedResult, result, 2);
	}
	
	@Test
	public void testForZero() {
		expectedResult=0;
		rectangle=new Rectangle(0, 0);
		result=rectangle.rectangleArea();
		assertEquals(expectedResult, result, 2);
	}

}
