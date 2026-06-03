package com.task;

class Company {
	
	String companyName;
	String companyLocation;

	// Parent class constructor
	Company(String companyName, String companyLocation) {
		this.companyName = companyName;
		this.companyLocation = companyLocation;
	}
	
}

// Child class
public class Employee2 extends Company {
	int empId;
	String empName;

	// Child class constructor
	Employee2(String companyName, String companyLocation, int empId, String empName) {

		// Calling parent constructor using super()
		super(companyName,companyLocation); 

		this.empId = empId;
		this.empName = empName;
	}

	// Display method
	void display() {
		System.out.println("Company Name : " + companyName);
		System.out.println("Company Location : " + companyLocation);
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Name : " + empName);
	}

	// Main method
	public static void main(String[] args) {

		Employee2 e1 = new Employee2("TCS", "Hyderabad", 101, "Neeraja");

		e1.display();
	}

}