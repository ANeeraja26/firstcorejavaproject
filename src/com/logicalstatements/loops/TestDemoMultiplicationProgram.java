package com.logicalstatements.loops;

import java.util.Scanner;

// WAP to print Multiplication program

//10 x 1 = 10
//10 x 2 = 20
//10 x 3 = 30
//10 x 4 = 40
//10 x 5 = 50
//10 x 6 = 60
//10 x 7 = 70
public class TestDemoMultiplicationProgram {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();

		System.out.println("up to where you want to print");
		int n1 = sc.nextInt();
		
		for(int i=1;i<=n1;i++) {
			System.out.println(n + " X " + i + " = " +(n*i));
			
		}
	}

}
