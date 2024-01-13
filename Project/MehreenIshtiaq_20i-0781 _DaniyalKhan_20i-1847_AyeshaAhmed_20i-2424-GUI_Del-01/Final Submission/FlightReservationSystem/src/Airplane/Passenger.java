package Airplane;

public class Passenger extends User {
private int age;
private Booking Booking;
public Passenger(String username, int userId,int age) {
	super(username, userId);
	this.age=age;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Booking getBooking() {
	return Booking;
}
public void setBooking(Booking booking) {
	Booking = booking;
}

}
