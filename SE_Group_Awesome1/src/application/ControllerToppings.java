package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerToppings implements Initializable
{
	
	@FXML 
	public Button Strawberries;
	
	@FXML 
	public Button Blueberries;
	
	@FXML 
	public Button Pecans;
	
	@FXML 
	public Button CinnamonApple;
	
	@FXML 
	public Button BananaSlices;
	
	@FXML 
	public Button Cherries;
	
	@FXML 
	public Button Back;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		Strawberries.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		Blueberries.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		Pecans.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		CinnamonApple.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		BananaSlices.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		Cherries.setOnAction(new EventHandler<ActionEvent> ()
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
				
			
			}
		});
		
		
	}
	
	
	
}
