/*
 * Project Name: CommissionEmployee.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/14/2019 | Time: 3:16 PM
 */
package Project1;

public class CommissionEmployee extends Employee
{
  //properties
  private double commRate;
  private double salesMade;

  CommissionEmployee(String firstName, String lastName, String sinNumber)
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