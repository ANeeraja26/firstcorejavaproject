package com.collections;

import java.util.Stack;

// Stack ----> LIFO----> last in first out

public class TestStackDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");

		Stack<String>s=new Stack<>();
		
		s.push("Neeru");
		s.push("Neeraja");
		s.push("Neeraj");
		s.push("Ram");
		s.push("Rami");
		s.push("Ramu");
		
		System.out.println(s.empty());//false
		System.out.println(s.remove(s.indexOf("Neeru")));//Neeru

		System.out.println(s.peek());//Ramu
		System.out.println(s.pop());//Ramu
		
		System.out.println(s.search("Neeraja"));//4
		
		System.out.println(s);//[Neeru, Neeraja, Neeraj, Ram, Rami]
		

		
	}

}
