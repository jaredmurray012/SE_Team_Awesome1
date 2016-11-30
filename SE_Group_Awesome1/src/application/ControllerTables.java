package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControllerTables implements Initializable {
	@FXML 
	public Button Table1;
	
	@FXML 
	public Button Table2;
	
	@FXML 
	public Button Table3;

	@FXML 
	public Button Table4;
	
	@FXML 
	public Button Table5;

	@FXML 
	public Button Table6;
	
	@FXML 
	public Button Table7;
	
	@FXML 
	public Button Table8;
	
	@FXML 
	public Button Table9;
	
	@FXML 
	public Button Table10;
	
	@FXML 
	public Button Table11;
	
	@FXML 
	public Button Table12;

	@FXML 
	public Button Table13;
	
	@FXML 
	public Button Table14;
	
	@FXML 
	public Button Back;
	
	@Override
	
	public void initialize(URL location, ResourceBundle resources){
		
		Table1.setOnAction(new EventHandler<ActionEvent> ()
					{
						@Override
						public void handle(ActionEvent event) 
						{
							Main.Scenes.DisplayTable1Scene();
							//Main.dbconnect. 
						}
					});
		
	Table2.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable2Scene();
				//Main.dbconnect. 
			}
		});
		Table3.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable3Scene();
				//Main.dbconnect. 
			}
		});
		Table4.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable4Scene();
				//Main.dbconnect. 
			}
		});
		Table5.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable5Scene();
				//Main.dbconnect. 
			}
		});
		Table6.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable6Scene();
				//Main.dbconnect. 
			}
		});
		Table7.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable7Scene();
				//Main.dbconnect. 
			}
		});
		Table8.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable8Scene();
				//Main.dbconnect. 
			}
		});
		Table9.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable9Scene();
				//Main.dbconnect. 
			}
		});
		Table10.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable10Scene();
				//Main.dbconnect. 
			}
		});
	
		Table11.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable11Scene();
				//Main.dbconnect. 
			}
		});
		Table12.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable12Scene();
				//Main.dbconnect. 
			}
		});
		Table13.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable13Scene();
				//Main.dbconnect. 
			}
		});
		Table14.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable14Scene();
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

}

}