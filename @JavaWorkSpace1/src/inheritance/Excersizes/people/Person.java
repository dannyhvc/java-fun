/*
 * Project Name: Person.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/18/2019 | Time: 3:21 PM
 */
package inheritance.Excersizes.people;

public class Person
{
  protected String name;
  protected int ID;

  //constructor
  Person(String name, int ID)
  {
    this.name = name;
    this.ID = ID;
  }//end constructor

  public void setName(String name)
  {
    this.name = name;
  }//end setName
  public String getName()
  {
    return name;
  }//end getName

  public void setID(int ID)
  {
    this.ID = ID;
  }//end setID
  public int getID()
  {
    return ID;
  }//end getID
}//end Main class
