module FlightReservationSystem {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application.FlightManagerLoginController to javafx.graphics, javafx.fxml;
}
