package com.task;

import java.util.Scanner;

public class TestDemo7 {
	
	
	int addition(int a, int b) {
		return a+b;
		
	}
	
	int Subtraction(int a, int b) {
		return a-b;
		
	}
	
	int Mulitipaly(int a, int b) {
		return a*b;
		
	}
	int Division(int a, int b) {
		return a/b;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number1");
		int n1=sc.nextInt();
		
		System.out.println("enter a number2");
		int n2=sc.nextInt();
		
		
		
		TestDemo7 t=new TestDemo7();
		
		System.out.println("addition="+t.addition(n1, n2));
		System.out.println("Subtraction="+t.Subtraction(n1,n2));
		System.out.println("Mulitipaly="+t.Mulitipaly(n1,n2));
		System.out.println("division="+t.Division(n1, n2));
		
		
		System.out.println("main method started");
		
		
		
		
		
		
		
		
		
			

	}

}
