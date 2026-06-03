package com.operators;

import java.util.Scanner;

// write a program to find min & max number from given two numbers
// ternary operators syntax  (condition)?value:value2
public class TestTernaryOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int a = 10;
		int b = 20;

		int max = (a > b) ? a : b;
		System.out.println(max);

		// find the given age valid for driving or not...?
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a age:");
		int age=sc.nextInt();
		String info=(age>18)?"valid":"invalid";
		System.out.println("enterd your age:"+info);
		
		// find a max value from 3 values
		int x = 10;
		int y = 20;
		int z = 30;
		
		int max1=(x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println(max1);
		
	}

}
