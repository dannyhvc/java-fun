/*
 * Project Name: JOptionPane.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/15/2019 | Time: 2:26 PM
 */
package SWING_GUIs.JOption_pane_example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPane extends JFrame
{
  private JPanel panel;
  private  JTextField input;

  JOptionPane()
  {
    super("Daniel Herrera's JOP");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 400);
    setLocationRelativeTo(null);
    setVisible(true);
    setLayout(new GridLayout(2,1));

    buildPanel();

//    ActionListener actionPreformed = (e) -> {
//      JOptionPane.
//    };

  }

//  @Override
//  public void actionPerformed(ActionEvent e)
//  {
//    JOptionPane.showMessageDialog(null, input.getText(), "Popup window");
//  }

  private void buildPanel()
  {
    panel = new JPanel();
    panel.setLayout(new GridLayout());
    input = new JTextField();
    panel.add(input);

    //input.addActionListener(this);
  }

  public static void main(String[] args)
  {
    new JOptionPane();
  }
}//end Main class
