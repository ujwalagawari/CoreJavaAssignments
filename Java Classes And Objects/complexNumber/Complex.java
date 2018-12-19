/**
 * Write the definition for a class called Complex that has floating point properties for storing real and imaginary parts. The class has the following behaviours/services/methods:
void set(float, float) to set the specified value in object
void disp() to display complex number object
complex sum() to sum two complex numbers & return complex number
1. Write the definitions for each of the above member functions.
2. Write a ComplexTest class with main function to create three complex number objects. Set the value in two objects and call sum() to calculate sum and assign it in third object. Display all complex numbers.
 */
package assignment.complexnumber;

/**
 * @author ugawari
 *
 */
public class Complex {

	private float realPart;
	private float imaginaryPart;
	
	public float getRealPart() {
		return realPart;
	}
	public void setRealPart(float realPart) {
		this.realPart = realPart;
	}
	public float getImaginaryPart() {
		return imaginaryPart;
	}
	public void setImaginaryPart(float imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	/**
	 * To set complex number in realPart and imaginaryPart 
	 */
	public void setComplex(float realPart, float imaginaryPart){
			this.realPart=realPart;
			this.imaginaryPart=imaginaryPart;
	}
	
	/**
	 * To display Complex number in realPart and imaginaryPart format
	 */
	public String disp(){
		if(imaginaryPart>0)
			return realPart+"+"+imaginaryPart+"i";
		else
			return realPart+""+imaginaryPart+"i";
	}
	
	private float newRealPart; 		//not given access to outside so not created getter and setter
	private float newImaginaryPart;		//not given access to outside so not created getter and setter
	
	
	/**
	 * @param complex
	 * @return sum of real part and imaginary part
	 */
	Complex sum(Complex complex){
		Complex newComplex=new Complex();
		newRealPart=this.realPart+complex.realPart;
		newImaginaryPart=this.imaginaryPart+complex.imaginaryPart;
		newComplex.setRealPart(newRealPart);
		newComplex.setImaginaryPart(newImaginaryPart);
		return newComplex;
	}
	
}
