/*
 * Project Name: BankAccount.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/8/2019 | Time: 7:10 PM
 */
package inheritance.Excersizes.practiceAssignment_1b;

public class BankAccount
{
  private int accountNumber;
  private String accountType;
  private double interestRate;
  private double accountBalance;

  //constructors
  BankAccount()
  {
    accountNumber = 0;
    accountType = "savings";
    interestRate = 0.0;
    accountBalance = 0.0;
  }
  BankAccount(int accountNumber, String accountType, double interestRate, double accountBalance)
  {
    this.accountNumber = accountNumber;
    this.accountType = accountType;
    this.interestRate = interestRate;
    this.accountBalance = accountBalance;
  }

  //getter
  public double getAccountBalance()
  {
    return accountBalance;
  }
  public double getInterestRate()
  {
    return interestRate;
  }
  public int getAccountNumber()
  {
    return accountNumber;
  }
  public String getAccountType()
  {
    return accountType;
  }

  public void makeDeposit(double depositAmount)
  {
    this.accountBalance = depositAmount;
  }
}//end Main class
