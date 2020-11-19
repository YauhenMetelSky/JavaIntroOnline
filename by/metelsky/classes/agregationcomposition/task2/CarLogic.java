package by.metelsky.classes.agregationcomposition.task2;

public class CarLogic {
	
	public static String drive(Car car) {
		if (startTheCar(car)) {
			return "Enjoy driving";
		} else {
			return "Car is not ready to drive";
		}
	}
	public static boolean startTheCar(Car car) {
		if(car.isStarted()) {
			return true;
		} else if(checkTheWheels(car) && car.getEngine() != null && car.getTank()!= null && car.getFuelLevel()> 0) {
			car.setStarted(true);
			return true;
		} else{
			return false;
		}
	}
	private static boolean checkTheWheels(Car car) {
		if(car.getWheels().length<4) {
			return false;
		}
		for(Wheel wheel : car.getWheels()) {
			if(wheel ==null) {
				return false;
			} 
		}
		return true;
	}
	
	
	public static void replaceTheWheel(int wheelIndex, Wheel wheel, Car car) {
		
		car.setWheel(wheelIndex, wheel);
	}
	
	public static boolean fillTheCar(int fuel,Car car) {
		if(fuel< car.getTank().getMaxCapacity()&& fuel >car.getTank().getMinCapacity()) {
			car.setFuelLevel(fuel);
		return true;
		} else {
			return false;
		}
	}
	

}
