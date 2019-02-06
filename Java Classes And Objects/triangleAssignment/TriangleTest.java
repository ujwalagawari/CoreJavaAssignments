/**
 * 
 */
package triangleAssignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class TriangleTest {
	
	private Triangle triangle1,triangle2,triangle3,triangle4,triangle5;
	
	@Before
	public void setUp(){
		triangle1=new Triangle(50, 10, 20);
		triangle2=new Triangle(4, 3, 5);
		triangle3=new Triangle(50, 10, 10);
		triangle4=new Triangle(50, 10, 20);
		triangle5=new Triangle(5, 5, 5);
	}
	
	@Test
	public void test() {}
	
	@Test
	public void testForRightAngle() {
		String answer=triangle2.checkTriangleType();
		assertEquals("Right", answer);
	}
	
	@Test
	public void testForScalene() {
		String answer=triangle1.checkTriangleType();
		assertEquals("Scalene", answer);
	}
	
	@Test
	public void testForIsosceles() {
		String answer=triangle3.checkTriangleType();
		assertEquals("Isosceles", answer);
	}
	
	@Test
	public void testForEquilateral() {
		String answer=triangle5.checkTriangleType();
		assertEquals("Equilateral", answer);
	}

}
