package application.Controllers;

import java.io.IOException;
import java.net.URL;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RemoveFlight2Controller {

	Main m=new Main();
	public URL location;
	
	@FXML
	private Button yesBtn;
	@FXML
	private Button noBtn;
	
	public RemoveFlight2Controller() {
		// TODO Auto-generated constructor stub
	}
	
	@FXML public void goToRemoveFlight3(ActionEvent event) throws IOException {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.RemoveFlight3Scene(s);
		 
	 }
	@FXML public void goToRemoveFlight(ActionEvent event) throws IOException {
	
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.RemoveFlightScene(s);

	}
	
	@FXML
	private Button RouteManagementBtn;
	
	
	public void goToRouteManagementMain(ActionEvent event) throws IOException {
		//System.out.println("this is text");
		 
		//System.out.println("button clicked");
		//btnAddPersonalContact.setText("you just clicked me!");
        //  the stage can be accessed using action event source
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		//call function inside main class to change the scene
		m.RouteManagementMainScene(s);
		 
	 }
	
	@FXML
	private Button FlightManagementBtn;
	
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
	private Button HomeBtn;
	public void goToHome(ActionEvent event) throws IOException {

		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.FlightManagerMainScene(s);
		 
	 }


	@FXML
	private Button ScheduleFlightBtn;
	@FXML
	private Button RemoveFlightBtn;
	@FXML
	private Button TrackFlightBtn;
	
	
	public void goToScheduleFlight(ActionEvent event) throws IOException {
		//System.out.println("this is text");
		 
		//System.out.println("button clicked");
		//btnAddPersonalContact.setText("you just clicked me!");
        //  the stage can be accessed using action event source
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		//call function inside main class to change the scene
		m.ScheduleFlightScene(s);
		 
	 }
	
	
	public void goToTrackFlight(ActionEvent event) throws IOException {
		//System.out.println("this is text");
		 
		//System.out.println("button clicked");
		//btnAddPersonalContact.setText("you just clicked me!");
        //  the stage can be accessed using action event source
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		//call function inside main class to change the scene
		m.TrackFlightScene(s);
		 
	 }
	
}
