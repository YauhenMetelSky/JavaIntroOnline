package by.metelsky.classes.agregationcomposition.task2;

public class View {
	public void print(String string) {
		System.out.println(string);
	}
	public void printBrand(Car car) {
		System.out.println("Car brand is " + car.getBrand() );
	}
	public void printCarSpecification(Car car) {
		System.out.println(car);
	}
	
	

}
