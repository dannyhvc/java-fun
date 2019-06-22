/*
 * Project Name: Net_ml.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 5/7/2019 | Time: 1:31 AM
 */
package nn;

import nn.net_Math.Math_transform;
import java.util.*;

public class Net_ml
{
  public static void main(String[] args)
  {

    double[][] X = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
    double[][] Y = {{0}, {1}, {1}, {0}};

    int m = 4;
    int nodes = 400;

    X = Math_transform.T(X);
    Y = Math_transform.T(Y);

    double[][] W1 = Math_transform.random(nodes, 2);
    double[][] b1 = new double[nodes][m];

    double[][] W2 = Math_transform.random(1, nodes);
    double[][] b2 = new double[1][m];


    for (int i = 0; i < 4000; i++)
    {
      // Forward Prop
      // LAYER 1
      double[][] Z1 = Math_transform.add(Math_transform.dot(W1, X), b1);
      double[][] A1 = Math_transform.sigmoid(Z1);

      //LAYER 2
      double[][] Z2 = Math_transform.add(Math_transform.dot(W2, A1), b2);
      double[][] A2 = Math_transform.sigmoid(Z2);

      double cost = Math_transform.cross_entropy(m, Y, A2);
      //costs.getData().add(new XYChart.Data(i, cost));

      // Back Prop
      //LAYER 2
      double[][] dZ2 = Math_transform.subtract(A2, Y);
      double[][] dW2 = Math_transform.divide(Math_transform.dot(dZ2, Math_transform.T(A1)), m);
      double[][] db2 = Math_transform.divide(dZ2, m);

      //LAYER 1
      double[][] dZ1 = Math_transform.multiply(Math_transform.dot(Math_transform.T(W2), dZ2),
          Math_transform.subtract(1.0, Math_transform.power(A1, 2)));
      double[][] dW1 = Math_transform.divide(Math_transform.dot(dZ1, Math_transform.T(X)), m);
      double[][] db1 = Math_transform.divide(dZ1, m);

      // G.D
      W1 = Math_transform.subtract(W1, Math_transform.multiply(0.01, dW1));
      b1 = Math_transform.subtract(b1, Math_transform.multiply(0.01, db1));

      W2 = Math_transform.subtract(W2, Math_transform.multiply(0.01, dW2));
      b2 = Math_transform.subtract(b2, Math_transform.multiply(0.01, db2));

      if (i % 400 == 0)
      {
        Math_transform.print("==============");
        Math_transform.print("Cost = " + cost);
        Math_transform.print("Predictions = " + Arrays.deepToString(A2));
      }//end if
    }//end for

  }//end main()

}//end Main class
