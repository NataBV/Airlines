package com.training.airlines.main;

import com.training.airlines.bean.Airline;
import com.training.airlines.bean.Plane;
import com.training.airlines.bean.Time;
import com.training.airlines.view.PlaneView;
import com.training.airlines.logic.PlaneSelections;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Airline ar1 = new Airline();
		
		ar1.addPlane(new Plane("London", 158, "B", new Time (5, 15), new int[] {0,0,1,1,0,0,0}));
		ar1.addPlane(new Plane("Berlin", 159, "A", new Time (6, 45), new int[] {1,0,1,1,0,1,0}));
		ar1.addPlane(new Plane("London", 116, "B", new Time (12, 0), new int[] {0,1,1,1,0,0,0}));
		ar1.addPlane(new Plane("Paris", 354, "C", new Time (17, 30), new int[] {0,0,0,1,0,0,0}));
		ar1.addPlane(new Plane("Minsk", 275, "A", new Time (8, 15), new int[] {1,0,1,1,0,1,0}));
		ar1.addPlane(new Plane("London", 777, "C", new Time (2, 45), new int[] {1,0,1,1,0,0,0}));
		
		PlaneSelections select = new PlaneSelections();
		PlaneView viewP = new PlaneView();
		
		List<Plane> d;
		
		d = select.selectByDestination("London", ar1.getPlanes());
		
		String p = viewP.print(d);
		System.out.print(p);
		System.out.println();
		
		d = select.selectByTimeAndDay(6, 30, 3, ar1.getPlanes());
		
		String n = viewP.print(d);
		System.out.print(n);
		
		
	}

}
