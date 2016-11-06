package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerHome implements Initializable
{
	
	@FXML 
	public Button mainMenu;
	
	@FXML 
	public Button managerFunctions; 
	

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		mainMenu.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		managerFunctions.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
	}
	
	
	
}
