import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.control.*;//must add this to get access to the controls
import javafx.stage.*;

public class CarPaymentCalculator extends Application{
	
	ToggleGroup group;
	RadioButton rbOneYear, rbTwoYear, rbThreeYear, rbFiveYear;
	TextField amount, monthlyPayment, totalPayment;
	
	
	public void start(Stage myStage) throws Exception
  {
		
		try 
		{
			myStage.setTitle("Car Payment Calculator");
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			Scene scene = new Scene(grid, 500, 500);
			
			myStage.setScene(scene);
			myStage.show();
			
			Text scenetitle = new Text("Car payment calculator");
			scenetitle.setId("title");
			
			Label input = new Label("Enter the amount to borrow: ");
			amount = new TextField("20000");
			Label lMonthlyInterest = new Label("Monthly Payment");
			monthlyPayment = new TextField();
			monthlyPayment.setEditable(false);
			totalPayment = new TextField();
			
			rbOneYear = new RadioButton("1 year at 5.04%");
			rbTwoYear = new RadioButton("2 year at 5.44%");
			rbThreeYear = new RadioButton("3 year at 5.79%");
			rbFiveYear = new RadioButton("5 year at 5.59%");
			group = new ToggleGroup();
			
			rbOneYear.setSelected(true);
			rbOneYear.setToggleGroup(group);
			rbTwoYear.setToggleGroup(group);
			rbThreeYear.setToggleGroup(group);
			rbFiveYear.setToggleGroup(group);
			
			grid.add(scenetitle, 0, 0);
			grid.add(input, 0, 1);
			grid.add(amount, 1, 1);
			grid.add(rbOneYear, 1, 2);
			grid.add(rbTwoYear, 1, 3);
			grid.add(rbThreeYear, 1, 4);
			grid.add(rbFiveYear, 1, 5);
			grid.add(lMonthlyInterest, 0, 6);
			grid.add(monthlyPayment, 1, 6);
			grid.add(totalPayment, 1, 7);
			
			radioButtonListener listener = new radioButtonListener();
			rbOneYear.setOnAction(listener);
			rbTwoYear.setOnAction(listener);
			rbThreeYear.setOnAction(listener);
			rbFiveYear.setOnAction(listener);
			
			scene.getStylesheets().add(getClass().getResource("test.css").toExternalForm());
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	private class radioButtonListener implements EventHandler<ActionEvent>
	{

		@Override
		public void handle(ActionEvent event) {
			
			double r, P, A;
			int n;
			
			if (group.getSelectedToggle().equals(rbOneYear))
			{
				r = 5.04/12.0/100.0;
				n = 12;
				P = Double.parseDouble(amount.getText());
				A = P * (r * Math.pow(1+r, n) / (Math.pow(1+r, n)-1));
				
				monthlyPayment.setText(""+A);
				totalPayment.setText("" + A*n);

			}
			else if (group.getSelectedToggle().equals(rbTwoYear))
			{
				System.out.println("test");
				r = 5.44/12.0/100.0;
				n = 24;
				P = Double.parseDouble(amount.getText());
				A = P * (r * Math.pow(1+r, n) / (Math.pow(1+r, n)-1));
				
				monthlyPayment.setText(""+A);
				totalPayment.setText("" + A*n);
			}
			else if (group.getSelectedToggle().equals(rbThreeYear))
			{
				r = 5.79/12.0/100.0;
				n = 36;
				P = Double.parseDouble(amount.getText());
				A = P * (r * Math.pow(1+r, n) / (Math.pow(1+r, n)-1));
				
				monthlyPayment.setText(""+A);
				totalPayment.setText("" + A*n);
			}
			else if (group.getSelectedToggle().equals(rbFiveYear))
			{
				r = 5.59/12.0/100.0;
				n = 60;
				P = Double.parseDouble(amount.getText());
				A = P * (r * Math.pow(1+r, n) / (Math.pow(1+r, n)-1));
				
				monthlyPayment.setText(""+A);
				totalPayment.setText("" + A*n);
			}
			else
			{
				totalPayment.setText("Invalid entry");
			}
		}
		
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args)
	{
		launch(args);
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
}
