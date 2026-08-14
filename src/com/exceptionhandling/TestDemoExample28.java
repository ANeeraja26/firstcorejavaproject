package com.exceptionhandling;

public class TestDemoExample28 {

	public static void main(String[] args) {
		try {
	        System.out.println("A");
	        int x = 10 / 0;
	        System.out.println("B");
	    } catch (Exception e) {
	        System.out.println("C");
	    } finally {
	        System.out.println("D");
	    }

	}

}
