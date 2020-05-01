package by.metelsky.classes.simpleclasses.task5;
/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать
 *  или уменьшать свое значение на единицу в заданном диапазоне. 
 * Предусмотрите инициализацию счетчика значениями по умолчанию 
 * и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
 *  и метод позволяющее получить его текущее состояние.
 *  Написать код, демонстрирующий все возможности класса.
 */
public class Counter {
	private static int idCounter =0;
	private int counter;
	private int minRange;
	private int maxRange;
	private int id;

	public Counter() {
		counter = 1;
		minRange = 0;
		maxRange = 10;
		idCounter++;
		id=idCounter;
	}

	public Counter(int minRange, int maxRange, int counter) {
		int tmp;

		if (minRange <= maxRange) {
			
			this.minRange = minRange;
			this.maxRange = maxRange;
			
		} else {

			tmp = maxRange;
			maxRange = minRange;
			minRange = tmp;

			this.minRange = minRange;
			this.maxRange = maxRange;

		}
		if (minRange <= counter && counter <= maxRange) {
			this.counter = counter;
		} else {
			this.counter = minRange;
		}
		idCounter++;
		id = idCounter;
	}

	public void increaseCounter() {
		if (counter < maxRange) {
			counter++;
		} else {
			System.out.println("Счетчик "+id+" достиг максимального значения: " + counter);
		}
	}

	public void decreaseCounter() {
		if (counter > minRange) {
			counter--;
		} else {
			System.out.println("Счетчик " +id+ " достиг минимального значения: " + counter);
		}

	}
	public int getId() {
		return id;
	}

	public int getCounter() {
		return counter;
	}
//	public void setCounter(int counter) {
//		this.counter = counter;
//	}
}
