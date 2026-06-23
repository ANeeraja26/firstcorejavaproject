package com.arrays;

// WAp to copy two arrays into one array
public class TestDemoCopyOfArray {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] a = { 10, 20, 30 };
		int[] b = { 40, 50, 60 };
		int[] c = new int[a.length + b.length];// 6--------> 0 1 2 3 4 5

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];

		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];

		}
		System.out.println("represent an array:");

		for (int e : c) {
			System.out.print(e + " ");

		}

	}

}
