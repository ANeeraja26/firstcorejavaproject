package com.exceptionhandling;

public class TestDemo8 {

	public static void main(String[] args) {
		System.out.println("main  metghod started");
		
		try {
			System.out.println("in try");
			int a=100/5;
			String str="javais simple";
			System.out.println(str.charAt(a));
		}catch(ArithmeticException|NullPointerException|StringIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			
		}finally {
			System.out.println("in finally");
		}
		
		System.out.println("main method ended");
	}

}
