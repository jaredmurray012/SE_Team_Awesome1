package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerWraps implements Initializable {

	@FXML 
	public Button FishFilet;
	@FXML 
	public Button ChickenCesar;
	
	@FXML 
	public Button ChickenRanch;

	@FXML 
	public Button ChickenSpinach;
	
	@FXML 
	public Button SteakandCheese;
	
	@FXML 
	public Button TunaSalad;
	
	@FXML 
	public Button BuffaloChicken;
	
	
	@FXML 
	public Button Back;
	
	double ItemPrice = 0.00; 
	int UniqueItemId = 0; 
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		FishFilet.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.99;
				UniqueItemId = 189;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		ChickenCesar.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 190;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		ChickenRanch.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 191;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		ChickenSpinach.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 192;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		SteakandCheese.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.99;
				UniqueItemId = 193;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		TunaSalad.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.99;
				UniqueItemId = 194;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		BuffaloChicken.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.99;
				UniqueItemId = 195;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		Back.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
				Main.Scenes.DisplayLunchOptionsScene();
				//Main.dbconnect. 
			}
		});
		
		
}
}
