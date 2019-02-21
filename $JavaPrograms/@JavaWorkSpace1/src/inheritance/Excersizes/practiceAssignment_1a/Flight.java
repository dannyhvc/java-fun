/*
 * Project Name: Flight.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/8/2019 | Time: 7:00 PM
 */
package inheritance.Excersizes.practiceAssignment_1a;

public class Flight
{
  private int flightNumber;
  private String aircraftType;
  private String departureTime;

  //constructors
  Flight()
  {
  }//end con1
  Flight(int flightNumber, String aircraftType, String departureTime)
  {
    this.flightNumber = flightNumber;
    this.aircraftType = aircraftType;
    this.departureTime = departureTime;
  }//end con2

  //getters
  public int getFlightNumber()
  {
    return flightNumber;
  }
  public String getAricraftType()
  {
    return aircraftType;
  }
  public String getDepartureTime()
  {
    return departureTime;
  }

  //setter
  public void setDepartureTime(String departureTime)
  {
    this.departureTime = departureTime;
  }


}//end Main class
