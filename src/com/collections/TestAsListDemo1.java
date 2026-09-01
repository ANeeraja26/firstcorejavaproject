package com.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class TestAsListDemo1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 100, 150, 80, 40, 70);
		System.out.println(list);
		
		list.add(100);
		System.out.println(list);//java.lang.UnsupportedOperationException
	}

}
