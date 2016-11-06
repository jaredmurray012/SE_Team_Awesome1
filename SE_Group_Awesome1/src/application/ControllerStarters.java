package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerStarters implements Initializable
{
	
	@FXML 
	public Button idguacandchips;
	@FXML 
	public Button idmixedflutes;
	
	@FXML 
	public Button idmeltedcheese;

	@FXML 
	public Button idloadedfries;
	
	@FXML 
	public Button idmozzarellasticks;
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		idguacandchips.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		idmixedflutes.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		idmeltedcheese.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		idloadedfries.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		idmozzarellasticks.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
	}
	
	
	
}
