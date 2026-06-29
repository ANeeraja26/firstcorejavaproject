package com.accessmodifiers01;


// if we use private for a class we will get CE:

public class TestDemo1 {
	
	private int id=7;
	private String name="neeraja";
	
	private void method1() {
		System.out.println("method1 called");
	}
	

	public static void main(String[] args) {
		
		TestDemo1 t1=new TestDemo1();
		
		// Accessing the private data with in the class
		System.out.println(t1.id);
		System.out.println(t1.name);
		t1.method1();
     
	}
	
	}
