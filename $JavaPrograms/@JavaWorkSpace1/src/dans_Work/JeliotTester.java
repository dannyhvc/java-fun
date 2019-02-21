/*
 * Project Name: JeliotTester.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/12/2019 | Time: 2:30 PM
 */
package dans_Work;
import java.util.Scanner;

public class JeliotTester
{
  public static void main(String[] args)
  {
    //create ThisClass object
    ThisClass thisClass1 = new ThisClass();

    //get current constructor properties;
    printer(thisClass1);

    //set new properties according to the input;
    System.out.print("\nset eNum: ");
    thisClass1.seteNum(inputEmpa());

    System.out.print("set eName: ");
    thisClass1.seteName(inputEmpb());

    System.out.print("set eSalary: ");
    thisClass1.seteSalary(inputEmpc());

    //re print
    System.out.println();
    printer(thisClass1);
  }//end psvm()

  public static void printer(ThisClass thisClass1)
  {
    System.out.println("eNum: "+thisClass1.geteNum());
    System.out.println("eName: "+thisClass1.geteName());
    System.out.println("eSalary: "+thisClass1.geteSalary());
  }

  public static int inputEmpa()
  {
    Scanner scanner = new Scanner(System.in);
    int en = scanner.nextInt();
    return en;
  }
  public static String inputEmpb()
  {
    Scanner scanner = new Scanner(System.in);
    String en = scanner.nextLine();
    return en;
  }
  public static double inputEmpc()
  {
    Scanner scanner = new Scanner(System.in);
    double en = scanner.nextDouble();
    return en;
  }

//
  public static class ThisClass
  {
    //properties
    private int eNum;
    private String eName;
    private double eSalary;

    //constructor
    ThisClass()
    {
      this.eNum = 0x007;
      this.eName = "Bond";
      this.eSalary = 5_000_000.00;
    }

    //getters
    public int geteNum()
    {
      return eNum;
    }

    public String geteName()
    {
      return eName;
    }

    public double geteSalary()
    {
      return eSalary;
    }

    //setters
    public void seteNum(int eNum)
    {
      this.eNum = eNum;
    }

    public void seteName(String eName)
    {
      this.eName = eName;
    }

    public void seteSalary(double eSalary)
    {
      this.eSalary = eSalary;
    }

  }//end ThisClass innerclass

}//end Main class
