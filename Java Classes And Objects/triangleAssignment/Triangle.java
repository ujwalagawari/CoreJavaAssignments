package triangleAssignment;

/**
 * @author ugawari
 *
 */
public class Triangle {

	private int hypotenuse;
	private int adjusent;
	private int opposite;
	private boolean result=false; 	//not given access to outside so not created getter and setter
	private String triangleType;	//not given access to outside so not created getter and setter
	
	public int getHypotenuse() {
		return hypotenuse;
	}
	public void setHypotenuse(int hypotenuse) {
		this.hypotenuse = hypotenuse;
	}
	public int getAdjusent() {
		return adjusent;
	}
	public void setAdjusent(int adjusent) {
		this.adjusent = adjusent;
	}
	public int getOpposite() {
		return opposite;
	}
	public void setOpposite(int opposite) {
		this.opposite = opposite;
	}
	
	
	public Triangle(int hypotenuse, int adjusent, int opposite) {
		super();
		this.hypotenuse = hypotenuse;
		this.adjusent = adjusent;
		this.opposite = opposite;
	}
	
	@Override
	public String toString() {
		return "Triangle [hypotenuse=" + hypotenuse + ", adjusent=" + adjusent
				+ ", opposite=" + opposite + "]";
	}
	
	/**
	 * To check given triangle is right angle or not
	 * @return
	 */
	public boolean isRight(){
		if(hypotenuse>adjusent && hypotenuse>opposite){
			if(hypotenuse*hypotenuse==adjusent*adjusent+opposite*opposite)
				result=true;
		}else if(adjusent>hypotenuse && adjusent>opposite){
			if(adjusent*adjusent==hypotenuse*hypotenuse+opposite*opposite)
				result =true;
		}else if(opposite>adjusent && opposite>hypotenuse){
			if(opposite*opposite==adjusent*adjusent+hypotenuse*hypotenuse)
				result=true;
		}
		return result;
	}
	
	/**
	 * To check given triangle is Scalene or not
	 * @return
	 */
	public boolean isScalene(){
		if(hypotenuse!=adjusent && hypotenuse!=opposite && adjusent!=opposite){
			result=true;
		}
		return result;
	}
	
	/**
	 * To check given triangle is Isosceles or not
	 * @return
	 */
	public boolean isIsosceles(){
		if(hypotenuse==adjusent && hypotenuse!=opposite){
			result=true;
		}else if(opposite==adjusent && hypotenuse!=opposite){
			result=true;
		}else if(hypotenuse==opposite && adjusent!=opposite){
			result=true;
		}
		return result;
	}
	
	/**
	 * To check given triangle is Equilateral or not
	 * @return
	 */
	public boolean isEquilateral(){
		if(hypotenuse==adjusent && hypotenuse==opposite){
				result=true;
		}
		return result;
	}
	
	
	/**
	 * check Triangle Type from isRight, isScalene, isIsosceles, isEquilateral methods
	 * @return triangle type
	 */
	public String checkTriangleType(){
		if(isRight()){
			triangleType="Right";
		}else if(isScalene()){
			triangleType="Scalene";
		}else if(isIsosceles()){
			triangleType="Isosceles";
		}else if(isEquilateral()){
			triangleType="Equilateral";
		}
		return triangleType;
	}
	
}
