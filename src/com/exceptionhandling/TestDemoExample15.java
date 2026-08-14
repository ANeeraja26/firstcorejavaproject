package com.exceptionhandling;

public class TestDemoExample15 {
	
	static int test() {
	    try {
	        int x = 10 / 0;
	        return 10;
	    } catch (Exception e) {
	        return 20;
	    } finally {
	        return 30;
	    }
	}

	public static void main(String[] args) {
		System.out.println("main method started");
        System.out.println(test());

		
	}

}
