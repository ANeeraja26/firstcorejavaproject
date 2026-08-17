package com.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnlineStudentPortal {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		try {
			String name = null;
			System.out.println("Length: " + name.length());
			
		} catch (NullPointerException e) {
			
			System.out.println(e);
			sc.nextLine();
		}

		try {
			System.out.println("Enter age:");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.println("Age = " + age);

		} catch (InputMismatchException e) {
			System.out.println(e);
			sc.nextLine();

		}

		try {
			System.out.println("Enter subjects:");
			int subjects = sc.nextInt();

			int totalmarks = 500;
			double average = totalmarks / subjects;

			System.out.println("Average marks: " + average);

		} catch (ArithmeticException e) {
			System.out.println(e);
			sc.nextLine();

		}

		try {
			int[] marks = { 80, 75, 90, 89 };

			System.out.println("Marks = " + marks[5]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);

		}

		sc.close();

		System.out.println("Student Online Portal Completed");
	}

}
