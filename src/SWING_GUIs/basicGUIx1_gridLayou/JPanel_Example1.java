/*
 * Project Name: JPanel_Example1.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/27/2019 | Time: 11:12 AM
 */
package SWING_GUIs.basicGUIx1_gridLayou;

import javax.swing.*;//contains all gui object
import java.awt.*;//contains all layout managers

public class JPanel_Example1
{
  public static void main(String[] args)
  {
    JFrame frame1 = new JFrame("Some JPanels in a JFrame");

    //boilerplate code: set up the jFrame with basic configs.
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the program when the x is hit
    frame1.setSize(500, 500);
    frame1.setLocationRelativeTo(null);//opens window in the middle of the screen
    //hgap =  horizontal gap between grids //vgap =  vertical gap between grids.
    frame1.setLayout(new GridLayout(2,2,10,10)); //hgap =  horizontal gap between grids
    frame1.setVisible(true);

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    panel1.setBackground(Color.BLACK);
    panel2.setBackground(Color.BLUE);
    panel3.setBackground(Color.CYAN);
    panel4.setBackground(Color.GREEN);

    panel1.setLayout(new GridLayout(1,2));
    JButton jButton1 = new JButton("One");
    JButton jButton2 = new JButton("Two");
    panel1.add(jButton1);
    panel1.add(jButton2);

    //with gird layout the order in which panels are added matters.
    frame1.add(panel1);
    frame1.add(panel2);
    frame1.add(panel3);
    frame1.add(panel4);


  }//end main()
}//end Main class
