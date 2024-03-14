package Abstraction;

public class ATM implements Bank {
	double balance = 5000;
	
	public void deposite(double amount)
	{
		if(amount >= 100)
		{
			System.out.println("Deposting amount is:"+amount);
			balance += amount;
			System.out.println("Amount has been deposited successfully!");
			
		}
		else
		{
			System.out.println("Insufficient amount,minimum amount to deposit is 100");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount >= 100)
		{
			System.out.println("Withdrawn amount is:"+amount);
			balance -= amount;
			System.out.println("Amount has been successfully withdrwaing:"+amount);
		}
		else
		{
			System.out.println("Insufficient amount,minimum amount to withdraw is 100");
		}
		
	}
		
	public void checkBalance()
	{
		System.out.println("Available Balance is:"+balance);
	}	

}
