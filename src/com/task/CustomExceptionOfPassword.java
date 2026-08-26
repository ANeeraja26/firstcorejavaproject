package com.task;

import java.util.Scanner;

class WeakPasswordException extends Exception {
	WeakPasswordException(String message) {
		super(message);
	}
}

public class CustomExceptionOfPassword {

	static void checkPassword(String password) {

		try {
			if (password.length() < 8) {
				throw new WeakPasswordException("Password is weak");

			}
			System.out.println("Password is strong");

		} catch (WeakPasswordException e) {
			System.out.println(e.getMessage());

		}
		

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter password");
		String password = sc.nextLine();
		checkPassword(password);

		System.out.println("main method ended");

	}
}
