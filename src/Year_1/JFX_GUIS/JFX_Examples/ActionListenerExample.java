package Year_1.JFX_GUIS.JFX_Examples; /**
 * This demonstrates how to integrate even
 */
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.stage.*;

public class ActionListenerExample extends Application{
	
	Label myLabel;
	//over-ride init() if necessary
	public void init()
	{
		//stub
		System.out.println("Inside the init() method, nothing much to do here...");
	}//end init()
	
	//FULFILL the contract and over-ride start()
	public void start(Stage myStage)
	{
		//stub
		System.out.println("Inside the start() method, putting things together...");
		
		//set the title
		myStage.setTitle("JavaFX: Showing a Label Object");
		
		//create a root node...here it will be a FlowPane
		FlowPane rootNode = new FlowPane();
		
		//make a scene, pass it the flowPane, and set the size
		Scene myScene = new Scene(rootNode, 500, 500);
		
		//REVSISION: make a Label
		myLabel = new Label("Here is an example of a JavaFX Label object...");
		
		//Added a button to JavaFX_My_Second_Show
		Button btn = new Button("Click me");
		btn.setOnAction(new buttonListener());
		
		//add the label to the scene graph
		rootNode.getChildren().add(myLabel);
		rootNode.getChildren().add(btn);
		//put the scene on the stage
		myStage.setScene(myScene);
		

		//last line: ! Raise the curtain!
		myStage.show();	
		
	}//end start()
	
	//Just like in swing, you can create a private inner class to handle events. You could also do anonymous inner classes or implement this in the host class
	private class buttonListener implements EventHandler<ActionEvent>
	{

		@Override
		public void handle(ActionEvent event) {
			myLabel.setText("Button was clicked!");
		}
		
	}
	//over-ride the stop() method if necessary
	public void stop()
	{
		//stub
		System.out.println("Inside stop() method, shutting things down...");
	}

	
	public static void main(String[] args)
	{
		//stub
		System.out.println("Inside the main, calling the launch() method to start everything...");
		// call launch
		launch(args);

	}//end main
	
	
}
