package com.collections;

import java.util.ArrayList;

public class TestDemo6List {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();

		l1.add(10);
		l1.add(10);
		l1.add(20);
		l1.add(40);

		l1.add(1, 100);
		l1.add(2, 200);
		l1.add(3, 400);

		System.out.println(l1);     
     
     
	}

}
