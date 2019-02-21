/*
 * Project Name: CircleTester.java
 * Purpose: This class is used to test the Circle.java class and print the results
 *          using various objects and instances to test the different methods of the class.
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/1/2019 | Time: 2:02 PM
 */
package inheritance.Excersizes.InClassCoding_1;

public class CircleTester
{
  public static void main(String[] args)
  {
    //1.	Print a short notice to the screen that this program will test all the methods of the Circle class.
    System.out.println("Welcome to the Circle tester!");
    System.out.println(
        "----------------------------------------------------------------------------------------------------");
    System.out.println(
        "This program will instantiate objects of Circle and test all of the methods of the Circle class.");
    System.out.println(
        "----------------------------------------------------------------------------------------------------");

    //2.	Create a Circle object called circle1 using the no-arg constructor.
    Circle circle1 = new Circle();

    //test output.
    //3.	Test all the getter methods on circle1 using System.out.println() statements.
    System.out.println("For circle1 radius is " + circle1.getRadius());
    System.out.println("For circle1 colour is " + circle1.getColour() + "\n");

    //4.	Create a second Circle object called circle2 using the 2-arg constructor.  Set values 5.5 for the radius,
    // and set the colour to “red”.
    Circle circle2 = new Circle(5.5, "red");

    //5.	Test the toString() method to print circle2 to the screen.
    System.out.println("Circle2:\n" + circle2.toString() + "\n");

    //6.	Test all the setter methods on circle1, and change its radius to 15.5 and its colour to “green”.
    circle1.setRadius(15.5);
    circle1.setColour("green");

    //7.	Use the toString() method to print the modified version of circle1 to the screen.
    System.out.println("Testing setter methods on circle1.");
    System.out.println("Circle1:\n" + circle1.toString() + "\n");

    //8.	Using both circle1 and circle2, test the utility methods, and print the results to the screen.
    // Pass an argument of 35 degrees for both objects for the calculateArc() method.
    System.out.println("For circle1 the diameter is: " + circle1.calculateDiameter());
    System.out.println("For circle2 the diameter is: " + circle2.calculateDiameter() + "\n");

    System.out.println("For circle1 the circumference is: " + circle1.calculateCircumference());
    System.out.println("For circle2 the circumference is: " + circle2.calculateCircumference() + "\n");

    System.out.println("For circle1 the area is: " + circle1.calculateArea());
    System.out.println("For circle2 the area is: " + circle2.calculateArea() + "\n");

    System.out.println(
        "For circle1 the arc of a slice with an angle of 35 degrees is: " + circle1.calculateArc(35.0));
    System.out.println(
        "For circle2 the arc of a slice with an angle of 35 degrees is: " + circle2.calculateArc(35.0) + "\n");

    //9.	Re-set the radius for circle2 to 15.5.  Test the equals method again!
    circle2.setRadius(15.5);
    System.out.println("Is circle1 equal to circle2? " + circle1.equals(circle2) + "\n");

    //Spice it up if you are up to the challenge . . .
    double radius = 7.5;
    double circumference = Circle.calculateCircumference(radius);
    System.out.println("For a circle with a radius of " + radius + " the circumference is: " + circumference);

  }//end main()
}//end Main class
