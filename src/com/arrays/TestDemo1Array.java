package com.arrays;

public class TestDemo1Array {

	public static void main(String[] args) {
		System.out.println("main method started");

		// step--> 1 declaration
		int[] ages;

		// step--> 2 creation
		ages = new int[5];
		// step-->3 initialization
		ages[0] = 21;
		ages[1] = 22;
		ages[2] = 23;
		ages[3] = 21;
		ages[4] = 24;

		// step--> 4 representation
		for (int i = 0; i <= ages.length; i++) {
			System.out.println(ages[i]);
		}

	}



	}


