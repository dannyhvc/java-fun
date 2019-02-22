package Project1;
/*
 * Project Name: D_H_TestPayment1..java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/14/2019 | Time: 4:59 PM
 */

public class D_H_TestPayment1
{
  public static void main(String[] args)
  {
    Payable[] testArray = new Payable[10];

    //initializing objs in the array.
    testArray[0] = new Invoice("Feb0001","AW234","Widget",25,2.99);
    testArray[1] =
        new Invoice("Feb0002", "AF235","Flange", 125, 3.37);

    System.out.println(testArray[0].toString());
    System.out.println(testArray[1].toString());



  }//end main()
}//end Main class
