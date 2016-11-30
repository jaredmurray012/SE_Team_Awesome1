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
	public Button table1;
	
	@FXML 
	public Button table2;
	
	@FXML 
	public Button table3;

	@FXML 
	public Button table4;
	
	@FXML 
	public Button table5;

	@FXML 
	public Button table6;
	
	@FXML 
	public Button table7;
	
	@FXML 
	public Button table8;
	
	@FXML 
	public Button table9;
	
	@FXML 
	public Button table10;
	
	@FXML 
	public Button table11;
	
	@FXML 
	public Button table12;

	@FXML 
	public Button table13;
	
	@FXML 
	public Button table14;
	
	@FXML 
	public Button Back;
	
	@Override
	
	public void initialize(URL location, ResourceBundle resources){
		
		table1.setOnAction(new EventHandler<ActionEvent> ()
					{
						@Override
						public void handle(ActionEvent event) 
						{
							Main.Scenes.DisplayTable1Scene();
							//Main.dbconnect. 
						}
					});
		
	table2.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable2Scene();
				//Main.dbconnect. 
			}
		});
		table3.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable3Scene();
				//Main.dbconnect. 
			}
		});
		table4.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable4Scene();
				//Main.dbconnect. 
			}
		});
		table5.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable5Scene();
				//Main.dbconnect. 
			}
		});
		table6.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable6Scene();
				//Main.dbconnect. 
			}
		});
		table7.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable7Scene();
				//Main.dbconnect. 
			}
		});
		table8.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable8Scene();
				//Main.dbconnect. 
			}
		});
		table9.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable9Scene();
				//Main.dbconnect. 
			}
		});
		table10.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable10Scene();
				//Main.dbconnect. 
			}
		});
	
		table11.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable11Scene();
				//Main.dbconnect. 
			}
		});
		table12.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable12Scene();
				//Main.dbconnect. 
			}
		});
		table13.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayTable13Scene();
				//Main.dbconnect. 
			}
		});
		table14.setOnAction(new EventHandler<ActionEvent> ()
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