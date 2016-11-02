package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class sceneContainer 
{

	Stage stage;
	
	AnchorPane loginPane; 
	Scene LoginScene;
	
	AnchorPane menuPane; 
	Scene menuScene; 
	
	AnchorPane ClockInOutPane;
	Scene ClockInOutScene;
	
	sceneContainer() // constructor 
	{
		stage = new Stage(); 
		
		try {
			loginPane = FXMLLoader.load(getClass().getResource("FXML_Login.fxml"));
		} catch (IOException e) {
			System.out.println("The Login FXML did not load correctly"); 
			e.printStackTrace();
		} 
		
		try {
			menuPane = FXMLLoader.load(getClass().getResource("FXML_Menu.fxml"));
		} catch (IOException e) {
			System.out.println("The Menu FXML did not load correctly"); 
			e.printStackTrace();
		}
		try {
			ClockInOutPane = FXMLLoader.load(getClass().getResource("Clock.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		menuScene = new Scene(menuPane, 600, 600); 
		LoginScene = new Scene(loginPane, 600, 600); 
		ClockInOutScene = new Scene(ClockInOutPane, 623, 702);
	}
	
	public void loadScene(Scene scene, String sceneTitle)
	{
		stage.setScene(scene); 
		stage.setTitle(sceneTitle);
		stage.show(); 
	}
	
	public void DisplayLoginScene()
	{
		stage.setScene(LoginScene); 
		stage.setTitle("Login Here");
		stage.show();
	}
	
	public void DisplayMenuScene() 
	{
		stage.setScene(menuScene);
		stage.setTitle("This is the menu Scene");
		stage.show(); 
	}
	public void DisplayClockInOutScene()
	{
		stage.setScene(ClockInOutScene);
		stage.setTitle("Clock in here");
		stage.show();
	}
}
