/*
 * Project Name: Microwave.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/15/2019 | Time: 12:18 AM
 */
package MY_CODE.gui_practice_assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Microwave extends JFrame
{
  //fields
  private String cookTime;
  private String timeDisplay;//BONUS

  //GUI fields
  private JPanel left_panel, right_top_panel, right_bot_panel;
  private JButton level_btn, defrost_btn, start_btn, stop_btn, time_btn,
      btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
  private JTextArea ovenWindow, timeWindow;

  private Microwave(String cookTime)
  {
    //set boilerplate code
    super("Daniel Herrera's Microwave Oven");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 400);
    setLocationRelativeTo(null);
    setVisible(true);
    setLayout(new GridLayout(2,1));

    buildLeft();
    buildRightTop();
    buildRightBot();

    add(right_top_panel);
    add(left_panel);
    add(right_bot_panel);

    pack();

  }//end constructor

  //properties
  public String getCookTime()
  {
    return cookTime;
  }
  public void setCookTime(String cookTime)
  {
    this.cookTime = cookTime;
  }

  //building methods
  private void buildLeft()
  {
    left_panel = new JPanel();

  }//end buildLeft()

  private void buildRightTop()
  {
    //initializing gui elements
    right_top_panel = new JPanel();
    timeWindow = new JTextArea();


    timeWindow = new JTextArea(67,267);
    timeWindow.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,2));
    timeWindow.setBackground(Color.RED);


    right_top_panel.add(timeWindow);
  }//end buildRightTop()

  private void buildRightBot()
  {
    right_bot_panel = new JPanel();
    right_bot_panel.setLayout(new GridLayout(5,3));

    btn0 = new JButton();
    btn1 = new JButton();
    btn2 = new JButton();
    btn3 = new JButton();
    btn4 = new JButton();
    btn5 = new JButton();
    btn6 = new JButton();
    btn7 = new JButton();
    btn8 = new JButton();
    btn9 = new JButton();

    right_bot_panel.add(btn0);
    right_bot_panel.add(btn1);
    right_bot_panel.add(btn2);
    right_bot_panel.add(btn3);
    right_bot_panel.add(btn4);
    right_bot_panel.add(btn5);
    right_bot_panel.add(btn6);
    right_bot_panel.add(btn7);
    right_bot_panel.add(btn8);
    right_bot_panel.add(btn9);


  }//end buildRightBot()

  //main method
  public static void main(String[] args)
  {
    new Microwave("a");
  }

}//end Main class
