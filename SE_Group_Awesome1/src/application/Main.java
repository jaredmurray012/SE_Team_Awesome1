// Added some documentation 
package application;
	
import java.sql.SQLException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;



public class Main extends Application 
{
	
	public static sceneContainer Scenes; 
	public static DBConnect DBconnectHere; 
	
	@Override
	public void start(Stage primaryStage) 
	{
		try {
			DBconnectHere = new DBConnect("jdbc:mysql://localhost:3306/awesomepos", "root", "");
		} catch (SQLException e) 
		{
			System.out.println("database connection error");
			e.printStackTrace();
		} 
		Scenes = new sceneContainer();
		Scenes.DisplayLoginScene(); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	void loadScene()
	{
	
	}
}