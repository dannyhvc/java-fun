/*
 * Project Name: TestAnimals.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/18/2019 | Time: 2:12 PM
 */
package inheritance.Animals2;

public class TestAnimals
{
  public static void main(String[] args)
  {
    Animal animal= new Animal("Doobie");
    Cat c = new Cat("Forest Cat", "Snuffles");
    Cat d = new Cat("Forest Cat", "Snuffles");

    Cat e = new Cat("Domestic Short hair", "Kiki");


    //System.out.println("Animal name -->" + animal.name + ", Cat name -->" + cat.name);
    //System.out.println(animal.toString());
  }
}//end Main class
