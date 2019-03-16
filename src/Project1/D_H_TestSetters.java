/*
 * Project Name: D_H_TestSetters.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/11/2019 | Time: 7:45 PM
 */
package Project1;

public class D_H_TestSetters
{
  public static void main(String[] args)
  {
    //5) declaring all the employee types.
    SalariedEmployee orr =
        new SalariedEmployee("Diana", "Orr", "111-111-111", 49378.98);
    CommissionEmployee Kim =
        new CommissionEmployee("David", "Kim", "222-222-222,", 12.5, 3950);
    SalPlusCommEmployee Bonvanie =
        new SalPlusCommEmployee(
            "Ken", "Bonvanie", "333-333-333", 500, 8.5, 997);
    HourlyEmployee Robertson =
        new HourlyEmployee("Jane", "Robertson", "444-444-444", 17.85, 87.5);

    //6)
    System.out.println("getEarnings amount generated is " + orr.getEarnings() + "\n");
    System.out.println("getEarnings amount generated is " + Kim.getEarnings() + "\n");
    System.out.println("getEarnings amount generated is " + Bonvanie.getEarnings() + "\n");
    System.out.println("getEarnings amount generated is " + Robertson.getEarnings() + "\n");

    orr.setSalary(2875.95);
    orr.setLastName("Iron-Orr");

    Kim.setSalesMade(67875.56);
    Kim.setCommRate(15);

    Bonvanie.setSalesMade(32579.59);
    Bonvanie.setBaseSalary(200);

    Robertson.setRate(18.65);

    //7)
    System.out.println("getEarnings amount generated is " + orr.getEarnings() + "\n");
    System.out.println("getEarnings amount generated is " + Kim.getEarnings() + "\n");
    System.out.println("getEarnings amount generated is " + Bonvanie.getEarnings() + "\n");
    System.out.println("getEarnings amount generated is " + Robertson.getEarnings() + "\n");

    //8)
    System.out.println(orr.toString() + "\n");
    System.out.println(Kim.toString() + "\n");
    System.out.println(Bonvanie.toString() + "\n");
    System.out.println(Robertson.toString() + "\n");

  }//end main

}//end Main class
