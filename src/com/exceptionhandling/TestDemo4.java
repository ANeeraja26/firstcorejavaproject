package com.exceptionhandling;

public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = new int[4];

		try {
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			arr[4] = 50;
		} catch (Exception e) {
			System.out.println("in catch");
			e.printStackTrace();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		System.out.println("main method started");

	}

}
