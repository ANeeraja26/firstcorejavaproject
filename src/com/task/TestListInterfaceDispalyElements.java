package com.task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class TestListInterfaceDispalyElements {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(2, 7, 4, 3, 5, 8, 1);
		int target = 9;
		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i) + l.get(j) == target) {
					System.out.println("(" + l.get(i) + "," + l.get(j) + ")");
				}

			}

		}

	}

}
