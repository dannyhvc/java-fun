/**
	 * Class Name:	JSliderExample	
	 * Purpose:		This demonstrates how to use a JSlider. It outputs whatever the current position of the slider is. 
	 * Coder:		Madhavi Mohan
	 * Date:		March 6, 2019
*/

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener; //Notice that unlike actionlistener and itemlistener, changelistener comes from the javax.swing.event.* package


public class JSliderExample extends JFrame{
	
	//I have to declare the JLabel outside the constructor, since I call .setText() on it in a method that's outside the constructor
	JLabel output;
	
	JSliderExample()
	{
		
		super("JSlider Example");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		
		//The first parameter of the constructor lets me display the slider either horizontally or vertically.
		//The second parameter is the minimum number on the slider
		//The third parameter is the maximum number on the slider
		//The final parameter is the starting position of the slider
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
		
		//The parameter passed to setMajorTickSpacing displays 1 tick for each number. If I set it to 2, it would display 1 tick on every other number. 
		slider.setMajorTickSpacing(1);
		
		//This displays the ticks
		slider.setPaintTicks(true);
		
		JPanel p = new JPanel();
		
		output = new JLabel();
		
		p.add(output);
		p.add(slider);
		
		//Note that unlike checkboxes, radiobuttons, and regular buttons, sliders generate ChangeEvents. Accordingly I need to register a changelistener instead.
		slider.addChangeListener(new SliderHandler());
		this.add(p);
		
	}


//  ChangeListener SliderHandler = (e) -> {
//  JSlider source = (JSlider)e.getSource();
//
//    //If the slider isn't currently being moved around
//    if (!source.getValueIsAdjusting())
//    {
//      //Get the value of whatever tick it's currently at
//      int fps = (int) source.getValue();
//
//      //Convert the value to a string (setText takes only strings as parameters)
//      String out = Integer.toString(fps);
//
//      //And set the value of the output label to out
//      output.setText(out);
//    }
//  };

  private class SliderHandler implements ChangeListener
  {

    //This method gets executed every time the slider is moved
    @Override
    public void stateChanged(ChangeEvent e) {

      //Get the current slider. I have to cast it to a JSlider object, since getSource() returns an Object rather than a JSlider.
      JSlider source = (JSlider)e.getSource();

      //If the slider isn't currently being moved around
      if (!source.getValueIsAdjusting())
      {
        //Get the value of whatever tick it's currently at
        int fps = (int)source.getValue();

        //Convert the value to a string (setText takes only strings as parameters)
        String out = Integer.toString(fps);

        //And set the value of the output label to out
        output.setText(out);

      }
    }

  }

	public static void main(String[] args)
	{
		new JSliderExample();
	}
}
