package Year_1.swing.D_H_PartC;/*
 * Project Name: D_H_TempConverter.java
 * Purpose: This swing application will convert a temperature from one to another depending on which
 *          textbox was entered
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 4/22/2019 | Time: 5:09 PM
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class D_H_TempConverter extends JFrame
{

  // fields
  private JPanel north, west, center, east;
  private JTextField fahr_f, cel_f, kel_f;
  private JButton clear, calculate;
  private JLabel welcome, fahr_label, cel_label, kel_label;

  D_H_TempConverter()
  {
    super("Dan Herrera's Temperature Converter");//constructor from JFrame class

    //boilerplate code: set up the jFrame with basic configs.
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the program when the x is hit
    this.setSize(400, 200);
    this.setLocationRelativeTo(null);//opens window in the middle of the screen
    //hgap =  horizontal gap between grids //vgap =  vertical gap between grids.
    this.setLayout(new BorderLayout());//changes the view of the components depending on the window size.
    this.setVisible(true);

    // Build Methods
    build_North();
    build_West();
    build_Center();
    build_East();

    // adding components to the JFrame
    this.add(north, BorderLayout.NORTH);
    this.add(west, BorderLayout.WEST);
    this.add(center, BorderLayout.CENTER);
    this.add(east, BorderLayout.EAST);

  }//end constructor


  /**
   * builds the north panel
   */
  public void build_North()
  {
    north = new JPanel();
    north.setBackground(Color.BLACK);
    welcome = new JLabel("Enter a temperature in any field and press the Calculate button");
    // adding component to the panel
    north.add(welcome);
  }//end build_North()


  /**
   * builds the west panel
   */
  public void build_West()
  {
    west = new JPanel();
    west.setLayout(new GridLayout(3, 1));

    fahr_label = new JLabel("Fahrenheit Temp: ");
    cel_label = new JLabel("Celsius Temp: ");
    kel_label = new JLabel("Kelvin Temp: ");
    // adding componenets to the Jpanel
    west.add(fahr_label);
    west.add(cel_label);
    west.add(kel_label);
  }


  /**
   * builds the center panel
   */
  public void build_Center()
  {
    center = new JPanel();
    center.setLayout(new GridLayout(3,1));

    fahr_f = new JTextField("");
    cel_f = new JTextField("");
    kel_f = new JTextField("");

    center.add(fahr_f);
    center.add(cel_f);
    center.add(kel_f);
  }


  /**
   * builds the eastern panel
   */
  public void build_East()
  {

    east = new JPanel();
    east.setLayout(new GridLayout(2,1));

    clear = new JButton("Clear Fields");
    calculate = new JButton("Calculate");

    clear.addActionListener(new Clear_listen());
    calculate.addActionListener(new Calc_listen());
    //clear functionality.

    east.add(clear);
    east.add(calculate);
  }


  /**
   * action listenr class to clear the text
   */
  private class Clear_listen implements ActionListener
  {

    @Override
    public void actionPerformed(ActionEvent e)
    {
      fahr_f.setText("");
      cel_f.setText("");
      kel_f.setText("");
    }
  }


  /**
   * action listener class to make the conversions
   */
  private class Calc_listen implements ActionListener, D_H_TempConvertable
  {
    @Override
    public double convertFtoC(double fTemp)
    {
      return (double)5/9 * (fTemp - 32);
    }

    @Override
    public double convertCtoF(double cTemp)
    {
      return (double)9/5 * cTemp + 32;
    }

    @Override
    public double convertCtoK(double cTemp)
    {
      return cTemp + 273.15;
    }

    @Override
    public double convertKtoC(double kTemp)
    {
      return kTemp - 273.15;
    }

    @Override
    public double convertFtoK(double fTemp)
    {
      return convertCtoK(convertFtoC(fTemp));
    }

    @Override
    public double convertKtoF(double kTemp)
    {
      return convertKtoC(convertCtoF(kTemp));
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
      // tries to find a values for which it can calculate the conversions
      try
      {
        if (Double.parseDouble(fahr_f.getText()) >= 0 || Double.parseDouble(fahr_f.getText()) < 0
            && (cel_f.getText().equals("") && kel_f.getText().equals("")))
        {
          cel_f.setText("" + convertFtoC(Double.parseDouble(fahr_f.getText())));
          kel_f.setText("" + convertFtoK(Double.parseDouble(fahr_f.getText())));
        }

        if (Double.parseDouble(cel_f.getText()) >= 0 || Double.parseDouble(cel_f.getText()) < 0
            && (fahr_f.getText().equals("") && kel_f.getText().equals("")))
        {
          fahr_f.setText("" + convertCtoF(Double.parseDouble(cel_f.getText())));
          kel_f.setText("" + convertCtoK(Double.parseDouble(cel_f.getText())));
        }

        if (Double.parseDouble(kel_f.getText()) >= 0 || Double.parseDouble(kel_f.getText()) < 0
            && (fahr_f.getText().equals("") && cel_f.getText().equals("")))
        {
          fahr_f.setText("" + convertKtoF(Double.parseDouble(kel_f.getText())));
          cel_f.setText("" + convertKtoC(Double.parseDouble(kel_f.getText())));
        }

      }
      catch (Exception err)
      {
        System.out.println(err.getMessage());
        fahr_f.setText("Enter a decimal value");
        cel_f.setText("Enter a decimal value");
        kel_f.setText("Enter a decimal value");
      }

    }

  }


//######################################################################################################################
  public static void main(String[] args)
  {
    new D_H_TempConverter();
  }
//######################################################################################################################

}//end Main class
