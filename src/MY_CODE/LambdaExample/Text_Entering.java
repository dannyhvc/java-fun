/*
 * Project Name: Text_Entering.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/13/2019 | Time: 1:29 PM
 */
package MY_CODE.LambdaExample;

import javax.swing.*;
import java.awt.*;

public class Text_Entering extends JFrame
{
  //fields
  private JPanel rightpanel, leftpanel;
  private JButton submit;
  private JTextField textField;
  private JLabel label;
  private String label_text;

  //constructor
  Text_Entering()
  {
    super("MY CODE: get text program <3");
    //boilerplate
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLocationRelativeTo(null);
    this.setLayout(new GridLayout(1,2));
    this.setVisible(true);

    // panel building
    buildRightPanel();
    buildLeftPanel();

    // adding panels to the frame
    add(rightpanel);
    add(leftpanel);

    //packing the JFrame
    this.pack();
  }//end constructor

  public void buildRightPanel()
  {
    // setting JPanel
    rightpanel = new JPanel();
    rightpanel.setLayout(new GridLayout(2,1));

    // setting components
    textField = new JTextField();
    submit = new JButton("Submit!");

//    ActionListener actionPreformed = (e) -> {
//      label_text = textField.getText();
//      label.setText(label_text);
//      textField.setText("");
//    };

    submit.addActionListener( (e) -> {
      label_text = textField.getText();
      label.setText(label_text);
      textField.setText("");
    });

    // adding components to the panel
    rightpanel.add(textField);
    rightpanel.add(submit);
  }//end buildRightPanel

  public void buildLeftPanel()
  {
    // setting JPanel
    leftpanel = new JPanel();

    // setting components
    label = new JLabel();

    //adding components to the panel
    leftpanel.add(label);
  }//end buildLeftPanel

}//end Main class


