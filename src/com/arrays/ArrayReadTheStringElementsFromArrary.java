package com.arrays;

import java.util.Scanner;

// read the elements from array 
public class ArrayReadTheStringElementsFromArrary {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();

		String[] arr = new String[size];
		System.out.println("Read the elements from a console");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextLine();

		}
		System.out.println("represnt an array:");
		for(String a:arr) {
			if(a.startsWith("n")) {
				System.out.println(a);
				
			}
			
		}
	}

}
