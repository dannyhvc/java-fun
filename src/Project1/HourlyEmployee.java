package Project1;
/*
 * Project Name: HourlyEmployee.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/14/2019 | Time: 3:16 PM
 */

public class HourlyEmployee extends Employee
{
  //properties
  private double rate;
  private double hours;

  //constructor
  HourlyEmployee(String firstName, String lastName, String sinNumber, double rate, double hours)
  {
    super(firstName, lastName, sinNumber);
    this.rate = rate;
    this.hours = hours;
  }

  //getters
  public double getRate()
  {
    return rate;
  }
  public double getHours()
  {
    return hours;
  }

  //setter
  public void setRate(double rate)
  {
    this.rate = rate;
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
    return rate * hours;
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
    return getEarnings();
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
    return "LastName:: "+ "FirstName: " + "Sin: " +
        "\n" + super.getLastName() + "\t"  + super.getFirstName() + "\t" + super.getSinNumber() +
        "\n" + "This employee's is Hourly rate of $" + rate +
        "\n" + "THis employee's earnings for the month are $" + getEarnings();
  }

}//end Main class
