package com.javaintroduction;

public class Customer {

	public static void main(String[] args) {

		
		System.out.println("main method started");
		
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		
		
		
		c3=c1;
		
		
		System.gc();
		
		
		
		System.out.println("c1");
		
		System.out.println("c2");
		
		System.out.println("c3");
		
		
		
		System.out.println("main method ended");
	}

}
