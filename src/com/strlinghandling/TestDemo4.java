package com.strlinghandling;

import java.util.Scanner;

// write a print String in a reverse order
// write a program given number is palindrome or not
public class TestDemo4 {

	public static void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");


		String str = sc.next();
		String rstr = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			rstr = c + rstr;

		}
		System.out.println("reverse string of a given string:"+rstr);
		
		if(str.equalsIgnoreCase(rstr)) {
			System.out.println("The Given string is palindrome");
			
		}else {
			System.out.println("The given number is a not palindrome");
		}

	}

}
