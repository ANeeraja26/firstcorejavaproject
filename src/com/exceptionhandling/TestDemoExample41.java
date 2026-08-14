package com.exceptionhandling;

public class TestDemoExample41 {
	static int test() {
	    try {
	        return 10;
	    } catch (Exception e) {
	        return 20;
	    } finally {
	        return 50;
	    }
	}


	public static void main(String[] args) {
	    System.out.println("Start");
	    System.out.println(test());
	    System.out.println("End");


	}

}
