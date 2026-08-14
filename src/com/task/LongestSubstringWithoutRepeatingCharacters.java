package com.task;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println("main method started");

		String str = "abcabcbb";
		String longest = "";

		for (int i = 0; i < str.length(); i++) {

			String s = "";

			for (int j = 0; j < str.length(); j++) {

				char ch = str.charAt(j);

				if (s.contains(ch + "")) {
					break;

				}

				s = s + ch;

				if (s.length() > longest.length()) {

					longest = s;

				}

			}


		}
		System.out.println(longest);

	}

}
