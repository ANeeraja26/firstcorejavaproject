package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestDemo3 {
	
	static void addition(int a, int b) {
		int sum=a+b;
		System.out.println("sum:"+sum);
		
	}

	public static void main(String[] args) {
      System.out.println("main method started");
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter a number 1:");
      int n1=sc.nextInt();
      
      System.out.println("enter a number 2:");
      int n2=sc.nextInt();
      
      
      addition(n1,n2);
      
      
      
	}

}
