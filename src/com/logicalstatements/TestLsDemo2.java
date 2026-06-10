package com.logicalstatements;

import java.util.Scanner;

// write a program result of two calculated values based on entered symbol
public class TestLsDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Calculation information");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a frist number");
		int n1 = sc.nextInt();
		System.out.println("Second  a frist number");
		int n2 = sc.nextInt();

		System.out.println("enter a symbol to proceed with calculations");
		String sym = sc.next();

		switch (sym) {

		case "+" -> {
			System.out.println("sum");
			System.out.println("addition is " + (n1 + n2));
		}

		case "-" -> {
			System.out.println("sub");
			System.out.println("Sub is " + (n1 - n2));
		}

		case "*" -> {
			System.out.println("mulitipaly");
			System.out.println("multiplay is " + (n1 * n2));
		}

		case "/" -> {
			System.out.println("divide");
			System.out.println("division is " + (n1 / n2));
		}

		case "%" -> {
			System.out.println("moduls");
			System.out.println("moduls is " + (n1 % n2));
		}

		default -> {
			System.out.println("unknow number");
		}

		}

	}

}
