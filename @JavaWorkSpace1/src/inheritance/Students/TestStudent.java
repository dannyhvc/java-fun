/*
 * Project Name: TestStudent.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/11/2019 | Time: 2:09 PM
 */
package inheritance.Students;

public class TestStudent
{
  public static void main(String[] args)
  {
    Students s;
    s = new Students("dan", 0, 100);

    Students t = new Students();

    //getting initial values from 2nd constructor attributes.
    System.out.println("current default student number is: "+s.getStudentNumber());//can't be accessed with a getter since its private

    //setting and getting the new value of StudentNumber
    s.setStudentNumber(3);
    System.out.println("New student number is: "+s.getStudentNumber());//can't be accessed with a getter since its private


    System.out.println("constructor created student number is: "+ t.getStudentNumber());

  }//end main()   
}//end Main class
