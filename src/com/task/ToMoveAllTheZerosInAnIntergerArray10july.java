package com.task;

public class ToMoveAllTheZerosInAnIntergerArray10july {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 0, 1, 0, 3, 12 };
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
