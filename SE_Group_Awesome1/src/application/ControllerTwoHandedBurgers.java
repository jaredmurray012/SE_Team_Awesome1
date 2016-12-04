package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerTwoHandedBurgers implements Initializable {

	@FXML 
	public Button TheClassic;
	@FXML 
	public Button PattyMelt;
	
	@FXML 
	public Button ConchisBurger;

	@FXML 
	public Button BaconCheeseBurger;
	
	@FXML 
	public Button WisconsinBurger;
	
	@FXML 
	public Button Hawaiian; 
	
	@FXML 
	public Button Back;
	
	double ItemPrice = 0.00; 
	int UniqueItemId = 0; 
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		TheClassic.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.49;
				UniqueItemId = 171;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		PattyMelt.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 172;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		ConchisBurger.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 174;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		BaconCheeseBurger.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 173;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		WisconsinBurger.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 175;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		Hawaiian.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 176;
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
