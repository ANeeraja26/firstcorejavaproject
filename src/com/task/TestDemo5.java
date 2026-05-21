package com.task;

import java.util.Scanner;

public class TestDemo5 {
	
	  static void addition(int a, int b){
		  int sum=a+b;
		  System.out.println("sum of two number:"+sum);
		
	}
	  static void subtract(int a, int b){
		  int subtract=a-b;
		  System.out.println("subtract of two number:"+subtract);
		
	}
	  static void multipaly(int a, int b){
		  int multipaly=a*b;
		  System.out.println("multipaly of two number:"+multipaly);
		
	}
	  static void divide(int a, int b){
		  int divide=a/b;
		  System.out.println("divide of two number:"+divide);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number1");
		int n1=sc.nextInt();
		System.out.println("enter a number 2");
		int n2=sc.nextInt();
		
		addition(n1,n2);
		subtract(n1,n2);
		multipaly(n1,n2);
		divide(n1,n2);
		
		
		
		

	}

}
