package by.metelsky.classes.agregationcomposition.task3;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private String name;
	private Town capital;
	private List<District> districts = new ArrayList<>();
	public Region() {
	
	}
	public Region(String name, Town capital, List<District> districts) {
		super();
		this.name = name;
		this.capital = capital;
		this.districts = districts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Town getCapital() {
		return capital;
	}
	public void setCapital(Town capital) {
		this.capital = capital;
	}
	public List<District> getDistricts() {
		return districts;
	}
	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}
	public boolean addDistrict(District district) {
		return districts.add(district);
	}
	public boolean removeDistrict(District district) {
		return districts.remove(district);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Region other = (Region) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
