package by.metelsky.basicofoop.task3;

import java.util.List;

import by.metelsky.basicofoop.task3.Calendar.Day;

public class View {
	public void printDay(Day day) {
		System.out.println(day);
	}
	public void printMonth(Calendar calendar) {
		for(Day day : calendar.getMonth()) {
			printDay(day);
		}
	}

}
