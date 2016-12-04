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
	
	double ItemPrice = 0;
	int UniqueItemId = 0;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		TraditionalBenedict.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 144;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		CountryBenedict.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 145;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		EggsFlorentine.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 146;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		SantaFeBenedict.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 148;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		AlaskaBenedict.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 9.25;
				UniqueItemId = 147;
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
