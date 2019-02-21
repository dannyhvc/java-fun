package Polymorphism.BankExample;

/**
 * Class Name:		BankAccount
 * Purpose:			This is an abstract superclass of CheckingAccount and SavingsAccount
 * Coder:			Madhavi
 * Date:			Jan 29, 2019
 */
abstract public class BankAccount
{

  String owner;
  double balance;

//This is an example of a javadoc comment. If you click project>generate javadoc it'll generate some html files that display this info
  /**
   * Name: Deposit
   * @param deposit The balance will get updated with this amount
   */
  public void deposit(double deposit)
  {
    this.balance = deposit;
  }

  //Notice that this is an abstract method, this means that
  //1. I can't instantiate an object of bankaccount type
  //2. Any subclass of bankaccount has to "implement" (i.e. write the body of) this method
  abstract public void withdrawal(double withdrawal);
}