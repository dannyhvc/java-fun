/*
 * Project Name: Staff.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/18/2019 | Time: 2:57 PM
 */
package inheritance.Persons;

public class Staff extends Person
{
  private String school;
  private double pay;


  Staff(String name, String address, String school, double pay)
  {
    super(name, address);
    this.school = school;
    this.pay = pay;
  }

  public void setSchool(String school)
  {
    this.school = school;
  }

  public void setPay(double pay)
  {
    this.pay = pay;
  }

  public double getPay()
  {
    return pay;
  }

  public String getSchool()
  {
    return school;
  }


}//end Main class
