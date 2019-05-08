/*
 * Project Name: InvalidMatrixException.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 5/8/2019 | Time: 12:31 AM
 */
package neuralNetwork;

public class InvalidMatrixException extends Exception
{
  private int array_size;

  InvalidMatrixException(int as)
  {
    super("Invalid Matrix Size: "+as);
    this.array_size = as;
  }

}//end Main class
