package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestDemo5List {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<>();

		// [1, 10, 30, 20, 10, 20, 40, null, null, null]
		l1.add(10);
		l1.add(10);
		l1.add(20);
		l1.add(40);
		l1.add(1, 20);
		l1.add(0, 1);
		l1.add(2, 30);
		// l1.add(10,100);//indexoutofboundsException

		l1.add(null);
		l1.add(null);
		l1.add(null);

		System.out.println(l1);

	}

}
