package com.oops.inheritance;

public class Customer {

	int cage;
	String cname;
	long ph;

	public Customer(int cage, String name, long ph) {
		this.cage = cage;
		this.cname = cname;
		this.ph = ph;
	}

	@Override
	public String toString() {
		return "Customer [Customer Age: " + cage + ", Customer Name: " + cname + ", Customer Phone: " + ph + "]";
	}

	public static void main(String[] args) {
		System.out.println("Main method started");

		Customer c1 = new Customer(22, "Neeraja", 9392436650L);

		System.out.println(c1); // Automatically calls toString()
		System.out.println(c1.toString()); // Explicitly calls toString()
	}

}
