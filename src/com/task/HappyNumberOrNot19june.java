package com.task;

// WAp to to check given number or happy or not
// 25---> 2^2+5^2=4+25------29 and again
// 29----> 2^2+9^2----4+81----85 and again 8^2+5^2------------------------------------
import java.util.Scanner;

public class HappyNumberOrNot19june {


	public static void main(String[] args) {
		System.out.println("main method started");
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			int num =sc.nextInt();
			
			int result=num;
			
			while(result!=1 && result!=4) {
				int sum=0;
				
				while(result>0) {
					int digit=result%10;
					result=result/10;
					sum=sum+(digit*digit);
					
					
				}
				result=sum;
				
			}
			if(result==1) {
				System.out.println(num+"given number is happy");
				
			}else {
				System.out.println(num+"given number is not happy");
			}
				

	}

}
