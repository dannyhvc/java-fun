/*
 * Project Name: password_entering.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 3/20/2019 | Time: 7:57 PM
 */
package MY_CODE.GUI_STUFF.jfx_example;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class password_entering extends Application
{
  //girding
  private Scene scene;
  private GridPane gridPane = new GridPane();

  //NODES
  private final Text text1 = new Text("Email");
  private final Text text2 = new Text("Password");
  private TextField textField1 = new TextField();
  private PasswordField textField2 = new PasswordField(); //acts the same as text feild but hides chars.
  private final Button button1 = new Button("Submit");
  private final Button button2 = new Button("Clear");

  //fields
  private String username_str;
  private String password_str;

  //main stage method
  @Override
  public void start(Stage stage)
  {
    //Creating a Grid Pane
    buildGird();

    //Setting title to the Stage
    stage.setTitle("Password Example");

    //Adding scene to the stage
    stage.setScene(scene);

    //Displaying the contents of the stage
    stage.show();
  }//end start()

  //build methods
  public void buildGird()
  {
    button1.setOnAction(
        (e) -> {
          username_str = textField1.getText();
          password_str =  textField2.getText();
          System.out.println("Email: " + username_str +" Password: "+ password_str);
        }//end lambda
    );//end setOnAction()

    button2.setOnAction(
        (e) -> {
          textField1.setText("");
          textField2.setText("");
        }//end lambda
    );//end setOnAction()

    //Setting size for the pane
    gridPane.setMinSize(400, 200);
    //Setting the padding
    gridPane.setPadding(new Insets(10, 10, 10, 10));
    //Setting the vertical and horizontal gaps between the columns
    gridPane.setVgap(5);
    gridPane.setHgap(5);
    //Setting the Grid alignment
    gridPane.setAlignment(Pos.CENTER);

    //Arranging all the nodes in the grid
    gridPane.add(text1, 0, 0);
    gridPane.add(textField1, 1, 0);
    gridPane.add(text2, 0, 1);
    gridPane.add(textField2, 1, 1);
    gridPane.add(button1, 0, 2);
    gridPane.add(button2, 1, 2);

    //Creating a scene object
    scene = new Scene(gridPane);
  }//end buildGrid()

  public static void main(String args[])
  {
    launch(args);
  }

}//end class
