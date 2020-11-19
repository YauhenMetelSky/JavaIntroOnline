package by.metelsky.classes.agregationcomposition.task3;

import java.util.ArrayList;
import java.util.List;

public class State {
	private String name;
	private Town capital;
	private List<Region> regions = new ArrayList<>();
	public State() {
		
	}
	public State(String name, Town capital, List<Region> regions) {
		super();
		this.name = name;
		this.capital = capital;
		this.regions = regions;
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
	public List<Region> getRegions() {
		return regions;
	}
	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}
	public boolean addRegion(Region region) {
		return regions.add(region);
	}
	public boolean removeRegion(Region region) {
		return regions.remove(region);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		State other = (State) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		return true;
	}
	
	

}
