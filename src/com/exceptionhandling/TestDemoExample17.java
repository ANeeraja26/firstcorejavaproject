package com.exceptionhandling;

public class TestDemoExample17 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
		    int x = 10 / 2;
		    System.out.println("A");
		} catch (Exception e) {
		    System.out.println("B");
		} finally {
		    System.out.println("C");
		}
	}

}
