package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerSpecialtySandwiches implements Initializable {

	@FXML 
	public Button ChickenBLT;
	@FXML 
	public Button ChickenPhilly;
	
	@FXML 
	public Button ChickenParmesan;

	@FXML 
	public Button GrilledFriedChicken;
	
	@FXML 
	public Button ChickenRanchPita;
	
	@FXML 
	public Button LoxandBagel; 
	
	@FXML 
	public Button NYStrip;

	@FXML 
	public Button SteakPita;
	
	@FXML 
	public Button ItalianBeef;
	
	@FXML 
	public Button SteakPhilly; 
	
	@FXML 
	public Button Back;
	
	double ItemPrice = 0.00; 
	int UniqueItemId = 0;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{

		ChickenBLT.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 161;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		ChickenPhilly.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 162;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		ChickenParmesan.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 163;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		GrilledFriedChicken.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 164;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		ChickenRanchPita.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 165;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		LoxandBagel.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 9.25;
				UniqueItemId = 166;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		NYStrip.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 10.99;
				UniqueItemId = 167;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		SteakPita.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 168;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		ItalianBeef.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 169;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		SteakPhilly.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 100;
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
