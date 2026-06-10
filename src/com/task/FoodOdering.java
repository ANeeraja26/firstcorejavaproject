package com.task;

import java.util.Scanner;

public class FoodOdering {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		int choice, quantity;
		int price = 0;
		String item = "";

		System.out.println("------ menu-------");
		System.out.println("1.Pizza-250");
		System.out.println("2.Burger-120");
		System.out.println("3.sandwich-100");
		System.out.println("4.coffee-80");

		System.out.println("enter your choice:");
		choice = sc.nextInt();
		System.out.println("enter quantity:");
		quantity = sc.nextInt();
		switch (choice) {
		case 1:
			item = "Pizza";
			price = 250;
			int totalBill=price*quantity;
			System.out.println(totalBill);
			break;
		case 2:
			item = "Burger";
			price = 120;
			totalBill=price*quantity;
			System.out.println(totalBill);
			break;
		case 3:
			item = "sandwich";
			price = 100;
			totalBill=price*quantity;
			System.out.println(totalBill);
			break;
		case 4:
			item = "coffee";
			price = 80;
			totalBill=price*quantity;
			System.out.println(totalBill);
			break;
			
			default:
				System.out.println("invalid Choice");
				return;
				
				
		}
	}

}
