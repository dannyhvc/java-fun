/*
 * Project Name: Person.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/8/2019 | Time: 2:52 PM
 */
package interfaces;

public class Person implements Comparable<Person>, Animal
{

  private int age;
  private String name;

  Person(int age, String  name)
  {
    this.age = age;
    this.name = name;
  }

  //DEFAULT COMPARE INTERFACE <--- important
  @Override
  public int compareTo(Person o)
  {
    if (this.age > o.age)
      return 1;
    else if (this.age < o.age)
      return -1;
    else
      return 0;
  }//end compareTo(T o)

  @Override
  public void eat()
  {

  }

  @Override
  public void travel()
  {

  }
}//end Main class
