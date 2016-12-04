package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerPaninis implements Initializable {

	@FXML 
	public Button HamandCheese;
	@FXML 
	public Button BaconandCheese;
	
	@FXML 
	public Button TunaSalad;

	@FXML 
	public Button ChickenParmesan;
	
	@FXML 
	public Button EggplantParmesan;
	
	@FXML 
	public Button TurkeyandCheddar;
	
	@FXML 
	public Button Veggie;
	
	@FXML 
	public Button Caprese;
	
	
	
	@FXML 
	public Button Back;
	
	double ItemPrice = 10.99;
	int UniqueItemId = 138;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		HamandCheese.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.49;
				UniqueItemId = 182;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		BaconandCheese.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.49;
				UniqueItemId = 182;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		TunaSalad.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 183;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		ChickenParmesan.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 184;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		EggplantParmesan.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 185;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		TurkeyandCheddar.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 186;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		Veggie.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
				ItemPrice = 7.99;
				UniqueItemId = 187;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			}
		});
		
		Caprese.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.49;
				UniqueItemId = 188;
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
