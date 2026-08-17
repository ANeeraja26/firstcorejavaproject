package com.exceptionhandling;

import java.util.Scanner;

public class TestCustException {

	public static void main(String[] args) throws NeerajaException {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a age");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("Congrtulations you are eligible for voting");
			
		}else {
			throw new NeerajaException("better luck next time");
		}
	}

}
