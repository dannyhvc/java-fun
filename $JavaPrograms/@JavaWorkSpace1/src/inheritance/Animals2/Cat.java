/*
 * Project Name: Cat.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 1/18/2019 | Time: 2:11 PM
 */
package inheritance.Animals2;

public class Cat extends Animal
{
  private String breed;

  Cat(String breed, String name)
  {
    super(name);// all sub constructors take after the super constructor and must pertain @params thats
    // give function to the super constructor
    this.breed = breed;
  }


  public boolean equals(Cat c)
  {
    return this.name.equals(c.name) && this.breed.equals(c.breed);
  }

}

