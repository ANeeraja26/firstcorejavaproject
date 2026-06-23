package com.logicalstatements.loops;

// WAp to print Digits of given sum
// input is--> 1234   --->4
//input is ---> 4563829 ---> 7
import java.util.Scanner;

public class WhileLoopsDigitsSumToFind {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to find digit");
		int n = sc.nextInt();
		int temp=n;
		int count = 0;
		int r=0;

		while (n > 0) {
			r = n % 10;
			n=n/10;
			count++;
		}
		System.out.println("the give digit sum is:"+count);
		
		System.out.println("**********************************");
		String str=Integer.toString(temp);
		int digitcount=str.length();
		
		sc.close();
		

		}
	}

