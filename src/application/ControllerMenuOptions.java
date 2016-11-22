
package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;


public class ControllerMenuOptions implements Initializable
{
	
	@FXML 
	public Button btn_idbreakfast;
	@FXML 
	public Button btn_idstarters;
	
	@FXML 
	public Button btn_idsalads;

	@FXML 
	public Button btn_idbeverages;
	
	@FXML 
	public Button btn_idmexican_cuisine;
	
	@FXML 
	public Button idLunch; 
	
	@FXML 
	public Button Back;

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		btn_idmexican_cuisine.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayMexicanCuisineScene();
						//Main.dbconnect. 
					}
				});
		
		btn_idstarters.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayStartersScene();
						//Main.dbconnect. 
					}
				});
		btn_idbeverages.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayBeveragesScene();
						//Main.dbconnect. 
					}
				});
		btn_idbreakfast.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayBreakfastScene();
						//Main.dbconnect. 
					}
				});
		
		btn_idsalads.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplaySaladsScene();
						//Main.dbconnect. 
					}
				});
		Back.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayLoginScene();
						//Main.dbconnect. 
					}
				});
		/*idLunch.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) 
					{
						
						Main.Scenes.DisplayMexicanCuisineScene();
						//Main.dbconnect. 
					}
				});*/
		
		}
	}
		
	
 

