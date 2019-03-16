package Project1;
/*
 * Project Name: CommissionEmployee.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/14/2019 | Time: 3:16 PM
 */

public class CommissionEmployee extends Employee
{
  //properties
  private double commRate;
  private double salesMade;

  CommissionEmployee(String firstName, String lastName, String sinNumber, double commRate, double salesMade)
  {
    super(firstName, lastName, sinNumber);
    this.commRate = commRate;
    this.salesMade = salesMade;
  }

  //getter
  public double getCommRate()
  {
    return commRate;
  }
  public double getSalesMade()
  {
    return salesMade;
  }

  //setter
  public void setCommRate(double commRate)
  {
    this.commRate = commRate;
  }
  public void setSalesMade(double salesMade)
  {
    this.salesMade = salesMade;
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
    return (commRate/100) * salesMade;
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
        "\n" + "This employee is commission employee with a commission rate of " + commRate + "%" +
        "\n" + "THis employee's earnings for the month are " + getEarnings() + "+ on sales of $" + salesMade;
  }
}//end Main class