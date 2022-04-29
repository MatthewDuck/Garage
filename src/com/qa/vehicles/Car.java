package com.qa.vehicles;

public class Car extends Vehicle {
	private final String type = "Car";

	
	public Car(String registration, int year, String colour, boolean automatic) {
		super(registration, year, colour, automatic);
		this.registration = registration;
		this.year = year;
		this.colour = colour;
		this.automatic = automatic;
	}
	

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
	
	public String toString() {
		String vehicle = type + "/" + registration + "/" + colour + "/" + year + "/" + automatic;
		return vehicle;
	}
}