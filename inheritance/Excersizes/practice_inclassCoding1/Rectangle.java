/*
 * Project Name: Rectangle.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/30/2019 | Time: 6:00 PM
 */
package inheritance.Excersizes.practice_inclassCoding1;

public class Rectangle
{
  private double length;
  private double width;
  private String colour;

  //constructors
  public Rectangle()
  {
    this.length = 1.0;
    this.width = 1.0;
    this.colour = "Black";
  }
  public Rectangle(double length, double width, String colour)
  {
    this.length = length;
    this.width = width;
    this.colour = colour;
  }
  public Rectangle(double side)
  {
    this.colour = "Yellow";
    this.length = side;
    this.width = side;
  }

  //getters
  public double getLength()
  {
    return length;
  }
  public double getWidth()
  {
    return width;
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
  public void setLength(double length)
  {
    this.length = length;
  }
  public void setWidth(double width)
  {
    this.width = width;
  }

  public double calculatePerimeter()
  {
    return 2 * (length + width);
  }
  public double calculateArea()
  {
    return length * width;
  }
  public Rectangle doubleRectanle(Rectangle rectangle)
  {
    this.width = rectangle.width * 2;
    this.length = rectangle.length * 2;
    return rectangle;
  }
  public boolean isSquare(Rectangle rectangle)
  {
    return rectangle.length == rectangle.width;
  }

  @Override
  public String toString()
  {
    return "length: \t" + length + " \nWidth: \t\t" + width + " \nColour: \t" + colour;
  }

  public boolean equals(Rectangle rectangle)
  {
    return this.colour.equals(rectangle.colour) && (width == (rectangle.width) && (length == (rectangle.length)));
  }

}//end Main class
