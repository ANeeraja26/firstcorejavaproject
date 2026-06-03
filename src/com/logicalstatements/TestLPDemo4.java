package com.logicalstatements;

import java.util.Scanner;

// Nested if else
// work with simple nested if condition for basic validation check for matrimonial site.

public class TestLPDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to vcube Matrimonal");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		String fullName = sc.nextLine();
		System.out.println("hello mr." + fullName);

		System.out.println("enter your assets");
		double assets = sc.nextDouble();
		if (assets >= 50000000.00) {
			System.out.println("okay to proceed");

			System.out.println("eneter your salary :");
			double salary = sc.nextDouble();

			if (salary >= 25000000.00) {
				System.out.println("okay good to go");

				System.out.println("enter your age");
				int age = sc.nextInt();

				if (age <= 27 && age >= 25) {
					System.out.println("ohh good to know your age");

					System.out.println("enter your Height");
					double Height = sc.nextDouble();

					if (Height >= 5.7 && Height <= 6.2) {
						System.out.println("height is matching");

						System.out.println("enter your weight");
						double weight = sc.nextDouble();

						if (weight >= 65 && weight <= 75) {
							System.out.println("good to proceed");

							System.out.println("do you have sibiling");
							boolean sibStatus = sc.nextBoolean();
							if (sibStatus) {
								System.out.println("we are good to continue");

							} else {
								System.out.println("ohh my god");
							}
						} else {
							System.out.println("join gym");
						}

					} else {
						System.out.println("you are too short or too long");
					}

				} else {
					System.out.println("your age is not matching");
				}

			} else {
				System.out.println("sorry to contact");
			}

		} else {
			System.out.println("you can leave for the day");

		}

	}
}
