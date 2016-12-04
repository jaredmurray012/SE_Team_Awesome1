package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerMexicanCuisine implements Initializable {
	@FXML 
	public Button TacosDinner;
	@FXML 
	public Button Enchiladas;
	
	@FXML 
	public Button SteakFajitas;

	@FXML 
	public Button ChickenFajitas;
	
	@FXML 
	public Button ChickenFlutes;
	
	@FXML 
	public Button BeefFlutes; 
	
	@FXML
	public Button ShrimpTacos;
	
	@FXML
	public Button TilapiaFilletTacos;
	
	@FXML
	public Button BanderillasDeCamaron;
	
	@FXML
	public Button Backid;
	
	double ItemPrice = 0;
	int UniqueItemId = 0;
	
	public void initialize(URL location, ResourceBundle resources) 
	{
		TacosDinner.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 9.25;
				UniqueItemId = 201;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		Enchiladas.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 11.25;
				UniqueItemId = 202;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		SteakFajitas.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 11.99;
				UniqueItemId = 204;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		ChickenFajitas.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 11.75;
				UniqueItemId = 204;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		ChickenFlutes.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 11.75;
				UniqueItemId = 205;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		BeefFlutes.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 11.75;
				UniqueItemId = 205;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		ShrimpTacos.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 12.75;
				UniqueItemId = 206;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		TilapiaFilletTacos.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 12.75;
				UniqueItemId = 206;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		BanderillasDeCamaron.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 12.75;
				UniqueItemId = 207;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			
			}
		});
		
		Backid.setOnAction(new EventHandler<ActionEvent> ()
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
