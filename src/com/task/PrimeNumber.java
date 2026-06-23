package com.task;

import java.util.Scanner;

public class PrimeNumber {

	static void isprime(int n1, int n2) {
		int sum = 0;

		for (int i = n1; i <= n2; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {

				System.out.println(i + " ");
				sum += i;
			}

		}

		System.out.println();
		System.out.println("the sum of the prime number range is:" + sum);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting point: ");
		int n1 = sc.nextInt();
		System.out.println("enter the ending point:");
		int n2 = sc.nextInt();
		isprime(n1, n2);

	}
}
