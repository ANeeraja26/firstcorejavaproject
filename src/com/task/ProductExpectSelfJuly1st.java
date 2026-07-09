package com.task;

public class ProductExpectSelfJuly1st {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 1, 2, 3, 4 };

		for (int i = 0; i < arr.length; i++) {

			int product = 1;

			for (int j = 0; j < arr.length; j++) {

				if (i == j) {
					continue;
				}

				product *= arr[j];
			}

			System.out.print(product + " ");
		}
	}

}
