package by.metelsky.classes.simpleclasses.task4;
import java.util.Arrays;
import java.util.Scanner;

/*
*  добавьте возможность сортировки элементов массива по номерам поездов.
*  Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
*  Добавьте возможность сортировки массив по пункту назначения, причем поезда 
* с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
*/
public class Main {
	public static void main(String[] args) {
		Train[] trains = new Train[5];
		Train tr1 = new Train();
		tr1.setDestination("Moscow");
		tr1.setTrainNumber(2);
		tr1.setDepartureTime(8, 50);

		Train tr2 = new Train("Moscow", 1, 06, 15);
		Train tr3 = new Train("Paris", 365, 17, 02);
		Train tr4 = new Train("Warsaw", 124, 9, 23);
		Train tr5 = new Train("Vilnues", 12, 15, 15);
		trains[0] = tr1;
		trains[1] = tr2;
		trains[2] = tr3;
		trains[3] = tr4;
		trains[4] = tr5;

		int select;

		while (true) {
			System.out.println("Введите 1 если хотите отсортировать поезда по станции назначения.");
			System.out.println("Введите 2 если хотите осортировать поезда по номерам.");
			System.out.println("Введите 3 если хотите получить информацию по номеру поезда.");
			System.out.println("Сделайте ваш выбор:");
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				select = sc.nextInt();
				switch (select) {
				case (1):
					trains = sortArrayDestination(trains);
					printTrain(trains);
					break;
				case (2):
					trains = sortArrayTrainNumber(trains);
					printTrain(trains);
					break;
				case (3):
					printTrainByNumber(trains);
					break;
				default:
					break;

				}
				break;
			} else {
				System.out.println("Ошибка ввода.Ввод должен содержать только цифры");
			}
		}

	}

	public static void printTrainByNumber(Train[] trains) {
		int trainNumber;
		int indexTrain;
		while (true) {
			System.out.println("Введите номер поезда:");
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				trainNumber = sc.nextInt();
				System.out.println("Вы ввели номер поезда: " + trainNumber);
				indexTrain = findTrain(trainNumber, trains);
				if (indexTrain >= 0) {
					System.out.println("Поезд следует до станции " + trains[indexTrain].getDestination() + ".");
					System.out.println("Поезд отправляется в " + trains[indexTrain].getDepartureTime() + ".");
					System.out.println("Номер поезда " + trains[indexTrain].getTrainNumber() + ".");
					break;
				} else {
					System.out.println("Поезд с номером " + trainNumber + " не найден, введите другой номер.");
				}

			} else {
				System.out.println("Ошибка ввода.Номер поезда должен содержать только цифры");
			}
		}
	}

	public static int findTrain(int trainNum, Train[] mas) {
		int index = -1;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i].getTrainNumber() == trainNum) {
				index = i;
			}
		}
		return index;
	}

	public static Train[] sortArrayTrainNumber(Train[] array) {
		Train[] sortedTrains = array;
		Train tmp;
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < sortedTrains.length - 1; i++) {
				if (sortedTrains[i].getTrainNumber() > sortedTrains[i + 1].getTrainNumber()) {
					tmp = sortedTrains[i];
					sortedTrains[i] = sortedTrains[i + 1];
					sortedTrains[i + 1] = tmp;
					isSorted = false;
				}
			}
		}
		return sortedTrains;

	}

	public static Train[] sortArrayDestination(Train[] array) {
		Train[] sortedTrains = array;
		Train tmp;
		String[] destinationArray = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			destinationArray[i] = array[i].getDestination();
		}
		Arrays.sort(destinationArray);

		for (int i = 0; i < destinationArray.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (destinationArray[i].equals(array[j].getDestination())) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
					break;

				}
			}
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i].getDestination().equals(array[i + 1].getDestination())) {
				if (array[i].getDepartureTime().compareTo(array[i + 1].getDepartureTime()) > 0) {
					tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
				}
			}
		}

		return sortedTrains;
	}

	public static void printTrain(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			System.out.println("Train number " + trains[i].getTrainNumber() + " " + trains[i].getDestination()
					+ " Departure time: " + trains[i].getDepartureTime());
		}
	}

	public static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
