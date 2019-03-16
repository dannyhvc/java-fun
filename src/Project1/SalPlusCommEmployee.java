/*
 * Project Name: SalPlusCommEmployee.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/14/2019 | Time: 3:18 PM
 */

package Project1;

public class SalPlusCommEmployee extends CommissionEmployee
{
  //properties
  private double baseSalary;

  //constructor
  SalPlusCommEmployee(
      String firstName, String lastName, String sinNumber, double baseSalary, double commRate, double salesMade)
  {
    super(firstName, lastName, sinNumber, commRate, salesMade);
    this.baseSalary = baseSalary;
  }

  //getters
  public double getBaseSalary()
  {
    return baseSalary;
  }

  //setters
  public void setBaseSalary(double baseSalary)
  {
    this.baseSalary = baseSalary;
  }

  /**
   * Method Name: getEarnings()
   * Purpose    :
   * Accepts    :
   * Returns    :
   */ //***TODO TAYLOR
  public double getEarnings()
  {
    return baseSalary * super.getEarnings();
  }

  /**
   * Method Name: getEarnings()
   * Purpose    :
   * Accepts    :
   * Returns    :
   */ //***TODO TAYLOR
  Payable generatePaymemntAmount = this::getEarnings;

  /**
   * Method Name: toString()
   * Purpose    :
   * Accepts    :
   * Returns    :
   */ //***TODO TAYLOR
  @Override
  public String toString()
  {
    return "LastName:: "+ "FirstName: " + "Sin: " +
        "\n" + super.getLastName() + "\t"  + super.getFirstName() + "\t" + super.getSinNumber() +
        "\n" + "This employee is commission employee with a commission rate of " + super.getCommRate() + "%" +
        "\n" + "THis employee's earnings for the month are " + getEarnings() + "+ on sales of $" + super.getSalesMade();
  }//end to string

}//end Main class
