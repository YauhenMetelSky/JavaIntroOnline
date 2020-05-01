package by.metelsky.classes.simpleclasses.task4;

import java.time.LocalTime;


/*
 * Создайте класс Train, содержащий поля: название пункта назначения, 
 * номер поезда, время отправления. Создайте данные в массив из пяти элементов типа Train,
 *  добавьте возможность сортировки элементов массива по номерам поездов.
 *  Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 *  Добавьте возможность сортировки массив по пункту назначения, причем поезда 
 * с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
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
}
