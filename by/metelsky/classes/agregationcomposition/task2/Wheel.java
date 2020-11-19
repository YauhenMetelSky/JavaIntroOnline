package by.metelsky.classes.agregationcomposition.task2;

public class Wheel {
	private final String seasonType;
	private final int wheelSize;
	private final String manufacturer;
	
	public Wheel(String seasonType, int wheelSize, String manufacturer) {
		super();
		this.seasonType = seasonType;
		this.wheelSize = wheelSize;
		this.manufacturer = manufacturer;
	}
	public String getSeasonType() {
		return seasonType;
	}
	public int getWheelSize() {
		return wheelSize;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((seasonType == null) ? 0 : seasonType.hashCode());
		result = prime * result + wheelSize;
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
		Wheel other = (Wheel) obj;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (seasonType == null) {
			if (other.seasonType != null)
				return false;
		} else if (!seasonType.equals(other.seasonType))
			return false;
		if (wheelSize != other.wheelSize)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Wheel [seasonType=" + seasonType + ", wheelSize=" + wheelSize + ", manufacturer=" + manufacturer + "]";
	}
	
	
	

}
