package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo4 {

	

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>();
		fruits.add("chikku");
		fruits.add("grape");

		

		if (!fruits.isEmpty()) {
			fruits.add("apple");
			fruits.add("banana");
			fruits.add("orange");
			fruits.add("papaya");

		}
		System.out.println(fruits);
		
	
	}

}
