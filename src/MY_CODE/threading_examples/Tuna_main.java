/*
 * Project Name: Tuna_main.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/14/2019 | Time: 6:41 PM
 */
package MY_CODE.threading_examples;

public class Tuna_main
{
  public static void main(String[] args)
  {
    //making objects
    Tuna fish1 = new Tuna("t_1", 500);
    Tuna fish2 = new Tuna("t_2", 1000);
    Shark tiger1 = new Shark("s_1", 500);

    //making threads
    Thread t1 = new Thread(fish1);
    t1 = new Thread(fish2);
    Thread t2 = new Thread(tiger1);

    //starting threads
    t1.start();
    t2.start();

  }//end main

}//end Main class
