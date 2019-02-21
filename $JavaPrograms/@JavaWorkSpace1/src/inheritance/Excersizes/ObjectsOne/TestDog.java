/*
 * Project Name: TestDog.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/11/2019 | Time: 3:03 PM
 */
package inheritance.Excersizes.ObjectsOne;

public class TestDog
{
  public static void main(String[] args)
  {
    Dog dog1 = new Dog();

    //prints values of Dog class age property.
    System.out.println("Default age: " + dog1.getAge());

    //setting the new age that gets doubled.
    dog1.doubleAge();
    System.out.println("Default age doubled: " + dog1.getAge());;
  }
}//end Main class
