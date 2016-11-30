
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
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	/*idCheese.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
					}
				});*/
	idSausageHamBacon.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					
				}
			});
	idVeggie.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
				
				}
			});
	idFriedEggSand.setOnAction(new EventHandler<ActionEvent> ()
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