package com.task;

import java.util.Scanner;

interface Discount {
	void regular(double amount);

	void premium(double amount);

	void vip(double amount);
}

class Customer implements Discount {
	public void regular(double amount) {
		System.out.println("Final Bill=" + (amount - amount * 0.05));
	}

	public void premium(double amount) {
		System.out.println("Final Bill=" + (amount - amount * 0.15));
	}

	public void vip(double amount) {
		System.out.println("Final Bill=" + (amount - amount * 0.25));
	}
}

public class Discount22july {
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter purchase amount:");
		double amount = sc.nextDouble();

		System.out.println("1.regular");
		System.out.println("2.premium");
		System.out.println("3.vip");
		System.out.println("enter your choice");
		int chioce = sc.nextInt();

		Customer c = new Customer();

        switch (chioce) {
        case 1:
            c.regular(amount);
            break;

        case 2:
            c.premium(amount);
            break;

        case 3:
            c.vip(amount);
            break;

        default:
            System.out.println("Invalid Choice");
    }

    sc.close();
}
}

	


