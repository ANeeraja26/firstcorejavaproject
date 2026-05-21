package com.task;

import java.util.Scanner;

public class CalculateSI {
	
	
	

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter principal amount:");
		double principal=sc.nextDouble();
		
		System.out.println("enter rate of interset:");
		double rate=sc.nextDouble();
		
		System.out.println("enter time(in years):");
		double time=sc.nextDouble();
		
		
        double simpleInterest = (principal * rate * time) / 100;
        
        
        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }

        
        
        


	}

