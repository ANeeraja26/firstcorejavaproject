package com.exceptionhandling;

public class TestDemoExample35 {

	public static void main(String[] args) {
	    try {
	        System.out.println("Try");
	        throw new Exception();
	    } catch (Exception e) {
	        System.out.println("Catch");
	    } finally {
	        System.out.println("Finally");
	    }
	
	}

}
