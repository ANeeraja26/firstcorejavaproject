package com.strlinghandling;

import java.util.Arrays;
import java.util.Scanner;

// write a program to print given numbers is anagram or not
// race---> care
// earth---> heart
//silent----> listen
// cat----> act
// how----> how

public class TestDemo18 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first string");
		String str1=sc.next().toLowerCase();
		System.out.println("enter a second string");
		String str2=sc.next().toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("two string are not anagram");
			
		}else {
			char[]ch1=str1.toCharArray();
			char[]ch2=str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("given string is anagram");
				
			}else {
				System.out.println("given starings are not an anagram");
			}
		}
		
		
	}

}
