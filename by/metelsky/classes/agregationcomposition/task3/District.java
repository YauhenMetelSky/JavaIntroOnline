package by.metelsky.classes.agregationcomposition.task3;

import java.util.ArrayList;
import java.util.List;

public class District {
	private int area;
	private List<Town> towns = new ArrayList<>();
	
	public District() {
		
	}

	public District(int area, List<Town> towns) {
		super();
		this.area = area;
		this.towns = towns;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public List<Town> getTowns() {
		return towns;
	}

	public void setTowns(List<Town> towns) {
		this.towns = towns;
	}
	
	public boolean addTown(Town town) {
		return towns.add(town);
	}
	public boolean removeTown(Town town) {
		return towns.remove(town);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + area;
		result = prime * result + ((towns == null) ? 0 : towns.hashCode());
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
		District other = (District) obj;
		if (area != other.area)
			return false;
		if (towns == null) {
			if (other.towns != null)
				return false;
		} else if (!towns.equals(other.towns))
			return false;
		return true;
	}
	

}
