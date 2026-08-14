package com.exceptionhandling;

public class TestDemoExample32 {
	static int test() {
	    try {
	        int x = 10 / 0;
	        return 10;
	    } catch (Exception e) {
	        System.out.println("Catch");
	        return 20;
	    } finally {
	        System.out.println("Finally");
	    }
	}


	public static void main(String[] args) {
	    System.out.println(test());


	}

}
