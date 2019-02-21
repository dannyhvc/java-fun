/*
 * Project Name: Teacher.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/18/2019 | Time: 3:26 PM
 */
package inheritance.Excersizes.people;

public class Teacher extends Person
{
  Teacher(String name, int ID)
  {
    super(name, ID);
  }//end constructor

  public String toSting()
  {
    return "Teacher:\n" + "Name - " + name+"\n" + "ID - " + ID+"\n";
  }//end toString

}//end Main class
