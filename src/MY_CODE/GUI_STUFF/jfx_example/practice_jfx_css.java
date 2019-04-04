/*
 * Project Name: practice_jfx_css.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/22/2019 | Time: 4:16 PM
 */
package MY_CODE.GUI_STUFF.jfx_example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class practice_jfx_css extends Application
{

  /**
   *
   */
  @Override public void start(Stage primaryStage) throws Exception
  {
    //setting scene.
    FlowPane pane = new FlowPane();
    Text text = new Text("TESTING FOR CSS");

    //adds text to pane
    pane.getChildren().add(text);
    text.setId("dud");
    pane.getStylesheets().add(getClass().getResource("practice.css").toExternalForm());

    //adding to stage
    Scene scene = new Scene(pane, 400 ,400);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /**
   *
   */
  public void stop()
  {
    System.out.println("End of program");
  }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public static void main(String[] args)
  {
    launch(args);
  }//end psvm()
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}//end Main class
