package com.exceptionhandling;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		try {
			System.out.println("in try");
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.err.println("in catch");
			// e.printStackTrace();---> name+location+Description
			// System.err.println(e.getMessage());// ---> Description
			System.err.println(e.toString()); // --> name + Description
		}
		System.out.println("good morning !!");

		System.out.println("main method ended");

	}

}
