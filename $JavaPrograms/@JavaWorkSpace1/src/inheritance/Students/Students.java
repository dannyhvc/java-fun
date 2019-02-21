/*
 * Project Name: Students.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/11/2019 | Time: 2:05 PM
 */
package inheritance.Students;

public class Students
{
   //properties
  private int studentNumber = 0;
  private String name;
  private int gpa;

  //constructor -> if no constructor is made, java has a default constructor and that
  //doesn't have any args or params.
  //the whole purpose of a constructor is to add attributes to the obj.
  Students()
  {
    this.studentNumber = 0;
    this.name = "None";
    this.gpa = 0;
  }
  Students(String name, int studentNumber, int avg)
  {
    this.name = name;
    this.studentNumber = studentNumber;
    this.gpa = avg;
  }

  //getter (never have parameters)
  //the only purpose of a getter is to get the value of an attribute.
  public int getStudentNumber()
  {
    return studentNumber;
  }

  //setter (setter will only have a param to adjust the value of the attribute)
  public void setStudentNumber(int studentNumber)
  {
    //"this" refers to the instance of the class and thus referring to the values in the class while it assigns
    // it to a variable/param.
    this.studentNumber = studentNumber;
  }

}//end Main class
