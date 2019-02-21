/*
 * Project Name: TestPeople.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/18/2019 | Time: 3:11 PM
 */
package inheritance.Persons;

public class TestPeople
{
  public static void main(String[] args)
  {
    Student student = new Student(
        "CPA", 1, 12000, "Dan", "1012 Guildwood BLVD.");

    System.out.println(student.toString());
  }
}//end Main class
