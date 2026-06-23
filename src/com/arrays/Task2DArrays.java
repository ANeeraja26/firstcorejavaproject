package com.arrays;

public class Task2DArrays {

	public static void main(String[] args) {

		int a[][] = { { 1, 2 }, { 3, 4 } };
		int b[][] = { { 1, 2 }, { 3, 4 } };

		boolean equal = true;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					equal = false;
					break;
				}
			}
		}

		if (equal) {
			System.out.println("Arrays are Equal");
		} else {
			System.out.println("Arrays are Not Equal");

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print((a[i][j] + 0) + " ");
				}
				System.out.println();
			}
		}
	}
}