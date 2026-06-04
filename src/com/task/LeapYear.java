package com.task;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
		
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "  Leap Year");
        } else {
            System.out.println(year + " Not a Leap Year");
        }

        sc.close();
    }
}
