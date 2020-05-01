package by.metelsky.classes.simpleclasses.task5;

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

		for (int i = 0; i < 4; i++) {
			count.decreaseCounter();
			count2.decreaseCounter();
			System.out.println("Счетчик " + count.getId() + " имеет значение " + count.getCounter());
			System.out.println("Счетчик " + count2.getId() + " имеет значение " + count2.getCounter());
			System.out.println("");
		}
		System.out.println("Увеличиваем значение счетчика");

		for (int i = 0; i < 7; i++) {
			count.increaseCounter();
			count2.increaseCounter();
			System.out.println("Счетчик " + count.getId() + " имеет значение " + count.getCounter());
			System.out.println("Счетчик " + count2.getId() + " имеет значение " + count2.getCounter());
			System.out.println("");
		}

	}
}
