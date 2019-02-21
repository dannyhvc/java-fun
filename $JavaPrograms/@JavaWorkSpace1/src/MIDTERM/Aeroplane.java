package MIDTERM;/*
 * Project Name: MIDTERM.Aeroplane.java
 * Purpose: creates data based on constructor values for aeroplanes
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/15/2019 | Time: 7:45 PM
 */

public class Aeroplane extends Transport
{
  //fields
  private String maker;
  private String model;
  private boolean isAirborne;
  private int stallSpeed;

  //constructor
  Aeroplane (String maker, String model, String color, int stallSpeed)
  {
    super(maker, color,0);
    this.model = model;
    this.stallSpeed = stallSpeed;
  }

  //getters
  public String getMaker()
  {
    return maker;
  }
  public String getModel()
  {
    return model;
  }
  public boolean getIsAirborne()
  {
    return isAirborne;
  }
  public int getStallSpeed()
  {
    return stallSpeed;
  }

  //setter
  public void setAirborne(boolean airborne)
  {
    isAirborne = airborne;
  }

  /**
   * Method Name: toString()
   * Purpose    : to return the values of the fields of an object
   * Accepts    : nothing
   * Returns    : the Values of the fields in string format
   */
  @Override
  public String toString()
  {
    return  super.toString() + " .This aeroplane is a " + model + " \nthat is made by " + maker;//TODO
  }

  /**
   * Method Name: toString()
   * Purpose    : to return the values of the fields of an object
   * Accepts    : nothing
   * Returns    : the Values of the fields in string format
   */
  @Override
  public String checkSpeed()
  {
    if(isAirborne == false)
      return "MIDTERM.Aeroplane is not airborne at this time.";
    else if (isAirborne == true && getForwardSpeed() <= stallSpeed)
      return "Warning: airspeed is at or below stall speed! Increase speed NOW!";
    else
      return "Current speed is withn safe limits";
  }
}//end Main class
