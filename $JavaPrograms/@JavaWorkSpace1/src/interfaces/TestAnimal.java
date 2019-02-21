/*
 * Project Name: TestAnimal.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/8/2019 | Time: 2:58 PM
 */
package interfaces;

public class TestAnimal
{
  public static void main(String[] args)
  {
    Mammal m = new Mammal();
    m.eat();
    m.sit();

    //cant instantiate an interface because they do not have method bodies.
    Animal a = new Mammal();
  }

}//end Main class
