package com.javaintroduction;


//island of isolation

class A {
	
	B b;
	
}
class B {
	A a;
		
}


public class TestDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		A a =new A();
		B b =new B();
		
		a.b = b;
		b.a = a;
		
		
		a = null;
		b = null;
		
		
		System.gc();
		

	}

}
