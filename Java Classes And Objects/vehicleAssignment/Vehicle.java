/**
 * 
 */
package vehicleAssignment;

/**
 * @author ugawari
 *
 */
public class Vehicle {

	private double speed;
	private double direction;
	private String ownerName;
	
	public Vehicle() {
	}
	
	public Vehicle(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getDirection() {
		return direction;
	}
	public void setDirection(double direction) {
		this.direction = direction;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	
}
