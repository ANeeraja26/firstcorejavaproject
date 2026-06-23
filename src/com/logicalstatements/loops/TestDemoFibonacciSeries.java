package com.logicalstatements.loops;

import java.util.Scanner;

// WAP to print FIbonacci series
// 0 1 1 2 3 5 8 13 21

public class TestDemoFibonacciSeries {

	static void Fibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1 + " "+n2);
		for(int i=1; i<=n; i++) {
			int n3=n1+n2;
			System.out.println(" "+n3);
			
			n1=n2;
			n2=n3;
			
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("how many number you want to print");
		int n = sc.nextInt();

		Fibonacci(n);

	}

}
