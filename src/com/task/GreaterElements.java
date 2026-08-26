package com.task;

public class GreaterElements {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 5, 1, 4, 3, 6, 8, 10, 7 };
		for (int i = 1; i < arr.length - 1; i++) {

			int maxLeft = arr[0];
			int minRight = arr[i + 1];

			for (int j = 0; j < i; j++) {
				if (arr[j] > maxLeft) {
					maxLeft = arr[j];

				}

			}

			for (int j = i; j < arr.length; j++) {
				if (arr[j] > minRight) {
					minRight = arr[j];

				}

			}

			if (arr[i] > maxLeft && arr[i] < minRight) {
				System.out.println(arr[i]);
				break;

			}

		}

	}
}
