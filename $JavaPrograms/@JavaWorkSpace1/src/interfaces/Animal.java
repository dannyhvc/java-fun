/*
 * Project Name: Animal.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/8/2019 | Time: 2:41 PM
 */
package interfaces;

public interface Animal
{
  //all methods in interfaces are PUBLIC, STATIC, OR FINAL by default.
  //they are useful because you can implement multiple interfaces but you can
  //only implement one class.

  void eat();
  void travel();

  //if static then it cannot be overridden
  default void sit()
  {
    System.out.println("sit");
  }
}//end Main class
