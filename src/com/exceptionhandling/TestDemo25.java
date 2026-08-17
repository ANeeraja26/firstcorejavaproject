package com.exceptionhandling;

import java.util.Scanner;

public class TestDemo25 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try(Scanner sc=new Scanner(System.in)) {
			System.out.println("enter a number");
			int a=sc.nextInt();
			System.out.println("enter a number");
			int b=sc.nextInt();
		
		if(b!=0) {
			System.out.println(a/b);//2
			
			
		}else {
			throw new ArithmeticException("Dont send Zero");
		}
	}
	}
}



