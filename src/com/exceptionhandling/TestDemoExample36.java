package com.exceptionhandling;

public class TestDemoExample36 {
	static String test() {
	    try {
	        return "Try";
	    } finally {
	        return "Finally";
	    }
	}


	public static void main(String[] args) {
	    System.out.println(test());


	}

}
