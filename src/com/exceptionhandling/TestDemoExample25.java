package com.exceptionhandling;

public class TestDemoExample25 {
	
	public static void main(String[] args) {
	    try {
	        int a = 10 / 0;
	        System.out.println("A");
	    } catch (Exception e) {
	        System.out.println("Catch");
	    } finally {
	        System.out.println("Finally");
	    }
	}

}
