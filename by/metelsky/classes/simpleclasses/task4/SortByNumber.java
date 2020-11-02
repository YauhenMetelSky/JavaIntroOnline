package by.metelsky.classes.simpleclasses.task4;

import java.util.Comparator;

public class SortByNumber implements Comparator<Train> {

	@Override
	public int compare(Train o1, Train o2) {
		
		return o1.getTrainNumber()-o2.getTrainNumber();
	}
	

}
