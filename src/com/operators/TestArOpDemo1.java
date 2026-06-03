package com.operators;

//Arithmetic operators : + - * / %
public class TestArOpDemo1 {

	public static void main(String[] args) {

		System.out.println("main method started");

		int a = 10;
		int b = 20;

		int a1 = 98;
		int b1 = 4;

		System.out.println("Addition");
		System.out.println(a + b);// sum == 30
		System.out.println("sum:" + a + b);// sum==1020
		System.out.println("sum:" + (a + b));// BODMAS sum==30

		System.out.println("Subtraction");
		System.out.println(b - a);// diff == 10
		System.out.println("Diff:" + (b - a));// 1

		System.out.println("Multiplication");
		System.out.println(a * b);// product 200
		System.out.println("Product:" + a * b);// 200
		
		
		System.out.println("Division---quotient");
		System.out.println(a1/b1);
		
		System.out.println("Modulus---Remainder");
		System.out.println(a1%b1);
		

	}

}
