/*
 * Project Name: JListExample2.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/6/2019 | Time: 12:10 PM
 */
package SWING_GUIs.JCheckBox_RadioButton_And_jList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JListExample2 extends JFrame
{
  private JList listSingle, listMultiple, listOutput;
  private JButton submit;

  JListExample2()
  {
    //title of the program
    super("JListExample2");

    //boilerplate code
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setLayout(new GridLayout(3,2));
    this.setVisible(true);

    //instantiating objects
    String data1[] = {
        "One", "Two", "Three"
    };
    String data2[] = {
        "A", "B", "C"
    };
    listSingle = new JList(data1);
    listMultiple = new JList(data2);
    listOutput = new JList();
    submit = new JButton("Submit");
    JPanel p = new JPanel();

    //listSingle formatting
    listSingle.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//sets how many elements will be selected at a time
    listSingle.setLayoutOrientation(JList.HORIZONTAL_WRAP);//sets the layout of the list
    listSingle.setSelectedIndex(-1);//sets which element to select at single time. thf: -1 means nothing selected by
                                    // default
    //listMulti formatting
    listMultiple.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//sets how many elements will be selected at a time
    listMultiple.setLayoutOrientation(JList.VERTICAL_WRAP);//sets the layout of the list
    listMultiple.setSelectedIndex(0);//sets which element to select at single time. thf: first element = 0.

    //create a listener functionality for the button "submit"
    submit.addActionListener((e) -> {
      int[] indiciesMultiple = listMultiple.getSelectedIndices();
      int[] indiciesSinlge = listMultiple.getSelectedIndices();

      ListModel modelMultiple = listMultiple.getModel();
      ListModel modelSingle = listSingle.getModel();

      Object[] outputValues = new Object[indiciesMultiple.length + indiciesSinlge.length];

      int index = 0;
      for (int i = 0; i < indiciesMultiple.length; i++)
      {
        outputValues[index] = modelMultiple.getElementAt(indiciesMultiple[i]);
            index++;
      }//end for
      for (int i = 0; i < indiciesSinlge.length; i++)
      {
        outputValues[index] = modelSingle.getElementAt(indiciesSinlge[i]);
        index++;
      }//end for

      listOutput.setListData(outputValues);
    });

    //add the elements to the panel.
    p.add(listSingle);
    p.add(listMultiple);
    p.add(listOutput);
    p.add(submit);

    //adds the panel to hte JFrame.
    this.add(p);
    this.pack();

  }//end constructor

  public static void main(String[] args)
  {
    new JListExample2();
  }//end main

}//end Main class
