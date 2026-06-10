package com.logicalstatements.loops;

import java.util.Scanner;

// WRP to print given number Divisors or factors
// input 14-->1 2 7 14
//input 6--->  1 2 3 6
public class TestDemoDivisorsorFactors {

	static void findFactors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);

			}

		}

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to find factors of a given number");
		int n = sc.nextInt();
		findFactors(n);

	}

}
