package com.project;

import java.util.ArrayList;
import java.util.Scanner;

class Customer {
	int customerId;
	String name;
	String phone;

	Customer(int customerId, String name, String phone) {
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
	}

	void displayCustomer() {
		System.out.println("Customer ID : " + customerId);
		System.out.println("Name        : " + name);
		System.out.println("Phone       : " + phone);
	}
}

class Loan {
	int loanId;
	int customerId;
	double amount;
	double interestRate;
	int tenure;
	double remainingAmount;

	Loan(int loanId, int customerId, double amount, double interestRate, int tenure) {
		this.loanId = loanId;
		this.customerId = customerId;
		this.amount = amount;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.remainingAmount = amount;
	}

	double calculateEMI() {
		double monthlyRate = interestRate / (12 * 100);

		double emi = (amount * monthlyRate * Math.pow(1 + monthlyRate, tenure))
				/ (Math.pow(1 + monthlyRate, tenure) - 1);

		return emi;
	}

	void displayLoan() {
		System.out.println("Loan ID          : " + loanId);
		System.out.println("Customer ID      : " + customerId);
		System.out.println("Loan Amount      : " + amount);
		System.out.println("Interest Rate    : " + interestRate + "%");
		System.out.println("Tenure           : " + tenure + " months");
		System.out.println("Remaining Amount : " + remainingAmount);
		System.out.println("Monthly EMI      : " + calculateEMI());
	}
}

public class LoanManagementSystem {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Customer> customers = new ArrayList<>();
	static ArrayList<Loan> loans = new ArrayList<>();

	static int customerId = 1;
	static int loanId = 1;

	public static void main(String[] args) {
		System.out.println("main method started");

		while (true) {
			System.out.println("------------ LOAN MANAGEMENT SYSTEM ---------");
			System.out.println("1. Add Customer");
			System.out.println("2. Apply Loan");
			System.out.println("3. View Customers");
			System.out.println("4. View Loans");
			System.out.println("5. Calculate EMI");
			System.out.println("6. Pay EMI");
			System.out.println("7. Check Remaining Balance");
			System.out.println("8. Exit");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addCustomer();
				break;

			case 2:
				applyLoan();
				break;

			case 3:
				viewCustomers();
				break;

			case 4:
				viewLoans();
				break;

			case 5:
				calculateEMI();
				break;
			case 6:
				payEMI();
				break;

			case 7:
				checkBalance();
				break;

			case 8:
				System.out.println("Thank you!");
				System.exit(0);

			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	static void addCustomer() {

		sc.nextLine();

		System.out.print("Enter customer name: ");
		String name = sc.nextLine();

		System.out.print("Enter phone number: ");
		String phone = sc.nextLine();

		Customer c = new Customer(customerId++, name, phone);

		customers.add(c);

		System.out.println("Customer added successfully!");
		System.out.println("Customer ID: " + c.customerId);
	}

	static void applyLoan() {

		System.out.print("Enter customer ID: ");
		int cid = sc.nextInt();

		Customer customer = findCustomer(cid);

		if (customer == null) {
			System.out.println("Customer not found!");
			return;
		}
		System.out.print("Enter loan amount: ");
		double amount = sc.nextDouble();

		System.out.print("Enter interest rate: ");
		double rate = sc.nextDouble();

		System.out.print("Enter tenure in months: ");
		int tenure = sc.nextInt();

		Loan loan = new Loan(loanId++, cid, amount, rate, tenure);
		loans.add(loan);

		System.out.println("Loan applied successfully!");
		System.out.println("Loan ID: " + loan.loanId);
	}

	static void viewCustomers() {

		if (customers.isEmpty()) {
			System.out.println("No customers available.");
			return;
		}

		for (Customer c : customers) {
			System.out.println("\n----------------");
			c.displayCustomer();
		}
	}

	static void viewLoans() {

		if (loans.isEmpty()) {
			System.out.println("No loans available.");
			return;
		}

		for (Loan l : loans) {
			System.out.println("\n----------------");
			l.displayLoan();
		}
	}

	static void calculateEMI() {

		System.out.print("Enter loan ID: ");
		int id = sc.nextInt();

		Loan loan = findLoan(id);

		if (loan == null) {
			System.out.println("Loan not found!");
			return;
		}

		System.out.println("Monthly EMI = " + loan.calculateEMI());
	}

	static void payEMI() {

		System.out.print("Enter loan ID: ");
		int id = sc.nextInt();

		Loan loan = findLoan(id);

		if (loan == null) {
			System.out.println("Loan not found!");
			return;
		}
		double emi = loan.calculateEMI();

		if (loan.remainingAmount >= emi) {
			loan.remainingAmount = loan.remainingAmount - emi;

			System.out.println("EMI paid successfully!");
			System.out.println("Paid Amount: " + emi);
			System.out.println("Remaining Amount: " + loan.remainingAmount);
		} else {
			System.out.println("Loan is already completed.");
		}
	}

	static void checkBalance() {

		System.out.print("Enter loan ID: ");
		int id = sc.nextInt();

		Loan loan = findLoan(id);

		if (loan == null) {
			System.out.println("Loan not found!");
			return;
		}

		System.out.println("Remaining Balance: " + loan.remainingAmount);
	}

	static Customer findCustomer(int id) {

		for (Customer c : customers) {
			if (c.customerId == id) {
				return c;
			}
		}

		return null;
	}

	static Loan findLoan(int id) {

		for (Loan l : loans) {
			if (l.loanId == id) {
				return l;
			}
		}

		return null;

	}

}
