package com.strlinghandling;

import java.util.Scanner;

public class TestDemo16 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(arr.length);
		System.out.println("Neeraja".length());

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a phone number");
		String phone = sc.next();

		System.out.println(phone.matches("[6-9][0-9]{9}"));

		System.out.println("enter a aadhar number");
		String aadhar = sc.next();
		System.out.println(aadhar.matches("[2-9][0-9]{11}"));

		System.out.println("enter a PAN Number");
		String pan = sc.next();
		System.out.println(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]"));
	}

}
