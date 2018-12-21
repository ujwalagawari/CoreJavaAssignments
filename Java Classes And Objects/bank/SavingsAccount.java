/**
Create a project for Money Money Bank. Money Money Bank is our banking client and they want us to create a solution for their business problem.

MM bank deals with Savings Account, the expectation is, anyone can open savings account in MM bank by just giving their basic info like name, and initial balance.
Every time the account object is created new account number is generated automatically and assigned to the accountNumber instance member, 
no two account object will have same account number.

customers can also open account without balance, which is a Zero balance account.

account has services like withdraw and deposit, anyone having an account object can use these services and on usage accordingly their accountBalance will change.

On printing the reference of an account through S.O.P it should display the account details on the console.

bank also provide a service, getNextAccountNumber() which is a kind of a open service that is open to all the people so,
 that even if a person does not have an account object he/she can still call this function to know what will be the next accountNumber
 if he/she opens an account in MM bank. So, even if their is no account object created yet, we should be able to call getNextAccountNumber().


create multiple account objects and test if it works as per the expectation of our client.

-------------------------------------------------------------------------------------------
Hint for Generating unique account number:-
	1) use of static 
	2) use of Initializers(Self-Study)
		Study about initializers and implement it as per your understanding.
---------------------------------------------------------------------------------------------


Also, Complete the Implementation of the given PaymentGateway class:-


class PaymentGateway
{ 
	//method to transfer the given amount from the src to target account.
	public static boolean transfer(SavingsAccount sender, SavingsAccount reciever, double amount) 
	{
		//If the sender account balance = the given amount then the amount is transferred from the sender to the reciever account and true is returned
		//otherwise false is returned.
	}
}






----------------------------------------
BEST PRACTICE:-
	1) Naming Convention for classes, objects, instance member, methods and local variable must be followed properly.
	2) Comments are mandatory above every classes and every methods.
	3) Code must be properly Indented.
	4) Code must be properly grouped in together with related statements.
	5) reading and displaying of data should only be done in main method.
	6) Make sure you don't repeat any code statements in functions or constructors.
	7) write TestCases for withdraw, deposit and fundTransfer

 */
package assignment.bank;

/**
 * @author ugawari
 *
 */
public class SavingsAccount {
	
	private final int accountNumber;
	private Double balance;
	private String name;
	private static int accountId=1;
	
	{
		accountNumber=accountId++; 
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public SavingsAccount(String name, Double balance) {
		this.name = name;
		this.balance = balance;
		//this.accountNumber = accountId;
	}
	
	public SavingsAccount(String name) {
		this.name = name;
		this.balance = 0.0;
	}

	/**
	 * if amount greater than 0 then add to account 
	 * @param amount
	 */
	public void deposit(double amount) {
		this.balance=(amount>0)?balance+=amount:balance;
	}

	/**
	 * if amount greater than 0 then withdraw amount from account 
	 * but after withdrawing if balance goes to negative then avoid to withdraw
	 * @param amount
	 */
	public void withdraw(double amount) {
		this.balance=(amount>0 && balance>=amount)?balance-amount:balance;
	}

	/**
	 * @return next account number may be this
	 */
	public static int getNextAccountNumber() {
		return accountId;
	}

	public Double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", name=" + name + "]";
	}

	/**
	 * @return balance- to check current balance
	 */
	public double checkCurrentBalance() {
		return balance;
	}
	
	
	
	
	

}
