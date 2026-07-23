package com.oops.methodoverloading;

public class TestMOLDemo3 {

	public class Test {

	      void main(String[] args) {
	        System.out.println("main method started");
	      //   addition(10,10);   
	    }

	    void addition() {
	        System.out.println("addition method called");
	    }

	    void addition(int a) {
	        System.out.println("addition method called with int args");
	    }

	    void addition(float a) {
	        System.out.println("addition method called with float args");
	    }

	    void addition(int i, float a) {
	        System.out.println("addition method called with int and float args");
	    }
	}

}
