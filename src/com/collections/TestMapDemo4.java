package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// WAP to print Occurrences of the each Character
// input----> java
// output ----> j=1,a=2,v=1
public class TestMapDemo4 {

	public static void main(String[] args) {
		
		Map<Character,Integer> map=new HashMap<>();//{}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string:");//javaaa
		String str=sc.next();
		
		
		//String to character array
		char[] ch=str.toCharArray();
		
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			}else {
				map.put(c, 1);//{j=1,a=1,v=1}
			}
			
		}
		
		System.out.println(map);
		
    
	}

}
