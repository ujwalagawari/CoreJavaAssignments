/**
 *This problem has several parts:

1. Write a simple Vehicle class that has fields for (at least) current speed, current direction in degrees, and owner name.
2. Add a static field to your Vehicle class for the highest Vehicle Identification Number issued, and a non-static field that holds each vehicle's ID number.
3. Write a main method for your Vehicle class that creates a few vehicles and prints out their field values. Note that you can also write a separate tester program as well.
4. Add two constructors to Vehicle. A no-arg constructor and one that takes an initial owner's name. Modify the tester program from the previous step and test your design.
5. Make the fields in your Vehicle class private, and add accessor methods for the fields. Which fields should have methods to change them and which should not?
6. Add a changeSpeed method that changes the current speed of the vehicle to a passed-in value, and a stop method that sets the speed to zero.
7. Add two turn methods to Vehicle. One that takes a number of degrees to turn, and one that takes simply either a Vehicle.TURN_LEFT or a Vehicle.TURN_RIGHT constant. Define the two constants accordingly.
8. Add a static method to Vehicle that returns the highest identification number used so far.
9. Add a toString method to Vehicle. 
 */
package assignment.vehicle;

/**
 * @author ugawari
 *
 */
public class Vehicle {

	private int vehicleID;// holds each vehicle's ID number
	private float speed;
	private String direction;
	private String ownerName;
	private static int highestVehicleIdentificationNumber;//a static field to your Vehicle class for the highest Vehicle Identification Number issued
	private static final boolean TURN_LEFT = false;
	private static final boolean TURN_RIGHT = true;
	private float angle;
	
	public Vehicle() {
	}

	/**
	 * 
	 * @param ownerName
	 */
	public Vehicle(String ownerName) {
		this.ownerName = ownerName;
		this.vehicleID = ++highestVehicleIdentificationNumber;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	/**
	 * changeSpeed method that changes the current speed of the vehicle to a passed-in value
	 * @param speed
	 */
	public void changeSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * a stop method that sets the speed to zero
	 */
	public void stop() {
		this.speed = 0;
	}

	/**
	 * @return  the highest Vehicle Identification Number issued
	 */
	public static int highestIdentificationNumber() {
		return highestVehicleIdentificationNumber;
	}

	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", direction=" + direction
				+ ", ownerName=" + ownerName + ", vehicleID=" + vehicleID + "]";
	}

	//main method for your Vehicle class that creates a few vehicles and prints out their field values
	public static void main(String[] arg) {
		Vehicle vehicle1 = new Vehicle("Ujwala");
		Vehicle vehicle2 = new Vehicle("Mrudula");
		Vehicle vehicle3 = new Vehicle("Atul");
		Vehicle vehicle4 = new Vehicle("Mangesh");

		
		System.out.println("vehicle1 " + vehicle1.toString());
		System.out.println("vehicle2 " + vehicle2.toString());
		System.out.println("vehicle3 " + vehicle3.toString());
		System.out.println("vehicle4 " + vehicle4.toString());
		System.out.println("highest Vehicle Identification Number is " + highestVehicleIdentificationNumber);
	}

	/**
	 * 
	 * @param turnTo - right or left
	 * @param newAngle - change angle in degree
	 * @return
	 */
	public String turnVehicle(Boolean turnTo, float newAngle ) {
		while(newAngle>360){ //if angle is greater than 360 convert into 360 or less
			newAngle=newAngle-360;
		}
		if(speed>0){
			this.direction="West"; //set direction by default to west
			if(turnTo==TURN_LEFT){	//turn  to left assign false
				float totalAngle=this.angle-newAngle;
				if(totalAngle<0)
					totalAngle=360+totalAngle;
					changeDirection(totalAngle);
			}else if(turnTo==TURN_RIGHT){	//turn  to right assign true
				float totalAngle=this.angle+newAngle;
				changeDirection(totalAngle);
			}
		}
		return this.direction;
	}
	
	/**
	 * change direction on the basis  of angle in degree
	 * @param totalAngle
	 * @return
	 */
	private String changeDirection(float totalAngle){
		if(totalAngle==0 && totalAngle==360){
			this.direction="West";
		}else if(totalAngle<90 && totalAngle>0){
			this.direction="West-South";
		}else if(totalAngle==90){
			this.direction="South";
		}else if(totalAngle<180 && totalAngle>90){
			this.direction="South-Eest";
		}else if(totalAngle==180){
			this.direction="East";
		}else if(totalAngle<270 && totalAngle>180){
			this.direction="East-North";
		}else if(totalAngle==270){
			this.direction="North";
		}else if(totalAngle<360 && totalAngle>270){
			this.direction="North-South";
		}
		return this.direction;
	}

}
