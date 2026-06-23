package com.arrays;

import java.util.Scanner;

// WAP program to read the elements from Scanner
public class ArrayReadTheElementsFromScanner {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("read the elemts from on consloe");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Represting the array");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);

			}

		}

	}
}
