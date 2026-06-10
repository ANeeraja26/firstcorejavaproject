package com.task;

import java.math.BigInteger;

public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("enter a number");
		int n = 50;
		BigInteger fact = BigInteger.ONE;
		
		

		for (int i = 1; i <= n; i++) {
			fact=fact.multiply(BigInteger.valueOf(i));

		}
		System.out.println("Factorial of " + n + " = " );
		System.out.println(fact);

	}

}
