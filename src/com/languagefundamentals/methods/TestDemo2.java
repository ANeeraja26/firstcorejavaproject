package com.languagefundamentals.methods;

//without return type+with arguments
//no return type+with arguments

public class TestDemo2 {
	
	static void Addition(int a, int b) {
		System.out.println("addition method called");
		System.out.println(a + b);
		}
		
		static void subtraction(int a, int b) {
			System.out.println("subtraction method called");
			System.out.println(a -b);
		}

		static void multiplication(Float a, double b) {
			System.out.println("multipllication method called");
			System.out.println(a * b);
		}
		static void division(double a, int b) {
			System.out.println("division method called");
			System.out.println(a/b);
		}
		
		static void modulus (double a, int b) {
			System.out.println("modulus method called");
			System.out.println(a%b);
		}

	public static void main(String[] args) {
		System.out.println("main method started");
		Addition(100,200);
		subtraction(500,300);
		multiplication(10.5F,3.5);
		division(500,300);
		modulus(100,4);
		
		

	}

}
