package Polymorphism.BankExample;

import Polymorphism.BankExample.BankAccount;
import Polymorphism.BankExample.CheckingAccount;
import Polymorphism.BankExample.SavingsAccount;

import java.util.ArrayList;

public class TestAccounts {
	
	public static void main(String[] args)
	{
		//Note that I can store checkingaccounts and savingsaccounts in this arraylist, since theyre both subclasses of bankaccount
		//I can also do this with ANY object if the arraylist stores Objects, instead of BankAccounts
		ArrayList<BankAccount> accounts = new ArrayList<>();
		
		//I'm creating anonymous objects here
		accounts.add(new CheckingAccount());
		accounts.add(new SavingsAccount());
		
		//If I want to use methods that are defined in checkinaccount/savings account and not in bankaccount, I'll have to cast these bankaccount objects into checkingaccount/savingsaccount objects
		CheckingAccount caccount = (CheckingAccount) accounts.get(0);
		SavingsAccount saccount = (SavingsAccount) accounts.get(1);
		
		BankAccount caccount2 = accounts.get(0);
		
		//Otherwise, I can't access methods like checkingAccountStatement, since caccount2 is a bank account
		//caccount2.checkingAccountStatement();
		
		caccount.checkingAccountStatement();
	}
}
