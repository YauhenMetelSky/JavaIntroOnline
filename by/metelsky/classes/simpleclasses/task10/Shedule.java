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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shedule == null) ? 0 : shedule.hashCode());
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
		Shedule other = (Shedule) obj;
		if (shedule == null) {
			if (other.shedule != null)
				return false;
		} else if (!shedule.equals(other.shedule))
			return false;
		return true;
	}


	
	
	

}
