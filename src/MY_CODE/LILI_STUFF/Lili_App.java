/*
 * Project Name: Lili_App.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/16/2019 | Time: 6:25 PM
 */
package MY_CODE.LILI_STUFF;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Lili_App extends JFrame
{
  // fields =======================================================================================================
  private JPanel north, center, south, f1_panel;
  private JTextField input;
  private JButton submit, started;
  private JLabel result;
  private Font WELOMER = new Font("Serif", Font.BOLD, 45);

  //setting objs
  JFrame f1 = new JFrame("Lili Lottery <3 [1..25]");
  JFrame f2 = new JFrame("Lili Lottery <3 [1..25]");

  // CONSTRUCTOR ==================================================================================================
  Lili_App()
  {
    //setting boilerplate's
    boilerPlateF2();
    boilerPlateF1();

    //f2 build methods
    buildF1Panel();

    //f2 build Methods
    buildNorth();
    buildCenter();
    buildSouth();

    //adding panels to f1
    f1.add(f1_panel);

    //adding panels to the f2
    f2.add(north, BorderLayout.NORTH);
    f2.add(center, BorderLayout.CENTER);
    f2.add(south, BorderLayout.SOUTH);

    f1.pack();
    f2.pack();
  }//end constructor

  // BOILERPLATE's ================================================================================================
  public void boilerPlateF1()
  {
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setSize(800, 400);
    f1.setLocationRelativeTo(null);
    f1.setVisible(true);
    f1.setLayout(new BorderLayout());
  }

  public void boilerPlateF2()
  {
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f2.setSize(800, 400);
    f2.setLocationRelativeTo(null);
    f2.setVisible(false);
    f2.setLayout(new BorderLayout());
  }

  // F1 -> BUILD METHODS ==========================================================================================
  public void buildF1Panel()
  {
    f1_panel = new JPanel(); f1_panel.setLayout(new GridLayout(1,1));
    f1_panel.setBorder(BorderFactory.createLineBorder(Color.RED));

    //settings for elements
    started = new JButton("WELCOME NIGGER!");
    started.setFont(WELOMER);
    started.addActionListener( (e) ->
    {
      f1.setVisible(false);
      f2.setVisible(true);
    });

    //TODO: adding to the panel
    f1_panel.add(started);


  }// end buildF1Panel

  // F2 -> BUILD METHODS ==========================================================================================
  public void buildNorth() //Label PANEL
  {
    //settings for the north panel
    north = new JPanel(); north.setLayout(new GridLayout(1,1));
    north.setBorder(BorderFactory.createLineBorder(Color.RED));

    //settings for elements
    result = new JLabel("LILI LOTTERY", SwingConstants.CENTER);
    result.setFont(WELOMER);

    //TODO: adding to the panel
    north.add(result);

  }//end buildNorth()

  public void buildCenter() //Input PANEL
  {
    //settings for the center panel
    center = new JPanel(); center.setLayout(new GridLayout(1,1));
    center.setBorder(BorderFactory.createLineBorder(Color.RED));

    //settings for elements
    input = new JTextField("", 10);
    input.setFont(WELOMER);
    input.setHorizontalAlignment(JTextField.CENTER);

    //adding to the panel
    center.add(input);

  }//end buildCenter()

  public void buildSouth() // Submit PANEL
  {
    //settings for the south panel
    south = new JPanel();  south.setLayout(new GridLayout(1,1));
    south.setBorder(BorderFactory.createLineBorder(Color.RED));

    //settings for elements
    submit = new JButton("Submit");
    submit.setFont(WELOMER);
    getInput();

    //TODO: adding to the panel
    south.add(submit);
  }//end buildSouth()

  public void getInput()
  {
    submit.addActionListener( (e) ->
    {
      Random rand = new Random();
      int num = rand.nextInt(25) + 1;

      switch (submit.getText())
      {
        case "Submit":
          //check if the input if equal to the rand
          if (input.getText().equals(num + ""))
          {
            result.setText("YAY!: " + num);
            submit.setText("Try Again");
          }
          else
          {
            result.setText("HEHE: " + num);
            submit.setText("Try Again");
          }//end if-else
          break;

        case "Try Again":
          result.setText("LILI LOTTERY");
          input.setText("");
          submit.setText("Submit");
          break;

        default:
          break;
      }//end switch
    });
  }//end getInput()

  public static void main(String[] args)
  {
    new Lili_App();
  }

}//end Main class

