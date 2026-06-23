package com.logicalstatements.loops;

import java.util.Scanner;

// WAP to Find given number is Armstrong or not
// Armstrong number is number which is sum of its each digit power based on digit count
// input is------->  153---------> 1^3+5^3+3^3  ---> 1+125+27------153 is a Armstrong number
// input is 133-----> 1^3+3^3+3^3----------> 1+27+27--------> 55---- given number is Armstrong  number
public class ArmstrongOrNot {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();

		boolean status = isArmstrong(n);

		if (status) {
			System.out.println("given number is armstrong");
		} else {
			System.out.println("given number is not armstrong");
		}

	}

	private static boolean isArmstrong(int n) {
		boolean status = false;
		int r = 0;
		int sump = 0;
		int temp = n;
		int digitcount = Integer.toString(n).length();

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sump = (int) (sump + Math.pow(r, digitcount));
		}
		if (sump == temp) {
			status = true;
		}

		return status;
	}
}
