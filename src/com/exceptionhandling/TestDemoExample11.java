package com.exceptionhandling;

public class TestDemoExample11 {

	public static void main(String[] args) {
		System.out.println("main method started");
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Catch");
        }

	}

}
