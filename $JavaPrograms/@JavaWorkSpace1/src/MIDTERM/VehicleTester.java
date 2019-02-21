package MIDTERM;/*
 * Project Name: MIDTERM.VehicleTester.java
 * Purpose: to test the tansport, aerorplane and automobile classes
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/15/2019 | Time: 8:09 PM
 */

public class VehicleTester
{
  public static void main(String[] args)
  {
    //1)//2)//3)
    Transport plane1 = new Aeroplane("Boeing", "787 Dreamliner", "Blue", 125);
    Transport car1 = new Automobile("Toyota","Corolla","Red", 65, 130);

    //4)
    System.out.println(plane1.toString());
    System.out.println(car1.toString());

    //5)
    System.out.println("\n" + plane1.checkSpeed());
    System.out.println(car1.checkSpeed());

    //6)
    Transport plane2 = new Aeroplane("Diamond", "Katana", "white", 50);

    //7)
    System.out.println(plane2.toString());

    //8)
    ((Aeroplane) plane2).setAirborne(true);
    plane2.setForwardSpeed(65);
    System.out.print(plane2.checkSpeed());

    //9)
    System.out.println(plane2.checkSpeed());

  }//end main()
}//end Main class
