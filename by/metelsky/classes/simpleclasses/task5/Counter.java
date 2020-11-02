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
	private static int idCounter = 0;
	private int counter;
	private int minRange;
	private int maxRange;
	private int id;

	public Counter() {
		counter = 1;
		minRange = 0;
		maxRange = 10;
		idCounter++;
		id = idCounter;
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

	public boolean increaseCounter() {
		if (counter < maxRange) {
			counter++;
			return true;
		} else {
			return false;
		}
	}

	public boolean decreaseCounter() {
		if (counter > minRange) {
			counter--;
			return true;
		} else {
			return false;
		}
	}

	public int getId() {
		return id;
	}

	public int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		return "Counter [counter=" + counter + ", minRange=" + minRange + ", maxRange=" + maxRange + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + counter;
		result = prime * result + id;
		result = prime * result + maxRange;
		result = prime * result + minRange;
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
		Counter other = (Counter) obj;
		if (counter != other.counter)
			return false;
		if (id != other.id)
			return false;
		if (maxRange != other.maxRange)
			return false;
		if (minRange != other.minRange)
			return false;
		return true;
	}

}
