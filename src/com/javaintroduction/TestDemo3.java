package com.javaintroduction;

public class TestDemo3 {
	
	static void wish() {
		System.out.println("Good Morning Have a nice day");
		
	}
	
	void hello() {
		
	System.out.println("Hello guys wassup");
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		wish();
		
		TestDemo3 t = new TestDemo3();
		
		t.hello();
		
		
		
		
		System.out.println("main method ended");
		
		

	}

}
