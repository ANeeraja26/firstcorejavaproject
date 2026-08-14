package com.exceptionhandling;

// DEV--> SIT---> UAT---> Pre-pod---> Production
// unit testing--> develop
import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = sc.nextInt();
		System.out.println("enter b number");
		int b = sc.nextInt();

		try {
              System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("dont send zeros");
		}

		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");

		sc.close();

	}

}
