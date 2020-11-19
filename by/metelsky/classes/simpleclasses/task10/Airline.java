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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
		result = prime * result + ((departureDays == null) ? 0 : departureDays.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flyghtNumber == null) ? 0 : flyghtNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (airplaneType == null) {
			if (other.airplaneType != null)
				return false;
		} else if (!airplaneType.equals(other.airplaneType))
			return false;
		if (departureDays == null) {
			if (other.departureDays != null)
				return false;
		} else if (!departureDays.equals(other.departureDays))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flyghtNumber == null) {
			if (other.flyghtNumber != null)
				return false;
		} else if (!flyghtNumber.equals(other.flyghtNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flyghtNumber=" + flyghtNumber + ", airplaneType="
				+ airplaneType + ", departureTime=" + departureTime + ", departureDays=" + departureDays + "]";
	}
	
	

}
