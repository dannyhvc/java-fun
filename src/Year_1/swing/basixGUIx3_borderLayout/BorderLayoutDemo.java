/*
 * Project Name: BorderLayoutDemo.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/27/2019 | Time: 11:40 AM
 */
package Year_1.swing.basixGUIx3_borderLayout;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame
{
  BorderLayoutDemo()
  {
    super("Demo");//constructor from JFrame class

    //boilerplate code: set up the jFrame with basic configs.
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the program when the x is hit
    this.setSize(500, 500);
    this.setLocationRelativeTo(null);//opens window in the middle of the screen
    //hgap =  horizontal gap between grids //vgap =  vertical gap between grids.
    this.setLayout(new BorderLayout());//changes the view of the components depending on the window size.
    this.setVisible(true);

    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();

    jPanel1.setBackground(Color.GREEN);
    jPanel1.setBackground(Color.CYAN);

    this.add(jPanel1, BorderLayout.CENTER);
    this.add(jPanel2, BorderLayout.NORTH);

    this.pack();//will automatically size the window to fit the elements.
  }
}//end Main class
