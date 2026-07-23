package com.task;

public class IntegerTargetjuly9 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 2, 4, 3, 5, 7, 8, 9 };
		int target = 7;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + " " + arr[j]);
					return;


				}
				

			}

		}

	}

}
