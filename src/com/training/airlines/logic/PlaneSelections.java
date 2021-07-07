package com.training.airlines.logic;

import java.util.ArrayList;
import java.util.List;
import com.training.airlines.bean.Plane;

public class PlaneSelections {
	
	public List<Plane> selectByDestination(String dest, List<Plane> planes) {
		List<Plane> planesSortedByDestination = new ArrayList<Plane>();
		
		for(Plane p: planes) {
			if (p.getDestination().equals(dest)) {
				planesSortedByDestination.add(p);
			}
		}
		
		return planesSortedByDestination;
	}
	
	public List<Plane> selectByDay(int day, List<Plane> planes) {
		List<Plane> planesSortedByDay = new ArrayList<Plane>();
		
		for(Plane p: planes) {
				if (p.getShedule()[day-1] == 1) {
				planesSortedByDay.add(p);
			}
		}
		
		return planesSortedByDay;
	}
	
	public List<Plane> selectByTimeAndDay(int h, int m, int day, List<Plane> planes) {
		List<Plane> planesSortedByTimeAndDay = new ArrayList<Plane>();
		List<Plane> tmpPlanes = new ArrayList<Plane>();
		
		for(Plane p: planes) {
			if (p.getDeparture().getHour() > h) {
				tmpPlanes.add(p);
			}else if ((p.getDeparture().getHour() == h) & (p.getDeparture().getMin() >= m)) {
				tmpPlanes.add(p);
			}
		}
		
		planesSortedByTimeAndDay = selectByDay(day, tmpPlanes);
		
		return planesSortedByTimeAndDay;
	}

}
