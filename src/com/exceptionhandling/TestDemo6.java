package com.exceptionhandling;

public class TestDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			System.out.println("in try");
			System.out.println(0.0/0.0);//naN
			System.out.println(10/0.0);//infinity
			System.out.println("hello");
			
		}catch(Exception e) {
			System.err.println("in catch");
			System.err.println(e.getMessage());
			
		}
		System.out.println("main method ended");
	}

}
