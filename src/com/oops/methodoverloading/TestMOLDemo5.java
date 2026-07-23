package com.oops.methodoverloading;

public class TestMOLDemo5 {
	void main(String[] args) {
		System.out.println("main method started");


		        addition();
		        addition(10, 20);
		        addition(10, 20, 30);
		        addition(10, 20, 30, 40);
		        addition(10, 20, 30, 40, 50);
		    }

		    static void addition(int... elements) {
		        System.out.println("Var-arg method called");

		        int sum = 0;
		        for (int e : elements) {
		            sum = sum + e;
		        }

		        System.out.println("Sum of all elements: " + sum);
		    }
		
	

}
