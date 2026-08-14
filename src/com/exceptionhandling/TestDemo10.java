package com.exceptionhandling;

public class TestDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			System.out.println("in try 1");
			System.out.println(10/0);
			
			try {
				System.out.println("in try 2");
				
			}catch(Exception e) {
				System.err
				.println("in catch2");
				
			}
		}catch(Exception e) {
			System.err.println("in catch 1");
			
		}
		
		
		
		System.out.println("main method ended");

	}

}
