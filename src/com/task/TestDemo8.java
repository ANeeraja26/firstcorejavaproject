package com.task;

import java.util.Scanner;

public class TestDemo8 {

	static Scanner sc = new Scanner(System.in);

	static double getArea(double radius) {
		double Area = (3.14) * (radius * radius);
		return Area;

	}

	static double getVolume(double radius) {
		double Volume = (4 / 3) * (3.14) * (radius * radius * radius);
		return Volume;

	}

	static double getPerameter(double radius) {
		double Perameter = 2 * (3.14) * (radius);
		return Perameter;

	}

	public static void main(String[] args) {
		System.out.println("Enter the radius value : ");
		double r = sc.nextDouble();
		System.out.println("area of cricle:" + getArea(r));
		System.out.println("volume of cricle:" + getVolume(r));
		System.out.println("area of P:erameter" + getPerameter(r));

		System.out.println("main method ended");

	}

}
