/**
 * 
 */
package assignment.bank;

/**
 * @author ugawari
 *
 */
public class PaymentGateway {

		//method to transfer the given amount from the src to target account.
		public static boolean transfer(SavingsAccount sender, SavingsAccount reciever, double amount) 
		{
			if(sender.getBalance()>=amount){
				//sender.setBalance(sender.getBalance()-amount); OR
				sender.withdraw(amount);
				//reciever.setBalance(reciever.getBalance()+amount); OR
				reciever.deposit(amount);
				return true;
			}
			//If the sender account balance = the given amount then the amount is transferred from the sender to the reciever account and true is returned
			//otherwise false is returned.
			return false;
		}
}
