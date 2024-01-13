package application.Controllers;

import java.io.IOException;
import java.net.URL;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UpdateRouteController {

	Main m=new Main();
	public URL location;
	
	@FXML
	private Button SearchBtn;
	
	
	public UpdateRouteController() {
		// TODO Auto-generated constructor stub
	}
	
	public void initialize() {
		
	}
	
	@FXML
	private Button AddRouteBtn;
	
	public void goToAddRoute(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.AddRouteScene(s);
		 
	 }
	
	@FXML
	private Button DeleteRouteBtn;
	public void goToDeleteRoute(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.DeleteRouteScene(s);
		 
	 }
	
	public void goToUpdateRoute2(ActionEvent event) throws IOException {
		//System.out.println("this is text");
		 
		//System.out.println("button clicked");
		//btnAddPersonalContact.setText("you just clicked me!");
        //  the stage can be accessed using action event source
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		//call function inside main class to change the scene
		m.UpdateRoute2Scene(s);
		 
	 }
	
	@FXML
	private Button RouteManagementBtn;
	@FXML
	private Button FlightManagementBtn;
	
	public void goToRouteManagementMain(ActionEvent event) throws IOException {
		//System.out.println("this is text");
		 
		//System.out.println("button clicked");
		//btnAddPersonalContact.setText("you just clicked me!");
        //  the stage can be accessed using action event source
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		//call function inside main class to change the scene
		m.RouteManagementMainScene(s);
		 
	 }
	
	public void goToFlightManagementMain(ActionEvent event) throws IOException {
		//System.out.println("this is text");
		 
		//System.out.println("button clicked");
		//btnAddPersonalContact.setText("you just clicked me!");
        //  the stage can be accessed using action event source
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		//call function inside main class to change the scene
		m.FlightManagementMainScene(s);
		 
	 }
	
	@FXML
	private Button LoginBtn;
	public void goToHome(ActionEvent event) throws IOException {

		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.FlightManagerMainScene(s);
		 
	 }

}
