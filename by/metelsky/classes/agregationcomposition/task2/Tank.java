package by.metelsky.classes.agregationcomposition.task2;

public class Tank {
	private int minCapacity;
	private int maxCapacity=0;
	
	public Tank() {

	}

	public Tank(int maxCapacity) {
		
		this.maxCapacity = maxCapacity;
	}

	public int getMinCapacity() {
		return minCapacity;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	@Override
	public String toString() {
		return "Tank [minCapacity=" + minCapacity + ", maxCapacity=" + maxCapacity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxCapacity;
		result = prime * result + minCapacity;
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
		Tank other = (Tank) obj;
		if (maxCapacity != other.maxCapacity)
			return false;
		if (minCapacity != other.minCapacity)
			return false;
		return true;
	}
	
	

}
