/*
 * Project Name: FeedForward.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 5/7/2019 | Time: 1:37 AM
 */
package nn.net_NeuralNetworks;

import nn.net_Data.TrainSet;
import nn.net_Handling.InvalidMatrixException;
import nn.net_Handling.NetGeneric;
import nn.net_Math.Activation;
import nn.net_Math.Math_transform;

import java.util.Arrays;


public class FeedForward implements NetGeneric
{
    //field declarations
    private double[][] output;
    private double[][][] weights;
    private double[][] bias;

    private double[][] error_signal;
    private double[][] output_derivative;

    private final int[] NETWORK_LAYER_SIZE;
    private final int INPUT_SIZE;
    private final int OUTPUT_SIZE;
    private final int NETWORK_SIZE;

    //constructor
    public FeedForward(int... NETWORK_LAYER_SIZE)
    {
        this.NETWORK_LAYER_SIZE = NETWORK_LAYER_SIZE;
        this.NETWORK_SIZE = NETWORK_LAYER_SIZE.length;
        this.INPUT_SIZE = NETWORK_LAYER_SIZE[0];
        this.OUTPUT_SIZE = NETWORK_LAYER_SIZE[NETWORK_SIZE - 1];

        this.output = new double[NETWORK_SIZE][];
        this.weights = new double[NETWORK_SIZE][][];
        this.bias = new double[NETWORK_SIZE][];

        this.error_signal = new double[NETWORK_SIZE][];
        this.output_derivative = new double[NETWORK_SIZE][];

        for (int i = 0; i < NETWORK_SIZE; i++)
        {
            this.output[i] = new double[NETWORK_LAYER_SIZE[i]];
            this.error_signal[i] = new double[NETWORK_LAYER_SIZE[i]];
            this.output_derivative[i] = new double[NETWORK_LAYER_SIZE[i]];

            this.bias[i] = Math_transform.createRandomArray(NETWORK_LAYER_SIZE[i], 0.3, 0.7);

            if (i > 0)
                weights[i] = Math_transform.createRandomArray(
                    NETWORK_LAYER_SIZE[i], NETWORK_LAYER_SIZE[i - 1], -0.3, 0.5
                );
        }//end for

    }//end constructor

    //accessors
    public Activation getSigmoid()
    {
        return sigmoid;
    }
    public Activation getDydxOfs()
    {
        return dydxOfs;
    }
    public double[][] getBias()
    {
        return bias;
    }
    public double[][] getError_signal()
    {
        return error_signal;
    }
    public double[][] getOutput()
    {
        return output;
    }
    public double[][] getOutput_derivative()
    {
        return output_derivative;
    }
    public double[][][] getWeights()
    {
        return weights;
    }
    public int[] getNETWORK_LAYER_SIZE()
    {
        return NETWORK_LAYER_SIZE;
    }
    public int getINPUT_SIZE()
    {
        return INPUT_SIZE;
    }
    public int getNETWORK_SIZE()
    {
        return NETWORK_SIZE;
    }
    public int getOUTPUT_SIZE()
    {
        return OUTPUT_SIZE;
    }

    //mutator's
    public void setSigmoid(Activation sigmoid)
    {
        this.sigmoid = sigmoid;
    }
    public void setDydxOfs(Activation dydxOfs)
    {
        this.dydxOfs = dydxOfs;
    }
    public void setWeights(double[][][] weights)
    {
        this.weights = weights;
    }
    public void setBias(double[][] bias)
    {
        this.bias = bias;
    }
    public void setError_signal(double[][] error_signal)
    {
        this.error_signal = error_signal;
    }
    public void setOutput(double[][] output)
    {
        this.output = output;
    }
    public void setOutput_derivative(double[][] output_derivative)
    {
        this.output_derivative = output_derivative;
    }

    /**
     * @param x;
     */
    private Activation sigmoid = (x -> 1d / (1 + Math.exp(-x)));
    private Activation dydxOfs = x -> 1 * (1 - x);


    /**
     * @param t_input;
     * @param target;
     * @throws InvalidMatrixException;
     */
    private double MSE(final double[] t_input, final double[] target) throws InvalidMatrixException
    {
        if (t_input.length != INPUT_SIZE || target.length != OUTPUT_SIZE)
            throw new InvalidMatrixException(t_input.length);
        think(t_input);
        double v = 0;
        for (int i = 0; i < target.length; i++)
            v += Math.pow((target[i] - output[NETWORK_SIZE - 1][i]), 2);
        return v / (2d * target.length);
    }//end MSE()


