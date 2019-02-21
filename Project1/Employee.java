/*
 * Project Name: Employee.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/14/2019 | Time: 3:15 PM
 */
package Project1;

public abstract class Employee implements Payable
{
  //properties
  private String firstName;
  private String lastName;
  private String sinNumber;

  //constructors
  Employee(String firstName, String lastName, String sinNumber)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.sinNumber = sinNumber;
  }

  //getters
  public String getFirstName()
  {
    return firstName;
  }
  public String getLastName()
  {
    return lastName;
  }
  public String getSinNumber()
  {
    return sinNumber;
  }

  //setter
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  /**
   * Method Name: getEarnings()
   * Purpose    :
   * Accepts    :
   * Returns    :
   */ //***TODO TAYLOR
  abstract public double getEarnings();

  /**
   * Method Name: toString()
   * Purpose    :
   * Accepts    :
   * Returns    :
   */ //***TODO TAYLOR
  @Override
  public String toString()
  {
    return "firstName: "+firstName + " lastName: "+lastName + " sinNumber: "+sinNumber;
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
}//end Main class
