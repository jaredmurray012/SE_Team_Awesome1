package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerLogin implements Initializable
{
	@FXML
	public TextField userNameId; 
	
	@FXML 
	public TextField userPasswordId; 
	
	@FXML 
	public Button Btn_LoginId;
	
	@FXML 
	public Button Btn_clearTextId; 
	
	@FXML
	public Button Btn_Clock;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		Btn_LoginId.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				System.out.print(userNameId.getText() +" " + userPasswordId.getText());
				Main.Scenes.DisplayMenuOptionsScene();
				//Main.dbconnect. 
			}
		});
		
		Btn_clearTextId.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				userNameId.setText("");
				userPasswordId.clear(); 
			}
		});
		
		Btn_Clock.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayClockInOutScene();
						//Main.dbconnect. 
					}
				});
		
	}
	
}
