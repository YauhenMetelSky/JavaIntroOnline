package by.metelsky.classes.simpleclasses.task10;

import java.util.List;

public class View {
	
public void printAirline(Airline airline) {
	System.out.println(airline);
}
public void printListAirlane(List<Airline> airlines) {
	airlines.forEach(System.out::println);
}
}
