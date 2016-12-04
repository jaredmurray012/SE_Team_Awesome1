package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerBreakfastMasterpieces implements Initializable
{
	
	@FXML 
	public Button MyStyleEggs;
	@FXML 
	public Button ChilaquilesWithEggs;
	
	@FXML 
	public Button ChorizoScrambler;

	@FXML 
	public Button FronteraEggs;
	
	@FXML 
	public Button HuevosRancheros;

	@FXML 
	public Button ChoppedSteak;
	
	@FXML 
	public Button BreakfastWrap;
	
	@FXML 
	public Button NYAndEggs;
	
	@FXML 
	public Button Back;
	
	double ItemPrice = 0;
	int UniqueItemId = 0;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		MyStyleEggs.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.25;
				UniqueItemId = 136;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			}
		});
		
		ChilaquilesWithEggs.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.25;
				UniqueItemId = 137;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			}
		});
		
		ChorizoScrambler.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.25;
				UniqueItemId = 139;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			}
		});
		
		FronteraEggs.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 9.49;
				UniqueItemId = 140;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			}
		});
		
		HuevosRancheros.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.25;
				UniqueItemId = 141;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			}
		});
		
		ChoppedSteak.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 9.49;
				UniqueItemId = 143;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			}
		});
		
		BreakfastWrap.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 7.49;
				UniqueItemId = 142;
				Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
			}
		});
		
		NYAndEggs.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				ItemPrice = 10.99;
				UniqueItemId = 138;
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
