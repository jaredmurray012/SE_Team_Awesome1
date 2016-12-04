package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerBeverages implements Initializable 
{

@FXML 
public Button btn_idcoffee;
@FXML 
public Button btn_idtea;

@FXML 
public Button btn_idmilk;

@FXML 
public Button btn_idchocolateshake;

@FXML 
public Button btn_idvanillashake;

@FXML 
public Button btn_idstrawberryshake; 

@FXML
public Button btn_idapplejuice;
@FXML
public Button btn_idorangejuice;

@FXML
public Button btn_idcranberryjuice;

@FXML
public Button btn_idgrapefruitjuice;

@FXML
public Button btn_idgrapejuice;

@FXML
public Button btn_idtomatojuice;

@FXML
public Button btn_idpepsi;

@FXML
public Button btn_iddietpepsi;

@FXML
public Button btn_idmountaindew;

@FXML
public Button btn_iddrpepper;

@FXML
public Button btn_idsierramist;

@FXML
public Button btn_idcrushorange;

@FXML
public Button btn_idsobelifewater;

@FXML
public Button btn_iddolelemonade;

@FXML
public Button back;

double ItemPrice = 0.00; 
int UniqueItemId = 0;

@Override
public void initialize(URL location, ResourceBundle resources) 
{
	btn_idcoffee.setOnAction(new EventHandler<ActionEvent> ()
	{
		@Override
		public void handle(ActionEvent event) 
		{
			ItemPrice = 2.25;
			UniqueItemId = 213;
			Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
		
		}
	});
	
	btn_idtea.setOnAction(new EventHandler<ActionEvent> ()
	{
		@Override
		public void handle(ActionEvent event) 
		{
			ItemPrice = 2.25;
			UniqueItemId = 214;
			Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
		
		}
	});
	
	btn_idmilk.setOnAction(new EventHandler<ActionEvent> ()
	{
		@Override
		public void handle(ActionEvent event) 
		{
			ItemPrice = 2.25;
			UniqueItemId = 215;
			Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
		
		}
	});
	
	btn_idchocolateshake.setOnAction(new EventHandler<ActionEvent> ()
	{
		@Override
		public void handle(ActionEvent event) 
		{
			ItemPrice = 3.75;
			UniqueItemId = 217;
			Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
		
		}
	});
	
	btn_idvanillashake.setOnAction(new EventHandler<ActionEvent> ()
	{
		@Override
		public void handle(ActionEvent event) 
		{
			ItemPrice = 3.75;
			UniqueItemId = 217;
			Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
		
		}
	});
	
	btn_idstrawberryshake.setOnAction(new EventHandler<ActionEvent> ()
	{
		@Override
		public void handle(ActionEvent event) 
		{
			ItemPrice = 3.75;
			UniqueItemId = 217;
			Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
		
		}
	});
	
	btn_idapplejuice.setOnAction(new EventHandler<ActionEvent> ()
	{
		@Override
		public void handle(ActionEvent event) 
		{
			ItemPrice = 2.25;
			UniqueItemId = 216;
			Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
		
		}
	});
	
	btn_idorangejuice.setOnAction(new EventHandler<ActionEvent> ()
	{
		@Override
		public void handle(ActionEvent event) 
		{
			ItemPrice = 2.25;
			UniqueItemId = 216;
			Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
		
		}
	});
	
	btn_idcranberryjuice.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 2.25;
					UniqueItemId = 216;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				
				}
			});
	btn_idcranberryjuice.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 2.25;
					UniqueItemId = 216;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				
				}
			});
	btn_idgrapejuice.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 2.25;
					UniqueItemId = 216;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				
				}
			});
	btn_idgrapefruitjuice.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 2.25;
					UniqueItemId = 216;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				
				}
			});
	btn_idtomatojuice.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 2.25;
					UniqueItemId = 216;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				
				}
			});
	btn_idpepsi.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 2.25;
					UniqueItemId = 218;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				
				}
			});
	btn_iddietpepsi.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 2.25;
					UniqueItemId = 218;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				
				}
			});
	btn_idmountaindew.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 2.25;
					UniqueItemId = 218;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				
				}
			});
	btn_iddrpepper.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 2.25;
					UniqueItemId = 218;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				
				}
			});
	btn_idsierramist.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 2.25;
					UniqueItemId = 218;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				
				}
			});
	btn_idsobelifewater.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 2.25;
					UniqueItemId = 218;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				
				}
			});
	btn_iddolelemonade.setOnAction(new EventHandler<ActionEvent> ()
			{
				@Override
				public void handle(ActionEvent event) 
				{
					ItemPrice = 2.25;
					UniqueItemId = 216;
					Main.DBconnectHere.InsertIntoOrderId(UniqueItemId, ItemPrice);
				
				}
			});
	back.setOnAction(new EventHandler<ActionEvent> ()
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
