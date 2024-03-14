package Abstraction;

import java.util.Scanner;

public class BankDriver {
	
	public static void display()
	{
		System.out.println("*********************Welcome to BOI************************");
		System.out.println("Enter 1 for Deposite");
		System.out.println("Enter 2 for Withdraw");
		System.out.println("Enter 3 for CheckBalance");
		System.out.println("Enter 4 for Exit");
		System.out.println("**********************************************************");
		
	}
	
	public static void main(String args[])
	
	{
		Bank b = new ATM();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			
			display();
			System.out.println();
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice)
			{
			
			case 1:
			{
				System.out.println("Amount to be Deposite");
				double amount = sc.nextDouble();
				b.deposite(amount);
			}
			break;
			
			case 2:
			{
				System.out.println("Amount to be withdrawn");
				double amount = sc.nextDouble();
				b.withdraw(amount);
			}
			break;
				
				
			case 3:
			{
				b.checkBalance();
			}
			break;
				
				
			case 4:
			{
				System.out.println("Thank you visit again soon....!!");
				flag = false;
			}
			break;
			default:
			{
				System.out.println("Invalid Choice");
			}

			
			}
			
		}
		
		
		
		
	}

}
