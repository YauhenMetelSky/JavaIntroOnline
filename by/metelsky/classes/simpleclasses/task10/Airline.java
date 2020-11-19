package by.metelsky.classes.simpleclasses.task10;

import java.time.LocalTime;
import java.util.List;

public class Airline {
	private String destination;
	private String flyghtNumber;
	private String airplaneType;
	private LocalTime departureTime;
	private List<WeekDays> departureDays;
	
	public Airline() {
	}

	public Airline(String destination, String flyghtNumber, String typeAirplane,int hour, int minutes,
			List<WeekDays> departureDays) {
		LocalTime departureTime = LocalTime.of(hour, minutes);
		this.destination = destination;
		this.flyghtNumber = flyghtNumber;
		this.airplaneType = typeAirplane;
		this.departureTime = departureTime;	
		this.departureDays = departureDays;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlyghtNumber() {
		return flyghtNumber;
	}

	public void setFlyghtNumber(String flyghtNumber) {
		this.flyghtNumber = flyghtNumber;
	}

	public String getairplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int hour, int minutes) {
		LocalTime departureTime = LocalTime.of(hour, minutes);
		this.departureTime = departureTime;
	}

	public List<WeekDays> getDepartureDays() {
		return departureDays;
	}

	public void setDepartureDays(List<WeekDays> departureDays) {
		this.departureDays = departureDays;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flyghtNumber=" + flyghtNumber + ", airplaneType="
				+ airplaneType + ", departureTime=" + departureTime + ", departureDays=" + departureDays + "]";
	}
	
	

}
