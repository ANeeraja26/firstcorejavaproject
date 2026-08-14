package com.task;

public class PatternMatrix {

	public static void main(String[] args) {
		System.out.println("main method started");

		int n = 5;
		char[][] arr = new char[n][n];

		String str = "DHONI";
		char ch = 'A';

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = ch;
				ch++;

			}

		}

		for (int i = 0; i < n; i++) {
			arr[i][i] = str.charAt(i);
			arr[i][n - 1 - i] = str.charAt(i);

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print(arr[i][j] + "");
			}
			
			System.out.println();
		}

	}
}
