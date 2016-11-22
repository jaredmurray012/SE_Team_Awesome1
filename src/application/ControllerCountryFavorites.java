package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerCountryFavorites implements Initializable
{
	
	@FXML 
	public Button BiscuitsandGravyFull;
	
	@FXML 
	public Button BiscuitsandGravyHalf;
	
	@FXML 
	public Button CountryFriedSteak;

	@FXML 
	public Button SouthernBreakfast;
	
	
	@FXML 
	public Button Back;
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		BiscuitsandGravyFull.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		BiscuitsandGravyHalf.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		CountryFriedSteak.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		SouthernBreakfast.setOnAction(new EventHandler<ActionEvent> ()
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
