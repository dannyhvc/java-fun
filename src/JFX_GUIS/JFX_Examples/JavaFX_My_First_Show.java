/**
 * Program Name: JavaFX_My_First_Show.java
 * Purpose: our very first JavaFX example, similar to MyFirstFrame in Swing
 * Coder: Bill Pulling for Sec
 * Date: Jul 23, 2018 
 */

//The gang of four
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class JavaFX_My_First_Show extends Application
{
	
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
		myStage.setTitle("JavaFX: My First Show");
		
		//create a root node...here it will be a FlowPane
		FlowPane rootNode = new FlowPane();
		
		//make a scene, pass it the flowPane, and set the size
		Scene myScene = new Scene(rootNode, 500, 500);
		
		//put the scene on the stage
		myStage.setScene(myScene);
		
		//last line: ! Raise the curtain!
		myStage.show();	
		
	}//end start()
	
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

}//end class
