package com.exceptionhandling;

public class TestDemoExample29 {
	static int test() {
	    try {
	        System.out.println("A");
	        return 10;
	    } finally {
	        System.out.println("B");
	    }
	}


	public static void main(String[] args) {
	    System.out.println(test());


	}

}
