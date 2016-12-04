package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerSalads implements Initializable
{
	
	@FXML 
	public Button btn_idgardensalad;
	@FXML 
	public Button btn_idjuliennesalad;
	
	@FXML 
	public Button btn_idtacosalad;

	@FXML 
	public Button btn_idgreeksalad;
	
	@FXML 
	public Button btn_idcesarsalad;
	
	@FXML 
	public Button back; 
	
	double ItemPrice = 0;
	int UniqueItemId = 0;

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		btn_idgardensalad.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 6.79;
				UniqueItemId = 208;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		btn_idjuliennesalad.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 210;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		btn_idtacosalad.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 9.49;
				UniqueItemId = 212;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		btn_idgreeksalad.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.99;
				UniqueItemId = 209;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		btn_idcesarsalad.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 8.49;
				UniqueItemId = 211;
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
