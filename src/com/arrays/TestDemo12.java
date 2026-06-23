package com.arrays;

public class TestDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int[][]arr=new int[2][1];
		
		arr[0]=new int[3];
		arr[1]=new int [3];
		
		arr[0][0]=10;
		arr[0][1]=102;
		arr[0][2]=100;
		
		arr[1][0]=1000;
		arr[1][1]=100;
		arr[1][2]=10;



		
		
		 for(int[]a1:arr) {
			 for(int a:a1) {
			 	System.out.print(a + " ");
				
			 }
			System.out.println();
			
		}
		
		// for(int i=0;i<arr.length;i++) {
			// for(int j=0; j<arr.length;j++) {
				// System.out.print(arr[i][j]+ " ");
				
			// }
			// System.out.println();
			
		// }

	}

}
