package by.metelsky.classes.agregationcomposition.task3;

import java.util.ArrayList;
import java.util.List;

public class StateLogic {
	
	public static int getArea(State state) {
		int area=0;
		for(Region region : state.getRegions()) {
			for(District district : region.getDistricts()) {
				area = area + district.getArea();
			}
		}
		return area;
	}
	
	public static int getRegionNumber(State state) {
		return state.getRegions().size();
	}
	
	public static List<Town> getRegionCapital(State state){
		List<Town> regionCapitals = new ArrayList<>();
		for(Region region : state.getRegions()) {
			regionCapitals.add(region.getCapital());
		}
		return regionCapitals;
	}

}
