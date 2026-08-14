package com.exceptionhandling;

public class TestDemoExample31 {
	static int test() {
	    try {
	        return 10;
	    } catch (Exception e) {
	        return 20;
	    } finally {
	        System.out.println("Finally");
	    }
	}
	

	public static void main(String[] args) {
	    System.out.println(test());


	}

}
