/*
 * Project Name: Student.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/18/2019 | Time: 3:23 PM
 */
package inheritance.Excersizes.people;

public class Student extends Person
{
  private double grade;

  Student(String name, double grade, int ID)
  {
    super(name, ID);
    this.grade = grade;
  }//end constructor

  public double getGrade()
  {
    return grade;
  }//end getGrade
  public void setGrade(double grade)
  {
    this.grade = grade;
  }//end setGrade

  public String toSting()
  {
    return "Student:\n" + "Name - " + name+"\n" + "Grade - " + grade+ "\n" + "ID - " + ID+"\n";
  }//end toString
}//end Main class
