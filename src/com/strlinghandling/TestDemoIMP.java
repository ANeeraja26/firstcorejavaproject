package com.strlinghandling;

import java.util.Scanner;

// Write a program to find duplicate elements from a string ---or print unique elements
public class TestDemoIMP {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (result.indexOf(c) == -1) {
				result = result + c;

			}

		}
		
		System.out.println("result value is :" + result);

	}

}
