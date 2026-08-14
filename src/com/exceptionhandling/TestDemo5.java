package com.exceptionhandling;

import java.util.Scanner;

public class TestDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter a string");

			String name = sc.next();

			System.out.println(name.indexOf('a'));

			System.out.println(name.charAt('h'));// Index 104 out of bounds for length 7
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();

		}
		System.out.println("main method started");

	}

}
