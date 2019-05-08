/*
 * Project Name: FeedForward.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 5/7/2019 | Time: 1:37 AM
 */
package nn.nn_NeuralNetworks;

import nn.nn_Handling.InvalidMatrixException;
import nn.nn_math.Activation;
import nn.nn_synthesis.Connections;
import java.util.*;

public class FeedForward
{
  private Connections[][] weights;
  private Connections[][] bias;
  private Connections[] inputs;
  private Connections[] outputs;
  private int[] layout;

  /**
   * Constructor to initialize the weights of the neural
   * network
   */
  FeedForward(final int[] layout)
  {
    // Setting instance variables.
    this.layout = layout;
    inputs  = new Connections[layout[0]];
    outputs = new Connections[layout[layout.length - 1]];
    weights = new Connections[layout.length - 1][];

    /**
     * This loop create the connection
     */
    for (int i=0; i < layout.length-1; i++)
    {
      weights[i] = new Connections[layout[i] * layout[i+1]];
      int connector = layout[i] * layout[i+1];

      for (int j=0; j < layout[i] * layout[i+1]; j++)
        weights[i][j].setConnection(2 * new Random().nextDouble() - 1, connector);
      --connector;
    }//end for
  }//end constructor


  //accessors
  public Connections[][] getWeights()
  {
    return weights;
  }
  public Connections[][] getBias()
  {
    return bias;
  }
  public Connections[] getInputs()
  {
    return inputs;
  }
  public Connections[] getOutputs()
  {
    return outputs;
  }
  public int[] getLayout()
  {
    return layout;
  }

  //mutator's
  public void setWeights(Connections[][] weights)
  {
    this.weights = weights;
  }
  public void setBias(Connections[][] bias)
  {
    this.bias = bias;
  }
  public void setInputs(Connections[] inputs)
  {
    this.inputs = inputs;
  }
  public void setOutputs(Connections[] outputs)
  {
    this.outputs = outputs;
  }
  public void setLayout(int[] layout)
  {
    this.layout = layout;
  }


  /**
   * This lambda is a preset for a the activation function
   * that is used to normalize the inputs.
   */
  Activation sigmoid = (x) -> 1 / (1 + Math.exp(-x));

  /**
   * This lambda's preset is for the
   */
  Activation sigmoid_derivative = (x) -> x * (1 - x);


  /**
   * This function uses the equation J(w) = (act - exp) * (inputs) * df(x)/dw
   * given the math function from Math_transform
   */
  public void train(final Double[] training_inputs, final Double[] training_outputs, final int training_iterations)
  {
    //local variables
    Double a;

    for (int i = 0; i < training_iterations; i++)
    {

    }

  }


  /**
   * This object method is used to collect
   * the output of the neural network.
   */
  public Double think(Double[] inputs) throws InvalidMatrixException
  {
    if (inputs.length > layout[0])
      throw new InvalidMatrixException(inputs.length);


    return 0.0;
  }


}//end Main class
