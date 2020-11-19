package by.metelsky.classes.simpleclasses.task10;

import java.util.ArrayList;
import java.util.List;

public class Shedule {
	private List<Airline> shedule = new ArrayList<>();

		public Shedule() {
		
	}
	
	public Shedule(List<Airline> shedule) {
		super();
		this.shedule = shedule;
	}
	public List<Airline> getShedule() {
		return shedule;
	}
	
	public boolean addAirline(Airline airline) {
		return shedule.add(airline);
	}
	
	public boolean removeAirline(Airline airline) {
		return shedule.remove(airline);
	}
	public boolean addListAirline(List<Airline> airlines) {
		return shedule.addAll(airlines);
	}


	
	
	

}
