package com.strlinghandling;

public class TestDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started");

		String str1 = "Java -is -simple -in -Vcube- at- KPHB";

		String[] words = str1.split("-",4);
		int count = 0;

		for (String word : words) {
			System.out.println(word);
			count++;
		}

		System.out.println("The count is: " + count);
	}

}
