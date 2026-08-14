package com.task;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(str.charAt(i) + "" + count);
                count = 1;
            }
        }

        sc.close();
	}

}

