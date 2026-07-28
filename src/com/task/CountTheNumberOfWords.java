package com.task;

import java.util.Scanner;

public class CountTheNumberOfWords {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence");

		String s = sc.nextLine().toLowerCase();

		int vowels = 0;
		int consonats = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;

				} else {
					consonats++;
				}

			}

		}

		System.out.println("length=" + s.length());
		System.out.println("vowels=" + vowels);
		System.out.println("consonats=" + consonats);

		sc.close();

	}

}
