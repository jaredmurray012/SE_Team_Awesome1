package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerOmelets implements Initializable
{
	
	@FXML 
	public Button Denver;
	@FXML 
	public Button Greek;
	
	@FXML 
	public Button Veggie;

	@FXML 
	public Button Ultimate;
	
	@FXML 
	public Button MeatLovers;

	@FXML 
	public Button Fiesta;
	
	@FXML 
	public Button Western;
	
	@FXML 
	public Button Back;
	
	double ItemPrice = 0;
	int UniqueItemId = 0; 
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		Denver.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.25;
				UniqueItemId = 129;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		Greek.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		Veggie.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		Ultimate.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		MeatLovers.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		Fiesta.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		Western.setOnAction(new EventHandler<ActionEvent> ()
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
