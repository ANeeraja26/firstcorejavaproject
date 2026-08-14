package com.exceptionhandling;

public class TestDemoExample38 {
	static int test() {
	    try {
	        int x = 10 / 0;
	        return 10;
	    } catch (ArithmeticException e) {
	        System.out.println("A");
	        return 20;
	    } finally {
	        System.out.println("B");
	    }
	}


	public static void main(String[] args) {
	    System.out.println(test());

		
	}

}
