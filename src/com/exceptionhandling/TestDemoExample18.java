package com.exceptionhandling;

public class TestDemoExample18 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
		    System.out.println("A");
		    int x = 10 / 0;
		} catch (Exception e) {
		    System.out.println("B");
		} finally {
		    System.out.println("C");
		}
	}

}
