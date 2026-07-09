package com.oops.inheritance;

import java.util.Scanner;

public class LoanImpl  {

	static Scanner sc = new Scanner(System.in);

	// Address Details
	String getAddressDetails() {

		System.out.print("Enter Flat Number: ");
		String flat = sc.next();

		sc.nextLine(); // Consume newline

		System.out.print("Enter Plot Details: ");
		String plot = sc.nextLine();

		System.out.print("Enter Street: ");
		String street = sc.nextLine();

		System.out.print("Enter City: ");
		String city = sc.next();

		System.out.print("Enter State: ");
		String state = sc.next();

		System.out.print("Enter Country: ");
		String country = sc.next();

		String address = "Flat Number: " + flat + ", Plot Details: " + plot + ", Street: " + street + ", City: " + city
				+ ", State: " + state + ", Country: " + country;

		return address;
	}

	// Phone Validation
	boolean isPhoneValid() {
		System.out.print("Enter Phone Number: ");
		String phone = sc.next();
		return phone.matches("[6-9][0-9]{9}");
	}

	// Aadhaar Validation
	boolean isAadharValid() {
		System.out.print("Enter Aadhaar Number: ");
		String aadhar = sc.next();
		return aadhar.matches("[0-9]{12}");
	}

	// PAN Validation
	boolean isPanValid() {
		System.out.print("Enter PAN Number: ");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
	}

	// Customer Salary
	double getCustomerSalary() {
		System.out.print("Enter Salary: ");
		return sc.nextDouble();
	}

	// CIBIL Score
	int getCibilScore() {
		System.out.print("Enter CIBIL Score: ");
		return sc.nextInt();
	}
	
	int ageInfo() {
		System.out.println("enter your age");
		int age = sc.nextInt();
		return age;
	}


	// Rate of Interest
	double getROI() {
		return 9.5;
	}

	// Main Method
	public static void main(String[] args) {

		LoanImpl loan = new LoanImpl();

		System.out.println("\n===== CUSTOMER DETAILS =====");

		String address = loan.getAddressDetails();
		System.out.println("\nAddress: " + address);

		System.out.println("Phone Valid: " + loan.isPhoneValid());
		System.out.println("Aadhaar Valid: " + loan.isAadharValid());
		System.out.println("PAN Valid: " + loan.isPanValid());

		double salary = loan.getCustomerSalary();
		System.out.println("Salary: " + salary);

		int cibil = loan.getCibilScore();
		System.out.println("CIBIL Score: " + cibil);

		System.out.println("Rate of Interest: " + loan.getROI() + "%");
	}
}