package application;

/*Guy Zarko
 * javafx login main program for login
 * 
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {

	@FXML
	private Label poslogin;
	
	@FXML
	private TextField txtusername;
	
	@FXML
	private TextField txtpassword;
	
	public void Login(ActionEvent event) throws Exception{
		
		//login credentials with password
		if (txtusername.getText().equals("Zarko") && txtpassword.getText().equals("123")){
			//if login is success will go to main page
			poslogin.setText("Login Success");
			Stage primaryStage = new Stage();
			//main page if login success 
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		//login failed will yield this
		} else {
			poslogin.setText("Login Failed");
		}
	}
}
