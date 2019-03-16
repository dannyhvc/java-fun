/*
 * Project Name: InClassCoding2.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/15/2019 | Time: 2:37 PM
 */

import java.awt.*;
import javax.swing.*;

public class D_H_BagelShop extends JFrame
{
  //gui fields/ elements
  private JPanel toppanel, leftpanel, middlepanel, rightpanel, bottompanel;
  private JLabel welcome, bagel, topping, coffee;
  private JCheckBox butter, crm_cheese, str_jam, pch_jelly;
  private JRadioButton white, whole_wheat, cheddar, poppy, None, Reg, Decaf, Cappu;
  private JButton submit;

  JFrame f1 = new JFrame("Dan's Bagel House App");

  D_H_BagelShop()
  {
    //boilerplate code
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setSize(400, 150);
    f1.setLocationRelativeTo(null);
    f1.setVisible(true);
    f1.setLayout(new BorderLayout());

    //build methods
    buildTopPanel();
    buildLeftPanel();
    buildMiddlePanel();
    buildRightPanel();
    buildBottomPanel();

    //ADDing to frame________
    f1.add(toppanel, BorderLayout.NORTH);
    f1.add(leftpanel, BorderLayout.WEST);
    f1.add(middlepanel, BorderLayout.CENTER);
    f1.add(rightpanel, BorderLayout.EAST);
    f1.add(bottompanel, BorderLayout.SOUTH);

    //trimming window
    f1.pack();
  }

  public void buildTopPanel()
  {
    //setting the panel
    toppanel = new JPanel();
    toppanel.setLayout(new GridLayout(1,1));

    //setting elements
    welcome = new JLabel("Welcome to Dan's Bagel House!", SwingConstants.CENTER);

    //adding to the panel
    toppanel.add(welcome);
  }

  public void buildLeftPanel()
  {
    leftpanel = new JPanel();
    leftpanel.setLayout(new GridLayout(5,1));

    //setting label
    bagel = new JLabel("Bagel");
    //setting left radio btns
    white = new JRadioButton("White");
    whole_wheat = new JRadioButton("Whole Wheat");
    cheddar = new JRadioButton("Cheddar cheese");
    poppy = new JRadioButton("Poppy Seed");

    //adding bagel section
    leftpanel.add(bagel);
    leftpanel.add(white);
    leftpanel.add(whole_wheat);
    leftpanel.add(cheddar);
    leftpanel.add(poppy);
  }

  public void buildMiddlePanel()
  {
    middlepanel = new JPanel();
    middlepanel.setLayout(new GridLayout(5,1));

    //setting the labels
    topping = new JLabel("Toppings");
    //setting right radio btns
    butter = new JCheckBox("Butter");
    crm_cheese = new JCheckBox("Cream Cheese");
    str_jam = new JCheckBox("Strawberry Jam");
    pch_jelly = new JCheckBox("Peach Jelly");

    //adding to the panel
    //adding toppings section
    middlepanel.add(topping);
    middlepanel.add(butter);
    middlepanel.add(crm_cheese);
    middlepanel.add(str_jam);
    middlepanel.add(pch_jelly);
  }

  public void buildRightPanel()
  {
    //panel settings
    rightpanel = new JPanel();
    rightpanel.setLayout(new GridLayout(5,1));

    //label settings
    coffee = new JLabel("Coffee");
    //setting check boxes
    None = new JRadioButton("None");
    Reg = new JRadioButton("Regular");
    Decaf = new JRadioButton("Decaf Coffee");
    Cappu = new JRadioButton("Cappuccino");

    //adding coffee section
    rightpanel.add(coffee);
    rightpanel.add(None);
    rightpanel.add(Reg);
    rightpanel.add(Decaf);
    rightpanel.add(Cappu);
  }

  public void buildBottomPanel()
  {
    //setting the panel info
    bottompanel = new JPanel();
    bottompanel.setLayout(new GridLayout(1,1));

    //setting elements
    submit = new JButton("Submit Order");

    //adding to the panel
    bottompanel.add(submit);
  }

  public static void main(String[] args)
  {
    new D_H_BagelShop();
  }

}//end Main class
