package com.task;

import java.util.Scanner;

public class RestaurantMenu {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------- RESTAURANT MENU -------------");
        System.out.println("1. Veg Items");
        System.out.println("2. Non-Veg Items");

        System.out.print("Enter Category (1 or 2): ");
        int category = sc.nextInt();

        int bill = 0;

        if (category == 1) {
            System.out.println("--- VEG MENU ---");
            System.out.println("1. Veg Meals - Rs.100");
            System.out.println("2. Paneer Biryani - Rs.150");
            System.out.println("3. Veg Fried Rice - Rs.120");

            System.out.print("Enter Item Number: ");
            int item = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            if (item == 1)
                bill = 100 * qty;
            else if (item == 2)
                bill = 150 * qty;
            else if (item == 3)
                bill = 120 * qty;
            else
                System.out.println("Invalid Item");

        } else if (category == 2) {
            System.out.println("--- NON-VEG MENU ---");
            System.out.println("1. Chicken Biryani - Rs.200");
            System.out.println("2. Mutton Biryani - Rs.300");
            System.out.println("3. Chicken Fried Rice - Rs.180");

            System.out.print("Enter Item Number: ");
            int item = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            if (item == 1)
                bill = 200 * qty;
            else if (item == 2)
                bill = 300 * qty;
            else if (item == 3)
                bill = 180 * qty;
            else
                System.out.println("Invalid Item");

        } else {
            System.out.println("Invalid Category");
        }

        if (bill > 0) {
            System.out.println("Total Bill = Rs." + bill);

            if (bill >= 500) {
                int discount = bill * 10 / 100;
                System.out.println("Discount = Rs." + discount);
                System.out.println("Final Bill = Rs." + (bill - discount));
            }
        }

        sc.close();
	}

}
