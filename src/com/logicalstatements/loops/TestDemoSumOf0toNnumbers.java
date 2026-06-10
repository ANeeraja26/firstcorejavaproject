package com.logicalstatements.loops;

// WAP to print sum of 0 to N numbers
import java.util.Scanner;

public class TestDemoSumOf0toNnumbers {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;


		}
		System.out.println("Sum is :" + sum);

	}

}
