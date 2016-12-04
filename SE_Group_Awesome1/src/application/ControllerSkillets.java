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
	
	double ItemPrice = 0.00; 
	int UniqueItemId = 0;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		WesternSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.99;
				UniqueItemId = 149;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			}
		});
		
		FiestaSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.99;
				UniqueItemId = 152;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		HawaiiSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.99;
				UniqueItemId = 154;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		MeatLoversSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.99;
				UniqueItemId = 150;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		SantaFeSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.99;
				UniqueItemId = 151;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		VeggieSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 152;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		IrishSkillet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 155;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
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
