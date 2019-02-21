package MIDTERM;/*
 * Project Name: MIDTERM.Automobile.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/15/2019 | Time: 7:53 PM
 */

public class Automobile extends Transport
{
  //feilds
  private String maker;
  private String model;
  private int initialSpeed;
  private int maxSafeSpeed;
  private int forwardSpeed;

  //constructors
  Automobile(String maker, String model, String color, int initialSpeed, int maxSafeSpeed)
  {
    super(maker, color, initialSpeed);
    this.model = model;
    this.maxSafeSpeed = maxSafeSpeed;
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
  public int getMaxSafeSpeed()
  {
    return maxSafeSpeed;
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
    return super.toString() + "This is a car " + model + " that is made \nby " + maker;//TODO
  }

  /**
   * Method Name: checkSpeed()
   * Purpose    : to return the values of the speed cautions
   * Accepts    : nothing
   * Returns    : the Values of the fields in string format
   */
  @Override
  public String checkSpeed()
  {
    if(initialSpeed % maxSafeSpeed > 0.95 )
      return "Warning: vehicle speed is at safety limits! SLOW DOWN!";
    else
      return "Current car speed is within the safety limits";
  }

}//end Main class
