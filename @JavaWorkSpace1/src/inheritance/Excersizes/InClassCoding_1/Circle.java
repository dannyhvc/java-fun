/*
 * Project Name: Circle.java
 * Purpose: this class is used to find the properties of a circle and give numerical results
 *          depending on the radius and or colour of the circle.
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/1/2019 | Time: 2:02 PM
 */
package inheritance.Excersizes.InClassCoding_1;

public class Circle
{
  //class properties
  private double radius;
  private String colour;
  private final double PI_VAL = Math.PI;

  //constructors
  Circle()
  {
    this.radius = 1.0;
    this.colour = "black";
  }
  Circle(double radius, String  colour)
  {
    this.radius = radius;
    this.colour = colour;
  }

  //getters
  public double getRadius()
  {
    return radius;
  }
  public String getColour()
  {
    return colour;
  }

  //setters
  public void setColour(String colour)
  {
    this.colour = colour;
  }
  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  //a)	Calculate and return the diameter of a Circle object.  (diameter =2r)
  public double calculateDiameter()
  {
    return 2 * radius;
  }//end calculateDiameter()

  //b) Calculate and return the circumference of a Circle object.  (circumference =2πr)
  public double calculateCircumference()
  {
    return 2 * PI_VAL * radius;
  }//end calculateCircumference()

  //c)	Calculate and return the area of a Circle object.  (area =πr^2)
  public double calculateArea()
  {
    return PI_VAL * Math.pow(radius, 2);
  }//end calculateArea()

  //d)	Calculate and return the arc of a piece of a Circle object, given its angle in degrees.
  public double calculateArc(double degrees)
  {
    return calculateCircumference() * (degrees/360);
  }//end calculateArc()

  //e)	Check if a Circle object is equal to another Circle object, that is, if all attributes are equal,
  // and return true or false.
  public boolean equals(Circle circle)
  {
    return this.colour.equals(circle.colour) && (radius == (circle.radius));
  }//end equals()

  //f) creaete a toString method that overrides the super class toString.
  @Override //overrides method in superclass
  public String toString()
  {
    return "Radius: \t" + radius + " \nColour: \t" + colour;
  }//end toString()

  //EXTRA SPICY VERSION.
  public static double calculateCircumference(double radius)
  {
    return 2 * Math.PI * radius;
  }//end calculateCircumference() <-- static spicy version

}//end Main class
