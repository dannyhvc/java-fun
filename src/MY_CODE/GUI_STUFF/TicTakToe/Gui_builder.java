/*
 * Project Name: Gui_builder.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/20/2019 | Time: 8:40 PM
 */
package MY_CODE.GUI_STUFF.TicTakToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Gui_builder extends Application
{
  //fields
  private String X_Win;
  private String O_Win;

  //Sections
  private final GridPane gridPane = new GridPane();
  private final Scene scene = new Scene(gridPane);

  //elements
  private Button[][] play_ground =
      {
          {new Button("*"), new Button("*"), new Button("*")},
          {new Button("*"), new Button("*"), new Button("*")},
          {new Button("*"), new Button("*"), new Button("*")}
      };

  /**
   *
   */
  @Override
  public void start(Stage primaryStage)
  {
    buildLayout();
    buildLayout();
    primaryStage.setScene(scene);
    primaryStage.show();
  }//end start()

  /**
   *
   */
  public void buildLayout()
  {
    
  }//end buildLayout()

  public void buildButtons()
  {
    for(int col=0; col < play_ground.length; col++)
    {
      for(int row=0; row < play_ground[0].length; row++)
      {
        gridPane.add(play_ground[col][row], col, row);
      }//end for=i
    }//end for=o

  }//end buildButtons()

  /**
   *
   */
  @Override
  public void stop()
  {
    System.out.println("EXITING PROGRAM...");
  }//end stop()

}//end Main class
