package Polymorphism.BankExample;

import Polymorphism.BankExample.BankAccount;

/**
	 * Class Name:		CheckingAccount
	 * Purpose:			This is a subclass of bankaccount, it implements the abstract method withdrawal() and has its own method
	 * Coder:			Madhavi
	 * Date:			Jan 29, 2019
*/
public class SavingsAccount extends BankAccount
{

	@Override
	public void withdrawal(double withdrawal) {
		
		double totalWithdrawal = withdrawal * 1.05;
		
		balance -= totalWithdrawal;
	}
	
	public void savingsAccountStatement()
	{
		System.out.println("I am a savings account");
	}
	
	
}
