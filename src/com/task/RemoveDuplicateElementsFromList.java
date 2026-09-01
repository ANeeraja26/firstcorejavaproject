package com.task;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElementsFromList {

	public static void main(String[] args) {
		
        List<Integer> l1 = new ArrayList<>();

        l1.add(10);
        l1.add(20);
        l1.add(10);
        l1.add(30);
        l1.add(20);
        l1.add(40);
        List<Integer> l2 = new ArrayList<>();

        for (int i = 0; i < l1.size(); i++) {

            if (!l2.contains(l1.get(i))) {
            	l2.add(l1.get(i));
            }
        }

        System.out.println("Original List: " + l1);
        System.out.println("After Removing Duplicates: " + l2);
    
		
	}

}
