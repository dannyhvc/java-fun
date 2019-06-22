/*
 * Project Name: Perceptron.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 5/10/2019 | Time: 1:22 AM
 */
package nn.net_NeuralNetworks;

import nn.net_Handling.InvalidMatrixException;
import nn.net_Math.Activation;
import nn.net_Math.Math_transform;

import java.util.Random;

public class Perceptron
{

  // Fields
  private Double[] weights;

  //constructor
  public Perceptron(int inputNum)
  {
    this.weights = new Double[inputNum];

    /**
     * This loop create the weights for the synapses
     * and the connections between the hidden neurons and
     * the matrix positions to dot.
     */
    for (int i=0; i < inputNum; i++)
      weights[i] = 2 * new Random().nextDouble() - 1;
  }

  //getters and setters
  public Double[] getWeights()
  {
    return weights;
  }
  public void setWeights(Double[] weights)
  {
    this.weights = weights;
  }


  /**
   * This lambda is a preset for a the activation function
   * that is used to normalize the inputs.
   */
  Activation sigmoid = (x) -> 1 / (1 + Math.exp(-x));


  /**
   * This lambda is a preset for a the activation function
   * that is used to normalized the inputs and returns the gradient.
   */
  Activation sigmoid_derivative = (x) -> x * (1 - x);


  /**
   *
   */
  public void train(
      Double[] training_inputs, Double[] training_outputs, long training_iterations) throws InvalidMatrixException
  {
    Double output, error, adjustment;

    if (training_inputs.length > (weights.length - 1) || training_inputs.length < (weights.length - 1))
      throw new InvalidMatrixException(training_inputs.length);


    for (int i = 0; i < training_iterations; i++)
    {

      // We train the model through trial and error, adjusting the
      // synaptic weights each time to get a better result
      output = think(training_inputs);

      // Calculate the error rate
      error = training_outputs[i] - output;

      // Multiply error by input and gradient of the sigmoid function
      // Less confident weights are adjusted more through the nature of the function
      for (int j = 0; j < weights.length; j++)
      {
        adjustment = Math_transform.scalar_dot(training_inputs, error * sigmoid_derivative.normalize(output));
        weights[j] += adjustment;
      }//end inner for

    }//end for

  }//end train()


  /**
   *
   */
  public Double think(Double[] inputs)
  {
    return sigmoid.normalize(Math_transform.dot(inputs, weights));
  }//end think()


}//end Perceptron class
