package com.exceptionhandling;

public class TestDemoExample19 {
	
	static int test() {
	    try {
	        System.out.println("A");
	        return 100;
	    } finally {
	        System.out.println("B");
	    }
	}

	public static void main(String[] args) {
		System.out.println("main method started");
        System.out.println(test());

		
		
	}

}
