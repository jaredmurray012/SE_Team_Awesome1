package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerHealthyChoices implements Initializable
{
	
	@FXML 
	public Button EggBeaters;
	
	@FXML 
	public Button Oatmeal;
	
	@FXML 
	public Button CottageCheese;
	
	@FXML 
	public Button Back;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		EggBeaters.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		Oatmeal.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		CottageCheese.setOnAction(new EventHandler<ActionEvent> ()
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
