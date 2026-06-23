package com.logicalstatements.loops;

public class BreakAndContinue {

	public static void main(String[] args) {
		System.out.println("main method started");
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i+" ");
		}

		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i+" ");

		}
	}

}
