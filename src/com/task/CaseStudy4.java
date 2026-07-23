package com.task;

import java.util.Scanner;

class Restaurant {
	void prepareFood() {
		System.out.println("Preparing food...");
	}
}

class Dominos extends Restaurant {
	void prepareFood() {
		System.out.println("Dominos is preparing Pizza.");
	}
	
	
}

class KFC extends Restaurant {
	void prepareFood() {
		System.out.println("KFC is preparing Fried Chicken.");
	}
}

class Bawarchi extends Restaurant {
	void prepareFood() {
		System.out.println("Bawarchi is preparing Biryani.");
	}
}

public class CaseStudy4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Restaurant r;

		System.out.println("Choose Restaurant:");
		System.out.println("1. Dominos");
		System.out.println("2. KFC");
		System.out.println("3. Bawarchi");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		if (choice == 1) {
			r = new Dominos();
		} else if (choice == 2) {
			r = new KFC();
		} else if (choice == 3) {
			r = new Bawarchi();
		} else {
			System.out.println("Invalid Choice");
			sc.close();
			return;
		}

	
		r.prepareFood();

		sc.close();
	}

}
