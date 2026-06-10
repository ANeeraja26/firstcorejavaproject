package com.logicalstatements;

import java.util.Scanner;

// write a program to print the Cricketer details based on his jersey number
public class TestLsDemo1 {

	public static void main(String[] args) {
		System.out.println("welcome to indian cricket team");
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter jersey number to find the details");
		int jno=sc.nextInt();
		
		switch(jno) {
		
		
		case 1:
			System.out.println("K L Rahul");
			System.out.println("Wicket keeper & Right Hand Bastmen");
			break;
			
		case 7:
			System.out.println("Dhoni");
			System.out.println("Wicket keeper & Keeper");
			break;
			
		case 18:
			System.out.println("Virat Kohli");
			System.out.println("Chase master & Consistent palyer");
			break;
			
		case 45:
			System.out.println("Rohit Sharma");
			System.out.println("Hit Man");
			break;
			
		case 4:
			System.out.println("Abhishek Sharma");
			System.out.println("Aya Sher !!");
			break;
			
			default:
				System.out.println("unkonw player form team");
				

		
		}
		

	}

}
