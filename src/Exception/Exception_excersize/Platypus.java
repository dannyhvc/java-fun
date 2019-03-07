/*
 * Project Name: Platypus.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/6/2019 | Time: 2:01 PM
 */
package Exception.Exception_excersize;

public class Platypus implements Mammal, LaysEggs
{
//fields
  private String colour;
  private int legs;
  private int eggs;

  //constructor
  private Platypus(String colour, int legs, int eggs)
  {
    this.colour = colour;
    this.legs = legs;
    this.eggs = eggs;
  }//end constructor

  @Override
  public void furColour()
  {
    System.out.println("colour: " + this.colour);
  }//end furColour

  @Override
  public void numberOfLegs()
  {
    System.out.println("Legs: " + this.legs);
  }

  @Override
  public void numberOfEggs()
  {
    System.out.println("Eggs: " + this.eggs);
  }

  public static void main(String[] args)
  {
    Platypus perry = new Platypus("red", 4, 100);
    perry.furColour();
    perry.numberOfLegs();
    perry.numberOfEggs();
  }//end main

}//end Main class
