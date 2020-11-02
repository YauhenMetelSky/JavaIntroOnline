package by.metelsky.classes.simpleclasses.task4;

import java.time.LocalTime;


/*
 * Создайте класс Train, содержащий поля: название пункта назначения, 
 * номер поезда, время отправления.
 */
public class Train {
	private String destination;
	private int trainNumber;
	private LocalTime departureTime;
	
	public Train() {
		
	}
	public Train(String destination, int trainNumber, int hour,int minutes) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		LocalTime departureTime = LocalTime.of(hour, minutes);
		this.departureTime = departureTime;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDestination() {
		return destination;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setDepartureTime(int hour,int minutes) {
		LocalTime departureTime = LocalTime.of(hour, minutes);
		this.departureTime = departureTime;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	
	@Override
	public String toString() {
		return "\nTrain number " + trainNumber + ", destination: " +  destination + ", departureTime: " + departureTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + trainNumber;
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
		Train other = (Train) obj;
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
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}
	
}
