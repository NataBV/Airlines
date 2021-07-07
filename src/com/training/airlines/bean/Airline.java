package com.training.airlines.bean;

import java.util.ArrayList;
import java.util.List;

public class Airline {
	List<Plane> planes;
	
	public Airline () {
		planes = new ArrayList<Plane>();
	}
	
	public void setPlanes(List<Plane> planes) {
		this.planes = planes;
	}
	
	public List<Plane> getPlanes() {
		return planes;
	}
	
	public void addPlane(Plane p) {
		planes.add(p);
	}
			
}
