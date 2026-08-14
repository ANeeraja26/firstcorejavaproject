package com.exceptionhandling;

public class TestDemoExample30 {

	public static void main(String[] args) {
		try {
	        int a = 10 / 2;
	        System.out.println(a);
	    } catch (Exception e) {
	        System.out.println("Catch");
	    } finally {
	        System.out.println("Finally");
	    }
	}
	}


