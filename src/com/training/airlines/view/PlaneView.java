package com.training.airlines.view;

import com.training.airlines.bean.Airline;
import com.training.airlines.bean.Plane;
import java.util.ArrayList;
import java.util.List;

public class PlaneView {
	
	public String print(List<Plane> planes) {
		String res = "";
		
		for(Plane p: planes) {
			res = res + (p.getDestination() + " " + p.getFligthN() + " " + p.getPlaneType() +
					" " + p.getDeparture().getHour() + "ч " + p.getDeparture().getMin() +
					"м " + p.getReadbleShedule() + "\n");
		}
		return res;
	}

}
