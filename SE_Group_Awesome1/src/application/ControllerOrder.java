package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ControllerOrder implements Initializable
{
	@FXML 
	public Button ViewOrderBtn;
	
	@FXML 
	public Button ClearOrderBtn;
	
	@FXML 
	public Button BackBtn;
	
	@FXML 
	public TextArea TextAreaField;

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		ViewOrderBtn.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				TextAreaField.appendText(Main.DBconnectHere.DisplayOrder());
			}
		});
		
		BackBtn.setOnAction(new EventHandler<ActionEvent> ()
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
