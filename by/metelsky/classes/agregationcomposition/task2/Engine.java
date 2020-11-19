package by.metelsky.classes.agregationcomposition.task2;

public class Engine {
	private final int volume;
	private final String type;
	
	public Engine(int volume, String type) {
		this.volume = volume;
		this.type = type;
	}

	public int getVolume() {
		return volume;
	}
	
	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Engine [volume=" + volume + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + volume;
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
		Engine other = (Engine) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (volume != other.volume)
			return false;
		return true;
	}
	

}
