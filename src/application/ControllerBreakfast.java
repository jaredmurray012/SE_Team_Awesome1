package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerBreakfast implements Initializable
{
	
	@FXML 
	public Button idHotOffTheGriddle;
	@FXML 
	public Button idHealthyOptions;
	
	@FXML 
	public Button idOmelets;

	@FXML 
	public Button idSkillets;
	
	@FXML 
	public Button idFamousBenedicts;
	
	@FXML 
	public Button idCountryFavorites; 
	
	@FXML
	public Button idBreakfastSandwiches;
	
	@FXML
	public Button idBreakfastMasterpieces;

	@FXML
	public Button back;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		idHotOffTheGriddle.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		idHealthyOptions.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		idOmelets.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		idSkillets.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		idFamousBenedicts.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		idCountryFavorites.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		idBreakfastSandwiches.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		idBreakfastMasterpieces.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		back.setOnAction(new EventHandler<ActionEvent> ()
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
