package com.qa.main;

import com.qa.garage.Garage;
import com.qa.vehicles.*;

public class Main {
	public static void main(String[] args) {
		Car c = new Car("ab12abc", 2012, "red", true);
		Van v = new Van("ab12abc", 2012, "red", false);
		Car d = new Car("ab12abc", 2012, "red", true);
		Garage garage = new Garage();
		garage.addV((Vehicle)c);
		garage.addV((Vehicle)d);
		garage.addV((Vehicle)v);
		garage.print();
		//garage.removeType("Car");
		//garage.remove(0);
		garage.print();
		System.out.println(garage.bill());
		garage.prices();
			
	}
}