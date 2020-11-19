package by.metelsky.classes.agregationcomposition.task2;
/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 *Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/
public class Task2 {

	public static void main(String[] args) {
		Wheel[]wheels = {new Wheel("Winter",17,"GoodYear"),new Wheel("Winter",17,"GoodYear"),new Wheel("Winter",17,"GoodYear"),new Wheel("Winter",17,"GoodYear")};
		Wheel spareWheel = new Wheel("Winter",17,"Michelin");
		Engine engine = new Engine(2,"turbo");
		Tank tank = new Tank(60);
		Car saab = new Car(0,"Saab",wheels,engine,tank);
		View view = new View();
		view.printBrand(saab);
		view.printCarSpecification(saab);
	    CarLogic.fillTheCar(25, saab);
		CarLogic.replaceTheWheel(2, spareWheel, saab);
		
		view.print((CarLogic.drive(saab)));
		
	}

}
