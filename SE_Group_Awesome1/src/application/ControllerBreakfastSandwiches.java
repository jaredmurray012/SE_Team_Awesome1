
package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerBreakfastSandwiches implements Initializable
{
	
	@FXML 
	public Button idCheese;
	@FXML 
	public Button idSausageHamBacon;
	
	@FXML 
	public Button idVeggie;

	@FXML 
	public Button idFriedEggSand;
	
	@FXML 
	public Button Back;
	
	double ItemPrice = 0;
	int UniqueItemId = 0;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	idCheese.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						ItemPrice = 4.99;
						UniqueItemId = 105;
						Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
					}
				});
	idSausageHamBacon.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 5.99;
					UniqueItemId = 108;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				}
			});
	idVeggie.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 4.99;
					UniqueItemId = 105;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				}
			});
	idFriedEggSand.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 4.99;
					UniqueItemId = 106;
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