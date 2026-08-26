package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestDemolist7 {

	public static void main(String[] args) {
		
		List<Integer>l1=new ArrayList<>();
		
		l1.add(6);
		l1.add(9);
		l1.add(10);
		l1.add(19);
		l1.add(99);
		l1.add(50);
		
		l1.remove(l1.indexOf(10));//IndexoutofboundsException
		                           // [6, 9, 19, 99, 50]
		System.out.println(l1);

		
	}

}
