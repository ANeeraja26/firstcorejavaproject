package com.logicalstatements.loops;

import java.util.Scanner;

// WAP to print Reverse number--123  --> 321
// WAP to palindrome 11211---> 11211
public class WhileLoopsReverseNumber {

	static int ReverseNumber(int n) {

		int r = 0;
		int rev = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;

		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("main mmethod started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int rev = ReverseNumber(n);
		System.out.println("reverse number of given number is:" + rev);

		if (n == rev) {
			System.out.println("given number is palindrome");
		} else {
			System.out.println("given number is  not palindrome");

		}
		sc.close();
	}

}
