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
    //1) Create an array called testArray of an appropriate type that can hold any type of Employee or an Invoice
    //    and size it to 10 elements.
    Payable[] testArray = new Payable[10];

    //2) You will also be creating two Invoice objects and then you are going to instantiate four workers,
    //employee1, employee2, and employee3, and employee4. Each employee will be one of the four different
    //types.
    testArray[0] =
        new Invoice("Feb0001","AW234","Widget",25,2.99);
    testArray[1] =
        new Invoice("Feb0002", "AF235","Flange", 125, 3.37);

   testArray[2] =
       new SalariedEmployee("Diana", "Orr","111-111-111", 49378.98);
   Payable employe1 = testArray[2];

   testArray[3] =
       new CommissionEmployee
           ("David", "Kim" ,"222-222-222,", 12.5, 49378.98);
   Payable employe2 = testArray[3];

   testArray[4] =
       new SalPlusCommEmployee(
           "Ken","Bonvanie","333-333-333",500, 8.5, 997);
   Payable employe3 = testArray[4];


   testArray[5] =
       new HourlyEmployee("Jane","Robertson","444-444-444",17.85,87.5);
   Payable employe4 = testArray[5];

    System.out.println(testArray[0].toString() + "\n");
    System.out.println(testArray[1].toString() + "\n");

    System.out.println(employe1.toString());
    System.out.println("Payment amount generated is " + employe1.generatePaymentAmount() + "\n");

    System.out.println(employe2.toString());
    System.out.println("Payment amount generated is " + employe2.generatePaymentAmount() + "\n");

    System.out.println(employe3.toString());
    System.out.println("Payment amount generated is " + employe3.generatePaymentAmount() + "\n");

    System.out.println(employe4.toString());
    System.out.println("Payment amount generated is " + employe4.generatePaymentAmount() + "\n");

  }//end main()
}//end Main class
