package com.logicalstatements.loops;

import java.util.Scanner;

public class DecimalToBinaryConvert {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();

		decimalTOBinary(n);
	}

	private static void decimalTOBinary(int n) {
		int r = 0;
		String bn="";
		
		while(n>0) {
			r=n%2;
			n=n/2;
			bn=r+bn;
			
		}
		System.out.println("The Binary number is:"+bn);

	}

}
