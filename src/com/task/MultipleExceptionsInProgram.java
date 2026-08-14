package com.task;

public class MultipleExceptionsInProgram {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 10, 20, 30 };
		try {

			System.out.println(arr[4]);
		}

		catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");

		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("array index is invalid");
		}
	}
}
