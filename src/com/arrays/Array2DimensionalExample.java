package com.arrays;

// WAP in 2dimensional program
public class Array2DimensionalExample {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[][] arr = new int[2][3]; // 6

		arr[0][1] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

		}

		// for(int[]a1:arr) {
		// for(int a :a1) {
		// System.out.print(a+" ");
		// }
		// System.out.println();

		// }

	}

}
