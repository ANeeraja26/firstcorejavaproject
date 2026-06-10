package com.logicalstatements;

import java.util.Scanner;

// write a program T-shirt Size and get the Description the cost...?
public class TestLsDemo3 {

	public static void main(String[] args) {
		System.out.println("welcome to shopping mall");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your T-shirt size");
		int size=sc.nextInt();
		
		switch(size) {
		case 36 ->{
			System.out.println("T-shirt size is small");
			System.out.println("T-shirt price is 500");
		}
		case 38 ->{
			System.out.println("T-shirt size is medium");
			System.out.println("T-shirt price is 600");
		}
		case 40 ->{
			System.out.println("T-shirt size is large");
			System.out.println("T-shirt price is 650");
		}
		case 44 ->{
			System.out.println("T-shirt size is XL");
			System.out.println("T-shirt price is 700");
		}
		default ->{
			System.out.println("size is not availble");
		}
		}
		
		

	}

}
