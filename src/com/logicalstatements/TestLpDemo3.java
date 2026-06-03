package com.logicalstatements;

import java.util.Scanner;

// write a program to print grade of the student based on their marks percentage

public class TestLpDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks percentage:");

		double marksp = sc.nextDouble();

		if (marksp > 100 || marksp <= 0) {
			System.out.println("invalid marks");

		} else if (marksp >= 90) {
			System.out.println("Grade A");

		} else if (marksp >= 80) {
			System.out.println("Grade B");

		} else if (marksp >= 70) {
			System.out.println("Grade C");

		} else if (marksp >= 60) {
			System.out.println("Grade D");

		} else if (marksp >= 35) {
			System.out.println("just passed");

		}

	}
}
