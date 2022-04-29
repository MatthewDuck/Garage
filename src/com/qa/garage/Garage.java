package com.qa.garage;
import java.util.ArrayList;
import java.util.List;

import com.qa.vehicles.Vehicle;

public class Garage {
	public static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	public static int bill = 0;
	public static int cost;
	
	public void addV(Vehicle v) {
		vehicles.add(v);
	}
	
	public void remove(int i) {
		vehicles.remove(i);
	}
	
	public int fix(Vehicle v) {
			if(v.getClass().getSimpleName().equals("Car")) {
				cost = 75;
			}else if(v.getClass().getSimpleName().equals("Van")) {
				cost = 100;
			}else if(v.getClass().getSimpleName().equals("Motorbike")) {
				cost = 20;
			}else {
			}
			return cost;
		}
			
	public void empty() {
		vehicles.clear();
	}
	
	public void removeType(String t) {
		for(int i =0; i<vehicles.size(); i++) {
			Vehicle v = vehicles.get(i);
			if(v.getClass().getSimpleName().equals(t)) {
				vehicles.remove(i);
				i--;
			}
			
		}
	}
	
	public void print() {
		System.out.println(vehicles);
	}
	
	public double bill() {
		for(int i =0; i<vehicles.size(); i++) {
			Vehicle v = vehicles.get(i);
			if(v.getClass().getSimpleName().equals("Car")) {
				bill += 75;
			}else if(v.getClass().getSimpleName().equals("Van")) {
				bill += 100;
			}else if(v.getClass().getSimpleName().equals("Motorbike")) {
				bill += 20;
			}else {
			}
		}
		return bill;
	}
	
	public void prices() {
		for(Vehicle vehicle : vehicles) {
			System.out.println(fix(vehicle));
			
		}
	}

}
