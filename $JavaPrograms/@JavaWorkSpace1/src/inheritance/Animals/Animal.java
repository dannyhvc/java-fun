package inheritance.Animals;

/**
 * This is a superclass. It's a parent of inheritance.Cat and inheritance.Dog.
 * Note how it contains properties that are common to both cats and dogs.
 * Anything that's a child of this class inherits these properties
 * This class is more abstract, while cat and dog are more concrete.
 * @author Madhavi
 *
 */
public class Animal
{
    //Properties
    String name = "Snuffles";
    int age = 10;
    String furColour = "Black";
}