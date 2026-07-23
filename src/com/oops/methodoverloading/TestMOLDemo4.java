package com.oops.methodoverloading;

public class TestMOLDemo4 {


	    public static void main(String[] args) {
	        System.out.println("main method started");

	        TestMOLDemo4 t = new TestMOLDemo4();
	      t. show(null);
	      
	      
	      
	    }

	    void show(String args) {
	        System.out.println("String method called");
	    }

	    void show(Object o) {
	        System.out.println("Object method called");
	    }
	}

	
