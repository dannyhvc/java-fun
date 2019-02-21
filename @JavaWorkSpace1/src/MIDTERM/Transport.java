package MIDTERM;/*
 * Project Name: MIDTERM.Transport.java
 * Purpose: abstract class used to create methods and data for automobile and aeroplane classes.
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/15/2019 | Time: 7:36 PM
 */

public abstract class Transport
{
  //properties
  private String vehicleType;
  private String color;
  private boolean isMoving;
  private int forwardSpeed;

  //constructors
  Transport(String vehicleType, String color, int forwardSpeed)
  {
    this.vehicleType = vehicleType;
    this.color = color;
    this.forwardSpeed = forwardSpeed;
  }

  //accessor methods
  public String getVehicleType()
  {
    return vehicleType;
  }
  public String getColor()
  {
    return color;
  }
  public boolean getIsMoving()
  {
    return isMoving;
  }
  public int getForwardSpeed()
  {
    return forwardSpeed;
  }

  //mutator
  public void setForwardSpeed(int forwardSpeed)
  {
    this.forwardSpeed = forwardSpeed;
    if(forwardSpeed > 0)
      isMoving = true;
  }

  /**
   * Method Name: toString()
   * Purpose    : to return the values of the fields of an object
   * Accepts    : nothing
   * Returns    : the Values of the fields in string format
   */
  public String toString()
  {
    return "This vehicle is a(n) " + vehicleType + ", it's color is " + color + ".\n"
    + "Current speed is " + forwardSpeed + ", the in motion state is " + isMoving;//TODO
  }

  /**
   * Method Name: checkSpeed()
   * Purpose    :
   * Accepts    :
   * Returns    :
   */
   protected abstract String checkSpeed();

}//end Main class
