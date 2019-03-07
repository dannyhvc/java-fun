/*
 * Project Name: JRadioButtonExample.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/6/2019 | Time: 11:32 AM
 */
package SWING_GUIs.JCheckBox_RadioButton_And_jList;

import javafx.scene.control.ButtonType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioButtonExample extends JFrame
{
JRadioButton option1, option2, option3, optionA , optionB, optionC;

  JRadioButtonExample()
  {
    //title of the program
    super("JRadioButton example");

    //boilerplate code
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setLayout(new GridLayout(3,2));
    this.setVisible(true);

    //instantiates the JRadioButtons
    option1 = new JRadioButton("One");
    option2 = new JRadioButton("Two");
    option3 = new JRadioButton("Three");
    optionA = new JRadioButton("A");
    optionB = new JRadioButton("B");
    optionC = new JRadioButton("C");

    //button group make radio buttons mutaly exclusive.
    ButtonGroup group1 = new ButtonGroup();
    ButtonGroup group2 = new ButtonGroup();
    group1.add(option1);
    group1.add(option2);
    group1.add(option3);
    group2.add(optionA);
    group2.add(optionB);
    group2.add(optionC);

    option1.setActionCommand("option1 was chosen");
    option2.setActionCommand("option2 was chosen");
    option3.setActionCommand("option3 was chosen");
    optionA.setActionCommand("optionA was chosen");
    optionB.setActionCommand("optionB was chosen");
    optionC.setActionCommand("optionC was chosen");

    //adds action listeners in lambda functions
    option1.addActionListener((e) -> {
      System.out.println(e.getActionCommand());
    });
    option2.addActionListener((e) -> {
      System.out.println(e.getActionCommand());
    });
    option3.addActionListener((e) -> {
      System.out.println(e.getActionCommand());
    });
    optionA.addActionListener((e) -> {
      System.out.println(e.getActionCommand());
    });
    optionB.addActionListener((e) -> {
      System.out.println(e.getActionCommand());
    });
    optionC.addActionListener((e) -> {
      System.out.println(e.getActionCommand());
    });

    //adds the radio buttons to the JFRAME.
    this.add(option1);
    this.add(optionA);
    this.add(option2);
    this.add(optionB);
    this.add(option3);
    this.add(optionC);

    this.pack();

  }//end constructor

  public static void main(String[] args)
  {
    new JRadioButtonExample();
  }//end main()

}//end Main class
