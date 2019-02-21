/*
 * Project Name: Animal.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/18/2019 | Time: 2:11 PM
 */
package inheritance.Animals2;

public class Animal
{
  protected String name;

  Animal(String name)
  {
    this.name = name;
  }
  Animal()
  {

  }

  @Override //Runs to the most direct superclass
  public String toString()
  {
    return "Name: " +  name;
  }

}//end Main class
