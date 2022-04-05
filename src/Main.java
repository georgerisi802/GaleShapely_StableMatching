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
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.*;


public class Main extends Application{
	
	public static void main(String [] args) {
		launch(args);	//Starts application
	}
	
	public void start(Stage mainStage) {
		
		mainStage.setTitle("Stable Matching App");					// Main GUI window
		int stageWidth = 600;
		int stageHeight = 600;
		
		
		FlowPane rootNode = new FlowPane(Orientation.VERTICAL);
		rootNode.setPrefWrapLength(stageHeight);
		
		FlowPane subNode1 = new FlowPane(Orientation.HORIZONTAL);
		subNode1.setPrefWrapLength(stageWidth);
		FlowPane subNode2 = new FlowPane(Orientation.HORIZONTAL, 20, 20);
		subNode2.setPrefWrapLength(stageWidth);
		rootNode.getChildren().addAll(subNode1, subNode2);
		
		// Intro/instructions
		Text intro = new Text();
		intro.setFont(new Font(20));
		intro.setText("Welcome to this app.\nHere are some instructions.");
		subNode1.getChildren().add(intro);
		
		// Two tables
		GridPane leftTable = new GridPane();						// For group 1	
		GridPane rightTable = new GridPane();						// For group 2
		subNode2.getChildren().addAll(leftTable, rightTable);
		
		// Left Table Stuff
		leftTable.add(new TextField("group1 a"), 0, 0);
		leftTable.add(new Button("Rank"), 1, 0);
		leftTable.add(new TextField("group1 b"), 0, 1);
		leftTable.add(new Button("Rank"), 1, 1);
		
		// Right Table stuff
		rightTable.add(new TextField("group2 a"), 0, 0);
		rightTable.add(new Button("Rank"), 1, 0);
		rightTable.add(new TextField("group2 b"), 0, 1);
		rightTable.add(new Button("Rank"), 1, 1);
		
		//Label test1 = new Label("TESTING");
		
		Button matchButt = new Button("Match!");
		
		
		Scene mainScene = new Scene(rootNode, stageWidth, stageHeight);
		
		mainStage.setScene(mainScene);
		
		mainStage.show();
	}
}
