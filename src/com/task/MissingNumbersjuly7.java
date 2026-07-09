package com.task;

public class MissingNumbersjuly7 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int n = 12;
		int[] arr = { 1,4,7,9,12 };
		boolean[] present = new boolean[n + 1];

		for (int num : arr) {
			present[num] = true;

		}
		System.out.println("missing number=");

		for (int i = 0; i <= n; i++) {
			if (!present[i]) {
				System.out.println(i + " ");

			}

		}
	}

}
