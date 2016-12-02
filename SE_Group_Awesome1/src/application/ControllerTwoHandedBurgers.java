package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerTwoHandedBurgers implements Initializable {

	@FXML 
	public Button TheClassic;
	@FXML 
	public Button PattyMelt;
	
	@FXML 
	public Button ConchisBurger;

	@FXML 
	public Button BaconCheeseBurger;
	
	@FXML 
	public Button WisconsinBurger;
	
	@FXML 
	public Button Hawaiian; 
	
	@FXML 
	public Button Back;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		TheClassic.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		PattyMelt.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		ConchisBurger.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		BaconCheeseBurger.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		WisconsinBurger.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		Hawaiian.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		Back.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayLunchOptionsScene();
				//Main.dbconnect. 
			
			}
		});
		
		
}
}
