package com.strlinghandling;

import java.util.Scanner;

public class TestDemo23IMP {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (str.indexOf(c)!=str.lastIndexOf(c) && result.indexOf(c) == -1) {
				System.out.println(c);
				result = result + c;

			}

		}

	}

}
