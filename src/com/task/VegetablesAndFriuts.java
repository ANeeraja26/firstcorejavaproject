package com.task;

import java.util.Scanner;

public class VegetablesAndFriuts {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String yn;
		int totalBill = 0;

		do {
			System.out.println("Enter category (fruits / vegetables):");
			String cat = sc.nextLine().toLowerCase();

			switch (cat) {

			case "fruits" -> {
				System.out.println("Available Fruits:");
				System.out.println("apple, banana, orange, mango, papaya");

				System.out.print("Enter fruit name: ");
				String item = sc.nextLine().toLowerCase();

				switch (item) {
				case "apple" -> {
					System.out.println("Apple Price = Rs.200");
					totalBill += 200;
				}
				case "banana" -> {
					System.out.println("Banana Price = Rs.80");
					totalBill += 80;
				}
				case "orange" -> {
					System.out.println("Orange Price = Rs.250");
					totalBill += 250;
				}
				case "mango" -> {
					System.out.println("Mango Price = Rs.210");
					totalBill += 210;
				}
				case "papaya" -> {
					System.out.println("Papaya Price = Rs.150");
					totalBill += 150;
				}
				default -> System.out.println("Fruit not available");
				}
			}

			case "vegetables" -> {
				System.out.println("Available Vegetables:");
				System.out.println("tomato, potato, onion, carrot, cabbage");

				System.out.print("Enter vegetable name: ");
				String item = sc.nextLine().toLowerCase();

				switch (item) {
				case "tomato" -> {
					System.out.println("Tomato Price = Rs.40");
					totalBill += 40;
				}
				case "potato" -> {
					System.out.println("Potato Price = Rs.30");
					totalBill += 30;
				}
				case "onion" -> {
					System.out.println("Onion Price = Rs.50");
					totalBill += 50;
				}
				case "carrot" -> {
					System.out.println("Carrot Price = Rs.60");
					totalBill += 60;
				}
				case "cabbage" -> {
					System.out.println("Cabbage Price = Rs.45");
					totalBill += 45;
				}
				default -> System.out.println("Vegetable not available");
				}
			}

			default -> System.out.println("Invalid Category");
			}

			System.out.print("Do you want to continue? (yes/no): ");
			yn = sc.nextLine();

		} while (yn.equalsIgnoreCase("yes"));

		System.out.println("Total Bill = Rs." + totalBill);
		System.out.println("Thank You for Shopping!");
	}

}
