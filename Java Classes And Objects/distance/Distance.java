/**
 * Write the definition for a class called Distance that has properties feet as integer  and inches as float. The class has the following behaviours/services/methods:
void set(int, float) to give value to object
void disp() to display distance in feet and inches
Distance add(Distance) to sum two distances & return distance
1. Write the definitions for each of the above member functions.
2. Write DistanceTest class with main function to create three Distance objects. Set the value in two objects and call add() to calculate sum and assign it in third object. Display all distances.
 */
package assignment.distance;

/**
 * @author ugawari
 *
 */
public class Distance {

	private int feet; 
	private float inches;
	
	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public float getInches() {
		return inches;
	}

	public void setInches(float inches) {
		this.inches = inches;
	}

	/**
	 * To set distance in feet and inches 
	 */
	public void setDistance(int feet, float inches){
		this.feet=feet;
		this.inches=inches;
	}
	
	/**
	 * To display distance in feet and inches format
	 * @return 
	 */
	public String disp(){
		return "distance in feet="+feet+" and inches="+inches;
	}
	
	private float newInches;//don't want public so not created getter and setter
	private int newFeet;///don't want public so not created getter and setter
	
	/**
	 * Addition of two distances
	 * @param distance
	 * @return distance in feet and inches
	 */
	Distance add(Distance distance){
		Distance newDistance=new Distance();
		 newInches=this.inches + distance.inches;
		 newFeet = this.feet+distance.feet;
		if(newInches>=12.0){	//if inches greater than 12 convert into feet
			newInches-=12.0;
			newFeet++;
		}
		newDistance.setFeet(newFeet);
		newDistance.setInches(newInches);
		return newDistance;
	}

	@Override
	public String toString() {
		return "Distance [feet=" + feet + ", inches=" + inches + "]";
	}
	
	
}
