package com.task;

import java.util.Scanner;

public class AlternatePrimeNumbersToPrint1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N value: ");
		int n = sc.nextInt();

		int count = 0;

		System.out.println("Alternate prime numbers from 1 to " + n + " are:");

		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				count++;
				if (count % 2 != 0) {
					System.out.print(i + " ");
				}
			}
		}

		sc.close();
	}
}