package by.metelsky.classes.simpleclasses.task4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
* 4. Создайте класс Train, содержащий поля: название пункта назначения,
*  номер поезда, время отправления. Создайте данные в массив из пяти элементов 
*  типа Train, добавьте возможность сортировки элементов массива по 
*  номерам поездов. Добавьте возможность вывода информации о поезде,
*   номер которого введен пользователем. Добавьте возможность сортировки массив
*    по пункту назначения, причем поезда с одинаковыми пунктами назначения 
*    должны быть упорядочены по времени отправления.
*/
public class Main {
	public static void main(String[] args) {
		ArrayList<Train> trains = new ArrayList<Train>();
		trains.add(new Train("Moscow", 1, 06, 15));
		trains.add(new Train("Paris", 365, 17, 02));
		trains.add(new Train("Warsaw", 124, 9, 23));
		trains.add(new Train("Moscow", 2, 8, 50));
		trains.add(new Train("Vilnues", 12, 15, 15));
		Depo depo = new Depo(trains);

		Shedule shedule = Shedule.getInstance();
		SheduleLogic sheduleLogic = new SheduleLogic();
		
		System.out.println(sheduleLogic.sortByTrainNumber(trains));
		System.out.println(sheduleLogic.sortByDestination(trains));
		System.out.println(trains);
		UserInput userInput = new UserInput();
		
		shedule.printTrain(depo.getTrainIndexByNumber(userInput.getUserInput()));
	}
}
