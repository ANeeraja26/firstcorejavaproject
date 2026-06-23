package com.task;

// WAP to print the given number is strong or not
// input---> 145
// output ----> 145
import java.util.Scanner;

public class StrongNumberOrNot18June {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		int sum = 0;
		int r = num;

		while (num > 0) {
			int digit = num % 10;
			int fact = 1;

			for (int i = 1; i <= digit; i++) {

				fact *= i;

			}
			sum += fact;
			num /= 10;

		}

		if (sum == r) {
			System.out.println("given number is strong");
		} else {
			System.out.println("given number is not strong");
		}
		sc.close();
	}

}
