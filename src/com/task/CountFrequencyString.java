package com.task;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencyString {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter a string: ");
		String s = sc.nextLine();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : map.keySet()) {
			System.out.print(c + " : " + map.get(c) + ",");
		}
	}

}
