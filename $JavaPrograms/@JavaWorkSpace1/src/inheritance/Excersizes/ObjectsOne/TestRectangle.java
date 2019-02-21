/*
 * Project Name: TestRectangle.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/11/2019 | Time: 2:54 PM
 */
package inheritance.Excersizes.ObjectsOne;

public class TestRectangle
{
  public static void main(String[] args)
  {
    Rectangle rectangle1 = new Rectangle();

    //prints the attribute in rectangle class.
    System.out.println("length: " + rectangle1.length + " ,width: " + rectangle1.width);

    //prints the area of the rectangle.
    rectangle1.findArea();

  }
}//end Main class
