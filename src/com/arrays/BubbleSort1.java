package com.arrays;

public class BubbleSort1 {

	void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}

			}

		}

	}

	void main(String[] args) {

		int[] arr = { 60, 50, 2, 3, 15, 20, 4 };
		System.out.println("before sorting : ");

		for (int a : arr) {
			System.out.print(a + " ");

		}
		System.out.println();

		bubbleSort(arr);

		System.out.println("after sorting: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
