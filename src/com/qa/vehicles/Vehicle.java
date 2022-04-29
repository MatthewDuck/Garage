package com.qa.vehicles;

public abstract class Vehicle {
	protected String registration;
	protected int year;
	protected String colour;
	protected boolean automatic;
	protected String type;

	public String getType() {
		return type;
	}
	
	public String getRegistration() {
		return registration;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getColour() {
		return colour;
	}
	
	public boolean automatic() {
		return automatic;
	}
	
	public Vehicle(String registration, int year, String colour, boolean automatic) {
		super();
		this.registration = registration;
		this.year = year;
		this.colour = colour;
		this.automatic = automatic;
	}

}
