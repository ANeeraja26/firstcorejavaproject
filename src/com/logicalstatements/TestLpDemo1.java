package com.logicalstatements;

import java.util.Scanner;

public class TestLpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("welcome..!!");
			System.out.println("you are eligible for voting");
		}else {
			System.out.println("you are not eligible for voting");
		}

	}

}