    /**
     * @param set;
     * @throws InvalidMatrixException;
     */
    private double MSE(TrainSet set) throws InvalidMatrixException
    {
        double v = 0;
        for (int i = 0; i < set.size(); i++)
            v += MSE(set.getInput(i), set.getOutput(i));
        return v / set.size();
    }//end MSE()


    /**
     * @param input;
     */	
    public double[] think(double... input)
    {
        if (input.length != this.INPUT_SIZE)
            return null;
        this.output[0] = input;

        for (int layer = 1; layer < NETWORK_SIZE; layer++)
            for (int neuron = 0; neuron < NETWORK_LAYER_SIZE[layer]; neuron++)
            {
                double sum = bias[layer][neuron];

                for (int prevNeuron = 0; prevNeuron < NETWORK_LAYER_SIZE[layer - 1]; prevNeuron++)
                    sum += output[layer - 1][prevNeuron] * weights[layer][neuron][prevNeuron];
                output[layer][neuron] = sigmoid.normalize(sum);
                output_derivative[layer][neuron] = dydxOfs.normalize(output[layer][neuron]);
            }//end for #neuron#

        return output[NETWORK_SIZE - 1];
    }//end think()


    /**
     * @param set;
     * @param iterations;
     * @param batch_size;
     * @throws InvalidMatrixException;
     */
    public void train(TrainSet set, int iterations, int batch_size, double eta) throws InvalidMatrixException
    {
        if (set.INPUT_SIZE != INPUT_SIZE || set.OUTPUT_SIZE != OUTPUT_SIZE)
            throw new InvalidMatrixException(set.INPUT_SIZE);

        for (int i = 0; i < iterations; i++)
        {
            TrainSet batch = set.extractBatch(batch_size);
            for (int b = 0; b < batch_size; b++)
                this.train(batch.getInput(b), batch.getOutput(b), eta);
            System.out.println(MSE(batch));
        }//end for #i#

    }//end train


    /**
     * @param t_inputs;
     * @param target;
     * @param eta;
     * @throws InvalidMatrixException;
     */
    public void train(double[] t_inputs, double[] target, double eta) throws InvalidMatrixException
    {
        if (t_inputs.length != INPUT_SIZE || target.length != OUTPUT_SIZE)
            throw new InvalidMatrixException(t_inputs.length);
        think(t_inputs);
        backpropError(target);
        updateSynapse(eta);
    }//end train()


    /**
     * @param target;
     */
    private void backpropError(double[] target)
    {
        for (int neuron = 0; neuron < NETWORK_LAYER_SIZE[NETWORK_SIZE - 1]; neuron++)
            error_signal[NETWORK_SIZE - 1][neuron] = (output[NETWORK_SIZE - 1][neuron] - target[neuron])
                * output_derivative[NETWORK_SIZE - 1][neuron];

        /*
          @IMPORTANT starts at n-2 because it it where the last neuron is located
         */
        for (int layer = NETWORK_SIZE - 2; layer > 0; layer--)
            for (int neuron = 0; neuron < NETWORK_LAYER_SIZE[layer]; neuron++)
            {
                double sum = 0;
                for (int nextNeuron = 0; nextNeuron < NETWORK_LAYER_SIZE[layer + 1]; nextNeuron++)
                    sum += weights[layer + 1][nextNeuron][neuron] * error_signal[layer + 1][nextNeuron];
                this.error_signal[layer][neuron] = sum * output_derivative[layer][neuron];
            }//end for #neuron#

    }//end backpropError()


    /**
     * @param eta;
     */
    private void updateSynapse(double eta)
    {
        for (int layer = 1; layer < NETWORK_SIZE; layer++)
            for (int neuron = 0; neuron < NETWORK_LAYER_SIZE[layer]; neuron++)
            {
                double deltaBi = -eta * error_signal[layer][neuron];
                bias[layer][neuron] += deltaBi;
                for (int prevNeuron = 0; prevNeuron < NETWORK_LAYER_SIZE[layer - 1]; prevNeuron++)
                    weights[layer][neuron][prevNeuron] += deltaBi * output[layer - 1][prevNeuron];
            }//end for #neuron#
    }//end updateSynapse()


    public void genoType()
    {
        System.out.println("\n\n\n");

        for (int i = 1; i <weights.length ; i++)
            for (int j = 0; j < weights[i].length; j++)
                for (int k = 0; k < weights[i][j].length; k++)
                    System.out.println(weights[i][j][k]);

        System.out.println("\n\n\n");

        for (int i = 0; i < bias.length; i++)
            for (int j = 0; j < bias[i].length; j++)
                System.out.println(bias[i][j]);

        System.out.println(Arrays.deepToString(getBias()));

    }//end genoType()

}//end Main class
