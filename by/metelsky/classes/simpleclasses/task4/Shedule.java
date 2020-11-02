package by.metelsky.classes.simpleclasses.task4;
//viewClass
/*Добавьте возможность вывода информации о поезде,
*   номер которого введен пользователем. Добавьте возможность 
*   сортировки массив по пункту назначения, причем поезда 
*   с одинаковыми пунктами назначения должны быть упорядочены 
*   по времени отправления.
*/

/*
 * Здесь вывод и методы которые выводят отсортированный массив по назначению 
 * или по времени 
 */
public class Shedule {
	private final static Shedule instance = new Shedule();
	private Shedule() {
		
	}
	public static Shedule getInstance() {
		return instance;
	}
		
	
	public void printTrain(Train train) {
		System.out.println(train);
	}
	
	public void printAllTrain(Train[] trains){
		for(Train train: trains) {
			System.out.println(train);
		}
	}

	

}
