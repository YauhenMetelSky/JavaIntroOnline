package by.metelsky.classes.simpleclasses.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Depo {

	ArrayList<Train> trains = new ArrayList<Train>(); 

public Depo() {
	
}

public Depo(ArrayList<Train> trains) {
	this.trains = trains;
}

public void setTrains(ArrayList<Train> trains) {
	this.trains = trains;
	
}
public ArrayList<Train> getTrains() {
	return trains;
}

public boolean addTrain(Train train) {
	return trains.add(train);

}
public boolean removeTrain(Train train) {
	return trains.remove(train);
}

public Train getTrainIndexByNumber(int number) {
	for(Train train: trains) {
		if(number == train.getTrainNumber()) {
			return train;
		}
	}
	return null;
}


@Override
public String toString() {
	return "Depo [trains=" + trains + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((trains == null) ? 0 : trains.hashCode());
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
	Depo other = (Depo) obj;
	if (trains == null) {
		if (other.trains != null)
			return false;
	} else if (!trains.equals(other.trains))
		return false;
	return true;
}

}
