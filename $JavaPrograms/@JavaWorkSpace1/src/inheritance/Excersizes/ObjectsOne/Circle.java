/*
 * Project Name: Circle.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/11/2019 | Time: 2:44 PM
 */
package inheritance.Excersizes.ObjectsOne;

public class Circle
{
  public int radius = 3;

  public void calcCricleArea()
  {
    System.out.println("Area = " + Math.pow(this.radius, 2) * Math.PI);
  }

}//end Main class
