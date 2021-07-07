package com.training.airlines.bean;

public class Plane {
	
	private String destination;
	private int flightN;
	private String planeType;
	private Time departure;
	private int[] shedule;
	
	
	public Plane(String dest, int flight, String plane, Time time, int[] shed) {
		destination = dest;
		flightN = flight;
		planeType = plane;
		departure = time;
		shedule = shed;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public int getFligthN() {
		return flightN;
	}
	
	public String getPlaneType() {
		return planeType;
	}
	
	public Time getDeparture() {
		return departure;
	}
	
	public int[] getShedule() {
		return shedule;
	}
	
	
	public String getReadbleShedule() {
		String res = "";
		
		if (shedule[0] == 1) {
			res = res + " пн";
		}
		if (shedule[1] == 1) {
			res = res + " вт";
		}
		if (shedule[2] == 1) {
			res = res + " ср";
		}
		if (shedule[3] == 1) {
			res = res + " чт";
		}
		if (shedule[4] == 1) {
			res = res + " пт";
		}
		if (shedule[5] == 1) {
			res = res + " сб";
		}
		if (shedule[6] == 1) {
			res = res + " вс";
		}
		return res;
	}

}
