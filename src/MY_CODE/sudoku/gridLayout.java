/*
 * Project Name: gridLayout.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/27/2019 | Time: 11:54 AM
 */
package MY_CODE.sudoku;

import javax.swing.*;
import java.awt.*;

class gridLayout extends JFrame
{
  gridLayout()
  {
    JFrame frame = new JFrame("Sudoku");

    //boilerplate code: set up the jFrame with basic configs.
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the program when the x is hit
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);//opens window in the middle of the screen
    //hgap =  horizontal gap between grids //vgap =  vertical gap between grids.
    frame.setLayout(new GridLayout(3,3,10,10)); //hgap =  horizontal gap between grids
    frame.setVisible(true);

    JPanel[] panel = new JPanel[9];
    JButton[] buttons = new JButton[27];

  }//end constructor

}//end Main class
