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
	
	double ItemPrice = 0;
	int UniqueItemId = 0;
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		BiscuitsandGravyFull.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 5.99;
				UniqueItemId = 156;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		BiscuitsandGravyHalf.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 3.99;
				UniqueItemId = 157;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		CountryFriedSteak.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.99;
				UniqueItemId = 158;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		SouthernBreakfast.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.49;
				UniqueItemId = 160;
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
