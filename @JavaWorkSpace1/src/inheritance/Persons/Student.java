/*
 * Project Name: Student.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/18/2019 | Time: 2:57 PM
 */
package inheritance.Persons;

public class Student extends Person
{
  private String program;
  private int year;
  private double fee;

  Student(String program, int year, double fee, String name, String address)
  {
    super(name, address);
    this.fee = fee;
    this.program = program;
    this.year = year;
  }

  public void setFee(double fee)
  {
    this.fee = fee;
  }
  public double getFee()
  {
    return fee;
  }

  public void setProgram(String program)
  {
    this.program = program;
  }
  public String getProgram()
  {
    return program;
  }

  public void setYear(int year)
  {
    this.year = year;
  }
  public int getYear()
  {
    return year;
  }

  @Override
  public String toString()
  {
    return "program->"+program + " year->"+year + " fee->"+fee + " name->"+name + " address->"+address;
  }
}//end Main class
