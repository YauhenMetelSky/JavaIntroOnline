package by.metelsky.basicofoop.task3;

import by.metelsky.basicofoop.task3.Calendar.Day;

/*Задача 3.
Создать класс Календарь с внутренним классом, с помощью объектов которого
 можно хранить информацию о выходных и праздничных днях.*/
public class Task3 {

	public static void main(String[] args) {
	Calendar january = new Calendar();
	january.addDay(new Day(1,WeekDays.MONDAY));
	january.addDay(new Day(1,WeekDays.THUSDAY));
	january.addDay(new Day(1,WeekDays.WEDNESDAY));
	january.addDay(new Day(1,WeekDays.THURSDAY));
	january.addDay(new Day(1,WeekDays.FRIDAY));
	january.addDay(new Day(1,WeekDays.SATURDAY));
	january.addDay(new Day(1,WeekDays.SUNDAY));
	january.getMonth().get(4).setWeekend(true);
	View view = new View();
	view.printMonth(january);
	
	

	}

}
