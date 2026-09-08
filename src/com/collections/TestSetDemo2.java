package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSetDemo2 {

	public static void main(String[] args) {
		
		Set<Integer>s=new HashSet<>();
		s.add(4);
		s.add(14);
		s.add(24);
		s.add(44);
		s.add(46);
		s.add(47);
		
		s.add(54);
		s.add(64);
		s.add(84);
		s.add(94);
		s.add(24);
		s.add(34);
		System.out.println(s);//[64, 34, 4, 84, 54, 24, 44, 14, 46, 94, 47]
		
		Set<Integer>s1=new LinkedHashSet<>();
		s1.add(4);
		s1.add(14);
		s1.add(24);
		s1.add(44);
		s1.add(46);
		s1.add(47);
		
		s1.add(54);
		s1.add(64);
		s1.add(84);
		s1.add(94);
		s1.add(24);
		s1.add(34);
		System.out.println(s1);//[4, 14, 24, 44, 46, 47, 54, 64, 84, 94, 34]


	}

}
