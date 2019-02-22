package Project1;
/*
 * Project Name: SalPlusCommEmployee.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/14/2019 | Time: 3:18 PM
 */

public class SalPlusCommEmployee extends CommissionEmployee
{
  //properties
  private double baseSalary;

  //constructor
  SalPlusCommEmployee(String firstName, String lastName, String sinNumber, double baseSalary)
  {
    super(firstName, lastName, sinNumber);
    this .baseSalary = baseSalary;
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
  @Override
  public double getEarnings()
  {
    return super.getEarnings();
  }

  /**
   * Method Name: toString()
   * Purpose    :
   * Accepts    :
   * Returns    :
   */ //***TODO TAYLOR
  @Override
  public String toString()
  {
    return "firstName: "+ super.getFirstName() + " lastName: "+ super.getLastName() +
        " sinNumber: "+super.getSinNumber();
  }
}//end Main class
