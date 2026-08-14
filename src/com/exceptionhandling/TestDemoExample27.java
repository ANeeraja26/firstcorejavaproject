package com.exceptionhandling;

public class TestDemoExample27 {
	static int test() {
	    try {
	        int a = 10 / 0;
	        return 10;
	    } catch (Exception e) {
	        return 20;
	    } finally {
	        return 30;
	    }
	}

	public static void main(String[] args) {
	    System.out.println(test());


	}

}
