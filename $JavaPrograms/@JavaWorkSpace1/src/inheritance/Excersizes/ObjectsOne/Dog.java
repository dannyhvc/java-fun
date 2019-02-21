/*
 * Project Name: Dog.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/11/2019 | Time: 2:59 PM
 */
package inheritance.Excersizes.ObjectsOne;

public class Dog
{
  //properties
  private int age = 10;

  //age getter.
  public int getAge()
  {
    return age;
  }

  //sets the object instance property value from default (10) to the property default value (10) times 2.
  public void doubleAge()
  {
    this.age = age*2;
  }


}//end Main class
