package com.arrays;

public class TestDemo2dArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		int [][]arr=new int[3][3];
		
		arr[0][0]=50;
		arr[0][1]=500;
		arr[0][2]=5000;

		arr[1][0]=60;
		arr[1][1]=50;
		arr[1][2]=500;

		arr[2][0]=50;
		arr[2][1]=50;
		arr[2][2]=50;
		
		// for(int[]a1:arr){
			// for(int a:a1) {
				// System.out.print(a + " ");
				
			// }
			
			// System.out.println();
			
		// }
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			
			System.out.println();
			
		}



		
		
	}

}
