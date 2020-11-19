package by.metelsky.classes.agregationcomposition.task3;

import java.util.List;

import by.metelsky.classes.agregationcomposition.task2.Car;

public class View {
	
	
	public void printTowName(Town town) {
		System.out.println(town.getName());
	}
	public void printTowns(List<Town> towns) {
		for(Town town : towns) {
			printTowName(town);
		}
		
	}
	public void printDistrictsNumber(int number) {
		System.out.println("The number of districts is : " + number);
	}
	public void printArea(int area) {
		System.out.println("The area is: " + area);
	}

}
