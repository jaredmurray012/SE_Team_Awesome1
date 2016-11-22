package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerFamousBenedicts implements Initializable
{
	
	@FXML 
	public Button TraditionalBenedict;
	
	@FXML 
	public Button CountryBenedict;
	
	@FXML 
	public Button EggsFlorentine;

	@FXML 
	public Button SantaFeBenedict;
	
	@FXML 
	public Button AlaskaBenedict;
	
	@FXML 
	public Button Back;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		TraditionalBenedict.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		CountryBenedict.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		EggsFlorentine.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		SantaFeBenedict.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		AlaskaBenedict.setOnAction(new EventHandler<ActionEvent> ()
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
