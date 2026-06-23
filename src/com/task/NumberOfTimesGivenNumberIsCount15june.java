package com.task;

import java.util.Scanner;

public class NumberOfTimesGivenNumberIsCount15june {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		System.out.println("enter the digit to count:");
		int digit = sc.nextInt();

		int count = 0;
		int temp = num;

		while (temp > 0) {
			
			int rem=temp%10;
		
			
			if(rem==digit) {
				count++;
				
				
			}
			
			temp=temp/10;	

		}
		
		
        System.out.println("The digit " + digit + " occurs " + count + " times.");
	}

}
