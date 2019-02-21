/*
 * Project Name: RectangleTest.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/30/2019 | Time: 6:01 PM
 */
package inheritance.Excersizes.practice_inclassCoding1;

public class RectangleTest
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Rectangle tester!");
    System.out.println(
        "----------------------------------------------------------------------------------------------------");
    System.out.println(
        "This program will instantiate objects of Rectangle and test all of the methods of the Rectangle class.");
    System.out.println(
        "----------------------------------------------------------------------------------------------------");

    //declaring objs
    Rectangle rectangle1 = new Rectangle();
    Rectangle rectangle2 = new Rectangle(3.5,4.9,"Red");
    Rectangle rectangle3 = new Rectangle(6.8);

    //tests the getter methods using
    System.out.println("For rectangle1 length of base is:   " + rectangle1.getLength());
    System.out.println("For rectangle1 length of side 1 is: " + rectangle1.getWidth());
    System.out.println("For rectangle1 colour of side 2 is: " + rectangle1.getColour() + "\n");

    //test the toString() method on rectangle2.
    System.out.println("Rectangle2:");
    System.out.println(rectangle2.toString() + "\n");

    //test the toString() method on rectangle3.
    System.out.println("Rectangle3:");
    System.out.println(rectangle3.toString() + "\n");

    //testing setter for rectangle1
    rectangle1.setLength(15.5);
    rectangle1.setWidth(15.5);
    rectangle1.setColour("Green");
    System.out.println("Rectangle1:");
    System.out.println(rectangle1.toString() + "\n");

    //test utility methods for rectangle2
    System.out.format("Perimeter: %.1fl\n" ,rectangle2.calculatePerimeter());
    System.out.format("Area: %.1fl\n\n" ,rectangle2.calculateArea());

    System.out.println("The doubled version of Rectangle2 is:");
    rectangle2.doubleRectanle(rectangle2);
    System.out.println(rectangle2.toString() + "\n");

    //testing to see if rectangle1 is a square.
    System.out.println("Is rectangle1 a square: " + rectangle1.isSquare(rectangle1));

  }//end psvm()
}//end Main class
