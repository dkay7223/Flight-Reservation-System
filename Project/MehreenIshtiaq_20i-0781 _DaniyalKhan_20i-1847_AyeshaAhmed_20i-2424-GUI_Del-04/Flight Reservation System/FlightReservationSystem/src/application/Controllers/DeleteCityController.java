package application.Controllers;

import java.io.IOException;
import java.net.URL;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DeleteCityController {

	public DeleteCityController() {
		// TODO Auto-generated constructor stub
	}
	
public void initialize() {
		
	}
	
	
	Main m=new Main();
	public URL location;
	
	@FXML
	private Button DeleteCity2Btn;
	@FXML
	private Button AddCityBtn;
	@FXML
	private Button DeleteCityBtn;
	@FXML
	private Button AirplaneManagementBtn;
	@FXML
	private Button AirportManagementBtn;
	@FXML
	private Button CityManagementBtn;
	@FXML
	private Button HomeBtn;
	
	public void goToDeleteCity2(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.DeleteCity2Scene(s);
		 
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
	public void goToCityManagementMain(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.CityManagementMainScene(s);
		 
	 }
	
	
	
	public void goToAddCity(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.AddCityScene(s);
		 
	 }
	
	public void goToDeleteCity(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.DeleteCityScene(s);
		 
	 }
	
	public void goToViewCities(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.ViewCitiesScene(s);
		 
	 }

}
