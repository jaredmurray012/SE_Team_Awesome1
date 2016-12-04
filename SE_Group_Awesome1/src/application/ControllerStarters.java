package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerStarters implements Initializable
{
	
	@FXML 
	public Button idguacandchips;
	@FXML 
	public Button idmixedflutes;
	
	@FXML 
	public Button idmeltedcheese;

	@FXML 
	public Button idloadedfries;
	
	@FXML 
	public Button idmozzarellasticks;
	
	@FXML
	public Button back;
	
	double ItemPrice = 0.00; 
	int UniqueItemId = 0;

	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		idguacandchips.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 5.95;
				UniqueItemId = 100;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		idmixedflutes.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.95;
				UniqueItemId = 101;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		idmeltedcheese.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 6.95;
				UniqueItemId = 103;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		idloadedfries.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 6.95;
				UniqueItemId = 104;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		idmozzarellasticks.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 6.95;
				UniqueItemId = 103;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		back.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						Main.Scenes.DisplayMenuOptionsScene();
						//Main.dbconnect. 
					
					
					}
				});
	}
	
	
	
}
