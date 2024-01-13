package application.Controllers;

import java.io.IOException;
import java.net.URL;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AddAirplaneController {

	Main m=new Main();
	public URL location;
	
	@FXML
	private Button AddBtn;
	
	public void initialize() {
		
	}
	
	public AddAirplaneController() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void goToAddAirplane2(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.AddAirplane2Scene(s);
		 
	 }
	
	
	@FXML
	private Button AddAirplaneBtn;
	@FXML
	private Button DeleteAirplaneBtn;
	@FXML
	private Button UpdateStatusBtn;
	@FXML
	private Button AirplaneManagementBtn;
	@FXML
	private Button AirportManagementBtn;
	@FXML
	private Button HomeBtn;
	
	@FXML
	private Button AddCityBtn;
	public void goToCityManagementMain(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.CityManagementMainScene(s);
		 
	 }
	
	
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
	
	public void goToAddAirplane(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.AddAirplaneScene(s);
		 
	 }
	
	public void goToDeleteAirplane(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.DeleteAirplaneScene(s);
		 
	 }
	
	public void goToUpdateAirplaneStatus(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.UpdateAirplaneStatusScene(s);
		 
	 }


}
