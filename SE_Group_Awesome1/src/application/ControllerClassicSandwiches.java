package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerClassicSandwiches implements Initializable {

	@FXML 
	public Button BLTClub;
	@FXML 
	public Button HamCheeseClub;
	
	@FXML 
	public Button TurkeyClub;

	@FXML 
	public Button MonteCristo;
	
	@FXML 
	public Button ClassicReuben;
	
	double ItemPrice = 0;
	int UniqueItemId = 0;
	
	@FXML 
	public Button Back;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		BLTClub.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 177;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			
			}
		});
		
		HamCheeseClub.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 178;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			
			}
		});
		
		TurkeyClub.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 179;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			
			}
		});
		MonteCristo.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 180;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			
			}
		});
		
		ClassicReuben.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 181;
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
