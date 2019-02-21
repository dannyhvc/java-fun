/*
 * Project Name: Mammal.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/8/2019 | Time: 2:42 PM
 */
package interfaces;

public class Mammal implements Animal
{

  @Override
  public void eat()
  {
    System.out.println("Eating like a mammal");
  }

  @Override
  public void travel()
  {
    System.out.println("Traveling like a mammal");
  }
}//end Main class
