package by.metelsky.classes.simpleclasses.task5;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать
 *  или уменьшать свое значение на единицу в заданном диапазоне. 
 * Предусмотрите инициализацию счетчика значениями по умолчанию 
 * и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
 *  и метод позволяющее получить его текущее состояние.
 *  Написать код, демонстрирующий все возможности класса.
 */
public class Main {
	public static void main(String[] args) {
		int minRange = 0;
		int maxRange = 5;
		int counter = 3;

		Counter count = new Counter(minRange, maxRange, counter);
		Counter count2 = new Counter();

		System.out.println("Счетчик " + count.getId() + " имеет значение " + count.getCounter());
		System.out.println("Счетчик " + count2.getId() + " имеет значение " + count2.getCounter());
		System.out.println("Уменьшаем значение счетчика");

		decreaseCounter(count);
		decreaseCounter(count2);
		increaseCounter(count);
		increaseCounter(count2);

	}

	public static void decreaseCounter(Counter count) {
		while (count.decreaseCounter()) {
			System.out.println("Счетчик " + count.getId() + " имеет значение " + count.getCounter());
		}
		System.out.println("Счетчик " + count.getId() + " достиг максимального значения: " + count.getCounter());
	}

	public static void increaseCounter(Counter count) {
		while (count.increaseCounter()) {
			System.out.println("Счетчик " + count.getId() + " имеет значение " + count.getCounter());
		}
		System.out.println("Счетчик " + count.getId() + " достиг максимального значения: " + count.getCounter());
	}
}
