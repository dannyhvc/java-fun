/*
 * Project Name: JCheckBocExample.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/6/2019 | Time: 11:04 AM
 */
package SWING_GUIs.JCheckBox_RadioButton_And_jList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBocExample extends JFrame implements ItemListener
{
  //always declare gui elements outside constructor
  JCheckBox box1;
  JCheckBox box2;
  JCheckBox box3;

  //initialize all gui elements in the constructor
  JCheckBocExample()
  {
    super("JCheckbox example");

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setLayout(new GridLayout(2,3));
    this.setVisible(true);

    box1 = new JCheckBox("One");
    box2 = new JCheckBox("Two");
    box3 = new JCheckBox("Three");

    JPanel p = new JPanel();
    p.add(box1);
    p.add(box2);
    p.add(box3);

    box1.addItemListener(this);

    this.add(p);
  }//end constructor

  @Override
  public void itemStateChanged(ItemEvent e)
  {
    Object source = e.getItemSelectable();

    if (source.equals(box1))
    {
      //get state change returns a number that see if it was selected or delselected.
      if(e.getStateChange() == ItemEvent.DESELECTED)
      {
        System.out.println("Box -> (1) was Deselected");
      }
      else
      {
        System.out.println("Box -> (1) was Selected");
      }
      System.out.println("Box -> (1) was clicked");
    }
    else if (source.equals(box2))
    {
      if(e.getStateChange() == ItemEvent.DESELECTED)
      {
        System.out.println("Box -> (2) was Deselected");
      }
      else
      {
        System.out.println("Box -> (2) was Selected");
      }
      System.out.println("Box -> (2) was clicked");
    }
    else if (source.equals(box3))
    {
      if(e.getStateChange() == ItemEvent.DESELECTED)
      {
        System.out.println("Box -> (3) was Deselected");
      }
      else
      {
        System.out.println("Box -> (3) was Selected");
      }
      System.out.println("Box -> (3) was clicked");
    }


  }//end itemStateChanged

  public static void main(String[] args)
  {
    new JCheckBocExample();
  }//end main()

}//end Main class
