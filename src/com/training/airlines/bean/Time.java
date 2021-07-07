package com.training.airlines.bean;

public class Time {
	private int hour;
	private int min;
	
	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	
	public void setTime(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	
	public Time getTime() {
		Time t = new Time(hour, min);
		return t;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMin() {
		return min;
	} 
}
