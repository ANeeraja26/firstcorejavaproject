package com.strlinghandling;

import java.util.Scanner;

public class TestDemo20MaxAccurancesFromStringIMP {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first string");

		String str = sc.next();
		int[] arr = new int[127];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}

		int max = -1;
		char maxChar = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] > max) {
				max = arr[str.charAt(i)];
				maxChar = str.charAt(i);
			}
		}

		System.out.println("Maximum frequency character: " + maxChar);
	}

}
