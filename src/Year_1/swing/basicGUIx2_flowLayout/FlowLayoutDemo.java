/*
 * Project Name: FlowLayoutDemo.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/27/2019 | Time: 11:29 AM
 */
package Year_1.swing.basicGUIx2_flowLayout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame
{

  FlowLayoutDemo()
  {
    super("Demo");//constructor from JFrame class

    //boilerplate code: set up the jFrame with basic configs.
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the program when the x is hit
    this.setSize(500, 500);
    this.setLocationRelativeTo(null);//opens window in the middle of the screen
    //hgap =  horizontal gap between grids //vgap =  vertical gap between grids.
    this.setLayout(new FlowLayout());//changes the view of the components depending on the window size.
    this.setVisible(true);

    JButton button1 = new JButton("One");
    JButton button2 = new JButton("Two");

    this.add(button1);
    this.add(button2);

    this.pack();//will automatically size the window to fit the elements.

  }

}//end Main class
