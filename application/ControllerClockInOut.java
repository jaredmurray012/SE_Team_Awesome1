package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerClockInOut implements Initializable {

	@FXML
	public Button Btn_clock_in; 
	
	@FXML 
	public Button Btn_clock_out; 
	
	@FXML 
	public Button Btn_meal_break_out;
	
	@FXML 
	public Button Btn_meal_break_in; 
	
	@FXML
	public Button Btn_back;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
		{
		
		Btn_clock_in.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
			
		Btn_clock_out.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		Btn_meal_break_out.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		Btn_meal_break_in.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		Btn_back.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			
			}
		});
		
		}
		
	}

