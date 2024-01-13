package application.Controllers;

import java.io.IOException;
import java.net.URL;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FlightManagerMainController {

	Main m=new Main();
	public URL location;
	
	@FXML
	private Button RouteManagementBtn;
	@FXML
	private Button FlightManagementBtn;

	public FlightManagerMainController() {
		
	}
	
	public void initialize() {
		
	}
	
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
