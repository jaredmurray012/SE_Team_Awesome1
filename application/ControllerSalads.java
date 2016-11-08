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
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		btn_idgardensalad.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		btn_idjuliennesalad.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		btn_idtacosalad.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		btn_idgreeksalad.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		btn_idcesarsalad.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		back.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		
		
	}
	
}
