package com.task;

// Time Complexity is O(1)--- when we use constant value
// time complexity isO(n)----> when we taken the value form console

// space complexity is O(1)
import java.util.Scanner;

public class TimeAndSpaceComplexity {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.println(i);

		}
	}

}
