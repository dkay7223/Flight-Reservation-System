package application.Controllers;

import java.io.IOException;
import java.net.URL;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AirportManagementMainController {

	Main m=new Main();
	public URL location;
	
	@FXML
	private Button AddAirportBtn;
	@FXML
	private Button DeleteAirportBtn;
	
	public AirportManagementMainController() {
		// TODO Auto-generated constructor stub
	}
	
	public void initialize() {
		
	}
	
	@FXML
	private Button AirplaneManagementBtn;
	@FXML
	private Button AirportManagementBtn;
	@FXML
	private Button HomeBtn;
	
	
	public void goToHome(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.AdminMainScene(s);
		 
	 }
	
	public void goToAirplaneManagementMain(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.AirplaneManagementMainScene(s);
		 
	 }
	
	public void goToAirportManagementMain(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.AirportManagementMainScene(s);
		 
	 }
	
	
	
	public void goToAddAirport(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.AddAirportScene(s);
		 
	 }
	
	public void goToDeleteAirport(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.DeleteAirportScene(s);
		 
	 }

}
