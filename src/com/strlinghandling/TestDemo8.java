package com.strlinghandling;

import java.util.Scanner;

public class TestDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name");
		String uname=sc.next();
		
		System.out.println("enter your password");
		sc.nextLine();
		String passwordString=sc.nextLine();
		
		if(uname.equalsIgnoreCase("Admin")&& passwordString.equals("Admin@12345")) {
			System.out.println("Welcome to Home page:");
			
		}else {
			System.out.println("Invalid user credentials");
		}
		
		
	}

}
