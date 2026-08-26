package com.task;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionOfStringElements {

	public static void main(String[] args) {
  
		
		Collection<String> friuts=new ArrayList<>();
		friuts.add("apple");
		friuts.add("banana");
		friuts.add("orange");
		friuts.add("grape");
		friuts.add("papaya");

		System.out.println(friuts);
		
		
		for (String friut:friuts) {
			System.out.println(friut);
		}
	}

}
