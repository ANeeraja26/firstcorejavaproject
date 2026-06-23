
package com.task;

import java.util.Scanner;

public class NeonNumber15thJune {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		int square=num*num;
		int temp=square;
		int sum=0;
		
		while(temp>0) {
			sum=sum+temp%10;
			temp=temp/10;
			
			
			
		
	}
	
	if(sum==num) {
		System.out.println("given number is neon");
	}else {
		System.out.println("given number is not a neon");
	}
	sc.close();
}


}
