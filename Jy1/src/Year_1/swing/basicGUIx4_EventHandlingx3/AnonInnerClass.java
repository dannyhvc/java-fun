/*
 * Project Name: AnonInnerClass.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/27/2019 | Time: 12:34 PM
 */
package Year_1.swing.basicGUIx4_EventHandlingx3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonInnerClass extends JFrame
{
  AnonInnerClass()
  {
    super("JButtoneHostListener");

    //boilerplate code: set up the jFrame with basic configs.
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the program when the x is hit
    this.setSize(500, 500);
    this.setLocationRelativeTo(null);//opens window in the middle of the screen
    this.setLayout(new FlowLayout());//changes the view of the components depending on the window size.
    this.setVisible(true);

    //create panel componenets
    JRadioButton jRadioButton1 = new JRadioButton("One");
    JRadioButton jRadioButton2 = new JRadioButton("Two");
    JLabel output = new JLabel();

    //add them to the JFrame
    this.add(jRadioButton1);
    this.add(jRadioButton2);
    this.add(output);

    jRadioButton1.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        output.setText("button 1 was clicked");
        System.out.println("Jradio1 was clicked");
      }
    });

    //lambda function are expressed based on the @params on the left and the body of the function on right of the arrow
    //only works with functional interfaces. functional interfaces == interface with one method.
    jRadioButton2.addActionListener((e) -> {
      output.setText("Jradio2 2 was clicked");
      System.out.println("Jradio2 was clicked");
    });

  }//end constructor

}//end Main class
