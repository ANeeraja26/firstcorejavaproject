package com.exceptionhandling;

public class TestDemoExample20 {
	
	static int test() {
	    try {
	        return 100;
	    } finally {
	        return 200;
	    }
	}

	public static void main(String[] args) {
		System.out.println("main method started");
        System.out.println(test());

	}

}
