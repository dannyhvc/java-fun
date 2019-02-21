/*
 * Project Name: TestPerson.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/18/2019 | Time: 3:33 PM
 */
package inheritance.Excersizes.people;

public class TestPerson
{
  public static void main(String[] args)
  {
    Student student = new Student("Dan", 99.9, 999);
    Teacher teacher = new Teacher("Madhavi", 1000);

    System.out.println(student.toSting());
    System.out.println(teacher.toSting());

    System.out.println(
        student.getName()+"\n"
        + student.getGrade()+"\n"
        + student.getID()
    );
  }//end main()
}//end Main class
