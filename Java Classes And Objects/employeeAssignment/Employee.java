/**
 * Attributes:
	Id
	name
	monthlyBasic
Behaviours/Interfaces/Services: 
	getAnnualBasic() //(return 12 * monthlyBasic;)
	getMonthlyGrossSalary()//(monthlyBasic + hra + medical + conveyance)
	getAnnualGrossSalary() //(12 * MonthlyGrossSalary)
	getMonthlyDeductions() //(pf + esic + profTax)
	getMonthlyTakeHome() //(MonthlyGrossSalary- MonthlyDeductions)
	getAnnualTakeHome() //(12 * MonthlyTakeHome)
	setPFRate(float f)  and getPFRate()


HRA = 50% of basic, medical allowance = Rs 1250, conveyance allowance = Rs 800
PF = 10% of  monthly basic or 6500 whichever is lower.
ESIC = 4.75% of monthly basic if monthly basic <= 5000
professional tax: if monthly gross <= 10000 then Rs 50, else Rs 100
 */
package employeeAssignment;

/**
 * @author ugawari
 *
 */
public class Employee {

	private int employeeId;
	private String employeeName;
	private double monthlyBasic;
	
	private double hra;
	private static final int MEDICAL=1250;//for all object having same and not change
	private static final int CONVEYANCE=800;//for all object having same and not change
	private static float pfRate=10f;//for all object having same 
	private static float esicRate=4.75f;//for all object having same 
	private int profTax;
	private double pf;
	private double esic;
	
	/**
	 * parameterized constructor
	 * @param employeeId
	 * @param employeeName
	 * @param monthlyBasic
	 */
	public Employee(int employeeId, String employeeName, double monthlyBasic) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthlyBasic = monthlyBasic;
	}
	
	
	/**
	 * no-argument Constructor
	 */
	public Employee() {
		super();
	}

	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public static float getPfRate() {
		return pfRate;
	}
	public static void setPfRate(float pfRate) {
		Employee.pfRate = pfRate;
	}
	public static float getEsicRate() {
		return esicRate;
	}
	public static void setEsicRate(float esicRate) {
		Employee.esicRate = esicRate;
	}
	public int getProfTax() {
		return profTax;
	}
	public void setProfTax(int profTax) {
		this.profTax = profTax;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public double getMonthlyBasic() {
		return monthlyBasic;
	}
	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	
	/**
	 * to get annual ctc
	 * @return annual salary
	 */
	public double getAnnualBasic(){
		return (monthlyBasic>0 ? 12 * monthlyBasic : 0) ;//if monthly salary is less than 0 return 0 
	}
	
	/**
	 * @return Monthly Gross Salary
	 */
	public double getMonthlyGrossSalary(){
		hra=50*monthlyBasic/100;
		return (monthlyBasic>0 ? monthlyBasic+hra+MEDICAL+CONVEYANCE : 0);//if monthly salary is less than 0 return 0 
	}
	
	/**
	 * @return Annual Gross Salary of monthly gross salary
	 */
	public double getAnnualGrossSalary(){
		return 12*getMonthlyGrossSalary();
	}
	
	/**
	 * To get total monthly deduction of actual monthly basic
	 * @return
	 */
	public double getMonthlyDeductions(){
		if(monthlyBasic>0){//if monthly salary is less than 0 return 0 
			pf = (pfRate*monthlyBasic/100>6500) ? 6500 : 10*monthlyBasic/100;
			esic = (monthlyBasic<=5000) ? monthlyBasic*esicRate/100 : 0;
			profTax = (getMonthlyGrossSalary()<=10000) ? 50 : 100;
		}
		return (pf + esic + profTax);
	}
	
	/**
	 * @return Monthly Take Home by subtracting deduction from gross salary
	 */
	public double getMonthlyTakeHome(){
		return getMonthlyGrossSalary()-getMonthlyDeductions();
	}
	
	/**
	 * @return Annual Take Home
	 */
	public double getAnnualTakeHome(){
		return getMonthlyTakeHome()*12;
	}
	
	
	
}
