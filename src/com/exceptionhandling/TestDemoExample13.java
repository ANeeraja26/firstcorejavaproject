package com.exceptionhandling;

public class TestDemoExample13 {
	
	
    static int test() {
        try {
            return 10;
        } finally {
            System.out.println("Finally");
        }
    }

	public static void main(String[] args) {
		System.out.println("main method started");
        System.out.println(test());

		
	}
	    

}
