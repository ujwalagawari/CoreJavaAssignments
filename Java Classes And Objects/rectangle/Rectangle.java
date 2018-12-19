/**
 * Consider a Rectangle Shape.
Identify its properties and behaviours and implement the same.
Write a Test Cases to check if the behaviours(methods) are implemented properly.
If their are 2 Rectangle objects of different sizes than we should be able to check if they are having same area or not.
 */
package assignment.rectangle;

/**
 * @author ugawari
 *
 */
public class Rectangle {

	private double hight;
	private double width;
	private double area;//don't want public so not created getter and setter
	
	/**
	 * @param hight
	 * @param width
	 */
	public Rectangle(double hight, double width) {
		super();
		this.hight = hight;
		this.width = width;
	}
	
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * @return parameter of given rectangle if width and height is greater than 0 else 0
	 */
	public double perimeter(){
		return (hight>=0 && width>=0) ? 2*(hight+width) : 0;
	}
	
	/**
	 * @return area of given rectangle if width and height is greater than 0 else 0
	 */
	public double rectangleArea(){
		if(hight>=0 && width>=0){
			area=hight*width;
		}
		return area;
	}
}
