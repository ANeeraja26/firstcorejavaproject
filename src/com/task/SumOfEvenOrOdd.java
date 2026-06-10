package com.task;

import java.util.Scanner;

public class SumOfEvenOrOdd {
	
	static void sumeven(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
			
			
		}
		System.out.println("even sum"+sum);
		
		int oddSum=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) 
				oddSum=oddSum+i;
			}
		
	System.out.println("oddSum"+oddSum);
	
}
	public static void main(String[] args) {
     System.out.println("main method started");
     
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number");
     
     int n=sc.nextInt();
     sumeven(n);
     
	}

}
