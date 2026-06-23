package com.task;

import java.util.Scanner;

public class OddOrEvenRecursion {
	
	static boolean isEven(int n) {
		if(n<0) {
		 isEven(-n);
		}
		
		if (n==0) return true;
		if (n==1) return false;
		return isEven(n-2);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(isEven(n)) {
			System.out.println("given number is even");
		}else {
			System.out.println("given number is odd");
		}
		
	}

}
