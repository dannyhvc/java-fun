/*
 * Project Name: JMenu_example1.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/15/2019 | Time: 2:08 PM
 */
package Year_1.swing.JMenu_example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenu_example1 extends JFrame
{
  private JLabel output;
  private JMenuItem one, two, three;

  private JMenu_example1()
  {
    super("Daniel Herrera's Microwave Oven");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 400);
    setLocationRelativeTo(null);
    setVisible(true);
    setLayout(new GridLayout(2,1));

    output = new JLabel();

    //THE BIGG BAR PART
    JMenuBar bar = new JMenuBar();


    //THE SUB OPTIONS BAR OF THE BIG BAR
    JMenu menu_options = new JMenu("Menu Options");

    //choices
   one = new JMenuItem("Item 1");
   two = new JMenuItem("Item 2");
   three = new JMenuItem("Item 3");

    //adding to Jframe
    setJMenuBar(bar);

    //adding to BIG BAR
    bar.add(menu_options);

    //adding to sub BAR
    menu_options.add(one);
    menu_options.add(two);
    menu_options.add(three);

    //more effectient because its one object being used for multiple cases
    MenuListener m = new MenuListener();
    one.addActionListener(m);
    two.addActionListener(m);
    three.addActionListener(m);

    //adding to JFRAME
    add(output);
  }

  private class MenuListener implements ActionListener
  {

    @Override
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource().equals(one))
        output.setText("one");
      else if(e.getSource().equals(two))
        output.setText("two");
      else if(e.getSource().equals(three))
        output.setText("three");
    }
  }

  public static void main(String[] args)
  {
    new JMenu_example1();
  }



}//end Main class
