/*
 * Project Name: Person.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/18/2019 | Time: 2:57 PM
 */
package inheritance.Persons;

public class Person
{
  protected String name;
  protected String address;

  Person(String name, String address)
  {
    this.name = name;
    this.address = address;
  }

  public String getAddress()
  {
    return address;
  }
  public void setAddress(String address)
  {
    this.address = address;
  }

  public String getName()
  {
      return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
}//end Main class
