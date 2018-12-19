package assignment.complexnumber;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class ComplexTest {

	private Complex complex1,complex2,complex3;
	private String expectedResult;
	
	@Before
	public void setUp(){
		complex1=new Complex();
		complex2=new Complex();
		complex3=new Complex();
	}
	
	@Test
	public void mainForPossitiveSameRealAndImaginary() {
		complex1.setComplex(5, (float) 4.5);
		complex2.setComplex(5, (float) 4.5);
		complex3=complex1.sum(complex2);
		expectedResult="10.0,9.0";
		assertEquals(expectedResult, complex3.getRealPart()+","+complex3.getImaginaryPart());
		complex1.disp();
		complex2.disp();
		complex3.disp();
	}
	
	@Test
	public void mainForPossitiveSameRealAndDifferentImaginary() {
		complex1.setComplex(5, (float) 1.7);
		complex2.setComplex(5, (float) 4.5);
		complex3=complex1.sum(complex2);
		expectedResult="10.0,6.2";
		assertEquals(expectedResult, complex3.getRealPart()+","+complex3.getImaginaryPart());
		complex1.disp();
		complex2.disp();
		complex3.disp();
	}
	
	@Test
	public void mainForPossitiveDifferentRealAndDifferentImaginary() {
		complex1.setComplex(2, (float) 4.5);
		complex2.setComplex(5, (float) 1.5);
		complex3=complex1.sum(complex2);
		expectedResult="7.0,6.0";
		assertEquals(expectedResult, complex3.getRealPart()+","+complex3.getImaginaryPart());
		complex1.disp();
		complex2.disp();
		complex3.disp();
	}
	
	@Test
	public void mainForNegativeSameRealAndImaginary() {
		complex1.setComplex(5, (float) 4.5);
		complex2.setComplex(-5, (float) 4.5);
		complex3=complex1.sum(complex2);
		expectedResult="0.0,9.0";
		assertEquals(expectedResult, complex3.getRealPart()+","+complex3.getImaginaryPart());
		complex1.disp();
		complex2.disp();
		complex3.disp();
	}
	
	@Test
	public void mainForNegativeSameRealAndDifferentImaginary() {
		complex1.setComplex(5, (float) 1.7);
		complex2.setComplex(5, -(float) 4.5);
		complex3=complex1.sum(complex2);
		expectedResult="10.0,-2.8";
		assertEquals(expectedResult, complex3.getRealPart()+","+complex3.getImaginaryPart());
		complex1.disp();
		complex2.disp();
		complex3.disp();
	}
	
	@Test
	public void mainForNegativeDifferentRealAndDifferentImaginary() {
		complex1.setComplex(-2, -(float) 4.5);
		complex2.setComplex(-5, -(float) 1.5);
		complex3=complex1.sum(complex2);
		expectedResult="-7.0,-6.0";
		assertEquals(expectedResult, complex3.getRealPart()+","+complex3.getImaginaryPart());
		complex1.disp();
		complex2.disp();
		complex3.disp();
	}
	
	@Test
	public void mainForZero() {
		complex1.setComplex(0, (float) 0);
		complex2.setComplex(0, (float) 0);
		complex3=complex1.sum(complex2);
		expectedResult="0.0,0.0";
		assertEquals(expectedResult, complex3.getRealPart()+","+complex3.getImaginaryPart());
		complex1.disp();
		complex2.disp();
		complex3.disp();
	}
	
	

}
