package Project1;
/*
 * Project Name: SalariedEmployee.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/14/2019 | Time: 3:12 PM
 */

public class SalariedEmployee extends Employee
{
  //properties
  private double Salary;

  //constructor
  SalariedEmployee(String firstName, String lastName, String sinNumber, double Salary)
  {
    super(firstName, lastName, sinNumber);
    this.Salary = Salary;
  }

  //getter
  public double getSalary()
  {
    return Salary;
  }

  //setter
  public void setSalary(double salary)
  {
    Salary = salary;
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
    return 0;
  }

  /**
   * Method Name: generatePaymentAmount()
   * Purpose    :
   * Accepts    :
   * Returns    :
   */ //***TODO TAYLOR
  @Override
  public double generatePaymentAmount()
  {
    return 0;
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
