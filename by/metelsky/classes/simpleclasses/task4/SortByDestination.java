package by.metelsky.classes.simpleclasses.task4;

import java.util.Comparator;

public class SortByDestination implements Comparator<Train> {

	@Override
	public int compare(Train o1, Train o2) {
		if(o1.getDestination().compareTo(o2.getDestination())==0) {
			return o1.getDepartureTime().compareTo(o2.getDepartureTime());
		}else {
			return o1.getDestination().compareTo(o2.getDestination()) ;
		}
	}

	
	

}
