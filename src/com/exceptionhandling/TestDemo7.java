package com.exceptionhandling;

public class TestDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");

		try {
			System.out.println("in try");
			System.out.println(10 / 0);// in catch
		} catch (ArithmeticException e) {
			System.err.println("in catch of AE");
		} catch (Exception e) {
			System.err.println("in catch of E");

		} finally {
			System.out.println("in finally");

		}
	}

}
