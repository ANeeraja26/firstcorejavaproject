package com.task;

class Vehicle {
	void park() {
		System.out.println("Vehicle is parked.");
	}
}

class Car2 extends Vehicle {
	void park() {
		System.out.println("Car parked in Car Parking Slot.");
	}
}

class Bike extends Vehicle {
	void park() {
		System.out.println("Bike parked in Bike Parking Slot.");
	}
}

class EV extends Vehicle {
	void park() {
		System.out.println("Electric Vehicle parked in EV Charging Parking Slot.");
	}
}

public class CaseStudy5 {

	public static void main(String[] args) {

		Vehicle v;

		v = new Car2();
		v.park();

		v = new Bike();
		v.park();

		v = new EV();
		v.park();

	}

}
