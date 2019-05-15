/*
 * Project Name: Shark.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/14/2019 | Time: 6:58 PM
 */
package Year_1.MY_CODE.threading_examples;

import java.util.Random;
import java.util.Scanner;

public class Shark implements Runnable
{
  //FIELDS --------------------
  private String name;
  private int time;
  Random r = new Random();
  private Scanner scanner = new Scanner(System.in);

  //CONSTRUCTORS --------------
  Shark(String n)
  {
    name = n;
    time = r.nextInt(999);
  }
  Shark(String n, int t)
  {
    this.name = n;
    this.time = t;
  }

  //PROPERTIES -----------------
  //mutator's
  public String getName()
  {
    return name;
  }
  public int getTime()
  {
    return time;
  }

  //accessor's
  public void setName(String name)
  {
    this.name = name;
  }
  public void setTime(int time)
  {
    this.time = time;
  }

  @Override
  public void run()
  {
    try
    {
      //TODO code that will always run in here for the thread
      for (;;)
      {
        int nothing = scanner.nextInt();
        System.out.printf("%s is sleeping for %d --> nothing= %d\n", name, time, nothing);
      }
    }
    catch (Exception e)
    {
      System.out.println("YUH");
    }//end try

  }//end run()

}//end Main class
