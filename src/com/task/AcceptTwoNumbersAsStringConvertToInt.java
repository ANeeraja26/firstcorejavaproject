package com.task;

import java.util.Scanner;

public class AcceptTwoNumbersAsStringConvertToInt {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("enter a first string");
			String a = sc.nextLine();

			System.out.println("enter a second string");
			String b = sc.nextLine();

			int x = Integer.valueOf(a);
			int y = Integer.valueOf(b);

			System.out.println("answer=" + x / y);

		} catch (NumberFormatException | ArithmeticException e) {
			System.err.println(e);

		}
	}

}
