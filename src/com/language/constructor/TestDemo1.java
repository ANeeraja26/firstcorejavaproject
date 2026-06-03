package com.language.constructor;

// parent class
class Vehicle{
	String name="RE";
	
}
//child class
class Bike extends Vehicle {
	String name="FZ";
	
	void method1() {
		System.out.println( super.name);
		System.out.println( this.name);
		this.method2();
		
	}
	
	void method2() {
		System.out.println( "Hello.method2");
		
		
	}
}

public class TestDemo1 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Bike b=new Bike();
		
		// System.out.println(b.name);
		b.method1();
		
		
		
		
		
		
		
		System.out.println("main method ended");
		
		
		
		
		
		
		
		

	}

}
