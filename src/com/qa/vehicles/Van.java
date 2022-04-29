package com.qa.vehicles;

public class Van extends Vehicle{
	
	private final String type = "Van";
	
	public Van(String registration, int year, String colour, boolean automatic) {
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
	
		String vehicle = type + "/" + registration + "/" + colour + "/" + year;
		return vehicle;
	}
}