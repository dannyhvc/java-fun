/*
 * Project Name: JButtonHostListener.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/27/2019 | Time: 12:04 PM
 */
package Year_1.swing.basicGUIx4_EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class JButtonHostListener extends JFrame implements ActionListener
{
  JButtonHostListener()
  {
    super("JButtoneHostListener");

    //boilerplate code: set up the jFrame with basic configs.
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the program when the x is hit
    this.setSize(500, 500);
    this.setLocationRelativeTo(null);//opens window in the middle of the screen
    this.setLayout(new FlowLayout());//changes the view of the components depending on the window size.
    this.setVisible(true);

    //creates buttons
    JButton redButton = new JButton("red");
    JButton greenButton = new JButton("green");
    JButton blueButton = new JButton("blue");
    JButton blackButton = new JButton("black");

    //implementing the action listener
    redButton.addActionListener(this);
    greenButton.addActionListener(this);
    blueButton.addActionListener(this);
    blackButton.addActionListener(this);

    //adds it to the JFrame
    this.add(redButton);
    this.add(greenButton);
    this.add(blueButton);
    this.add(blackButton);

    this.pack();//will automatically size the window to fit the elements.
  }//end constructor

  @Override
  public void actionPerformed(ActionEvent e)
  {
    Container contentPain = this.getContentPane();

    switch (e.getActionCommand())
    {
      case "red":
        contentPain.setBackground(Color.RED);
        break;
      case "green":
        contentPain.setBackground(Color.GREEN);
        break;
      case "blue":
        contentPain.setBackground(Color.BLUE);
        break;
      default:
        contentPain.setBackground(Color.BLACK);
        break;
    }//end switch

  }//end actionPerformed

}//end Main class
