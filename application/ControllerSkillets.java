package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerSkillets implements Initializable
{
	
	@FXML 
	public Button WesternSkillet;
	
	@FXML 
	public Button FiestaSkillet;
	
	@FXML 
	public Button HawaiiSkillet;

	@FXML 
	public Button MeatLoversSkillet;
	
	@FXML 
	public Button SantaFeSkillet;
	

	@FXML 
	public Button VeggieSkillet;
	

	@FXML 
	public Button IrishSkillet;
	
	@FXML 
	public Button Back;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		WesternSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		FiestaSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		HawaiiSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		MeatLoversSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		SantaFeSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		VeggieSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		IrishSkillet.setOnAction(new EventHandler<ActionEvent> ()
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
						Main.Scenes.DisplayBreakfastScene();
						//Main.dbconnect. 	
					}
				});
	}
	
	
	
}
