package com.arrays;

public class SelectionSort {
	void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;

				}

			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}

	}

	void main(String[] args) {
		int[] arr = { 10, 5, 8, 4, 5, 6, 8 };
		System.out.println("before sorting : ");

		for (int a : arr) {
			System.out.print(a + " ");

		}
		System.out.println();

		selectionSort(arr);

		System.out.println("after sorting: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
