package com.task;

import java.util.Scanner;

public class BitwiseOp1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		if ((num & 1) == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        sc.close();

	}

}
