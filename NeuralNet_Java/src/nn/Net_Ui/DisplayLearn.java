/*
 * Project Name: DisplayLearn.java
 * Purpose:
 * Coder: Dan, Aiden, ...
 * Date: 5/11/2019 | Time: 11:10 PM
 */
package nn.Net_Ui;

import nn.net_Data.TrainSet;
import nn.net_NeuralNetworks.FeedForward;

import javax.swing.*;
import java.awt.*;

public class DisplayLearn
{
    //Fields
    private JFrame main_frame = new JFrame("NN Learn");
    private JLabel[] labels;
    private double[][][] weights;


    public DisplayLearn(int... topology)
    {
        //boilerplate code: set up the jFrame with basic configs.
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the program when the x is hit
        main_frame.setSize(500, 500);
        main_frame.setLocationRelativeTo(null);//opens window in the middle of the screen
        main_frame.setLayout(/*set layout in here:*/ new GridLayout(1, 1));//changes the view of the components
        // depending on the window size.
        main_frame.setVisible(true);

        FeedForward f = new FeedForward(topology);
        TrainSet s = new TrainSet(topology[0], topology[topology.length-1]);

        //build methods.
        buildNorth();
        buildCenter();
        buildSouth();
        buildWest();
        buildEast();

        //packing
        main_frame.pack();

    }//end constructor.


    private void buildNorth()
    {

    }


    private void buildCenter()
    {

    }


    private void buildSouth()
    {

    }


    private void buildWest()
    {

    }


    private void buildEast()
    {

    }

}//end Main class
