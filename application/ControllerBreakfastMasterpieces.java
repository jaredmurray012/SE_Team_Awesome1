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
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		MyStyleEggs.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			}
		});
		
		ChilaquilesWithEggs.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			}
		});
		
		ChorizoScrambler.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			}
		});
		
		FronteraEggs.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			}
		});
		
		HuevosRancheros.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			}
		});
		
		ChoppedSteak.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			}
		});
		
		BreakfastWrap.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			}
		});
		
		NYAndEggs.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
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
