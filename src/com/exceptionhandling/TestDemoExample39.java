package com.exceptionhandling;

public class TestDemoExample39 {
	static int test() {
	    try {
	        return 10;
	    } finally {
	        System.out.println("Hello");
	        System.out.println("World");
	    }
	}



	public static void main(String[] args) {
	    System.out.println(test());


	}

}
