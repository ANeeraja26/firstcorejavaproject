package com.task;

import java.util.Scanner;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		
		String s=sc.nextLine();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		
		if(s.equals(rev))
			System.out.println("given number is palindrone");
		else
			System.out.println("given number  is not a palindrone");
	}

}
