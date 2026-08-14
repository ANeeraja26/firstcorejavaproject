package com.exceptionhandling;

public class TestDemoExample34 {
	static int test() {
	    try {
	        return 100;
	    } finally {
	        System.out.println("Finally 1");
	        System.out.println("Finally 2");
	    }
	}

	public static void main(String[] args) {
	    System.out.println(test());


	}

}
