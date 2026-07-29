package com.task;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str1 = sc.nextLine();

		System.out.print("Enter second string: ");
		String str2 = sc.nextLine();

		if (str1.length() != str2.length()) {
			System.out.println("The strings are not anagrams.");
			return;
		}

		char[] ch = str2.toCharArray();
		boolean flag = true;

		for (int i = 0; i < str1.length(); i++) {
			boolean found = false;

			for (int j = 0; j < ch.length; j++) {
				if (str1.charAt(i) == ch[j]) {
					ch[j] = '*'; 
					found = true;
					break;
				}
			}

			if (!found) {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("The strings are anagrams.");
		else
			System.out.println("The strings are not anagrams.");

		sc.close();
	}


	}


