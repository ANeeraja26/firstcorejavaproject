package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestSetDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Neeraja");
		m.put(2, "Neeraj");
		m.put(3, "Neeru");
		m.put(4, "Rami");
		m.put(4, "Ramu");
		m.put(5, "Rami");
		System.out.println(m);//{1=Neeraja, 2=Neeraj, 3=Neeru, 4=Ramu, 5=Rami}

		// HashMap instance has default initial capacity is 16
		Set<Integer> s = new HashSet<>();
		s.add(12);// ----> 12%16--->
		s.add(15);
		s.add(20);
		s.add(23);
		s.add(30);
		s.add(35);
		s.add(null);
		s.add(null);
		s.add(15);
		s.add(35);
		System.out.println(s);// [null, 35, 20, 23, 12, 30, 15]

	}

}
