package com.exceptionhandling;

public class TestDemoExample40 {
	static int test() {
	    try {
	        int x = 10 / 0;
	        return 10;
	    } catch (Exception e) {
	        return 20;
	    } finally {
	        System.out.println("Finally");
	    }
	}


	public static void main(String[] args) {
	    System.out.println("Start");
	    System.out.println(test());
	    System.out.println("End");
	}

	}


