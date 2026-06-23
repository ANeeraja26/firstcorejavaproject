package com.logicalstatements.loops;

import java.util.Scanner;

public class DoWhileTestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		String yn = " ";

		do {
			System.out.println("Enter first number:");
			int n1 = sc.nextInt();

			System.out.println("Enter second number:");
			int n2 = sc.nextInt();

			System.out.println("Enter a symbol (+, -, *, /, %):");
			String symb = sc.next();

			switch (symb) {
			case "+" -> System.out.println("Addition: " + (n1 + n2));
			case "-" -> System.out.println("Subtraction: " + (n1 - n2));
			case "*" -> System.out.println("Multiplication: " + (n1 * n2));
			case "/" -> System.out.println("Division: " + (n1 / n2));
			case "%" -> System.out.println("Modulus: " + (n1 % n2));
			default -> System.out.println("Invalid symbol");
			}

			System.out.println("Do you want to continue? Press Y for Yes or N for No:");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("Y"));

		sc.close();
		System.out.println("Program ended");
	}
}