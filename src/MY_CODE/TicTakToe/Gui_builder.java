/*
 * Project Name: Gui_builder.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/20/2019 | Time: 8:40 PM
 */
package MY_CODE.TicTakToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
  private Button[][] play_ground = new Button[3][3];
  private final Button pickX = new Button("Pick X first");
  private Button pickO = new Button("Pick O first");

  /**
   *
   */
  @Override
  public void start(Stage primaryStage)
  {
    buildLayout();
    primaryStage.setScene(scene);
    primaryStage.show();
  }//end start()

  /**
   *
   */
  public void buildLayout()
  {
    //Setting size for the pane
    gridPane.setMinSize(400, 200);
    //Setting the padding
    gridPane.setPadding(new Insets(10, 10, 10, 10));
    //Setting the vertical and horizontal gaps between the columns
    gridPane.setVgap(5);
    gridPane.setHgap(5);
    //Setting the Grid alignment
    gridPane.setAlignment(Pos.CENTER);

    setButtonStuff();
  }//end buildLayout()

  /**
   *
   */
  public void setButtonStuff()
  {
    for (int col = 0; col < play_ground.length; col++)
    {
      for (int row = 0; row < play_ground[0].length; row++)
      {
        play_ground = new Button[col][row];
        play_ground[col][row].setText("*");
        gridPane.add(play_ground[col][row], col, row);
      }//end inner for
    }//end for

  }//end setButtonStuff()

  /**
   *
   */
  @Override
  public void stop()
  {
    System.out.println("EXITING PROGRAM...");
  }//end stop()


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////// FUNCTIONAL SECTION //////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   *
   */
  public void checkDiagonal_Win()
  {

  }//end checkDiagWin()

  /**
   *
   */
  public void checkVertical_Win()
  {

  }//end checkDiagWin()

  /**
   *
   */
  public void checkHorizontal_Win()
  {

  }//end checkDiagWin()


}//end Main class
