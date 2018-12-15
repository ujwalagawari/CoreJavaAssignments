/**
 * 
 */
package rectangleAssignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class DoubleRectangleTest {

	private Rectangle rectangle1;
	private Rectangle rectangle2;
	/*@Before
	public void setUp(){
		rectangle=new Rectangle(8,9);
	}*/
	
	@Test
	public void testForBothPossitiveAndSameHightWidth() {
		rectangle1=new Rectangle(8,9);
		rectangle2=new Rectangle(8,9);
		assertTrue(rectangle1.rectangleArea()==rectangle2.rectangleArea());
	}
	
	@Test
	public void testForBothNegativeAndSameHightWidth() {
		rectangle1=new Rectangle(-8,-9);
		rectangle2=new Rectangle(-8,-9);
		assertTrue(rectangle1.rectangleArea()==rectangle2.rectangleArea());
	}
	
	@Test
	public void testForDifferentHightWidth() {
		rectangle1=new Rectangle(10,9);
		rectangle2=new Rectangle(8,9);
		assertTrue(rectangle1.rectangleArea()==rectangle2.rectangleArea());
	}
	
	@Test
	public void testForOneAreaIsNegative() {
		rectangle1=new Rectangle(8,9);
		rectangle2=new Rectangle(-8,9);
		assertTrue(rectangle1.rectangleArea()==rectangle2.rectangleArea());
	}
	
	
	/*@After
	public void tearDown(){
		assertTrue(rectangle1.rectangleArea()==rectangle2.rectangleArea());
	}*/
	
	
	
}
