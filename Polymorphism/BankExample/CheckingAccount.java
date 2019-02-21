package Polymorphism.BankExample;

import Polymorphism.BankExample.BankAccount;

/**
	 * Class Name:		CheckingAccount
	 * Purpose:			This is a subclass of bankaccount, it implements the abstract method withdrawal() and has its own method
	 * Coder:			Madhavi
	 * Date:			Jan 29, 2019
*/
public class CheckingAccount extends BankAccount
{

	@Override
	public void withdrawal(double withdrawal) {
		
		balance -= withdrawal;
	}
	
	public void checkingAccountStatement()
	{
		System.out.println("I am a checking account");
	}
	
}
