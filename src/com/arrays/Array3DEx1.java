package com.arrays;

public class Array3DEx1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[][][] arr = new int[2][3][4];
		
		System.out.println(arr.length);//2
		System.out.println(arr[0].length);//3
		System.out.println(arr[0][0].length);//4
		
		for(int i=0;i<arr.length;i++) {
		    for(int j=0;j<arr[i].length;j++) {
		        for(int k=0;k<arr[i][j].length;k++) {
		            System.out.print(arr[i][j][k] + " ");
		        }
		        System.out.println();
		    }
		    System.out.println();
		}			
			
		

		for (int[][] arr2 : arr) {
			for (int[] arr1 : arr2) {
				for (int a : arr1) {
					System.out.print(a + " ");

				}
				System.out.println();

			}
			
			System.out.println();

		}
	}

}
