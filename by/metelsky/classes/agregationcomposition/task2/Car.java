package by.metelsky.classes.agregationcomposition.task2;

import java.util.Arrays;

public class Car {
	private int milleage;
	private int fuelLevel;
	private boolean isStarted = false;
	private String brand;
	private Wheel[] wheels;
	private Engine engine;
	private Tank tank;

	public Car() {

	}

	public Car(int milleage, String brand, Wheel[] wheels, Engine engine, Tank tank) {

		this.milleage = milleage;
		this.brand = brand;
		this.wheels = wheels;
		this.engine = engine;
		this.tank = tank;
		if(wheels.length>4) {
			for(int i =0;i<4;i++) {
				this.wheels[i]=wheels[i];
			}
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public Wheel getWheel(int index) {
		Wheel wheel = wheels[index];
		wheels[index] = null;
		return wheel;
	}

	public void setWheel(int index, Wheel wheel) {
		wheels[index] = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getMilleage() {
		return milleage;
	}

	public void setMilleage(int milleage) {
		this.milleage = milleage;
	}

	public boolean isStarted() {
		return isStarted;
	}

	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public Tank getTank() {
		return tank;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}

	@Override
	public String toString() {
		return "Car [milleage=" + milleage + ", fuelLevel=" + fuelLevel + ", isStarted=" + isStarted + ", brand="
				+ brand + ", wheels=" + Arrays.toString(wheels) + ", engine=" + engine + ", tank=" + tank + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + fuelLevel;
		result = prime * result + (isStarted ? 1231 : 1237);
		result = prime * result + milleage;
		result = prime * result + ((tank == null) ? 0 : tank.hashCode());
		result = prime * result + Arrays.hashCode(wheels);
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
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (fuelLevel != other.fuelLevel)
			return false;
		if (isStarted != other.isStarted)
			return false;
		if (milleage != other.milleage)
			return false;
		if (tank == null) {
			if (other.tank != null)
				return false;
		} else if (!tank.equals(other.tank))
			return false;
		if (!Arrays.equals(wheels, other.wheels))
			return false;
		return true;
	}



}
