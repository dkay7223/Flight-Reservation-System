package application;
	
import java.io.FileInputStream;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	FXMLLoader loader = new FXMLLoader();		
	@Override
	public void start(Stage primaryStage) {
		try {
			// Path to the FXML File
			String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\PassengerLogin.fxml";
			FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
			//Create the Pane and all Details
		    //BorderPane root = (BorderPane) loader.load(fxmlStream);
			AnchorPane root = (AnchorPane) loader.load(fxmlStream);
						
			Scene scene = new Scene(root,1200,800);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
	
	
		//*************************************************************************
		//*************************************************************************
		//**********************   FLIGHT MANAGER     *****************************
		//*************************************************************************
		//*************************************************************************
	
	public void FlightManagerLoginScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\FlightManagerLogin.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void FlightManagerMainScene(Stage currentStage) throws IOException {
	
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\FlightManagerMain.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	/////////////////////////////////////////////////////////////////////
	//////////////////////// ROUTE MANAGEMENT //////////////////////////
	/////////////////////////////////////////////////////////////////////
	
	public void RouteManagementMainScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\RouteManagementMain.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void AddRouteScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\AddRoute.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void AddRoute2Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\AddRoute2.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void DeleteRouteScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\DeleteRoute.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
		
	
	public void DeleteRoute2Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\DeleteRoute2.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void DeleteRoute3Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\DeleteRoute3.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void UpdateRouteScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\UpdateRoute.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void UpdateRoute2Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\UpdateRoute2.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void UpdateRoute3Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\UpdateRoute3.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	/////////////////////////////////////////////////////////////////////
	//////////////////////// FLIGHT MANAGEMENT //////////////////////////
	/////////////////////////////////////////////////////////////////////
	
	public void FlightManagementMainScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\FlightManagementMain.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	
	
	public void ScheduleFlightScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\ScheduleFlight.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void ScheduleFlight2Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\ScheduleFlight2.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void CalculateFareScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\CalculateFare.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void CalculateFare2Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\CalculateFare2.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void RemoveFlightScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\RemoveFlight.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void RemoveFlight2Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\RemoveFlight2.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void RemoveFlight3Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\RemoveFlight3.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void TrackFlightScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\TrackFlight.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void TrackFlight2Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\TrackFlight2.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	
	//*************************************************************************
	//*************************************************************************
	//****************************      ADMIN     *****************************
	//*************************************************************************
	//*************************************************************************
	
	
	public void AdminLoginScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\AdminLogin.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void AdminMainScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\AdminMain.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	/////////////////////////////////////////////////////////////////////
	//////////////////////// AIRPLANE MANAGEMENT ////////////////////////
	/////////////////////////////////////////////////////////////////////
	
	public void AirplaneManagementMainScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\AirplaneManagementMain.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void AddAirplaneScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\AddAirplane.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void AddAirplane2Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\AddAirplane2.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void DeleteAirplaneScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\DeleteAirplane.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void DeleteAirplane2Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\DeleteAirplane2.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void DeleteAirplane3Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\DeleteAirplane3.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void UpdateAirplaneStatusScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\UpdateAirplaneStatus.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void UpdateAirplaneStatus2Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\UpdateAirplaneStatus2.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void UpdateAirplaneStatus3Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\UpdateAirplanStatus3.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	
	
	/////////////////////////////////////////////////////////////////////
	//////////////////////// AIRPORT MANAGEMENT /////////////////////////
	/////////////////////////////////////////////////////////////////////
	
	
	public void AirportManagementMainScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\AirportManagementMain.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void AddAirportScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\AddAirport.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void AddAirport2Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\AddAirport2.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void DeleteAirportScene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\DeleteAirport.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void DeleteAirport2Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\DeleteAirport2.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void DeleteAirport3Scene(Stage currentStage) throws IOException {
		
		String fxmlDocPath = "C:\\Users\\user\\eclipse-workspace\\FlightReservationSystem\\src\\application\\res\\fxml\\DeleteAirport3.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1200,800);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	
	
	
	
	
	
}
