package by.metelsky.classes.simpleclasses.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class SheduleLogic {
	
	public ArrayList<Train> sortByTrainNumber(ArrayList<Train> trains){
		ArrayList<Train> sortedTrains = new ArrayList<Train>();
		sortedTrains.addAll(trains);
		sortedTrains.sort(new SortByNumber());
		return sortedTrains;
	}
	public ArrayList<Train> sortByDestination(ArrayList<Train> trains){
		ArrayList<Train> sortedTrains = new ArrayList<Train>();
		sortedTrains.addAll(trains);
		sortedTrains.sort(new SortByDestination());
		return sortedTrains;
	}
	
//	
//	public static Train[] sortArrayTrainNumber(Train[] array) {
//		Train[] sortedTrains = array;
//		Train tmp;
//		boolean isSorted = false;
//		while (!isSorted) {
//			isSorted = true;
//			for (int i = 0; i < sortedTrains.length - 1; i++) {
//				if (sortedTrains[i].getTrainNumber() > sortedTrains[i + 1].getTrainNumber()) {
//					tmp = sortedTrains[i];
//					sortedTrains[i] = sortedTrains[i + 1];
//					sortedTrains[i + 1] = tmp;
//					isSorted = false;
//				}
//			}
//		}
//		return sortedTrains;
//
//	}
//
//	public static Train[] sortArrayDestination(Train[] array) {
//		Train[] sortedTrains = array;
//		Train tmp;
//		String[] destinationArray = new String[array.length];
//		for (int i = 0; i < array.length; i++) {
//			destinationArray[i] = array[i].getDestination();
//		}
//		Arrays.sort(destinationArray);
//
//		for (int i = 0; i < destinationArray.length; i++) {
//			for (int j = i; j < array.length; j++) {
//				if (destinationArray[i].equals(array[j].getDestination())) {
//					tmp = array[i];
//					array[i] = array[j];
//					array[j] = tmp;
//					break;
//
//				}
//			}
//		}
//		for (int i = 0; i < array.length - 1; i++) {
//			if (array[i].getDestination().equals(array[i + 1].getDestination())) {
//				if (array[i].getDepartureTime().compareTo(array[i + 1].getDepartureTime()) > 0) {
//					tmp = array[i];
//					array[i] = array[i + 1];
//					array[i + 1] = tmp;
//				}
//			}
//		}
//
//		return sortedTrains;
//	}


}
