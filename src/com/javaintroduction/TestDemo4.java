package com.javaintroduction;

public class TestDemo4 {
	
	static void method1() {
		  
		  
		  TestDemo4 t = new TestDemo4();
		  t.method2();
		  System.out.println("method1 called");
		  
		}
	
	
	void method2() {
		method3();
		System.out.println("method2 called");
		
		
		
	}

	void method3() {
		method4();
		System.out.println("method3 called");
	}
	void method4() {
	          System.out.println("method4 called");
		  
		
	}
	
	public static void main(String[] args) {
		
		    System.out.println("main method started");
		    
		    method1(); {
		    	
		    	System.out.println("main method ended");
		    	
		    	
		    	
		    	
		    }
		

	}

}
