package by.metelsky.classes.simpleclasses.task10;

import java.util.List;
import java.time.LocalTime;
import java.util.ArrayList;
/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
 *  set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, 
 *  с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
* Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
* Найти и вывести:
* a) список рейсов для заданного пункта назначения;
* b) список рейсов для заданного дня недели;
* c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/
public class Task10 {

	public static void main(String[] args) {
		List<WeekDays> days1 = new ArrayList<>();
		days1.add(WeekDays.MONDAY);
		days1.add(WeekDays.WEDNESDAY);
		days1.add(WeekDays.FRIDAY);
		List<WeekDays> days2 = new ArrayList<>();
		days2.add(WeekDays.THUSDAY);
		days2.add(WeekDays.THURSDAY);
		List<WeekDays> days3 = new ArrayList<>();
		days3.add(WeekDays.SUNDAY);
		String destination = "Tokio";
		WeekDays day = WeekDays.MONDAY;
		int hour = 13;
		int minutes =21;
	
	Airline airline1 = new Airline("Paris","BR276","Boing",5,30,days1);
	Airline airline2 = new Airline("Moscow","BR254","Boing",8,00,days3);
	Airline airline3 = new Airline("Tokio","BR625","Boing",13,20,days2);
	Airline airline4 = new Airline("Berlin","BR277","Boing",14,00,days1);
	Airline airline5 = new Airline("New-Vasuki","BR001","Cessna",1,01,days3);
	Airline airline6 = new Airline("Chicago","BR342","Boing",2,15,days2);
	Airline airline7 = new Airline("Los-Angeles","BR354","Boing",4,50,days2);
	Airline airline8 = new Airline("London","BR195","Boing",18,00,days1);
	Airline airline9 = new Airline("Tokio","BR219","Boing",7,15,days1);
	Airline airline10 = new Airline("Istambul","BR237","Boing",19,40,days1);
	Shedule shedule = new Shedule();
	shedule.addAirline(airline1);
	shedule.addAirline(airline2);
	shedule.addAirline(airline3);
	shedule.addAirline(airline4);
	shedule.addAirline(airline5);
	shedule.addAirline(airline6);
	shedule.addAirline(airline7);
	shedule.addAirline(airline8);
	shedule.addAirline(airline9);
	shedule.addAirline(airline10);
	View view = new View();
	System.out.println("Flyghts by destination " + destination);
	view.printListAirlane(SheduleLogic.findByDestination(shedule, destination));
	System.out.println("Flyghts by day " + day);
	view.printListAirlane(SheduleLogic.findByDay(shedule, day));
	System.out.println("Flyghts by day "+day+" and time " + hour +" " + minutes);
	view.printListAirlane(SheduleLogic.findByDayAndTime(shedule, day, hour, minutes));
	

	}

}
