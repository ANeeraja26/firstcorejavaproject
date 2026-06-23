package com.logicalstatements.loops;

import java.util.Scanner;

public class TestDemoIsPrimeOrNot {
	
	static boolean IsPrime(int n) {
		boolean status=true;
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
			
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check given number is prime  or not");
		int n=sc.nextInt();
		
		boolean status =IsPrime(n);
		if(status) {
			System.out.println("given number is prime");
		}else {
			System.out.println("given no is not prime");
		}
	}

}
