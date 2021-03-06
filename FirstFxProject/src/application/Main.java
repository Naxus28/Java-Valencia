package application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;


/**
 * UI components (parent to children)
 * stage
 * scene
 * pane
 * node
 * 
 * we need to create components from the bottom of hierarchy up because children 
 * need to have been created before they are added to the parents
 
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		// create nodes
		Button button = new Button("click me");
		Button button2 = new Button("submit form");
		
		Label label = new Label("Enter name");
		
		
		// radio toggle
		ToggleGroup group = new ToggleGroup();
		
		RadioButton radioOne = new RadioButton("select first");
		radioOne.setToggleGroup(group);
		radioOne.setSelected(true);
		
		RadioButton radioTwo = new RadioButton("select second");
		radioTwo.setToggleGroup(group);
		
		
		// text field
		TextField text = new TextField();
		
		
		//A checkbox without a caption
		CheckBox cb1 = new CheckBox();
		cb1.setText("First"); // set caption
		cb1.setSelected(true);
		
		
		//A checkbox with a string caption
		CheckBox cb2 = new CheckBox("Second");
		
		
		//combo box
		ObservableList<String> options = 
			    FXCollections.observableArrayList(
			        "Option 1",
			        "Option 2",
			        "Option 3"
			    );
	
		final ComboBox<String> comboBox = new ComboBox<>(options);

		
		// create flow pane
		FlowPane flowPane = new FlowPane();
		
		
		// add all nodes to flow pane
		flowPane.getChildren().addAll(button, button2, label, radioOne, radioTwo, text, cb1, cb2, comboBox);
	
		// create scene
		Scene scene = new Scene(flowPane, 400, 400);
		
		// add scene to stage
		primaryStage.setScene(scene);
		
		// set title to stage--this could be set at the top because it has no children
		primaryStage.setTitle("First Fx App");
		
		// show stage
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
