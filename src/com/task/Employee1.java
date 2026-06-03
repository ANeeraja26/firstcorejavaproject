package com.task;

	class Employee1 {

	    int empId;
	    String empName;

	    // Parent constructor
	    Employee1(int empId, String empName) {

	        // using this keyword
	        this.empId = empId;
	        this.empName = empName;
	    }
	}

	// Child class
	class Manager extends Employee {

	    String department;

	    // Child constructor
	    Manager(int empId, String empName, String department) {

	        // calling parent constructor using super keyword
	        super(empId, empName);

	        // using this keyword
	        this.department = department;
	    }

	    // Method to display details
	    void display() {

	        System.out.println("Employee ID : " + id);
	        System.out.println("Employee Name : " + name);
	        System.out.println("Department : " + department);
	    }
	

	// Main class
	//public class Main {

	    public static void main(String[] args) {

	        // Creating object
	        Manager m = new Manager(101, "Neeraja", "HR");

	        // Calling method
	        m.display();
	    }
	

	}

