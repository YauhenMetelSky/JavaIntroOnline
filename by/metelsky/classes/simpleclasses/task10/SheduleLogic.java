package by.metelsky.classes.simpleclasses.task10;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SheduleLogic {

	public static List<Airline> findByDestination(Shedule shedule, String destination) {
		List<Airline> list = new ArrayList<>();
		for (Airline airline : shedule.getShedule()) {
			if (airline.getDestination().equalsIgnoreCase(destination)) {
				list.add(airline);
			}
		}
		return list;
	}

	public static List<Airline> findByDay(Shedule shedule, WeekDays day) {
		List<Airline> list = new ArrayList<>();
		for (Airline airline : shedule.getShedule()) {
			if (airline.getDepartureDays().contains(day)) {
				list.add(airline);
			}
		}
		return list;
	}

	public static List<Airline> findByDayAndTime(Shedule shedule, WeekDays day, int hour, int minutes) {
		LocalTime departureTime = LocalTime.of(hour, minutes);
		List<Airline> list = new ArrayList<>();
		for (Airline airline : shedule.getShedule()) {
			if (airline.getDepartureDays().contains(day)) {
				if (airline.getDepartureTime().compareTo(departureTime) > 0) {
					list.add(airline);
				}
			}
		}
		return list;
	}

}
