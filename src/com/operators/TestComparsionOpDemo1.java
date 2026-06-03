package com.operators;

import java.util.Scanner;

public class TestComparsionOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int a = 10;
		int b = 20;
		int c = 20;
		System.out.println(a < b);// true
		System.out.println(a > b);// true
		System.out.println(a <= b);// true
		System.out.println(b >= c);// true

		System.out.println(!(a >= b));
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("you are Eligible for voting or driving");
		} else {
			System.out.println("Thank u boss");
		}

	}

}
