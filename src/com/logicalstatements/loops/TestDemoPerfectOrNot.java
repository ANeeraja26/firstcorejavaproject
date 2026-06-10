package com.logicalstatements.loops;

import java.util.Scanner;

// WAP to find the given number is perfect or not
// input is --> number
//output is--> boolean
public class TestDemoPerfectOrNot {
	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}

		}

		if (n == sum) {
			status = true;
		}
		return status;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check it perfect or not");
		int n = sc.nextInt();

		boolean flag = isPerfect(n);
		if (flag) {
			System.out.println("Given number is perfect");
		} else {
			System.out.println("given number is not perfect");
		}

	}

}
