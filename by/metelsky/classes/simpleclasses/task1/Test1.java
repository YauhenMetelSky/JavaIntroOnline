package by.metelsky.classes.simpleclasses.task1;
/*
 * 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран
 *  и методы изменения этих переменных. Добавьте метод, который находит сумму значений этих переменных,
 *  и метод, который находит наибольшее значение из этих двух переменных.
 */

public class Test1 {
	private int firstVar;
	private int secondVar;
	
	public void setFirstVar(int firstVar) {
		this.firstVar=firstVar;
	}
	
	public void setSecondVar(int secondVar) {
		this.secondVar= secondVar;
	}
	
	public void printVar() {
		System.out.println("firstVar = " + firstVar);
		System.out.println("secondVar = " + secondVar);
	}
	
	public int sumVariable() {
		int sum;
		sum = firstVar+secondVar;
		return sum;
	}
	
	public int maxVariable() {
		if(firstVar > secondVar) {
			return firstVar;
		} else {
			return secondVar;
		}
	}


}
