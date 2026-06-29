
package com.arrays;

public class SwappedWithReverseArray {

	void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		reverseArray(arr);

		System.out.println("After reverse:");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
