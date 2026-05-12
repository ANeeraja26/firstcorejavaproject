package com.languagefundamentals.methods;

//no return type+no arguments
//without return type+ without arguments

public class TestDemo1 {

	
	static void hello() {
		System.out.println("hello method called");
	}
	
	public static void main(String[] args) {
   System.out.println("main method started");
   
   hello();
   TestDemo1 t=new TestDemo1();
   t.show();
	}
	

	
	
	void show() {
		System.out.println("show method called");
		
		
		
	}

}

