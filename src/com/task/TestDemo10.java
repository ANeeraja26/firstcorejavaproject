package com.task;

import java.util.Scanner;

//comparison operators == != > < >= <=
public class TestDemo10 {

	public static void main(String[] args) {
     System.out.println("main method started");
     
     Scanner sc=new Scanner(System.in);
     
     System.out.println("enter a first number:");
     int a=sc.nextInt();
     
     System.out.println("enter b Second number:");
     int b=sc.nextInt();
     
     System.out.println("Comparison Operator Results:");
     
     System.out.println("a == b : " + (a == b)); // Equal to
     System.out.println("a != b : " + (a != b)); // Not equal to
     System.out.println("a > b  : " + (a > b));  // Greater than
     System.out.println("a < b  : " + (a < b));  // Less than
     System.out.println("a >= b : " + (a >= b)); // Greater than or equal to
     System.out.println("a <= b : " + (a <= b)); // Less than or equal to
     
     
     sc.close();


     
     
	}

}
