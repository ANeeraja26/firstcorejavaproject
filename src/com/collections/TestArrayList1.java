package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList1 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		
		l1.add(7);
		l1.add(18);
		l1.add(1);
		l1.add(45);
		l1.add(35);
		l1.add(45);
		l1.add(55);
		l1.add(65);
		l1.add(75);
		l1.add(50);
		
		l1.add(24);
		l1.add(56);
		
		
		//size changed dynamic
		System.out.println(l1); // [7, 18, 1, 45, 35, 45, 55, 65, 75, 50, 24, 56]


		

	}

}
