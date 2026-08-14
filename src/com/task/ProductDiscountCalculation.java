package com.task;

import java.util.Scanner;

public class ProductDiscountCalculation {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		
		try {
			
			System.out.println("enter product price:");
			double product=sc.nextDouble();
			System.out.println("enter a discount amount:");
			double discount=sc.nextDouble();
			
			double Finalprice=product-discount;
			System.out.println(Finalprice);
			
			
		}catch(Exception e) {
			System.out.println(e);
			
		}finally {
			System.out.println("shopping completed");
		}
		
		
		
		
		
		
		
	}

}
