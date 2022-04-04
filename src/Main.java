 /**
 This is the main class for my Stable Matching application. The application uses the Gale-Shapely algorithm
 to find an optimal match between two groups with ranked preferences toward eachother.
 
 This class defines the GUI components, launches the application, and invokes the business logic from other
 classes.
 
 @author George Risi
 
 */

import java.util.*;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.*;


public class Main extends Application{
	
	public static void main(String [] args) {
		launch(args);	//Starts application
	}
	
	public void start(Stage mainStage) {
		
		mainStage.setTitle("Stable Matching App");					// The window that holds everything
		
		FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);	// Numbers are spacing between elements
		
		FlowPane subNode1 = new FlowPane(Orientation.HORIZONTAL, 10, 10); 
		
		// rootNode pane contains two tables
		GridPane leftTable = new GridPane();						// For group 1	
		GridPane rightTable = new GridPane();						// For group 2
		rootNode.getChildren().addAll(leftTable, rightTable);
		
		// Left Table Stuff
		leftTable.add(new TextField("Dummy text"), 0, 0);
		leftTable.add(new Button("Rank"), 1, 0);
		leftTable.add(new TextField("More Dummy Text"), 0, 1);
		
		Label test1 = new Label("TESTING");
		
		TextField test2 = new TextField();
		
		
		
		Scene scene1 = new Scene(rootNode, 500, 750);
		
		mainStage.setScene(scene1);
		
		mainStage.show();
		
	}
}
