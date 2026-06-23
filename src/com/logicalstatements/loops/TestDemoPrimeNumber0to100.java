package com.logicalstatements.loops;

import java.util.Scanner;

// WAP to print prime number to 0 to 100
// prime number means to print itself and 1
public class TestDemoPrimeNumber0to100 {
	static boolean isprime(int n) {
		boolean status = true;
		if (n <= 1) {
			return false;

		}

		for (int i = 2; i <= n; i++) {
			if (n % i == 0)
				status = false;
			break;

		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number for prime number range");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (isprime(i)) {
				System.out.println(i);
			}

		}

	}

}
