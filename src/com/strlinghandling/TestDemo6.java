package com.strlinghandling;

public class TestDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started");

		String[] names = { "Neeru", "Neeraja", "Ram", "RamiReddy", "Ramu" };

		for (String name : names) {

			if (name.contains("er")) {
				System.out.println(name);

			}

		}
	}

}
