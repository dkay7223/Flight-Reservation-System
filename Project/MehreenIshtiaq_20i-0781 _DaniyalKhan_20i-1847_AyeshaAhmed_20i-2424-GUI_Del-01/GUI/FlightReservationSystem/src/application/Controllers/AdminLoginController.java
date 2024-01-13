package application.Controllers;

import java.io.IOException;
import java.net.URL;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdminLoginController {

	Main m=new Main();
	public URL location;
	
	@FXML
	private TextField UserNametxt;
	@FXML
	private PasswordField Passwordtxt;
	@FXML
	private Button LoginBtn;
	@FXML
	private Button PassengerLoginBtn;
	@FXML
	private Button FlightManagerLoginBtn;
	
	
	public AdminLoginController() {
		// TODO Auto-generated constructor stub
	}
	
	public void initialize() {
		
	}
	
	public void goToAdminMain(ActionEvent event) throws IOException {

		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.AdminMainScene(s);
		 
	 }
	
	/*public void goToPassengerLogin(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.PassengerLoginScene(s);
		 
	 }*/
	
	public void goToFlightManagerLogin(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.FlightManagerLoginScene(s);
		 
	 }
	


}
