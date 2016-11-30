package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerLunchOptions implements Initializable {

	@FXML 
	public Button SpecialtySandwiches;
	@FXML 
	public Button TwoHandedBurgers;
	
	@FXML 
	public Button ClassicSandwiches;

	@FXML 
	public Button Paninis;
	
	@FXML 
	public Button Wraps;
	
	@FXML 
	public Button Quesadillas; 
	
	@FXML 
	public Button Back;

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		SpecialtySandwiches.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
				Main.Scenes.DisplaySpecialtySandwichesScene();
				//Main.dbconnect. 
			}
		});

		TwoHandedBurgers.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayTwoHandedBurgersScene();
						//Main.dbconnect. 
					}
				});
		
		ClassicSandwiches.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayClassicSandwichesScene();
						//Main.dbconnect. 
					}
				});
		Paninis.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayPaninisScene();
						//Main.dbconnect. 
					}
				});
		Wraps.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayWrapsScene();
						//Main.dbconnect. 
					}
				});
		
		Quesadillas.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayQuesadillasScene();
						//Main.dbconnect. 
					}
				});
		Back.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayMenuOptionsScene();
						//Main.dbconnect. 
					}
				});
		
		
		}
	}
		
	
 


