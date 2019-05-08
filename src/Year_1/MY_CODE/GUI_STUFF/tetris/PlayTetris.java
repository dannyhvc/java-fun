/*
 * Project Name: PlayTetris.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/25/2019 | Time: 2:34 PM
 */
package Year_1.MY_CODE.GUI_STUFF.tetris;

import javax.swing.*;
import java.awt.*;

public class PlayTetris extends JFrame
{
  public PlayTetris()
  {
    getContentPane().setLayout(new FlowLayout());
    add(new TetrisComponent(15,30));
    pack();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args)
  {
    new PlayTetris();
  }
}