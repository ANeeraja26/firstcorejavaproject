package com.task;

import java.util.Scanner;

public class ArraySizeNumber19june {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("enter a array elements");
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
			
		}
		
		int largest=arr[0];
		
		for(int i=1;i<size;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
				
			}
			
		}
		
		System.out.println("largest number="+largest);

	}

}
