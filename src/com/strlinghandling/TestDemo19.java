package com.strlinghandling;

import java.util.Scanner;

// write a program from vowels consonants,and digits....
public class TestDemo19 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a frist string");
		String str1 = sc.nextLine().toLowerCase();

		int chCount = 0;
		int cCount = 0;
		int vCount = 0;
		int dCount = 0;
		int spChar=0;
		

		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);

			if (c >= 'a' && c <= 'z') {
				chCount++;
				if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
					vCount++;
					
				}else {
					cCount++;
					
				}
					
				}else if(Character.isDigit(c)) {
					dCount++;
					


			}else if(Character.isSpaceChar(c)) {
				spChar++;
				
				
			}

		}

		System.out.println("char count is:" + chCount);
		System.out.println("vowels count is:" + vCount);
		System.out.println("consonants count is:" + cCount);
		System.out.println("digits count is:"+dCount);
		System.out.println("Space count is:"+spChar);

		


	}

}
