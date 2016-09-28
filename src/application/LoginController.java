package application;
/*
 * Guy Zarko
 * Login Database example
 * 
 */
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {
	public LoginModel loginModel = new LoginModel();
	
	
	@FXML
	private Label isConnected;
	
	@FXML
	private TextField txtusername;
	
	@FXML
	private TextField txtpassword;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//test connection
		if (loginModel.isDbConnected()){
			isConnected.setText("Connected");
		}
		else {
			isConnected.setText("Not Connected");
		}
	}
	//login with username and password
	public void Login (ActionEvent event){
		try{
		if (loginModel.isLogin(txtusername.getText(), txtpassword.getText())){
			isConnected.setText("username and password is correct");
		}
		else {
			isConnected.setText("username and password is not correct");
			
		}
		
	}
	catch (SQLException e){
		
		isConnected.setText("username and password is not correct");
		e.printStackTrace();
	}

}
}
