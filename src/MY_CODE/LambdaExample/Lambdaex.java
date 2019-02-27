/*
 * Project Name: Lambdaex.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/27/2019 | Time: 2:10 PM
 */
package MY_CODE.LambdaExample;

public class Lambdaex implements Cloneable
{
  public static void main(String[] args)
  {
    Function function = (s) -> {
      System.out.println("Suckle my balls: " + s);
    };

    function.apply("Fag");
  }//end main

  private interface Function
  {
    void apply(String s);
  }
}//end Main class
