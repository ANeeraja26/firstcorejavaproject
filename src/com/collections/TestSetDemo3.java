package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSetDemo3 {

	public static void main(String[] args) {
		SortedSet<Integer> ss = new TreeSet<>();
		ss.add(10);
		ss.add(20);
		ss.add(30);
		ss.add(40);
		ss.add(50);
		ss.add(60);

		System.out.println(ss.first());// 10
		System.out.println(ss.last());// 60
		System.out.println(ss.tailSet(40));// [40, 50, 60]
		System.out.println(ss.headSet(20));// [10]
		System.out.println(ss.subSet(20, 50));//[20, 30, 40]
		System.out.println(ss);// [10, 20, 30, 40, 50, 60]

	}

}
