package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		// button
		Button button = new Button("Enter your info");
		
		button.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    		alertBox();
		    }
		});
		
		// pane
		GridPane pane = new GridPane();
		
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setPadding(new Insets(10,10,10,10));
		pane.setHgap(5);
		pane.setVgap(5);
		
		pane.add(button, 0, 0);
		
		// scene
		Scene scene = new Scene(pane,  400, 400);
		
		// stage
		primaryStage.setTitle("Useful GUI");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void alertBox() {
		// create nodes
		Label labelOne = new Label("Name: ");
		Label labelTwo = new Label("Email: ");
		Label labelThree = new Label("Phone: ");
		
		TextField fieldOne = new TextField();
		TextField fieldTwo = new TextField();
		TextField fieldThree = new TextField();
		
		Button buttonOk = new Button("Ok");
		Button buttonCancel = new Button("Cancel");
		
		// create grid pane and add nodes
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
	
		
		pane.add(labelOne, 0, 0);
		pane.add(fieldOne, 1, 0);
		pane.add(labelTwo, 0, 2);
		pane.add(fieldTwo, 1, 2);
		pane.add(labelThree, 0, 3);
		pane.add(fieldThree, 1, 3);
		pane.add(buttonOk, 0, 4);
		pane.add(buttonCancel, 1, 4);
		
		// create new stage and set properties
		Stage dialog = new Stage();
		dialog.initModality(Modality.APPLICATION_MODAL);
		dialog.setTitle("Personal Information");
		dialog.setMinHeight(400);
		dialog.setMinWidth(400);
		

		
		// button listeners
		buttonOk.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    		System.out.println(String.format("Name: %s, Eemail: %s, phone#: %s", fieldOne.getText(), fieldTwo.getText(), fieldThree.getText()));
		    }
		});
		
		buttonCancel.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    		dialog.close();
		    }
		});
		
		
		// create new scene and add pane
		Scene personalInfo = new Scene(pane);
		dialog.setScene(personalInfo);
		dialog.showAndWait();
	}
		
	
}