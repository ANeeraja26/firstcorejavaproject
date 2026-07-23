package com.task;

public class PrimaryAndSecondaryDiagonals21july {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum = 0;
		int n = a.length;

		for (int i = 0; i < n; i++) {

			sum = sum + a[i][i];

			if (i != n - 1 - i) {
				sum = sum + a[i][n - 1 - i];
			}
		}

		System.out.println("Sum of both diagonals = " + sum);
	}

}
