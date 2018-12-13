class Hello{
	public static void main(String[] args){
		System.out.println("Addition of two no.s ="+addition(10.55,82));
		System.out.println("Substraction of two no.s ="+substract(55.26,25));
		System.out.println("Multiplication of two no.s ="+multiply(65,2));
		System.out.println("Devision of two no.s ="+devide(10,3));
	}
	
	public static void display(){
		System.out.println("This");
	}

	public static double addition(double number1, double number2){
		return number1+number2;
	}

	public static double substract(double number1, double number2){
		return number1-number2;
	}

	public static double multiply(double number1, double number2){
		return number1*number2;
	}
	
	public static double devide(double number1, double number2){
		return number1/number2;
	}


}