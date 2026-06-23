package com.logicalstatements.loops;

// WAP to swap two numbers by using temp variable
// WAp to swap two number without using 3rd variable

public class DoWhileTestDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int a = 30;
		int b = 20;

		int temp = a;
		a = b;
		b = temp;
		
		
		System.out.println("A value:" + a);
		System.out.println("B value:" + b);
	}

}
