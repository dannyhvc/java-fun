/*
 * Project Name: CircleNeuronUI.java
 * Purpose:
 * Coder: Dan, Aiden, ...
 * Date: 5/12/2019 | Time: 6:14 PM
 */
package nn.Net_Ui;

import java.awt.geom.Ellipse2D;

public class CircleNeuronUI
{

  //fields
  private double x_pos = 1.0;
  private double y_pos = 1.0;
  private double rad_x = 1.0;
  private double rad_y = 1.0;

  CircleNeuronUI(double r, double x, double y)
  {
    this.x_pos = x;
    this.y_pos = y;
    this.rad_x = r; this.rad_y = r;
  }//end c1
  CircleNeuronUI(double rx, double ry, double x, double y)
  {
    this.x_pos = x;
    this.y_pos = y;
    this.rad_x = rx;
    this.rad_y = ry;
  }//end c1
  CircleNeuronUI() {}

  //rad_x setters and getters
  public double getRad_x()
  {
    return rad_x;
  }
  public void setRad_x(double rad_x)
  {
    rad_x = rad_x;
  }

  //rad_y setters and getters
  public double getRad_y()
  {
    return rad_y;
  }
  public void setRad_y(double rad_y)
  {
    rad_y = rad_y;
  }

  public void draw()
  {
    Ellipse2D.Double g2d = new Ellipse2D.Double(x_pos, y_pos, rad_x, rad_y);
  }

}//end Main class
