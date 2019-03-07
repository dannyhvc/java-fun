/*
 * Project Name: JListExample1.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/6/2019 | Time: 12:04 PM
 */
package SWING_GUIs.JCheckBox_RadioButton_And_jList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JListExample1 extends JFrame
{
  private DefaultListModel<String> data;

  JListExample1()
  {
    //title of the program
    super("JListExample1");

    //boilerplate code
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setLayout(new GridLayout(3,2));
    this.setVisible(true);

    //instantiating elements
    JList list = new JList();

    data = new DefaultListModel<String>();

    //adding elements to the list
    data.addElement("Element 1");
    data.addElement("Element 2");
    data.addElement("Element 3");

    list.setModel(data);

    this.add(list);
    this.pack();
  }//end constructor

  public static void main(String[] args)
  {
    new JListExample1();
  }//end main()
}//end Main class
